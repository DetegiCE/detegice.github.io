---
title: "JAVA 24. Making Swing GUI Program"
date: 2019-06-25
categories: java gui
---

{% include java3.md %}

# Making Swing GUI Program

## Process

* 스윙 GUI 프로그램 만드는 매우 쉽고 간단한 과정
  * 스윙 프레임을 만든다
  * main() 메소드를 작성한다
  * 스윙 프레임에 스윙 컴포넌트를 

* 스윙 프로그램 작성에 필요한 import
  * *import java.awt.&#42;;* : 그래픽 처리를 위한 클래스들의 경로
  * *import java.awt.event.&#42;;* : AWT 이벤트 사용을 위한 경로
  * *import javax.swing.&#42;;* : 스윙 컴포넌트 클래스들의 경로
  * *import javax.swing.event.&#42;;* : 스윙 이벤트를 위한 경로
  
## Swing Frame

* 스윙 프레임 : 모든 스윙 컴포넌트를 담는 최상위 컨테이너
  * JFrame을 상속받아 구현
  * 컴포넌트들은 화면에 보이기 위해서는 스윙 프레임에 부착되어 있어야 함
* JFrame의 구성
  * 프레임 - 스윙 프로그램의 기본 틀
  * 메뉴 바 - 메뉴들이 부착되는 공간
  * 컨텐트팬 - GUI 컴포넌트들이 부착되는 공간
  
![0807](https://user-images.githubusercontent.com/26007107/60095067-ade01100-9788-11e9-91de-383e158c23d8.png)

* 프레임 만들기
  * JFrame 클래스를 상속받은 클래스 작성
  * 프레임의 크기 지정 : *setSize()* 호출
  * 프레임을 화면에 출력하는 코드 : *setVisible(true)* 호출
  * [프레임 만드는 코드 예시](https://github.com/DetegiCE/JavaStudy/blob/master/chapter8/MyFrameEx.java)
    * <details><summary>그 결과</summary>
      <img src="https://user-images.githubusercontent.com/26007107/60095320-3c549280-9789-11e9-917d-a70fc16afc19.png">
      </details>
      
> **연습문제 1 : 위의 코드를 보지 말고 프레임 제목 MyFrame400x400, 프레임 크기 400x400의 스윙 프레임을 만들어보자. (MyFrame400.java)**

[연습문제 1 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter8/MyFrame400.java)

* 스윙 프로그램에서 main() 메소드의 기능
  * 프로그램의 시작을 알리는 기능
  * 프레임을 생성하는 정도의 코드로만 최소화
  
## Adding Components to Frame

* 제목 달기
  * *setTitle(String)* 이나 *super(String)* 사용
* 컨텐트팬 : 스윙 컴포넌트들이 부착되는 공간
  * 컨텐트팬 알아내기 : 스윙 프레임에 붙은 디폴트 컨텐트팬 찾기
  
  ~~~java
  Container cp = getContentPane();
  ~~~
  
  * 컨텐트팬에 컴포넌트 붙이기
  
  ~~~java
  JButton button = new JButton("Click"); //버튼 컴포넌트 생성
  cp.add(button); //컨텐트팬에 버튼 부착
  ~~~
  
## Some TIPS

* 제목 다는 것은 무조건 맨 처음에 해라

* GUI는 창을 끈다고 프로그램이 종료되는 것이 아니다. 그냥 프레임이 안보이게 되는거다. 아래 구문을 꼭 추가해주자.
  * *setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*
  
> **연습문제 2 : 프레임 제목 "ContentPane연습", 프레임 크기 300x150인 프레임에 OK, Cancel, Ignore 버튼을 부착한 스윙 프로그램을 작성하시오. (ThreeButtonFrame.java)**
>
> 원활한 진행을 위해 컨텐트팬에 버튼을 추가하기 전에 *contentPane.setLayout(new FlowLayout());* 을 추가해주자.
> 이게 뭔지는 다음 시간에 배운다.

[연습문제 2 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter8/ThreeButtonFrame.java)

<details><summary>출력예시</summary>
<img src="https://user-images.githubusercontent.com/26007107/60096495-095fce00-978c-11e9-8f00-df7b7793351f.png">
</details>

{% include support.md %}
