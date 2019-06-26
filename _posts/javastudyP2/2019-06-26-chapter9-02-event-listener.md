---
title: "JAVA 27. Event Listener"
date: 2019-06-26
categories: JAVA
---

{% include java3.md %}

# Event Listener

## Listener Interface

* 이벤트 리스너 : 이벤트를 처리하는 자바 프로그램 코드, 클래스로 작성함
* 사용자의 이벤트 리스너 작성
  * 자바의 리스터 인터페이스를 상속받아 구현
  * 리스너 인터페이스의 모든 추상 메소드 구현
  
![0903](https://user-images.githubusercontent.com/26007107/60154513-80e03c80-9822-11e9-9a39-778588c68d44.png)

## How to Write Event Listener

* 이벤트와 이벤트 리스너 선택
  * e.g) 버튼 클릭을 처리하는 경우 : Action 이벤트, ActionListener 이벤트 리스너
* 이벤트 리스너 클래스 작성

~~~java
class MyActionListener implements ActionListener {
  public void actionPerformed(ActionEvent e) { // 버튼이 클릭될 때 호출
    JButton b = (JButton)e.getSource();
    if(b.getText().equals("Action");
      b.setText("액션");
    else
      b.setText("Action");
  }
}
~~~

* 이벤트 리스너 등록
  * 이벤트를 받아 처리하고자 하는 컴포넌트에 이벤트 리스너 등록
  * *component.addXXXListener(listener)*
    * XXX : 이벤트 명, listener : 이벤트 리스터 객체
    
~~~java
MyActionListener lis = new MyActionListener(); // 리스터 객체 생성
b.addActionListener(lis); // 리스너 등록
~~~

* 이벤트 리스너의 작성 방법
  * 독립 클래스로 작성
    * 이벤트 리스너를 완전한 클래스로 작성
    * 이벤트 리스너를 여러 곳에서 사용할 때 적합
    * 독립된 클래스를 별도의 파일로 작성해도 됨
    * [독립 클래스 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter9/IndepClassListener.java)
  * 내부 클래스로 작성
    * 클래스 안에 멤버처럼 클래스 작성
    * 이벤트 리스터를 특정 클래스에서만 사용할 때 적합
    * 리스너에서 JFrame 멤버에 대한 접근이 용이함
    * private로 선언하여 외부에서 사용할 수 없게 함
    * [내부 클래스 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter9/InterClassListener.java)
  * 익명 클래스 작성
    * 클래스의 이름 없이 간단히 리스너 작성
    * 리스너 코드가 간단한 경우에 적합
    * [익명 클래스 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter9/AnonyClassListener.java)
    
> **연습문제 1 : 프레임의 임의의 위치에 마우스 버튼을 누르면 마우스 포인터가 있는 위치에 본인의 이름을 출력하는 프로그램 MyNameCursor.java를 작성하시오.**
>
> 프레임 제목 : "커서이름", 프레임 사이즈 : 500x500
>
> 이름의 초기 위치 : (250, 250), 라벨의 사이즈 : (100, 20)
>
> 이벤트 : MouseEvent, 이벤트 리스너 : MouseListener, 이벤트 소스 : 컨텐트 팬
>
> 컨텐트팬 배치관리자 : null
>
> 구현할 이벤트 리스너의 메소드 : mousePressed()
>
> 문자열 : JLabel 컴포넌트 이용

[연습문제 1 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter9/MyNameCursor.java)


{% include support.md %}
