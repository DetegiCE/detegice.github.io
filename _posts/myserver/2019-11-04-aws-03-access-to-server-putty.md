---
title: "[개인 서버 만들기] 3. 서버 접속하기 (PuTTY Ver.)"
date: 2019-11-04
categories: aws
---

[PuTTY 다운로드](https://putty.ko.softonic.com/)

aws에서 다운로드 받은 pem 파일은 putty에서 지원하지 않기 때문에 ppk 파일로 변경해주어야 합니다.

먼저 PuTTYGen을 열어줍니다.

![ec2_12](https://user-images.githubusercontent.com/26007107/68112823-9afafb80-ff35-11e9-8afd-6c552ca82e3d.png)

**Load**를 누른 후, 파일 확장자를 **All Files**로 바꾼 뒤 자신의 프라이빗 키를 찾아서 엽니다.

**Save private key**를 누르고 **예**를 누른뒤 저장해줍니다.

이제 PuTTY를 실행해줍니다.

![ec2_13](https://user-images.githubusercontent.com/26007107/68112959-f200d080-ff35-11e9-8939-b5c3961d719c.png)

**Host Name**에는 EC2 인스턴스에 있는 IPv4 퍼블릭 IP를 적어주시고,

![ec2_14](https://user-images.githubusercontent.com/26007107/68113031-21afd880-ff36-11e9-9ac6-ba78901ca39c.png)

**Connection**의 **Data** 탭으로 들어가 **Auto-login username**에 **ubuntu**를 적어주시고,

![ec2_15](https://user-images.githubusercontent.com/26007107/68113102-4dcb5980-ff36-11e9-8e56-eb7d757525e3.png)

**Connection > SSH > Auth** 탭으로 들어가 **Private key file for authentication**의 **Browse**를 눌러 자신의 인증키 ppk 파일을 열어줍니다.

그리고 **Open**을 누르면 로그인이 완료됩니다.

![ec2_16](https://user-images.githubusercontent.com/26007107/68113212-8f5c0480-ff36-11e9-8c9b-bd13cc4b2856.png)

[(NEXT) 4. GUI로 접속하기](https://detegice.github.io/aws-04-access-by-gui/)
