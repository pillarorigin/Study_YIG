## HTML
HTML은 정보와 구조화, Content

### 1. HTML 기본 구조
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    
</body>
</html>
```

### 2. Line 태그
| `태그`                         | 설명                                                   |
| ------------------------------ | ------------------------------------------------------ |
| `&nbsp;`                       | 공백                                                   |
| `<P align="">`                 | 문단을 바꾸는 태그 줄바꿈과 동시에 줄을 띈 것같은 효과 |
| `<BR>`                         | 문단을 바꾸는 태그 줄바꿈의 역할만 수행                |
| `<PRE>` `</PRE>`               | 여백이나 줄간격 등을 고정시켜 주는 역할                |
| `<BLOCKQUOTE>` `</BLOCKQUOTE>` | 들여쓰기                                               |
| `<CNETER>` `</CENTER>`         | 전체 문장을 가운데로 정렬                              |
| `- align`                      | 정렬하기 [left/center/right]                           |

### 3. Text 태그
| `태그`                                 | 설명                                     |
| ------------------------------------- | ----------------------------------------- |
| `<STRONG>` `</STRONG>` , `<B>` `</B>`           | 굵은 글씨를 나타내 주는 태그           |
| `<I>` `</I>`, `<EM>` `</EM>`, `<VAR>` `</VAR>`       | 이탤릭체의 글씨를 나타내 주는 태그|
| `<KBD>` `</KBD>`, `<CODE>` `</CODE>`, `<TT>` `</TT>` | 타자기체의 글씨를 나타내 주는 태그|
| `<U>` `</U>`                               | 글자에 밑줄                               |
| `<S>` `</S>`                               | 글자 중앙을 가로지르는 중앙선을 긋는 태그   |
| `<BIG>` `</BIG>`                           | 글자 크기를 크게 변경                     |
| `<SMALL>` `</SMALL>`                       | 글자 크기를 작게 변경                     |
| `<BLINK>` `</BLINK>`                       | 글자를 깜박이게                           |
| `<SUB>` `</SUB>`                           | 아랫첨자                                  |
| `<SUP>` `</SUP>`                           | 윗첨자                                    |

### 4. List 태그
| `태그`        | 설명                                              |
| ------------- | ------------------------------------------------ |
| `<UL>` `</UL>`     | 순서가 없는 목록. 일반적인 나열                  |
| `<OL>` `</OL>`     | 순서가 있는 목록. 위에서부터 번호 매김           |
| `<MENU>` `</MENU>` | 메뉴 목록으로 그리길지 않은 문장의 열거에 사용   |
| `<DIR>` `</DIR>`   | 디렉토리 목록으로 메뉴 목록보다 짧은 문장을 나열 |
| `<DL>` `</DL>`     | 정의 목록 태그<LI>가 아닌<DT>와 <DD>를 사용      |

### 5. Link 태그
  `<A href="URL"> </A>` : 연결될 URL 지정 ("mailto:mail-address" : 메일보내기) 
  `<A name=""></A>` : 자신의 홈페이지 내에서 연결 (책갈피) (다른 페이지에서 책갈피로드 : URL#name)
  `<A href="URL" target="_self/_blank">` : target [ _self : 지금 창에서 연결 (default) /  _blank : 새창으로 연결 ]

### 6. Image 태그
```html
<IMG 
    src="이미지 경로" 
    width="n" 
    height="n" 
    border=n 
    vspace="n (좌우, 상하 여백 지정) "  
    hspace="n (좌우, 상하 여백 지정) " 
    align="left/right/..." 
    alt="설명"
>
```
`<BODY background="이미지경로">` : 배경 이미지 띄어줌
`<BODY bgcolor="색깔"> ` : 배경 색깔을 지정
`<BODY text="#nnnnnn"></BODY>` : 글자색을 지정
`<BODY link="#nnnnnn"></BODY>` : 하이퍼링크의 색을 지정
`<BODY vlink="#nnnnnn"></BODY>` : 한번 누른적이 있는 하이퍼링크의 색을 지정
`<BODY alink="#nnnnnn"></BODY> ` : 누르고 있는 동안의 하이퍼링크의 색을 지정

 ### 7. Table 태그 및 CSS
 ```html
 <TABLE 
    width="너비" 
    height="높이" 
    border="경계선 [border-width, border-style, border-color]" 
    bordercolor="" 
    background="테이블 배경 이미지 지정" 
    frame="바깥쪽 테두리 [ void / boxs ]" 
    rules=" 안쪽 테두리 [ none : 테두리 없음 / cols : 열사이만 테두리 / rows : 행사이만 테두리 ]" 
    cellspacing="셀간의 여백 지정" 
    cellpadding="셀과 내용물간의 여백 지정" 
    align="테이블 정렬 [ left / center / right ]"
>      

<TR>
    <TD>1행 1열</TD>
    <TD>1행 2열</TD>
</TR>  
<TR>
    <TD>2행 1열</TD>
    <TD>2행 2열</TD>
</TR>  
<TD 
    bgcolor="" 
    colspan="행(가로칸)을 n만큼 병합" 
    rowspan="열(세로칸)을 n만큼 병합" 
    align="내부 값의 좌,우 정렬 방식을 정의 " 
    valign="표안의 상하 정렬 방식을 정의 [ top / middle / bottom ]" 
    nowrap="셀 줄바꿈 안되게 지정"> 
</TD>
</TABLE>    
 ```

### 8. Form 태그
```html
<FORM>
    // 텍스트 입력창
<INPUT type="text" name="" value="" size="" maxlength="">    
    // 패스워드 입력창
<INPUT type="password" name="" value="" size="" maxlength="">
    // 텍스트 박스 작성 영역
<TEXTAREA name="" rows="" cols=""> </TEXTAREA>                       
    // 라디오버튼
<INPUT type="rado" name="" value="" checked>
    // 체크박스
<INPUT type="checkbox" name="" value="" checked>
    // 콤보박스 (OPTION으로 항목 추가 가능)
<SELECT name="">
 <OPTION value=""> </OPTION>
 <OPTION value="" selected> </OPTION>
 ...
</SELECT>
    // 파일 선택 상자
<INPUT type="file" name="" size="">
    // form 태그로 묶인 정보들을 req 객체에 담아서 보내는 버튼
<INPUT type="submit" name="" value="">
    // 취소버튼
<INPUT type="reset" name="" value="">
    // 이미지 버튼
<INPUT type="image" name="" src="이미지 경로" alt="설명" align="">
</FORM>
```

### 9. Frame 태그
```html
<FRAMESET cols="" rows="" border="" bordercolor="" frameborder="yes/no" framespacing="여백 크기 지정">
  <FRAME name="프레임 이름" src="프레임 문서 경로" marginheight="" marginwidth="" scrolling="auto/yes/no" noresize>
  </FRAME>
</FRMAMSET>
```

### 10. 기타 태그
    10.1 이미지 태그
```html
    //name : `<IMG>` 의 usemap 에서 지정한 맵이름과 동일해야한다.
<MAP name="menu">
    //shape : 이미지맵의 모양을 사각형(rect), 타원형(circle), 다각형(poly) 중에 지정
    <AREA shape="rect/circle/poly" coords="좌표" href="URL" alt="설명">
    //coords : shape 에서 선택한 이미지맵에 따라 좌표부분이 달라진다. 다각형의 경우 최소 3개의 꼭지점이 필요하다. 
    (circle : 중심점 x좌표, 중심점 y좌표, 반지름)
</MAP>
```
    10.2 음악 태그
```html
<BGSOUND src="음악파일 경로" loop="">
    // autostart : 자동 시작 설정 , loop : 반복여부 설정 (-1 : 무한반복)
<EMBED src="음악파일 경로" autostart="true/false" hidden="true/false" loop="true/false/">
```

## HTML에서 이것만은 확실히. 
1. `form `태그의 정보를 server에 보내는 방법.
2. `div`, `span` 태그에 어떻게 class와 id를 주고 UI를 꾸미느냐.