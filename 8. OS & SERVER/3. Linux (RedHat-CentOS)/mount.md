### Mount

1. Mount (하드웨어 장치와 폴더(디렉토리)간 연결 매핑)

   1. window (PnP기능이 있어서 장치 인식은 자동적으로 가능)

      1. 하드 장착
      2. NTFS (폴더구조) 설정

   2. Linux

      1. 장치 연결 확인 ( 명령어 : `fdisk -l` )

         

      2. 장치에 접근 ( 명령어 : `fdisk <장치명 (/dev/sdb`)> )

         

      3. partition 분배

         - 총 4개 (물리)까지 // 4개 이상으로 분배 하고자 할때는 3개까지 물리적 분배를 해놓고 나머지 용량에 대해 extended설정 후 그 안에서 용량이 허용하는 한 논리적 분배는 마음껏 가능.

         ```bash
         //command 창에서
         $ n //new 파티션 생성
         $ p //primary partition 선택
         $ 1 //partition number 선택
         $ enter //first cylinder: sector 시작 위치로 default 상태 그냥 엔터
         $ +30M // 사이즈 지정 default는 남은 공간 전부 할당
         $ p //생성한 파티션 확인
         
         //두 번째 파티션 까지 동일하게 구성 후
         
         //세번째 파티션은 extends 설정 후 나머지 부분 전부 차지하게
         $ n
         $ e //extended
         $ 3 //세번째 파티션
         $ enter //default
         //남아 있는 공간보다 더 많은 양의 공간을 주면 Value out of range가 발생. 그냥 엔터치면 남은 공간 모두 할당
         
         $ w //partition 분할 후 저장까지
         
         // partition 도움말
         $ m //
         ```

         - partition 도움말

         ```bash
         a	toggle a bootable flag (부트 가능한 플래그로 변경)
         b	edit bsd disklabel (bsd 디스크 레이블을 편집)
         c	toggle the doc compatibility flag(도스 호환 플래그로 변경)
         d	delete a partition (파티션 삭제)
         l	list know partition type (알려진 파티션 형태의 목록)
         m	print this menu (이 메뉴를 출력)
         n	add a new partition(새로운 파티션 추가)
         o	create a new empty DOS partition table(새로운 도스 파티션 테이블을 생성)
         p	print the partition table (파티션 테이블을 출력)
         q	quit without saving changes(변경을 저장하지 않고 종료)
         s	create a new empty Sun disklabel (새로운 Sun디스크 레이블을 생성)
         t	change a partition's system id(id 파티션의 시스템 id를 변경)
         u	change display/entry units(표시/엔트리 단위를 변경)
         v	verify the partition table(파티션 레이블을 점검)
         w	write table to disk and exit(디스크에 테이블을 기록하고 빠져나감)
         x	extra functionality (experts only) 
         ```

         

      4. 파일시스템 설정 (format 작업) (명령어 : `mkfs.ext4`)

         - FAT32 : 윈도우와 리눅스 범용적으로 상용할 수 있는 파일 시스템으로 대용량 NTFS파일 시스템 이하의 환경에서 동작할 수 있는 제한 사항을 갖고 있다.

         - ext3 : 보안 부분이 조금 향상된 기본 파일 시스템으로 저널링 파일 시스템을 기반으로 하고 있고 ext2보다 조금 향상된 기능을 갖고 있다.

         - ex4 : 대형 파일 시스템을 지향하는 목적으로 개발되었으며 최대 1엑사 바이트 볼륨과 16TB파일을 지원. ext3 단점을 많이 보안한 파일 시스템으로 현재까지 개발중

         ```ba
         //논리 파티션 있는지 주의!!
         
         $ mkfs.ext4 /dev/sdb1
         //~ information: done 메세지 출력시 정상 적으로 설정 완료.
         ```

         

      5. 파티션과 연결할 디렉토리 생성

         ```bash
         $ mkdir 디렉토리 명
         ```

         

      6. `mount` 명령어로 (분배한)장치와 파일시스템(디렉토리) 연결

         ```bash
         //mount -t <file type을 명시적으로 지정해주는 옵션>
         
         $ mount -t ext4 /dev/sdb1 ./test1
         
         //mount option
         $ mount [-v -r -w] [-t 파일 시스템] [-o 옵션] [마운트 할 장치] [마운트 될 디렉토리]
         -a : fstab에 있는 파일 시스템을 마운트
         ```

         - mount 명령어

         | 옵션 | 설명                         |
         | ---- | ---------------------------- |
         | -v   | 자세한 정보가 출력           |
         | -r   | read-only로 mount            |
         | -w   | read-write 모두 가능한 mount |

         - File System 장치 설명

         | 파일시스템 | 설명                                                         |
         | ---------- | ------------------------------------------------------------ |
         | vfat       | windows 95, 98, NT파일 시스템                                |
         | ext2       | 리눅스에서 사용되는 파일 시스템                              |
         | ext3       | ext2 + 저널링 파일 시스템(파일 복구 가능)                    |
         | nfs        | Network File System의 약자 (NFS 서버의 공유 디렉토리를 Mount할때 사용) |
         | cifs       | 윈도우 공유파일에서 쓰는 파일 시스템                         |
         | iso9660    | CD-ROM의 파일 시스템                                         |

         - Mount option 

         | 옵션    | 설명                                                         |
         | ------- | ------------------------------------------------------------ |
         | default | rw, suid, dev, auto, nouser, async 옵션이 선택. 사용하지 않을 경우 자동 |
         | ro      | 읽기전용 mount                                               |
         | rw      | 읽기,쓰기 mount                                              |
         | auto    | -a 옵션 (auto옵션이 장치 자동 mount)                         |
         | noauto  | -a (mount 안됨)                                              |
         | exec    | 실행파일의 실행이 가능하게 mount                             |
         | noexec  | 실행파일이 불가능하게 mount                                  |
         | user    | 일반 사용자의 mount를 허용                                   |
         | nouser  | 일반 사용자의 mount를 거부                                   |
         | async   | 파일시스템에 대한 입출력이 비동기적으로 이루어짐             |
         | sync    | 파일시스템에 대한 입출력이 동기적                            |
         | remount | 이미 mount된 파일 시스템을 다시 mount                        |
         | dev     | 파일 시스템의 문자, 블럭 특수장치를 해석                     |
         | suid    | setuid, getuid의 사용을 허가                                 |
         | nosuid  | setuid, getuid의 사용을 불허                                 |
         | umask   | mount된 디렉토리에서 새로 생성하는 파일과 디렉토리 퍼미션의 default값을 지정 |

         - 마운트 해제

         ```bash
         $ umount [장치명 or 디렉토리명]
         
         $ umount -a [-t 파일 시스템]
         
         //"device is busy" 메세지가 발생하면 
         $ fuser -ck /dev/sdb1 으로 명령으로 프로세스를 kill하고 umount를 재시도하면 정상적으로 해제 가능
         
         //해당 디렉토리를 사용하는 사용자가 누구인지 확인하고 싶을 때 
         $ fuser -cu /dev/sdb1
         ```

         - 부팅시 자동 마운트

         ```bash
         $ vi /etc/fstab
         [마운트 할 장치][마운트 될 디렉토리][파일시스템][옵션][덤프][검사]
         
         //덤프 (0 = 안함, 1=한다)
         //검사 (0 = 한다, 1=루트 파일 시스템으로 부팅 시에 검사)
         ```

         - 현재 mount 되어 있는 파일 시스템 정보 확인

         ```bash
         $ mount
         $ cat /etc/mtab
         ```

         

      7. `df -h` 명령어로 확인

         ```bash
         [root@localhost ~]# df -h
         Filesystem      Size  Used Avail Use% Mounted on
         /dev/sda3        27G  1.9G   24G   8% /
         tmpfs           491M     0  491M   0% /dev/shm
         /dev/sda1       477M   34M  418M   8% /boot
         /dev/sdb1        30M  383K   28M   2% /root/test1
         /dev/sdb2        30M  383K   28M   2% /root/test2
         /dev/sdb3        35M  491K   33M   2% /root/test3
         ```

         

      8. 연습

         1. 최상위 디렉토리로 data를 만들고 내부에 aa.txt를 만든 후 마운트를 풀면 aa.txt의 존재는?

            //내부 파일 다 사라짐(data는 /dev/sdb1에 존재)

            ```bash
            $ umount -f /dev/sdb1
            ```

         2. 기존 3개의 파티션 fdisk에 접근해서 p로 tablelist를 확인 후 파티션 전부 삭제 후 10개의 파티션 나눠보기.

            

### Reference

[fdisk - partition - mkfs - mkdir - mount] : https://wlsvud84.tistory.com/14