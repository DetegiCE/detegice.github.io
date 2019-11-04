---
title: "[개인 서버 만들기] 4. GUI로 접속하기"
date: 2019-11-04
categories: aws ubuntu
---

이제 내 서버를 터미널이 아닌 GUI를 통해 접속해봅시다.

서버를 열어 다음 명령어들을 순차적으로 입력해줍니다.

```
sudo apt-get update
sudo apt-get install ubuntu-desktop
```

``ubuntu-desktop``의 용량이 **2.1GB**이기 때문에 서버 용량을 잘 확인하신 후 설치하시기 바랍니다.

![ec2_17](https://user-images.githubusercontent.com/26007107/68113522-52dcd880-ff37-11e9-82c0-5881be847357.png)

나머지 필요한 것들도 설치해줍니다.

```
sudo apt-get install tightvncserver gnome-panel gnome-settings-daemon metacity nautilus gnome-terminal
```

이제 초기 세팅 파일을 만들기 위해 VNC서버를 작동시킵니다.

```
vncserver :1
```

작동시킬 경우, 비밀번호 입력이 나오는데 후에 접속할 때 필요하므로 잘 기억해둡시다.

![ec2_18](https://user-images.githubusercontent.com/26007107/68113991-62105600-ff38-11e9-8e33-2763308d5110.png)

이제 설정파일을 수정해봅시다.

```
vi ~/.vnc/xstartup
```

![ec2_19](https://user-images.githubusercontent.com/26007107/68114764-2c6c6c80-ff3a-11e9-9d85-4c2d656703e0.png)

```
#!/bin/sh

export XKL_XMODMAP_DISABLE=1
unset SESSION_MANAGER
unset DBUS_SESSION_BUS_ADDRESS

[ -x /etc/vnc/xstartup ] && exec /etc/vnc/xstartup
[ -r $HOME/.Xresources ] && xrdb $HOME/.Xresources
xsetroot -solid grey

vncconfig -iconic &
gnome-panel &
gnome-settings-daemon &
metacity &
nautilus &
gnome-terminal &
```

이제 GUI로 접속할 수 있게끔 SSH 터널을 설정해줍시다.

![ec2_20](https://user-images.githubusercontent.com/26007107/68115067-dc41da00-ff3a-11e9-90f1-b59a5fb313d8.png)

접속에 사용하는 서버를 클릭해준 뒤 **Load**를 선택합니다.

![ec2_21](https://user-images.githubusercontent.com/26007107/68115172-1e6b1b80-ff3b-11e9-8202-fb35b84edbf5.png)

**Connection > SSH > Tunnels**로 들어가 **Source port**에 5902, **Destination**에 서버IP:5901을 입력해주고 **Add**를 누릅니다.

