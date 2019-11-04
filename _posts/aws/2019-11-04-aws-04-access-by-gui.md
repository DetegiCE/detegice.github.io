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

이제 포트를 열어줍시다.

![ec2_22](https://user-images.githubusercontent.com/26007107/68115433-b9fc8c00-ff3b-11e9-87e2-7267675fa2c7.PNG)

EC2 콘솔의 인스턴스로 들어가 자신의 서버의 보안그룹을 눌러줍니다.

**인바운드**를 누르고 **편집**에서 다음과 같이 5901 포트를 열어줍니다.

![ec2_23](https://user-images.githubusercontent.com/26007107/68115531-f0d2a200-ff3b-11e9-811a-ab84967b9f67.PNG)

[TightVNC](https://www.tightvnc.com/download.php)를 다운로드 받아줍니다.

![ec2_24](https://user-images.githubusercontent.com/26007107/68115655-37c09780-ff3c-11e9-98df-e8f7e1cd9ce4.png)

다운로드는 알아서 해주시고

![ec2_25](https://user-images.githubusercontent.com/26007107/68116101-5d9a6c00-ff3d-11e9-8d9b-258849bb2291.png)

**Remote Host**에 ``localhost::5902``를 입력해주시고 **Connect**를 누릅니다.

만약 안되는 경우, 아직 포트가 열리지 않은 것이므로, 서버로 돌아가 ``netstat -tnlp``를 통해 포트가 열려있는지 확인하고 다시 시도합니다.

잘 되는 경우, 아까 입력했던 비밀번호를 입력해준 뒤, 접속합니다.

성공적으로 접속되는 경우, 다음과 같이 화면이 뜹니다.

![ec2_26](https://user-images.githubusercontent.com/26007107/68116095-583d2180-ff3d-11e9-92a6-1d862c7a53de.png)

[(NEXT) 4. GUI로 접속하기](https://detegice.github.io/aws-04-access-by-gui/)
