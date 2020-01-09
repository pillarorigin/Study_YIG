# Weather App 만들기

### 1. Expo install & init
```bash
    $ npm install expo-cli --global

    $ expo init <Project Name>
```
### 2. Project Working 
   - Mobile 환경
   - Device 환경
  
### 3. Mobile 환경에서 작업
    - Android Device 에서 Expo App 설치 후 expo 작업 폴더에서 $ yarn start(Building JavaScript bundle..) 했을 때 QR코드 Device로 스캔
    - expo 계정 생성 (username은 alphanumeric characters or single hyphens을 포함해야 함.)

### 4. host address
https://expo.io/@bobbyyou/wearher-basic

### 5. module install
```bash
    $ npm i react-devtools
    or
    $ yarn global add react-devtools
    //시물레이터가 아닌 경우 실행
    $ adb reverse tcp:8097 tcp:8097
    //독립형 DevTools로 사용하려면 터미널에서
    $ react-devtools
    //직업 폴더 <head> 부분에 아래 <script> 추가
    <!doctype html>
    <html lang="en">
        <head>
    <script src="http://localhost:8097"></script> 
```
[In-App Developer] : https://facebook.github.io/react-native/docs/debugging.html#accessing-the-in-app-developer-menu

### 6. Reload Setting
    - Hot Reloading : 코드의 변경된 부분만 리로딩
    - Live Reloading : 화면 전체를 새로고침 