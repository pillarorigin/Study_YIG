## CSS
CSS는 Styling(design, layout etc), Presentation

### 1. Selector (선택자)
![css-syntax](C:\Users\Youinguk\Desktop\Study_YIG\1. WEB\2. CSS\css-syntax.png)
위의 구문을 Rule Set이라 하며 HTML 요소에 어떻게 Rendering 할 것인지 지정하는 역할을 하고 Rule Set의 집합을 Style Sheet라 한다.

1. Universal Selector : `*`(HTML 문서 내의 모든 요소 선택해서 css 적용)
2. Type Selector : 특정 태그명(`p`, `div` 등)에 css 적용
3. ID Selector : `#id` (id Attribute 값을 지정하여 일치하는 요소에 css적용, 중복될 수 없는 유일한 값.)
```css
   <style>
   #p1 { color : red; }
   </style>
   (중략)
   <body> <div> <p id="p1"> ID Selector를 지정한 경우입니다. </p> </div> </body>
```
4. Class Selector : `.class` (class Attribute 값을 지정하여 일치하는 요소에 css 적용 가능. 중복될 수 있는 값.)
```css
   <style>
   .container { color : red; }
   </style>
   (중략)
   <body> <div class="container"> <p> Class Selector를 지정한 경우입니다. </p> </div> </body>
```
5. Combinator Selecotr (복합 셀렉터)
   1. Descendant Combinator (후손 셀렉터)
   2. Child Combinator (자식 셀렉터)
   3. Sibling Combinator (형제 (동위) 셀렉터)
      1. Adjacent Sibling Combinator (인접 형제 셀렉터)
      2. General Sibling Combinator (일반 형제 셀렉터)
6. Pseudo-Class Selector (가상 클래스 셀렉터)
   1. Link pesudo-classes (링크 셀렉터)
   2. User action pesudo-classes (동적 셀렉터)
   3. UI element states pesudo-classes (UI 요소 상태 셀렉터)
   4. Structural pesudo-classes (구조 가상 클래스 셀렉터)
   5. Validity pesudo-classes (정합성 체크 셀렉터)
   6. Pesudo-Element Selector (가상 요소 셀렉터)

### 2. Property
Selector로 HTML요소를 선택하고 { } 내부에 Property 값을 지정하는 것으로 style 정의 가능. 다수의 Property는 `;(세미콜론)`으로 구분
```css
h1 {
    /* 여기서 property는 color와 font-size */
    color : red;
    font-size : 12px;
}
```
### 3. Value (속성값)
Property의 값에 해당하는 값
```css
h1 {
    /* 여기서 Value는 red와 12px */
    color : red;
    font-size : 12px;
}
```
1. 키워드 : 각 Property에 따라 사용 할 수 있는 키워드 존재. 
2. 크기 단위
   1. `px` : 디바이스 해상도(resolution)에 따라 상대적인 크기 갖는다.
   2. `%` : 백분률 단위의 상대 단위.(상속과 default 사이즈에 대해 상대적)
   3. `em` : 배수 단위로 상대 단위. (상속과 default 사이즈에 대해 상대적) 1em은 요소에 지정된 사이즈와 같고 2em은 요소에 지정된 사이즈의 2배 (em 지정 시 모든 자식 요소에 영향)
   4. `rem` : em의 기준은 상속의 영향으로 바뀔 수 있다.
   5. Viewport 단위 (`VH`,`VW`,`vmin`, `vmax` )
      1. `vw` : viewport 너비의 1/100
      2. `vh` : viewport 높이의 1/100
      3. `vmin` : viewport 너비 또는 높이 중 작은 쪽의 1/100
      4. `vmax` : viewport 너비 또는 높이 중 큰 쪽의 1/100

### 4. Box-model (박스 모델)
![box-model](C:\Users\Youinguk\Desktop\Study_YIG\1. WEB\2. CSS\box-model.png)
1. Content : 요소의 텍스트나 이미지 등의 실제 내용이 위치하는 영역이다. width, height 프로퍼티를 갖는다.
2. Padding : 테두리(Border) 안쪽에 위치하는 요소의 내부 여백 영역이다. padding 프로퍼티 값은 패딩 영역의 두께를 의미하며 기본색은 투명(transparent)이다. 요소에 적용된 배경의 컬러, 이미지는 패딩 영역까지 적용된다.
3. Border : 테두리 영역으로 border 프로퍼티 값은 테두리의 두께를 의미한다.
4. Margin : 테두리(Border) 바깥에 위치하는 요소의 외부 여백 영역이다. margin 프로퍼티 값은 마진 영역의 두께를 의미한다. 기본적으로 투명(transparent)하며 배경색을 지정할 수 없다.
![box-model-calc](C:\Users\Youinguk\Desktop\Study_YIG\1. WEB\2. CSS\box-model-calc.png)
![box-model-detail](C:\Users\Youinguk\Desktop\Study_YIG\1. WEB\2. CSS\box-model-detail.png)

### 5. display
display Property는 layout을 정의하는 중요 Property
1. block : block 특성을 가지는 요소(block 레벨 요소)로 지정
2. inline : inline 특성을 가지는 요소(inline 레벨 요소)로 지정
3. inline-block : inline-block 특성을 가지는 요소(inline-block 레벨 요소)로 지정
4. none : 해당 요소를 화면에 표시하지 않는다 (공간조차 사라진다)

### 6. Background-image Property
1. background-image : url("http://www.pillarorigin.com/css.png");
2. background-repeat : repeat-x; //배경 이미지 반복 ( <-> no-repeat )
3. background-size : 1024px 760px; (//100% 100%; //cover;)
4. background-attachment
5. background-position ; 0px, 0px, center;
6. background-color
7. background Shorthand
[MDN web docs] : https://developer.mozilla.org/en-US/docs/Web/CSS/background-image

### 7. Font
1. font-size
2. font-family
3. line-height : 텍스트 높이 지정 및 수직 정렬에 응용
4. letter-spacing : 자간 지정 및 글씨 여백을 강조할 때 응용
5. text-align : 텍스트 수평 정렬 ( center, right, left, justify )
6. text-decoration : underline, overline, line-through
7. white-space : 공백, 들여쓰기, 줄바꿈 설정
8. text-overflow : 부모영역을 벗어난 wrapping(자동줄바꿈)이 되지 않은 텍스트 처리 방법
   1. clip : 영역을 벗어는 텍스트를 표시하지 않는다 (default)
   2. ellipsis : 영역을 벗어난 텍스트를 잘라내어 보이지 않게 하고 줄임표(...) 를 표시
9. word-wrap : 한 단어의 길이가 길어서 (link url 등) 부모 영역을 벗어나는 경우 부모 영역을 넘지 않게 처리 (word-break: break-all; :부모영역에 강제 개행)

### 8. position
1. static
2. relative (static을 기준으로 top, bottom, left, right를 사용)
3. absolute 
   - 부모 요소 또는 가장 가까이 있는 조상 요소(static 제외)를 기준으로 좌표 프로퍼티(top, bottom, left, right)만큼 이동한다. 즉, relative, absolute, fixed 프로퍼티가 선언되어 있는 부모 또는 조상 요소를 기준으로 위치가 결정된다. 
   - 만일 부모 또는 조상 요소가 static인 경우, document body를 기준으로 하여 좌표 프로퍼티대로 위치하게 된다.
   - 따라서 부모 요소를 배치의 기준으로 삼기 위해서는 부모 요소에 relative를 정의하여야 한다.
   - 이때 다른 요소가 먼저 위치를 점유하고 있어도 뒤로 밀리지 않고 덮어쓰게 된다. (이런 특성을 부유 또는 부유 객체라 한다)
   - absolute 선언 시, block 레벨 요소의 width는 inline 요소와 같이 content에 맞게 변화되므로 적절한 width를 지정하여야 한다.
4. fixed : 스크롤이 되더라도 화면에서 사라지지 않고 항상 같은 곳에 위치한다. fixed 프로퍼티 선언 시, block 요소의 width는 inline 요소와 같이 content에 맞게 변화되므로 적절한 width를 지정하여야 한다.
5. z-index : 큰 숫자값을 지정할 수록 화면 전면에 촐력
6. overflow
   1. visible : 영역을 벗어난 부분을 표시한다. (기본값)
   2. hidden : 영역을 벗어난 부분을 잘라내어 보이지 않게 한다.
   3. scroll : 영역을 벗어난 부분이 없어도 스크롤 표시한다.(현재 대부분 브라우저는 auto과 동일하게 작동한다)
   4. auto : 영역을 벗어난 부분이 있을때만 스크롤 표시한다.

### 9.Float

### 10. Inheritance & Cascading

### 11. Vender prefix

### 12. Gradient

### 13. Transition 

### 14. Animation

### 15. Transform

### 16. Layout

### 17. Responsive Web Design

### 18. Flexbox Layout

### 19. Typography

## CSS 이것만은 확실히!

## Reference
- 