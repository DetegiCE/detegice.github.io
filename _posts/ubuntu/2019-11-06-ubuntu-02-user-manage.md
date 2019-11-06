---
title: "[Ubuntu] 02. 사용자 관리"
date: 2019-11-06
categories: ubuntu
---

하나의 리눅스 서버에는 여러 명의 사용자가 동시에 접속하여 사용할 수 있다.

리눅스 서버에는 ``root``라는 최고 관리자가 있으며, 이 사용자는 시스템의 모든 작업을 수행할 수 있다. 

모든 사용자는 하나 이상의 **그룹**에 속해있어야 한다.

서버를 열어 ``cat /etc/passwd``를 해보자

![02-01](https://user-images.githubusercontent.com/26007107/68292648-a84bed80-00cf-11ea-805f-49913d1b9be4.png)

여러명의 사용자가 보이는데, 맨 위의 ``root``부터 ``usbmux``까지가 기본 표준 사용자이다.

```
사용자이름:암호:사용자ID:소속그룹ID:추가정보:홈 디렉토리:기본 셸
```

ubuntu 사용자의 정보를 봐보자

```
ubuntu:x:1000:1000:Ubuntu:/home/ubuntu:/bin/bash
```

이름 ubuntu, 암호가 x인것은 ``/etc/shadow``파일에 암호 정보가 저장되있다는 것이다. 

사용자ID는 1000, 소속 그룹의 ID도 1000, 추가정보는 개인정보등이 저장되는데 여기서는 사용자의 풀네임 (Ubuntu)가 저장되어있다.

홈 디렉토리는 ``/home/ubuntu``이며, 기본 셸은 ``/bin/bash``에서 실행된다.

이제 ``cat /etc/group``을 해보자.

![02-02](https://user-images.githubusercontent.com/26007107/68293072-8b63ea00-00d0-11ea-8468-b2a0440a1a50.png)

각 그룹들의 정보가 나온다

```
그룹이름:비밀번호:그룹ID:보조 그룹 사용자
```

audio 그룹의 정보를 봐보자

```
audio:x:29:ubuntu,pulse
```

그룹이름 audio, 암호가 x인것은 위와 같다.

그룹ID는 29, 보조 그룹 사용자는 ubuntu와 pulse이다.

**보조 그룹 사용자**는 이 그룹을 주 그룹이 아닌 보조 그룹으로 사용하는 사용자들의 목록이다.

