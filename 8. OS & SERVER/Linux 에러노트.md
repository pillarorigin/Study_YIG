#### Linux 에러



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

