---
title: "JAVA 11. Object Array and Method Overloading"
date: 2019-06-23
categories: JAVA
---

{% include java.md %}

# Object Array and Method Overloading

## Object Array

* 객체 배열
  * 객체에 대한 레퍼런스 배열
* 객체 배열 만드는 방법
  1. 배열 레퍼런스 변수 선언
  2. 레퍼런스 배열 생성
  3. 배열의 각 원소 객체 생성
  
  ~~~java
  Circle c[]; //Circle 배열에 대한 레퍼런스 변수 c 선언
  c = new Circle[5]; //레퍼런스 배열 생성
  for(int i=0 ; i<c.length ; i++)
    c[i] = new Circle(i); //각 원소 객체 생성
  ~~~
  
> **연습문제 1 : Circle 객체를 5개 가지는 배열을 생성하고, Circle 객체의 반지름을 0에서 4까지 각각 지정한 후 면적을 출력하는 프로그램 CircleArray.java를 작성하시오.**
>
> 단, class의 이름을 Circle로 하면 지난번에 작성했던 Circle과 중복이 되어 오류가 발생하므로, 클래스 이름을 CircleC로 하시오. 또한 PI = 3.14

[연습문제 1 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/CircleArray.java)


> **연습문제 2 : 2개짜리 Book 객체 배열을 만들고, 사용자로부터 책의 제목과 저자를 입력받은 뒤, 각 책의 정보를 출력하는 프로그램 BookArray.java를 작성하시오.**
>
> 단, class의 이름을 Book으로 하면 지난번에 작성하였던 Book과 중복이 되어 오류가 발생하므로, 클래스의 이름을 BookB로 하시오.

[연습문제 2 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/BookArray.java)


## Method

* 메소드
  * C/C++의 함수와 동일
  * 모든 메소드는 반드시 클래스 안에 있어야 함
* 메소드 형식

  ~~~java
  public int sum(int i, int j) {
    int sum;
    sum = i + j;
    return sum;
  }
  ~~~
  
  * *public* : 접근 지정자
    * 다른 클래스에서 메소드를 접근할 수 있는지 여부를 선언
    * public, private, protected, default(생략 가능)
  * *int* : 리턴 타입
    * 메소드가 리턴하는 데이터 타입
    
    
* 메소드의 인자 전달
  * 기본 데이터 타입이 전달되는 경우 : 값만 복사되어 전달. 실인자 값은 변경되지 않음 (CallByValue)
  * 객체가 전달되는 경우 : 객체의 레퍼런스만 전달. 실인자 객체 공유 (CallByReference)
  * 배열이 전달되는 경우 : 배열 레퍼런스만 전달. 실인자의 배열 공유 (CallByReference)
  * [CallByReference 예제](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/ArrayParameter.java)
  

## Method Overloading

* 메소드 오버로딩
  * 한 클래스 내에서 두 개 이상의 이름이 같은 메소드 작성
  * 메소드 이름이 동일
  * 매개변수의 개수가 다르거나, 타입이 달라야 함
  * 리턴 타입은 오버로딩과 관련 없음
  
[메소드 오버로딩의 예시](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/MethodEx.java)


{% include support.md %}
