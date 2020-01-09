[TOC]

## MarkDown사용법

### Chapter 1. Beginner or Elementary

1. 목차 만들기 (가장 큰 틀에서 TOC활용이 BEST, 내부적으로 internal link 활용)
   
   - Internal link 활용 예시
   
     ```bash
     1. [TOC] 활용 (Table of Contents) TOC 활용 예시 ( # header level 별 작성 )
       Big title
       	# Chapter 1
       		## Chapter 1.1
       	# Chapter 2
       		## Chapter 2.1
       		## Chapter 2.2
       			### Chapter 2.2.1
       
     2. internal link 활용
     //기본 문법 (방법: 대괄호`[]` 뒤에 소괄호`()` 안에 샾`#`으로 목차 제목과 동일하게 써준다. 단, 띄어쓴 부분은 대시`-`로 표기해준다. )
     [목차 제목](#링크) 활용
     
     //링크 부분에 url이 아닌 현재 파일 내의 같은 제목 찾기
     [1.MarkDown 단축키](#1.markdown-단축키)
     [2.Short Cut](#Short-Cut)
     ```
     
       [ShortCut](#Short-Cut)
     
       [MarkDown Reference](#markdown-reference)


​           
2. 제목

     ```bash
     텍스트 앞에 `#` 의 갯수 만큼 HTML의 `<h1>~<h6>` 태그레벨 조정 가능.
     `#`을 두번 쓰면 `<h2>`태그를 의미한다.
     #은 6개까지 쓸 수 있고, #이 늘어날때마다 제목의 수준(글씨 크기가 작아진다)은 내려간다.
     ```

     

3. 리스트

     1. 번호 없는 리스트

          ```bash
          `-`,`+`,`*`텍스트.
          //(마이너스, 플러스, 별표 순서)
          ```

     2. 번호 있는 리스트

          ```bash
     숫자. 리스트
          ```
          
          

4. italic text (html의 `<em>` 태그)

   ```bash
   `*텍스트*` or `_텍스트_`
   `*`나 `_ _` 사이에 기울이고자 하는 텍스트를 삽입.
   bold text (html의 <strong>태그)
   `**텍스트**`
   `** **` 나`__ __`사이에 힘주고자 하는 텍스트 삽입.
   ```

   

5. strikethrough
   취소선은 `~` 기호를 이용하여 `~~ 취소할 내용 ~~`

   ~~취소~~

   

6. 인용문구 (`>`)

   텍스트. 인용문 안에 인용문을 넣으려면 `>`를 더 추가해주면 된다.

   > 인용문 예시



7. 인라인 링크

   ```bash
   [링크 문구] (링크주소 " 타이틀 문구")
   [ ] 대괄호에 링크이름을 적고 뒤에 ( ) 소괄호 안에 링크 주소를 적어 넣는다. ( )소괄호 뒤에 더블쿼테이션으로 "타이틀 부구를 작성할 수 있다."
   참조 링크
   [ 텍스트 ] [참조명]
   [ ] 대괄호 안에 텍스트 적고 뒤에 한번 더[ ] 대괄호를 적고 그 안에 참조명을 적는다.
   주소만으로 링크
   < > 기호로 감싸서 사용
   ```

   

8. Named Anchor or Internal Links

   1. 
      브라우저 상에서 특정 앵커로 점프하는 용도 (목차나 특정 각주위치로 움직일 때 사용)

      ```bash
      [대괄호안에는 이동시킬 네임드앵커 제목](#소괄호 안에 점프할 특정 앵커)
      //주의 사항 
      단, 영어는 소문자로, 띄어쓴 부분은 대시(-)로 표기해준다.  
      ```

      

   2. 이미지 삽입

      ```bash
      ![ 대괄호 ](이미지 링크)
      ```

      

   3. url 삽입

      ```bash
      [링크 문구](http://url주소)
      
      [링크 문구](http://url주소 "타이틀 작성란")
      ```

      

   4. 참조 링크

      ```bash
      [구글][1]
      [1]: http://www.google.com
      ```

      

   5. 주소링크

      ```bash
      <http://www.google.com>
      ```
      
      
      
   6. 각주(FootNote)

      ```bash
      MarkDown Editor에는 여러 종류가 있습니다. Typora[^typora]와 Bear[^bear] 그리고 StackEdit[^StackEdit]가 있습니다.
      
      [^typora]: Typora는 베타 무료이지만 2020년 1월 현재까지는 모바일 환경을 지원하지 않습니다.
      [^bear]: bear는 기본 무료이지만  pro 구독 시 1.49달러이고 macOS와 iSO만 지원 합니다.
      [^StackEdit]: 브라우저 기반으로 모든 플랫폼에서 가능합니다 (모바일도 지원) 하지만 오프라인 시 사용에 제약이 있고 온라인 스토리지 연동을 안할 경우 data손실의 위험이 있습니다.
      
      주의사항: [^각주이름]: 콜론의 띄어쓰기 또한 주의해서 작성해야 합니다.
      ```

      각주 예시

      MarkDown Editor에는 여러 종류가 있습니다. Typora[^1]와 Bear[^2] 그리고 StackEdit[^3]가 있습니다.

      [^1]: Typora는 베타 무료이지만 2020년 1월 현재까지는 모바일 환경을 지원하지 않습니다.
      [^2]: bear는 기본 무료이지만  pro 구독 시 1.49달러이고 macOS와 iSO만 지원 합니다.
      [^3]: 브라우저 기반으로 모든 플랫폼에서 가능합니다 (모바일도 지원) 하지만 오프라인 시 사용에 제약이 있고 온라인 스토리지 연동을 안할 경우 data손실의 위험이 있습니다.

   

9. 수평선 (html의 `<hr/>` 태그)

     ```bash
     `-`, `*`, `_`을 세개 이상 나열, 단락 나누기 용도로 많이 사용.
     ```

     

10. 테이블

    ```bash
    | 이름 | 나이 | 성별
    ```

    

11. 정렬

    ```bash
    오른쪽 정렬 	---:
    왼쪽 정렬 	:---
    가운데 정렬 :---:
    ```

    

12. 



### Chapter 2. Intermediate (Pre-Low- * -Upper)

1. Short Cut

   `ctrl` + `shift` + `k` or `백틱`(\`\`\`)3연속 특정 언어명 : 코드 라인 추가

   `ctrl` + `t` : 표 추가

   표 에서 `ctrl` + `enter` : 행 추가

   표에서 `shift` + `enter` \<br> :태그 자동 추가

   `ctrl` + `+` or `-` 제목 수준 낮추기

   \`(백틱)으로 글자를 묶으면 `코드스팬추가` 이런 식으로 쓸 수 있음.

   `ctrl` + `shift` + `m` : 수식 추가

   `ctrl` + `shift` + `q` or > : 인용문 추가 

   `ctrl` + `]` : 들여쓰기

   `ctrl` + `[` : 내어쓰기 

   `\` : 역슬래시 뒤의 Syntax(문자, 표기 등)를 Escape합니다.



### Chapter 3. Advanced (* - very)



### MarkDown Reference

1. Link가 git에서 왜 안보일까요? 원인 찾기 -> 주말

2. FootNote 문제도 찾아야 함.

3. [Typora]: https://typora.io/	"MarkDown Editor"

4. [Typora Reference]: https://support.typora.io/Markdown-Reference/

   