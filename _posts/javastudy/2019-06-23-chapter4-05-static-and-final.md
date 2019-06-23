---
title: "JAVA 13. static and final"
date: 2019-06-23
categories : JAVA
---

# static and final

## static member
* static 멤버 선언

  ~~~java
  class StaticSample{
    int n; // non-static field
    void g() { ... } // non-static method
    
    static int m; // static field
    static void f() { ... } // static method
  }
  ~~~
  
  * non-static 멤버는 객체가 생성될 때마다 생성된다
  * 하지만, static 멤버는 클래스 당 하나만 생성 (= 객체들끼리 공유)

* static 멤버 사용
  * static 멤버는 클래스 이름과 객체로 접근이 가능
  * non-static 멤버는 클래스 이름으로 접근이 안됨
  
    ~~~java
    StaticSample.m = 3;
    StaticSample.f();
    
    StaticSample b1 = new StaticSample();
    b1.m = 3;
    b1.f();
    
    StaticSample.n = 5; //오류 발생
    StaticSample.g(); //오류 발생
    ~~~
    
* static의 활용
  * 전역 변수와 전역 함수
  * 공유 멤버를 만들때
  
## Constraint of static method

* static 메소드는 오직 static 멤버만 접근 가능
  * static 메소드 --> static 멤버 (O)
  * static 메소드 --> non-static 멤버 (X)
  * non-static 메소드 --> static 멤버 (O)
  * non-static 메소드 --> non-static 멤버 (O)
  
> **연습문제 2 : 다음 코드에서 에러가 발생하는 부분을 찾으시오.**

[연습문제 2 : 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/StaticMethod.java)

<details><summary>정답</summary>

s1함수 : static 메소드의 non-static 필드 접근 불가

s2함수 : static 메소드의 non-static 메소드 접근 불가

</details>

* static 메소드는 this 사용 불가
  * static 메소드는 객체 없이도 사용이 가능하므로, this 레퍼런스를 사용할 수 없음
  

## final

* final 클래스 : 상속 불가능한 클래스
* final 메소드 : 오버라이딩 불가능한 메소드
* final 필드 : 상수 선언할때 사용
  * 선언 시 초기값 지정
  * 실행 중 
