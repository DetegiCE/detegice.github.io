---
title: "JAVA 19. Object Class and Wrapper Class"
date: 2019-06-25
categories: java
---

{% include java2.md %}

# Object Class and Wrapper Class

## Properties of Object Class

* 특징
  * 모든 클래스의 슈퍼 클래스
  * 모든 클래스는 반드시 *Object*를 상속받도록 컴파일 됨
  
* 주요 메소드

| 메소드 | 설명 |
|:---|:---|
| ★ boolean equals(Object obj) | obj 객체와 현재 객체를 비교하여 같으면 true 리턴 |
| Class getClass() | 현 객체의 실행 클래스 리턴 |
| ★ int hashCode() | 현 객체의 해시 코드값 리턴 |
| ★ String toString() | 현 객체에 대한 문자열 표현 리턴 |
| void notify() | 현 객체에 대해 대기하고 있는 하나의 스레드를 깨움 | 
| void notifyAll() | 현 객체에 대해 대기하고 있는 모든 스레드를 깨움 |
| void wait() | 다른 스레드가 깨울 때까지 현재 스레드를 대기 |


## toString()

* 각 클래스는 *toString()*을 오버라이딩하여 자신만의 문자열 리턴 가능
  * 객체를 문자열로 변환
  * *public String toString();*
  
* 컴파일러에 의한 *toString()* 자동 변환
  * *객체+문자열*을 *객체.toString()+문자열*로 자동 변환
  * 객체 단독의 경우 *객체.toString()*으로 자동 변환
  * [자동 변환 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter6/ToStringEx.java)

## Object Comparison and equals()

* *==* 연산자
  * 객체의 레퍼런스를 비교
  
  ~~~java
  Point a = new Point(2,3);
  Point b = new Point(2,3);
  Point c = a;
  
  if(a==b) { ... } //false
  if(a==c) { ... } //true
  ~~~
  
* *boolean equals(Object obj)*
  * 객체의 내용을 비교
  * [equals() 메소드 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter6/EqualsEx.java)
  
> **연습문제 1 : int 타입의 width, height 필드를 가지는 Rect 클래스를 작성하고, 면적이 같으면 두 Rect 객체가 같은 것으로 판별하는 equals() 메소드를 작성하시오. (RectEx.java)**

[연습문제 1 : 예시코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter6/RectEx.java)


## Wrapper Class

* Wrapper 클래스
  * 자바의 기본 타입을 클래스화한 8개의 클래스
  * Byte, Short, Integer, Long, Character, Float, Double, Boolean
* 용도
  * 객체만 사용할 수 있는 컬렉션 등에 기본 타입의 값을 사용하기 위해
  
* 객체 생성 방법
  ~~~java
  Integer i = new Integer(10);
  Character c = new Character('c');
  Boolean b = new Boolean(true);
  
  Boolean B = new Boolean("false");
  Integer I = new Integer("10");
  Double D = new Double("3.14159");
  ~~~

* 주요 메소드
  * parseInt, toString은 알아둡시다
  
![0602](https://user-images.githubusercontent.com/26007107/60071238-6475ce80-9754-11e9-8ec6-fb5074009644.png)

{% include support.md %}
