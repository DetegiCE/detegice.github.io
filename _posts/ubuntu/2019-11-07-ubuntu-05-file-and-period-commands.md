---
title: "[Ubuntu] 05. 파일 및 주기(period) 관련 명령어"
date: 2019-11-07
categories: ubuntu
---

# 파일 관련 명령어

리눅스에서 자주 사용하는 압축 확장자는 xz, bz2, gz, zip, Z 등이 있다.

## 파일 압축

### xz

가장 압축률이 뛰어나다

``xz 파일명`` : 기존 파일은 삭제되며, 해당 파일이 압축되어 ``파일명.xz``가 된다. (``abc.txt`` --> ``abc.txt.xz``)

``xz -d 파일명.xz`` : 해당 파일을 압축 해제함. (Decompress)

``xz -l 파일명.xz`` : 압축 파일에 포함된 파일 목록과 압축률 등의 정보 출력 (List)

``xz -k 파일명`` : 기존 파일을 유지한 채 파일 압축 (Keep)

### bzip2

압축 확장자 bz2. 작동 방식은 xz와 유사함. 

``bzip2 파일명``

``bzip2 -d 파일명.bz2``

``bzip2 -k 파일명``

### gzip

압축 확장자 gz. 작동 방식은 xz와 유사함.

``gzip 파일명``

``gzip -d 파일명.gz``

### zip/unzip

Windows OS와 호환

``zip 새파일명.zip 압축할파일명`` : ``압축할파일명``을 ``새파일명.zip``으로 압축

``unzip 압축파일명.zip`` : ``압축파일명.zip``의 압축을 해제

## 파일 묶기

### tar

확장명 tar로 묶음 파일을 만들거나 해제

명령 | 동작
:---:|:---
``c`` | 새로운 묶음을 만듬
``x`` | 묶인 파일을 해제
``t`` | 묶음 해제 전 묶인 경로를 보여줌
``C`` | 묶음 해제 시, 지정된 경로에 해제. 

옵션 | 동작
:---:|:---
``f``(필수) | 묶음 파일 지정
``v`` | 파일이 묶이거나 풀리는 과정을 보여줌 (Visual)
``J`` | tar + xz
``z`` | tar + gzip
``j`` | tar + bzip2

**자주 사용**

``tar xvfJ 파일명.tar.xz`` : ``파일명.tar.xz``을 해제

``tar xvfj 파일명.tar.bz2`` : ``파일명.tar.bz2``를 해제

## 파일 위치 검색

### find

옵션 | 동작
:---:|:---
``-name`` | 파일명
``-user`` | 소유자
``-newer`` | 전, 후
``-perm`` | 소유권
``-size`` | 크기

action | 동작
:---:|:---
``-print`` | 기본 값
``-exec`` | 외부 명령 실행

**예시**

``find /etc -name "*.conf"`` : ``/etc`` 디렉토리 하위에 확장자가 ``.conf``인 파일 검색

``find /home -user ubuntu`` : ``/home`` 디렉토리 하위에 소유자가 ubuntu인 파일 검색

``find ~ -perm 755`` : 현재 사용자의 홈 디렉토리 하위에 허가권이 755인 파일 검색

``find /usr/bin -size +10k -size -100k`` : ``/usr/bin`` 디렉토리 하위에 파일 크기가 10KB~100KB인 파일 검색

``find ~ -size 0k ls -l { } \;`` : 현재 사용자의 홈 디렉토리 하위에 파일 크기가 0인 상세 파일 목록 출력

``find /home -name "*.swp" -exec rm { } \;`` : ``/home`` 디렉토리 하위에 확장자가 ``.swp``인 파일 삭제 

# 주기 관련 명령어

## cron

시스템 작업을 예약하는 명령어이다.

cron과 관련된 서비슨느 crond이고, 파일은 ``/etc/crontab``에 있다.

![05-01](https://user-images.githubusercontent.com/26007107/68398388-fcca9800-01b7-11ea-9f2c-8455373bf1b4.png)

``분 시 일 월 요일 사용자 실행명령`` 의 형식을 이루고 있다.

``15 14 3 * * root cp -r /home /backup``의 경우, 매월 3일 14시 15분에 root 사용자 권한으로 ``cp -r /home /backup`` 명령을 실행한다는 것이다.

``systemctl status cron`` 명령어를 통해 cron 서비스가 제대로 작동하는지 확인할 수 있다.

``vi /etc/crontab`` 명령어를 통해 cron 명령을 추가할 수 있다.

