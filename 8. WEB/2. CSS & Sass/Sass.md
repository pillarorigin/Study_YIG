##  Sass(scss)
Syntactically Awesome StyleSheets)는 CSS pre-processor 로서 CSS의 단점을 보완하여 가독성을 높이고 코드의 재사용에 유리한 CSS의 extension이다.
- CSS를 구조화하여 표현하므로 CSS보다 간결하다.
- 스킬 레벨이 다른 팀원들과의 작업 시 발생하는 수준 차이를 평준화할 수 있다.
- CSS에 존재하지 않는 Mixin등의 기능을 활용하여 CSS 코드 유지보수 편의성을 향상시킨다.

### 1. Sass의 기능
1. 변수의 사용
2. 조건문과 반복문
3. import
4. Nesting
5. Mixin
6. Extend / Inheritance

### 2. Sass Install
1. Ruby Sass(Ruby 환경에서 개발 할 경우) 와 LibSass(Node.js 환경에서 개발 할 경우) 두가지 버전 중 하나를 택하여 설치
2. node-sass
   ```bash
   $ npm install -g node-sass
   $ node-sass -v //버전 확인
   ```

### 3. Command (node-sass 기준)
1. compile
   1. SCSS 파일의 경로와 컴파일 후 생성될 css 파일의 경로를 지정
   ```bash
   $ cd sass-project
   // 특정 파일을 특정 파일 이름으로 컴파일
   $ node-sass HelloWorld.scss > HelloWorld.css
   //폴더 내의 모든 파일을 컴파일
   $ node-sass src/sass --output dist/css
   ```
2. style
   ```bash
   $ node-sass --output-style [option] src/sass --output dist/css
   ```
   1. nested : sass 형식과 유사하게 nested된 css파일이 생성된다. 
   2. expanded : 표준적인 스타일의 css파일이 생성된다.
   3. compact : 여러 룰셋을 한줄로 나타내는 스타일의 css파일이 생성된다.
   4. compressed : 가능한 빈공간이 없는 압축된 스타일의 css파일이 생성된다.

3. watch
   1. file 단위의 watch
   2. dir 단위의 watch

### 4. SASS vs SCSS
1. Sass (.sass) 와 SCSS (.scss) 두 가지 표기법이 있는데 Sass 3.0 version 부터 css 친화적인 SCSS(Sassy CSS) 표기법이 기본 표기법으로 됨.

|             | SCSS     | SASS                                            | CSS    |
| :---------- | :------- | :---------------------------------------------- | :----- |
| 중괄호 {}   | 필요     | 불필요（공백 2문자 들여쓰기가 코드 블록을 의미) | 필요   |
| 세미콜론 ;  | 필요     | 불필요                                          | 필요   |
| : 뒤의 공백 | 불필요   | 필요                                            | 불필요 |
| Mixin       | @mixin   | =                                               | 없음   |
| Include     | @include | +                                               | 없음   |
| 확장자      | .scss    | .sass                                           | .css   |

## Reference
- 