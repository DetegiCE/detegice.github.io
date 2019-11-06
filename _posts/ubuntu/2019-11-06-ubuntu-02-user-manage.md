---
title: "[Ubuntu] 02. 사용자 관리"
date: 2019-11-06
categories: ubuntu
---

# 사용자 관리 

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

# 명령어

사용자와 그룹에 관련된 명령어는 많이 있다.

## adduser

새로운 사용자 추가

``adduser newuser`` : newuser이라는 이름의 사용자 생성

``adduser --uid 1234 newuser1`` : newuser1 사용자를 생성하며 사용자ID를 1234로 지정

``adduser --gid 1000 newuser2`` : newuser2 사용자를 생성하며 그룹ID가 1000인 그룹에 배정

``adduser --home /brandnewhome newuser3`` : newuser3 사용자를 생성하며 홈 디렉토리를 ``/brandnewhome``으로 지정

``adduser --shell /bin/newshell newuser4`` : newuser4 사용자를 생성하며 기본 셸 위치를 ``/bin/newshell``로 지정

## passwd

사용자의 비밀번호 변경

``passwd newuser5`` : newuser5의 비밀번호 변경

## usermod

사용자의 속성 변경

``usermod --shell /bin/newshell1 newuser6`` : newuser6의 기본 셸을 ``/bin/newshell1``으로 변경

``usermod --groups ubuntu newuser7`` : newuser7의 보조 그룹에 ubuntu 그룹을 추가

## userdel

사용자 삭제

``userdel newuser8`` : newuser8 사용자를 삭제하나 홈 디렉토리는 삭제되지 않음

``userdel -r newuser9`` : newuser9 사용자를 홈 디렉토리와 함께 삭제

## chage

CHange AGE의 약자로서 사용자의 암호를 주기적으로 변경하도록 설정

``chage -l ubuntu`` : ubuntu 사용자의 암호 설정 확인

``chage -m 10 ubuntu`` : ubuntu 사용자는 설정한 암호를 변경 후 최소 10일 사용해야 함

``chage -M 30 ubuntu`` : ubuntu 사용자는 암호를 변경 후 최대 30일까지만 사용가능 함

``chage -E 2020/02/13 ubuntu`` : ubuntu 사용자는 설정한 암호를 2020년 2월 13일까지만 사용가능 함

``chage -W 10 ubuntu`` : ubuntu 사용자에게 설정한 암호가 만료되기 10일전부터 알림 경고를 함

## groups 

사용자의 소속 그룹을 보여줌

``groups`` : 현재 사용자의 소속 그룹을 보여줌

``groups newuser1`` : newuser1의 소속 그룹을 보여줌

## groupadd

새로운 그룹 생성

``groupadd newgroup1`` : newgroup1이라는 그룹 생성

``groupadd --gid 2345 newgroup2`` : newgroup2라는 그룹을 생성하며 그룹ID를 2345로 설정

## groupmod

그룹 속성 변경 

``groupmod --new-name newname1 newgroup1`` : newgroup1 그룹이름을 newname1으로 변경

## groupdel

그룹을 삭제

``groupdel newgroup3`` : newgroup3을 삭제 (단, 이 그룹을 주 그룹으로 설정한 사용자가 없어야 함)

## gpasswd

그룹의 암호를 설정하거나 그룹을 관리

``gpasswd newgroup1`` : newgroup1 그룹에 암호를 설정

``gpasswd -A newuser1 newgroup1`` : newgroup1의 관리자를 newuser1으로 설정

``gpasswd -a newuser2 newgroup1`` : newgroup1에 newuser2를 추가

``gpasswd -d newuser2 newgroup1`` : newgroup1에서 newuser2를 제거

# 실습

1. user1 사용자를 만들어보자.
1. user1 사용자를 삭제해보자.
1. group1 그룹을 만들어보자
1. user1 사용자를 group1 그룹에 속하도록 설정하여 만들어보자.
1. user1 사용자의 홈 디렉토리와 ``/etc/skel`` 폴더의 내용을 비교해보자.
