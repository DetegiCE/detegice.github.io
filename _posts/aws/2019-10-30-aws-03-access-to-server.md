---
title: "[개인 서버 만들기] 3. 서버 접속하기"
date: 2019-10-30
categories: aws
---

이제 본인의 서버에 접속을 해보도록 하겠습니다.

먼저 본인의 서버가 잘 실행되고 있는지 EC2 대시보드로 가봅시다.

![ec2_7](https://user-images.githubusercontent.com/26007107/67828589-4f9cb380-fb17-11e9-8fb4-ef87c7a2000a.PNG)

**실행 중인 인스턴스**를 눌러 확인해봅시다.

![ec2_8](https://user-images.githubusercontent.com/26007107/67828658-98546c80-fb17-11e9-8ff3-16775077683d.png)

본인이 만든 서버에 대한 정보가 나옵니다.

그 중 **IPv4 퍼블릭 IP**가 접속할 서버의 IP가 됩니다.

이제 이 서버에 접속할 클라이언트를 찾아봅시다.

일반적으로 **Putty**나 **MobaXTerm** 등을 사용하게 됩니다.

본인이 사용하기 편한 클라이언트를 사용하시면 되나, 저는 MobaXTerm을 더 선호하기 때문에 이를 이용하겠습니다.

[MobaXTerm 다운로드](https://mobaxterm.mobatek.net/)

![ec2_9](https://user-images.githubusercontent.com/26007107/67828811-30525600-fb18-11e9-8f76-8e44e5076820.png)

**New Session**을 눌러 서버에 접속해봅시다.

![ec2_10](https://user-images.githubusercontent.com/26007107/67828865-5c6dd700-fb18-11e9-8261-3a11538e0335.png)

**Remote Host**에는 EC2 인스턴스에 있는 IPv4 퍼블릭 IP를 적어주시고,

**Specify username**에는 **ubuntu**를 적어줍니다.

그리고 **Advanced SSH settings**를 열어 **Use private key**를 활성화 시켜주시고,

저번에 저장했던 프라이빗 키를 찾아줍니다.

그리고 **OK**를 눌러주시면, 본인의 서버에 접속하실 수 있습니다.

![ec2_11](https://user-images.githubusercontent.com/26007107/67828990-cab29980-fb18-11e9-9d4a-ad18c810450a.png)
