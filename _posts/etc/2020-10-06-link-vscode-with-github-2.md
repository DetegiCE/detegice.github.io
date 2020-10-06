---
title: "VSCode와 GitHub 연결하기 (2)"
date: 2020-10-06 17:10:58
categories: github vscode
---

이제 연결을 완료했으니 vscode에서 작성한 코드가 github에 반영되도록 해본다.

<img width="1021" alt="스크린샷 2020-10-06 오후 5 13 24" src="https://user-images.githubusercontent.com/26007107/95176026-3f955580-07f7-11eb-927d-f32f83d503d6.png">

아무 코드나 작성하고 저장해보자.

왼쪽을 보면, 방금 새로 만든 문서가 초록색으로 표시 되어있고 update를 뜻하는 U라는 표시가 되어있는 것을 볼 수 있다.

<img width="75" alt="스크린샷 2020-10-06 오후 5 14 24" src="https://user-images.githubusercontent.com/26007107/95176135-63f13200-07f7-11eb-898d-03e5ec38b202.png">

위에서 세번째에 있는 ``Source Control`` 메뉴로 들어가보자.

<img width="319" alt="스크린샷 2020-10-06 오후 5 14 58" src="https://user-images.githubusercontent.com/26007107/95176182-77040200-07f7-11eb-852a-15782eb088df.png">

변경 사항이 있는 파일들의 목록이 표시가 된다.

파일 목록의 ``+``를 누르고, Message를 입력해 준뒤, 상단의 체크 버튼을 눌러준다. 

<img width="371" alt="스크린샷 2020-10-06 오후 5 16 33" src="https://user-images.githubusercontent.com/26007107/95176329-b16d9f00-07f7-11eb-94fd-e4a2d99545af.png">

그럼 목록이 사라지고, 하단에 0down 1up 표시가 보인다.

push 할 수 있는 commit의 수를 나타내는 표시이다.

몇개 더 수정하여 여러 개의 commit을 한 번의 push로 가능하다.

아래의 commit수 버튼을 눌러 push를 해보자.

<img width="519" alt="스크린샷 2020-10-06 오후 5 18 05" src="https://user-images.githubusercontent.com/26007107/95176481-e679f180-07f7-11eb-95c4-feb5198a970c.png">

위와 같은 경고창이 뜨고 OK를 누른다.

처음 push를 하는 경우, github과 연동하기 위해서 로그인을 하라는 창이 뜬다.

로그인을 진행해준다.

<img width="153" alt="스크린샷 2020-10-06 오후 5 08 23" src="https://user-images.githubusercontent.com/26007107/95176644-1b864400-07f8-11eb-9c4d-93843887d142.png">
<img width="1105" alt="스크린샷 2020-10-06 오후 5 08 18" src="https://user-images.githubusercontent.com/26007107/95176664-2214bb80-07f8-11eb-9ee1-93af36c6d962.png">
<img width="720" alt="스크린샷 2020-10-06 오후 5 08 29" src="https://user-images.githubusercontent.com/26007107/95176669-2345e880-07f8-11eb-938c-afe8e65f0103.png">
<img width="542" alt="스크린샷 2020-10-06 오후 5 08 34" src="https://user-images.githubusercontent.com/26007107/95176671-24771580-07f8-11eb-965a-77590b2fb4fe.png">

로그인이 완료되면 깃헙으로 들어가 잘 push 되었는지 확인해보자.

<img width="397" alt="스크린샷 2020-10-06 오후 5 20 46" src="https://user-images.githubusercontent.com/26007107/95176768-47a1c500-07f8-11eb-80fb-a4614e1c8f12.png">

