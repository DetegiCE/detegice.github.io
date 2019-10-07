---
title: "JAVA 10. Class and Object"
date: 2019-06-22
categories: java
---

{% include java.md %}

# Class and Object

## 클래스와 객체

* 클래스
  * 객체의 속성(state)과 행위(behavior) 선언
  * 객체의 설계도
  
* 객체 (=인스턴스)
  * 클래스의 틀로 찍어낸 실체
  * 프로그램 실행 중에 생성되는 실체
  * 메모리 공간을 갖는 구체적인 실체
  
  ![0404](https://user-images.githubusercontent.com/26007107/59965396-489ddd00-9548-11e9-8ada-10ad3ea359eb.png)


## 자바 클래스의 구성
* 클래스
  * *class* 키워드로 선언
  * 멤버 : 클래스의 구성 요소 (필드와 메소드)
  * 클래스에 대한 *public* 접근 지정 : 다른 모든 클래스에서 클래스 사용 허가
  * 멤버에 대한 *public* 접근 지정 : 다른 모든 클래스에서 멤버 접근 허가
  
  ~~~java
  public class Circle {
    int radius;
    String name;
    
    public double getArea() {
      return 3.14 * radius * radius;
    }
  }
  ~~~
  
  [Circle 클래스를 통해서 본 예시](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/Circle.java)
  
  ![0405](https://user-images.githubusercontent.com/26007107/59965516-39b82a00-954a-11e9-83d4-45f4e5cfb6ec.png)

* 객체의 생성과 활용
  * *Circle pizza;* : 레퍼런스 변수 선언
  * *pizza = new Circle();* : 객체 생성 (new 연산자)
  * *pizza.radius = 10;* : 객체 멤버 접근
  
> **연습문제 1 : 너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스를 작성하시오.**

[연습문제 1 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/Rectangle.java)

## 생성자 (Constructor)
* 생성자
  * 객체가 생성될 때 초기화 목적으로 실행되는 메소드
  * 객체가 생성되는 순간에 자동 호출
  
  [CircleA 클래스를 통해서 본 예시](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/CircleA.java)
  
* 생성자의 특징
  * 생성자 이름은 클래스 이름과 동일
  * 여러 개의 생성자 가능 (생성자 중복)
  
  ~~~java
  public class CircleA {
    public CircleA() { ... } //매개변수 없는 생성자
    public CircleA(int r, String n) { ... } //2개의 매개변수를 갖는 생성자
  }
  ~~~
  
  * 생성자는 객체 생성시 한번만 호출 : 객체 생성은 반드시 new 연산자로 함
  
  ~~~java
  CircleA pizza = new Circle(10, "미스터피자"); //생성자 CircleA(int r, String n) 호출
  CircleA donut = new Circle(); //생성자 CircleA() 호출
  ~~~

  * 생성자의 목적은 객체 생성시 초기화
  * 생성자는 리턴 타입을 지정할 수 없음
  
  ~~~java
  public void Circle() { ... } //오류 발생
  ~~~

> **연습문제 2 : title과 author 필드를 갖는 Book 클래스를 선언하고, 제목만 받는 생성자와 제목과 저자 모두 받는 생성자를 작성하시오.**

[연습문제 2 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/Book.java)


* 기본 생성자 (=디폴트 생성자)
  * 매개변수 없고, 아무 작업 없이 단순 리턴하는 생성자
  
  ~~~java
  class Circle {
    public Circle() {} //기본 생성자
  }
  ~~~
  
  * 클래스에 생성자가 하나도 없는 경우, 컴파일러에 의해 기본 생성자 자동 생성
  * 클래스에 생성자가 선언되어 있는 경우, 컴파일러는 자동으로 기본 생성자를 자동 생성하지 않음


## this 레퍼런스

* 객체 자신에 대한 레퍼런스
  * 컴파일러에 의해 자동 관리
  * *this.멤버* 형태로 멤버 접근 시 사용
  
  [CircleB 클래스를 통해 본 예시](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/CircleB.java)
  
* this() 로 다른 생성자 호출
  * 같은 클래스의 다른 생성자 호출
  * 생성자 내에서만 사용 가능
  * 생성자 코드의 제일 처음에 있어야함

> **연습문제 3 : 연습문제 2에서 작성한 Book 클래스의 생성자를 this()를 이용하여 수정한 프로그램 BookA.java를 작성하시오.**

[연습문제 3 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/BookA.java)


{% include support.md %}
