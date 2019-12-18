## Bootstrap
Bootstrap은 간편한 responsive web design을 위한 open source front-end framework이다.

### 1. Bootstrap 설치
1. Download
   [Bootstrap] : https://getbootstrap.com/docs/4.4/getting-started/introduction/

2. Bootstrap CDN
   1. CDN 이란 html 파일에서 참조하는 css, js 파일이나 리소스 파일을 웹사이트 server가 아닌 공용의 server에 두고 웹사이트가 참조할 수 있게 하는 서비스를 의미.
   2. 웹사이트 구축 시, 다운로드가 필요 없고 로딩 속도가 빠르지만 CDN제공 서버가 다운되면 사용이 불가 하다.
   3. npm(node package manager)으로 설치
   ```bash
   $ cd <project 경로>
   $ npm init -y
   $ npm install --save bootstrap
   ```
### 2. Bootstrap Grid System
1. Media Query
   - Bootstrap은 Mobile-first 방식을 기본 지원하므로 Media query에 포함되지 않은 모든 정의는 768px 미만 디바이스를 위한 것이다.
   - Bootstrap은 기본적으로 4개의 breakpoint로 구간을 나눈다.
   - @screen-*의 @는 LESS의 변수를 의미한다. LESS는 CSS 프리프로세서(Preprocessor)로서 Bootstrap의 소스코드는 LESS를 기반으로 작성되었다.
  ```bootstrap
    /* Large devices (large desktops, 768px and up) */
    @media (min-width: @screen-sm-min) { /* ... */ }
    /* Large devices (large desktops, 992px and up) */
    @media (min-width: @screen-md-min) { /* ... */ }
    /* Large devices (large desktops, 1200px and up) */
    @media (min-width: @screen-lg-min) { /* ... */ }
  ```

2. Container
   Contents를 감싸는 wrapping 요소를 포함해야 한다. padding 문제 때문에  2가지 container를 중첩 사용하는 것은 비추.
   - `.container class` : fixed width container로서 responsive fixed layout(반응형 고정폭 레이아웃)을 제공한다.
   - `container-fluid class` : full width container로서 fluid layout(유동 최대폭 레이아웃)을 제공한다.

3. Grid system
   1. Bootstrap은 반응형 12열 그리드 시스템.
   ```bootstrap
   그리드 레이아웃을 구성 시에는 반드시 .row(행)를 먼저 배치하고 행 안에 .col-*-*(열)을 필요한 갯수만큼 배치한다. 즉, container 내에 .row(행)을 먼저 배치하고 그 안에 .col-*-*(열)을 배치한다. 그리고 콘텐츠는 .col-*-* 내에 배치한다.
   .container or .container-fluid
    .row
    .col-xs-#
      contents
    .col-xs-#
      contents
    .row
    .col-xs-#
      contents
    .col-xs-#
      contents
   ```
   2. row (행)의 구성
   
   3. col (열)의 구성
    ![bs_grid_options](C:\Users\Youinguk\Desktop\Study_YIG\1. WEB\3. BootStrap\bs_grid_options.png)
    1. .col-xs-* class
       1. viewport width와 관계없이 .col-xs-* 클래스는 언제나 적용되어 항상 수평으로 정렬
    2. .col-sm-* class
    3. .col-md-* class
    4. .col-lg-* class
    5. col-class 복합 구성
       1. Mobile and desktop
       2. Mobile, tablet, desktop
       3. Nesting columns
       4. Offsetting columns
       5. Column ordering