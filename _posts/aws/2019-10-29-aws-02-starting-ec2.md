---
title: "[개인 서버 만들기] 2. EC2 시작하기"
date: 2019-10-29
categories: aws
---

이제 본인의 개인 서버를 만들어봅시다.

[이 포스팅](https://detegice.github.io/aws-01-create-aws-account/)을 읽고 나서 AWS에 가입이 완료되었다면, AWS Management Console로 로그인을 하실 수 있습니다.

![ec2_1](https://user-images.githubusercontent.com/26007107/67737986-66c49e00-fa50-11e9-8251-9d889a2e74c6.png)

위의 **서비스**를 클릭하셔서 **컴퓨팅** 메뉴의 **EC2**를 선택해주세요.

![ec2_2](https://user-images.githubusercontent.com/26007107/67738042-8e1b6b00-fa50-11e9-9077-baf3932f8032.PNG)

**인스턴스 생성**을 눌러주세요.

인스턴스 생성 시, 미국/동부 오하이오 지역에 서버가 만들어지게 되는데,

이 리전의 변경은 우측 상단의 *오하이오*를 눌러 변경하실 수 있습니다.

인스턴스 생성시, AMI 선택이 나오는데, 프리 티어를 사용하고 계신 분은 

![ec2_3](https://user-images.githubusercontent.com/26007107/67738082-c91d9e80-fa50-11e9-9e4e-4bee5eccede4.PNG)

이렇게 프리티어 사용 가능이라 써진 AMI만 사용하실 수 있습니다.

원하시는 AMI를 아무거나 선택하실 수 있지만, 가장 보편적인 **Ubuntu**나 **CentOS**를 추천합니다.

이 포스팅에서는 **Ubuntu Server 18.04 LTS**로 진행해보겠습니다.

![ec2_4](https://user-images.githubusercontent.com/26007107/67738262-40ebc900-fa51-11e9-8161-15f2d3dda5b4.PNG)

인스턴스 유형은 프리티어가 사용이 가능한 **t2.micro**로 해주시고, **검토 및 시작**을 눌러줍니다.

인스턴스 시작 검토에서 본인이 선택하신 사항을 최종적으로 검토하시고 **시작**을 눌러줍니다.

![ec2_5](https://user-images.githubusercontent.com/26007107/67738296-6b3d8680-fa51-11e9-95d3-ef35db467c91.PNG)

이제 키 페어를 선택하는 창이 나오는데, 이 **키 페어**를 간단하게 설명하면 본인의 서버에 접속하기 위한 열쇠라고 생각하시면 됩니다.

키 페어를 이미 만들어 두셨던 분이라면 **기존 키 페어 선택**을 하시면 되지만, 우리는 처음 서버를 만드는 것이기 때문에 **새 키 페어 생성**을 선택하여 본인이 원하는 키 페어 이름을 입력하신 후, **키 페어 다운로드**를 눌러줍니다.

지금 만드신 키 페어는 매우 중요한 것이므로, 잃어버리지 않도록 유의하시기 바랍니다.

다운로드가 완료되면 **인스턴스 시작**이 활성화 되며, 본인의 프라이빗 서버가 완성이 됩니다.

![ec2_6](https://user-images.githubusercontent.com/26007107/67738422-dc7d3980-fa51-11e9-882a-2c07ca59e07d.png)

이 창이 뜬다면 성공적으로 완성이 된 것입니다.

[(NEXT) 3. 서버 접속하기](https://detegice.github.io/aws-03-access-to-server/)
