---
title: "리눅스 시간대 변경"
date: 2020-01-23 23:16:00
categories: linux
---

내 서버 시간대가 UTC이길래 KST로 바꾸려고 한다.

``date``를 통해 현재 시간을 확인할 수 있다.

```sh
ubuntu@myserver:~$ date
Thu Jan 23 14:15:06 UTC 2020
```

``timedatectl set-timezone Asia/Seoul`` 이 명령어를 통해 우리는 시간대를 한국/서울로 바꿔줄 수 있다.

```sh
ubuntu@myserver:~$ timedatectl set-timezone Asia/Seoul
==== AUTHENTICATING FOR org.freedesktop.timedate1.set-timezone ===
Authentication is required to set the system timezone.
Authenticating as: Ubuntu (ubuntu)
Password:
polkit-agent-helper-1: pam_authenticate failed: Authentication failure
==== AUTHENTICATION FAILED ===
Failed to set time zone: Access denied
```

하지만 어림도 없지!

루트 권한이 아니면 못 바꾼다.

```sh
ubuntu@myserver:~$ sudo su
root@myserver:/home/ubuntu# date
Thu Jan 23 14:15:25 UTC 2020
root@myserver:/home/ubuntu# timedatectl set-timezone Asia/Seoul
root@myserver:/home/ubuntu# date
Thu Jan 23 23:15:31 KST 2020
```

짜잔


