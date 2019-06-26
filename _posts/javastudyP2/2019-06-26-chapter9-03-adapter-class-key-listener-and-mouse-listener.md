---
title: "JAVA 28. Adapter Class, Key Listener, and Mouse Listener"
date: 2019-06-26
categories: JAVA
---

{% include java3.md %}

# Adapter Class, Key Listener, and Mouse Listener

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



{% include support.md %}
