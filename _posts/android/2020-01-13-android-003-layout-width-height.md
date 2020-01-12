---
title: "Android 003. layout_width, layout_height of view"
date: 2020-01-13 04:52:00
categories: android
---

뷰의 폭과 높이를 설정

* ``match_parent`` : 뷰 그룹에 남아있는 여유 공간을 채움

* ``wrap_content`` : 뷰에 들어있는 내용의 크기에 따라 뷰의 크기 결정

* 값 지정 : 고정 값

테스트 해보자

# ``match_constraint``, ``wrap_content``

![03-am](https://user-images.githubusercontent.com/26007107/72224716-dadb0080-35c0-11ea-9b24-53dc83865960.png)

하지만 우리의 버튼 친구는 ``match_parent`` 대신에 ``match_constraint``가 있다.

이 버튼 친구는 처음부터 기본 레이아웃인 ConstraintLayout에 속해있기 때문이다.

![03-ha](https://user-images.githubusercontent.com/26007107/72224737-107fe980-35c1-11ea-9574-c8dc4ff7b981.PNG)

그럼 width 값을 ``match_constraint``로 해보면 이렇게 꽉 차게 된다.

ConstraintLayout이 전체 레이아웃을 차지하기 때문이다.

``wrap_content``의 경우, 첫 번째 사진을 보면 된다.

뷰에 들어있는 글자에 맞춰서 크기가 정해지기 때문이다.

HELLO ANDROID 버튼과 LINK TO MY BLOG 버튼의 width가 다른 이유가 둘 다 ``wrap_content``이기 때문이다.

# ``match_parent``

그럼, ConstraintLayout을 지워보자.

``activity_main.xml``로 가서 Text를 선택하고 몇개를 바꿔주자.

![03-amt](https://user-images.githubusercontent.com/26007107/72224802-c77c6500-35c1-11ea-9d13-a12f5abae259.png)

<script src="https://gist.github.com/DetegiCE/5527921705d440cd3987e3ef26f2a1ab.js"></script>

두 번째 줄의 ConstraintLayout을 LinearLayout으로 바꿔준다.

ConstraintLayout과 관련된 것은 모두 지워주자.

그럼 왼쪽의 그림과 같이 좌측 상단으로 버튼이 모두 쏠린다.

이제 드디어 ``match_parent``를 써볼때가 됐다.

HELLO ANDROID 버튼의 ``layout_width``를 ``match_parent``로 바꿔보자

![03-am2](https://user-images.githubusercontent.com/26007107/72224846-24781b00-35c2-11ea-9cd6-9dcfe9a72474.png)

``layout_height``도 바꿔보자

![03-am3](https://user-images.githubusercontent.com/26007107/72224856-470a3400-35c2-11ea-8891-9342df314dde.png)

# 값 지정

이번엔 수치로 해보자

수치가 뭐가 어렵냐 하겠지만, 단위가 다르다.

## ``px``

먼저 가장 기본적인 ``px``이 있다.

말 그대로 화면의 픽셀값이다.

![03-ha2](https://user-images.githubusercontent.com/26007107/72224907-cbf54d80-35c2-11ea-8c50-bfccf3589531.PNG)

## ``dp``

``dp``는 density independent pixel의 줄임마이다.

화면을 160dpi라 했을 때의 픽셀을 의미한다.

![03-ha3](https://user-images.githubusercontent.com/26007107/72224933-fb0bbf00-35c2-11ea-96bd-b402ce4fea97.PNG)

dpi가 인치단위니까 인치로도 단위를 쓸 수 있을까?

## ``in``

당연하다.

이번엔 아래버튼을 2in로 지정해보자.

![03-lb](https://user-images.githubusercontent.com/26007107/72224956-3a3a1000-35c3-11ea-9b9a-4946b295888f.PNG)

# 다른 레이아웃들은 어떻게 하냐

아까처럼 Text로 가서 코드를 전부 바꿔줘야 하냐?

우리의 위대한 안스께서는 레이아웃들도 Drag&Drop으로 해주셨다.

왼쪽의 팔레트에 보면 레이아웃들이 있다.

![03-pa](https://user-images.githubusercontent.com/26007107/72224978-7b322480-35c3-11ea-9a3e-8e1d365d451c.PNG)

가져다 쓰면 된다.

근데 주의할 점은 레이아웃 안에 레이아웃이 들어가는 경우도 있기 때문에 열심히 잘 드래그 해줘야한다.

Design 탭만 보는게 아니라 Text 탭도 보라는 거다.

