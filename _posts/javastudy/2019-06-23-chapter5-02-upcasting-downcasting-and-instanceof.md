---
title : "JAVA 15. Upcasting, Downcasting and instanceof"
date: 2019-06-23
categories: JAVA
---

{% include java2.md %}

# Upcasting, Downcasting and instanceof

## Upcasting

* 업캐스팅
  * 서브클래스의 레퍼런스를 슈퍼클래스의 레퍼런스에 대입
  * 슈퍼클래스 레퍼런스로 서브클래스 객체를 가리키게 되는 현상
  
  ~~~java
  class Person { ... }
  class Student extends Person { ... }
  
  Person p;
  Student s = new Student();
  p = s; //업캐스팅
  ~~~
  
  * [업캐스팅 예시](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/UpcastingEx.java)
  
  
## Downcasting

* 다운캐스팅
  * 슈퍼클래스 레퍼런스를 서브클래스 레퍼런스에 대입
  * 업캐스팅 된 것을 다시 원래대로 복귀
  * 반드시 명시적 형변환으로 지정
  
  ~~~java
  class Person { ... }
  class Student extends Person { ... }
  
  Person p = new Student("허고컴"); //업캐스팅
  Student s = (Student)p; //다운캐스팅
  ~~~
  
  * [다운캐스팅 예시](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/DowncastingEx.java)


## instanceof

* instanceof 연산자
  * 레퍼런스가 가리키는 객체의 타입 식별
  
  ~~~java
  ObjectReference instanceof ClassType //true or false
  ~~~
  
* 예시
  ![0504](https://user-images.githubusercontent.com/26007107/59972914-821b2a80-95d2-11e9-8212-1bf606e73264.png)
  ~~~java
  Person p = new Professor();
  
  if(p instanceof Person) //true
  if(p instanceof Student)  //false
  if(p instanceof Researcher) //true
  if(p instanceof Professor)  //true
  
  if("자바싫어" instanceof String)  //true
  
  if(3 instance of int) //문법 오류 : int는 객체가 아님
  ~~~

{% include support.md %}
