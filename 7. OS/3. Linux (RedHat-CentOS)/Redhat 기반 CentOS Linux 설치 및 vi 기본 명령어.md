### linux (RedHat-CentOs Linux 설치) 설치 및 vi명령어

#### 리눅스(centos기반 리눅스 설치)

```bash
1. 설치 파일 다운

2. CentOS 7 버전과 6.8버전 다운 후 설치 (saw)

3. VMware에서 설치
fdisk -l //linux 설치 확인
df -h  //디스크 공간 정보 확인
setup 아래 network 주소 셋팅

network setting
168.126.63.1

Static IP (서버 ip)
192.168.0.107

Netmask
255.255.255.0

Default gateway IP
192.168.0.1

4. service network restart

5. ifconfig //네트워크 연결 상태 확인 (eth0이 설정 되어있어야 함)

6. vi /etc/sysconfig/network-scripts/ifcfg-eth0 디렉토리에서 boot를 no에서 yes로 변경 후 저장 나가기

7. putty로 원격 접속
```



#### 권한 기본 명령어

##### dir

디렉터리 `r`  - 명령어`ls`

디렉터리 접근 `x` - 명령어 `cd`

쓰기`w` - 명령어 `mv`,`mkdir` , etc..



##### file (최대 권한 666, rw-rw-rw-)

파일 `r` - 명령어 `vi`, `cat` etc..

파일 `w` - 명령어 `vi(i)`

파일 `x` - 명령어 `sh`



#### 리눅스 vi 모드 (리눅스 텍스트 editor 종류:  vi, vim)

1. vi 시작 (`vim`, `vi`)

2. 명령모드(커서 이동, 줄, 한 줄 삭제(`dd`) 복사`yy`, 붙여넣기`p`)

   ![image-20191230115715105](C:\Users\sau-5\AppData\Roaming\Typora\typora-user-images\image-20191230115715105.png)

   - 복사 하고자 하는 줄에 커서를 놓고 `2yy`를 누른 후 붙여넣기 하고자 하는 줄의 위에 커서를 놓은 후 `p`를 누르면 두줄 복사 가능
   - `2dd` 현재 커서로부터 두 줄 삭제

   - `i`(해당커서),`a(커서다음)`,`o(다음줄)`입력모드 변환, `s` (커서다음 단어 삭제)

   - `:` 마지막 행  모드로 변환

   - `zz` vi종료
   - `u`되돌리기 (입력 모드로 전환 한 후까지 되돌리기 가능 window의 `ctrl` + `z`)
   - `ctrl` + `r` (되돌린 것을 다시 되돌리는 window의 `ctrl`+`y`)
   - `(`, `)`,`{`,`}`,`[[(문서의 처음으로 이동)`,`]](문서의 끝으로 이동)`, `H`,`M`,`L`
   - 치환
     - 한 글자 치환 `r`
     - 한 문장 치환: `%s /old/new`
     - 문장의 모든 것을 치환: `%s /old/new/g`
     - 대소문자 구분없이 치환: `%s/old/new/i`
     - (시작줄), (마지막줄)만 치환 : `1,4s/old/new/g`
   - visual 모드로 블럭 지정 후 치환
     - 

3. 입력모드(입력한 내용이 버퍼로 옯겨져 추가,삭제 가능)

   - `esc`로 입력모드 나가기

4. 실행(ex)모드

   ![image-20191230115653239](C:\Users\sau-5\AppData\Roaming\Typora\typora-user-images\image-20191230115653239.png)

   - `q`(나가기), `wq`(저장 후 나가기),`q!`(버퍼에 data가 있어도 강제로 나가기)

   - `w`(저장 후 현 모드 상태 유지)

   - `set number` 후 `:3`세번째 줄로 이동

   - `:/이동하고자 하는 단어 입력` 후 `n`으로 해당 단어 이동 가능, `N`으로 역순으로 이동 가능

5. vi 종료



6. vim의 경우 복수개의 파일을 열 수 있다.

   - 실행모드에서 ls로 열려있는 파일 확인 가능

   - 코드 작성 시 단어를 가시적으로 확인 가능

   - `%`현재 내가 보고 있는 파일, `#`버퍼가 있는 파일

     

7. vi 기타 명령어

   - /root의 test파일을 /root/Test 디렉토리 안에 상대경로로 복사해오기 : `cp ../test.txt .`

   - 새로운 파일 만든 후 cc.txt로 파일 이름 저장후 닫기: `wq <파일명>`

     

8. 입출력 명령어

   1. **Cat** (현재 화면에 출력)

   2. more (현재 화면에 화면 단위까지 출력)

   3. head (최상단부터 아래로 10줄 출력) [-3 or -n 3: 세번째 줄까지 출력하는 option]

   4. **tail** (최하단부터 위로 10줄 출력)

   5. vi

   6. vim

   7. less (more의 확장판)

   8. echo (출력, printf나 println 느낌)

      

9. Redirection

   1. 입출력 재지정

      - 출력  > 입력 (덮어쓰기)
      
        ls -l > ls.txt (현재 파일 디렉터리의 list목록을 ls.txt 파일에 저장)
      
        복수로 사용 가능(응용 가능)
      
      - 출력 >> 입력 (append 형태)
      
        log data를 쌓고자 하거나  backup 시 자주 사용.
      
      - 출력 < 입력 (사용하나 마나 큰 차이 없음)
      
        cat < ls.txt
      
      

10. 표준입출력

   1. stdin

      - 입력, 0번

   2. stdout

      - 출력, 1번
      - ```ee > t.txt > 2 >f.txt ``` : 출력값 ee가 true면 앞의 파일에 false면 뒤에 파일에 저장

   3. stderr

      - 에러, 2번
      - 1> /dev/null

   4. stdprint

      

11. Pipe (`|`) & grep (패턴 찾기)

    1. 리눅스는 한줄에 하나의 명령어만 인식 가능

    2. 명령어1 | 명령어2

       명령어 1의 값을 명령어 2로 넘긴다.

    3. ls /bin /usr/bin | sort

       알파벳 순서로 정렬

    4. ls /bin /usr/bin | sort | uniq

       알파벳 순서로 정렬하면서 중복제거까지

    5. ls /bin /usr/bin | sort | uniq | grep zip

       알파벳 순서로 정렬하면서 중복제거하고 `zip`이 들어간 파일들 출력

    6. and(&&)나 ||(or) 는 pipe와 다름명령어 하나 실행 끝 ||(&&) 명령어 하나 실행 끝

    7. ls -al | grep "^a"



12. 리눅스 루트 디렉토리와 하위 디렉토리 설명

    1. bin : 리눅스에 가장 필수적인 리눅스 실행 파일 존재
    2. boot : 리눅스 부팅 관련 파일들과 리눅스의 커널이 존재
    3. dev : 컴퓨터에 설치된 하드웨어에 관한 정보들이 파일 형태로 저장
    4. etc : 사용자 계정 정보 파일, 쉐도우 파일 그 외 리눅스 설정 파일이 존재
    5. home : 일반 사용자들과 디렉토라 존재
    6. lib : 라이브러리 파일
    7. mnt : mount 명령을 사용, 마운트 시킨 cd-rom 등
    8. proc : 프로세스들이 파일 형태로 저장되는 디랙토리
    9. root : 일반 사용자의 디렉토리는 /home 아래 존재하지만 루트의 home 디렉토리는 이것에 저장
    10. sbin : 기본 명령을 제외한 시스템 관리용 실행 파일들이 들어 있는 디렉토리
    11. tmp : 임시로 파일을 저장하는 디렉토리로서, 권한에 상관없이 누구나 이 디렉토리에 파일을 생성할 수 있다.
    12. usr : 다양한 응용 프로그램들이 설치되어 있는 곳
    13. var : 시스템 운영 중에 사용되는 각종 임시 파일이다.

    

13. 예제

/etc/passwd 파일을 /tmp/pass.txt로 만들고 pass.txt파일에 밑에서 5줄만 em.txt로 저장하기

```bash
현재 /tmp 디렉토리에서 진행
// 1단계 
현재 경로에서 상위의 etc/passwd파일을 찾고

// 2단계
chmod 명령어로 접근 권한을 해제하고
chmod 777 ../etc

// 3단계 명령어 작성 
cat ../etc/passwd > /pass.txt > tail -5 tmp/em.txt
```



14. find

```bash
1. find /위치

2. -name 옵션 이용한 확장자 명이 txt인 모든 파일 찾기 
$ find / -name *.txt

3. a로 시작하고 파일명이 4글자인경우
$ find / -name a???.txt 

4. -size 옵션
//2MB인 size의 file을 찾을 때
$ find / -size +2048

5. -type 옵션
//directory type만 찾음
$ find / -type d

6. 복수 개의 옵션 사용
//type이 file이고 size는 1GB이고 name은 모르는데 확장자는 txt인 파일 찾기
$ find / -type f -size + 1024M -name "*.txt"

7. 찾는 파일을 실행 값에 출력
//find / -type f -size + 1024M -name "*.txt" -exec 실행 값(ls -l etc.. 등) {} \;

$ find / -type f -name "*.txt" -exec ls -l {} \;

// -name "*.txt" 처럼 중간에 space나 공간이 있으면 더블 쿼테이션으로 감싸줘야 인식 함
// {} : find에서 찾아낸 검색 결과가 하나씩 들어간다.
// \; :-exec 다음 부분에 나와 있는 명령어를 실행하라는 구문 

8. 파일 갯수 찾기
//366개의 파일 존재 확인
$ find / -name "*".txt  | wc -l

9. 접근 시간 찾기]
$ find / tmp -atime -40 -exec rm -rf {} \;
//-atime -40 :  접근한 시간이 40일 이내
//-atime -40 :  접근한 시간이 40일 이내

10. 특수권한 (setUId 등)
1777
```



15. ln (링크파일)

1. 심볼릭링크: 원본파일의 주소(메모리)값을 가리키는 포인터

   링크 대상인 원본파일이 이동하면 링크가 깨짐

2. 하드링크: 원본파일과 동일한 데이터를 가리키는 포인터

   하드링크는 링크라기 보다는 동일 파일에 대한 '또 다른 이름'으로, 원본 파일과 동일한 레벨이므로 하드링크는 문제없이 사용 가능

3. 파일 생성시 i-node 번호도 같이 생김

![sym,hard](C:\Users\sau-5\Desktop\YIG\System\sym,hard.png)

```bash
$ ln -s 원본 명 / 링크 파일 명
```

4. 예제

   ```bash
   1. cc.txt의 심볼링 링크 만들기
   //i-node 번호가 같은지 확인 (심볼릭과 원본 파일의 i-node번호가 다름)
   $ ln -s cc.txt cc1.txt
   
   2. link와 관련된 정보를 확인
   $ ls -il
   //맨 앞 부분의 숫자가 inode
   
   3. 하드링크 생성
   $ ln cc.txt dd.txt
   
   4. 하드링크로 생성한 파일의 내용 확인
   $ cat dd.txt
   
   5. 원본파일 지워보기
   $ rm cc.txt
   
   6. 원본 파일에서 내용 수정 후 하드링크로 원본 파일에 수정한 data가 보이는지 확인 (보임)
   
   7. 그 다음 원본 파일 지운 후 심볼릭크와 하드링크가 각각 접근 가능한지 확인 // 심볼릭에서는 접근 불가 하드는 가능
   
   8. 원본 파일과 동일한 이름으로 새로운 파일을 만들면 심볼릭링크와 연결은 되나 내용은 없음.
   ```

![UFS Structure](C:\Users\sau-5\Desktop\YIG\System\UFS Structure.png)



### Reference

[시스템 관리 설명서] : https://docs.oracle.com/cd/E24846_01/html/E23088/spmonitor-6.html



[vi 에디터 참고 사이트] : https://blockdmask.tistory.com/25



[시스템 운영 인프라] : https://multicore-it.com/71?category=686777



[심볼릭, 하드 링크] : https://koromoon.blogspot.com/2018/05/inode-symbolic-link-hard-link.html



보안관제 - cert (침해사고대응) 