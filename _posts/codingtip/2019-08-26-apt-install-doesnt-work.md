---
title: "apt install 오류 - Unable to locate package python3-pip"
date: 2019-08-26
categories: ubuntu
---

apt로 pip를 설치하려고 했다
```shell
sudo apt install python3-pip
```

하지만, 설치되는 척하더니, 아래의 오류를 내며 설치는 되지 않았다.
```shell
Reading package lists... Done
Building dependency tree
Reading state information... Done
E: Unable to locate package python3-pip
```

아주 간단하게 해결할 수 있다.

``/etc/apt/sources.list`` 파일로 가준다.

```
deb http://archive.ubuntu.com/ubuntu bionic main restricted
deb http://archive.ubuntu.com/ubuntu bionic-security main restricted 
deb http://archive.ubuntu.com/ubuntu bionic-updates main restricted
```

이렇게 되있는 친구들을 모두 ``restricted``에서 ``universe``로 바꿔준다.

완료되면 ``sudo apt udpate``로 업데이트를 해주면 끝!
