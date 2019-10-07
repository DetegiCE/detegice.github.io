---
title: "JAVA 28. Adapter Class and Key Listener"
date: 2019-06-26
categories: java gui
---

{% include java3.md %}

# Adapter Class and Key Listener

## Adapter Class

* 이벤트 리스너 구현에 따른 부담
  * 리스너의 추상 메소드를 모두 구현해야 함
  * e.g) 앞의 문제에서 마우스 리스너가 mousePressed()만 하더라도 다른 4개를 모두 구현해야함
* 어댑터 클래스
  * 리스너의 모든 메소드를 단순 리턴하도록 만든 클래스
  * 단, 추상 메소드가 1개인 리스너는 어댑터가 없음
  
* 어댑터 클래스 사용 전

~~~java
class MyMouseListener implements MouseListener {
  public void mousePressed(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();
    la.setLocation(x, y);
  }
  public void mouseReleased(MouseEvent e) {}
  public void mouseClicked(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
}
~~~

* 어댑터 클래스 사용 후

~~~java
class MyMouseAdapter extends MouseAdapter{
  public void mousePressed(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();
    la.setLocation(x, y);
  }
}
~~~

![0904](https://user-images.githubusercontent.com/26007107/60158191-99088980-982b-11e9-9191-6574b3485f57.png)

> **연습문제 1 : 저번에 짰던 MyNameCursor.java를 어댑터 클래스를 이용하여 수정한 프로그램 MyNameAdapter.java를 작성하시오.**

[연습문제 1 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter9/MyNameAdapter.java)


## Key Event and Focus

* 키 입력시, 세 경우의 Key 이벤트가 발생
  * 키를 누르는 순간
  * 누른 키를 떼는 순간
  * 누른 키를 떼는 순간 (Unicode의 경우)
* 키 이벤트를 받을 수 있는 조건
  * 모든 컴포넌트
  * 현재 포커스를 가진 컴포넌트가 키 이벤트를 독점
* 포커스
  * 컴포넌트나 프로그램이 키 이벤트를 독점하는 권한
  * 컴포넌트에 포커스 설졍 방법
  * ~~~java
    component.requestFocus();
    ~~~


## Key Listener

* 프로그램에서 KeyListener를 상속받아 키 리스너 구현
* 총 3개의 메소드
  * *void keyPressed(KeyEvent e) { ... }* // 키를 누르는 순간
  * *void keyTyped(KeyEvent e) { ... }* // 유니코드 키인 경우 누른 키를 떼는 순간
  * *void keyReleased(KeyEvent e) { ... }* // 누른 키를 떼는 순간
* 키 이벤트 리스너 달기

~~~java
component.addKeyListener(myKeyListener);
~~~


* 유니코드 키
  * 국제 산업 표준
  * 전 세계 문자를 컴퓨터에서 일관하게 표현하기 위한 코드 체계
  * 문자들에 대해서만 키 코드 값 정의
  * 문자가 아닌 키의 경우 표준화 키 코드 없음

* 유니코드 키 입력 시 : keyPressed -> keyTyped -> keyReleased 순서 호출
* 유니코드가 아닌 키 입력 시 : keyPressed -> keyReleased 순서 호출


* KeyEvent 객체
  * 입력된 키 정보를 가진 이벤트 객체
* 객체의 메소드로 입력된 키 판별
  * *char keyEvent.getKeyChar()*
    * 키의 유니코드 문자 값 리턴
    * Unicode 문자 키인 경우에만 사용 가능
    * 입력된 키를 판별하기 위해 문자 값과 비교 필요
    * ~~~java
      public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'q')
          System.exit(0);
      }
      ~~~

  * *int KeyEvent.getKeyCode()*
    * 유니코드 키 포함
    * 모든 키에 대한 정수형 키 코드 리턴
    * 입력된 키의 판별을 위해 가상키 값과 비교
    * 가상 키 값은 KeyEvent 클래스에 상수로 표현
    * ~~~java
      public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_F5)
          System.exit(0);
      }
      ~~~

* 가상 키

![0905](https://user-images.githubusercontent.com/26007107/60159175-9444d500-982d-11e9-9f53-08b32587c411.png)

> **연습문제 2 : 컨텐트팬에 Enter 키를 입력할 때마다 배경색을 랜덤하게 바꾸고, 'q'키를 입력하면 프로그램을 종료하는 프로그램 KeyAllocDalloc.java를 작성하시오.**
>
> 프레임 제목 "알록달록", 프레임 크기 300 x 200
>
> 중앙 상단에 "<Enter>키로 배경색이 바뀝니다" 를 라벨로 달아주시고, 색이 바뀔때마다 해당 색상의 코드를 적어주세요. 
>
> e.g) "r = 135, g = 53, b = 231"
>
> Enter 키 입력의 경우 '\n'으로 판단하시고, 색상 바꾸는 것은 *getContentPane().setBackground(new Color(int,int,int));* 로 가능합니다.
>
> 프로그램의 종료는 *System.exit(0);* 으로 가능합니다.

[연습문제 2 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter9/KeyAllocDalloc.java)


{% include support.md %}
