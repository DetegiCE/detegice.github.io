---
title: "[Ubuntu] 04. 패키지 설치"
date: 2019-11-06
categories: ubuntu
---

# apt-get

apt-get은 우분투에서 제공하는 패키지인 .deb 파일을 설치하는 프로그램이다.

우분투에서 제공하는 deb 파일 레포지토리에서 설치되는 deb 파일 뿐만 아니라, 인터넷 상에 있는 deb 파일 또한 찾아서 설치해준다.

저장소의 URL은 ``/etc/apt/sources.list``에 있다. 

![04-01](https://user-images.githubusercontent.com/26007107/68394682-a5c1c480-01b1-11ea-9337-7359f32d1d5c.png)

apt 설치가 제대로 되지 않는 경우 [이 링크](https://detegice.github.io/apt-install-doesnt-work/)를 참고해보자  

## 명령어

``dpkg -l 패키지 이름`` : 패키지 설치 전, 이미 설치가 되어있는지 확인

``apt-get -y install 패키지이름`` : 패키지를 다운로드 한 후, 설치를 함

``apt-get update`` : ``/etc/apt/sources.list`` 파일이 내용이 수정되면 패키지 목록을 업데이트 하는 명령어 

``apt-get remove 패키지이름`` : 설치된 패키지를 삭제함

``apt-get purge 패키지이름`` : 설치된 패키지를 설정파일을 포함하여 삭제함

``apt-get autoremove`` : 사용하지 않는 패키지를 모두 삭제함

``apt-get autoclean`` : 설치 할 때 다운로드 받은 파일들을 삭제함

``apt-cache show 패키지이름`` : 패키지의 정보를 출력 

``apt-cache depends 패키지이름`` : 패키지에 대한 의존성 정보를 출력 

``apt-cache rdepends 패키지이름`` : 이 패키지에 의존하는 패키지를 출력 

## ``/etc/apt/sources.list`` 파일 살펴보기

![04-02](https://user-images.githubusercontent.com/26007107/68395473-1fa67d80-01b3-11ea-982e-2aec21bcfdce.png)

```
deb http://security.ubuntu.com/ubuntu bionic universe
```

``deb 우분투저장소URL 버전코드명 저장소종류`` 가 문법이 된다.

**버전 코드 명**의 경우 14.04 LTS는 trusty, 16.04 LTS는 xenial, 18.04 LTS는 bionic으로 되어있다.

버전 코드 명이 그냥 ``bionic``인 경우, 18.04 LTS가 출시된 때에 제공된 패키지 버전을 설치하겠다는 것이고

``bionic-updates``인 경우, 그 이후에 버전이 올라간 경우 올라간 버전을 설치하겠다는 것이다.





# 실습

1. ``mysql-client`` 패키지가 설치되어있는지 확인하고, 패키지의 정보를 확인해보자 
1. ``mysql-client`` 패키지를 설치해보자 
