[toc]



### Linux 에러

#### 1. 마운트한 장치를 삭제 한 후 booting이 안되는 경우

[원인] : 마운트 한 장치를 삭제하고 reboot 하면 sdc, sdb .. 하드를 찾다가 없으니 booting이 안됨.

[해결]

/etc/fstab  의 권한을 ro에서 rw로 변경

mount 옵션 중 `-o` 옵션을 이용해서 remount 시킨다.

```bash
# mount -o remount, rw /
```



#### 2. Linux RAID 작업 중 "will not make a filesystem here" 메세지

[원인] : multipath나 LVM에 매핑되어 있던 정보가 깨끗하게 clear 되어지지 않아 발생

[해결 1] : dmsetup 명령으로 clear 후 다시 format 진행

[해결 2] : 기존 /dev/md127에 연결되어있는 mount를 umount로 해제 한 후 다시 format 진행



#### 3. 리눅스에서 md0가 md127로 바뀌는 현상

[원인] : 새로 구축한 RAID 디바이스의 정보가 /etc/mdadm.conf 파일에 있지 않아서

[해결 1] : 변경 되기 전 설정

```bash
# mdadm --detail --brief /dev/md0 >> /etc/mdadm.conf
# reboot
# mdadm --detail --scan
# mdadm --detail /dev/md0
```

[해결 2] :  설정을 못하고 이미 변경 된 후 다시 설정

```bash
# mdadm --detail /dev/md127 명령어로 나오는 결과 중 UUID와 Name을 아래 처럼 설정해준다.
```

/etc/mdadm/mdadm.conf파일에 아래 문장 추가

```bash
ARRAY /dev/md1 devices=/dev/sdc1, /dev/sdd1 name=localhost.localdomain:1 UUID=b0a681f7:087f21d0:5509fc56:259d2d1c level=1 num-devices=2 auto=yes

# reboot 후
# vi /etc/fstab 내용도 수정
//아래 명령어로 모든 파일 시스템  mount가능.
# mount -a 
```

화인은 다음 명령어

```bash
# cat /proc/mdstat
//여기서 resync가 끝나는지 확인
```

위 ARRAY 부분에 localhost.localdomain는 호스트네임 (호스트네임 변경할 경우. 호스트네임 설정 파일은 /etc/hostname에 존재)

```bash
//현재 호스트네임 확인
# hostname 

// abc로 호스트네임 변경 (CentOS 6버전)
# hostname abc

// abc로 호스트네임 변경 (CentOS 7버전)
# hostnamectl set-hostname abc

이후 아래 명령어 실행 후 재부팅하면 정상적으로 md0로 인식
# update-initramfs-u
```



#### 4. "Couldn't resolve host 'mirrorlist.centos.org'" 

```bash
[root@localhost /]# yum update
Loaded plugins: fastestmirror, security
Setting up Update Process
Loading mirror speeds from cached hostfile
Could not retrieve mirrorlist http://mirrorlist.centos.org/?release=6&arch=x86_64&repo=os&infra=stock error was
14: PYCURL ERROR 6 - "Couldn't resolve host 'mirrorlist.centos.org'"
Error: Cannot find a valid baseurl for repo: base
```

[원인] : OS를 설치하고 resolv.conf 에 nameserver 정보를 작성하지 않아 발생한 error

[해결방법] : /etc/resolve.conf 파일에 nameserver 추가

### Reference

[3. RAID 장치명 변경] : http://blog.naver.com/PostView.nhn?blogId=sunguru&logNo=220753062293



[시스템 프로그래밍] : https://www.joinc.co.kr/w/man/2