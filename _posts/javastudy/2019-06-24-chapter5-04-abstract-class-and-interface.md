---
title: "JAVA 17. Abstract Class and Interface"
date: 2019-06-24
categories: JAVA
---

{% include java2.md %}

# Abstract Class and Interface

## Abstract Class

* 추상 메소드 (abstract method)
  * *abstract*로 선언된 메소드
  * 코드는 없고 원형만 선언
  
  ~~~java
  public abstract String sayHello();
  public abstract String sayHi() { return "Hi"; } //compile error
  ~~~
  
* 추상 클래스 (abstract class)
  * 추상 메소드를 가지며 abstract로 선언된 클래스
  
  ~~~java
  abstract class Computer {
    Computer() { ... }
    void booting() { ... }
    
    abstract public void install();
  }
  ~~~
  
  * 추상 메소드 없이 abstract로 선언된 클래스
  
  ~~~java
  abstract class Component {
    String name;
    void load(String name) {
      this.name = name;
    }
  }
  ~~~
  
  * 일반 클래스는 추상 메소드를 가질 수 없음
  
  ~~~java
  class thisiserror {
    abstract void hello();  //compile error
  }
  ~~~
  
  * 추상 클래스는 온전한 클래스가 아니기 때문에 객체 생성 불가
    * Unresolved compilation problem : Cannot instantiate the type Computer
    
  ~~~java
  Computer c; //no error
  c = new Computer(); //error
  ~~~
  
  
## Inheritance and Implementation of Abstract Class

* 추상 클래스의 상속
  * 추상 클래스를 상속 받으면 추상 클래스가 됨
  * 서브 클래스도 *abstract*로 선언
  
  ~~~java
  abstract class A {
    abstract int add(int x, int y);
  }
  abstract class B extends A {
    void sayHello() { System.out.println("HelloB"); }
  }
  //중략
  A a = new A(); //compile error
  B b = new B(); //compile error
  ~~~
  
* 추상 클래스의 구현
  * 서브 클래스에서 슈퍼 클래스의 추상 메소드 구현 (오버라이딩)
  * 추상 클래스를 구현한 서브 클래스는 추상 클래스가 아님
  
  ~~~java
  class C extends A {
    int add(int x, int y) { return x + y; }
    void sayHello() { System.out.println("HelloC"); }
  }
  //중략
  C c = new C(); //no error
  ~~~
  
* 추상 클래스의 목적
  * 상속을 위한 슈퍼 클래스
  * 서브 클래스에서 추상 메소드를 구현
  * 다형성의 실현
  
> **연습문제 1 : 다음 추상클래스 Calculator를 상속 받는 클래스 GoodCalc를 구현하시오. (AbstractCalc.java)**

~~~java
abstract class Calculator {
  public abstract int add(int a, int b);
  public abstract int subtract(int a, int b);
  public abstract double average(int[] a);
}
~~~

[연습문제 1 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/AbstractCalc.java)


## Interface

* 자바 인터페이스
  * 상수와 추상 메소드로만 구성 (변수X)
  
  ~~~java
  interface PhoneInterface { 
    int BUTTONS = 20; 
    void sendCall();
    void receiveCall();
  }
  ~~~
  
* 특징
  * 상수와 추상 메소드로만 구성
    * 메소드 : *public abstract* 타입
    * 상수 : *public static final* 타입
  * 객체 생성 불가
  
## Inheritance and Implementation of Interface

* 인터페이스의 상속
  * 인터페이스간 상속 가능 : 확장된 인터페이스 작성 가능
  * 인터페이스 다중 상속 허용
  
  ~~~java
  interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
  }
  
  interface MusicPhoneInterface extends PhoneInterface, MP3Interface {
    ...
  }
  ~~~
  
* 인터페이스의 구현
  * 인터페이스를 상속받아 모든 추상메소드를 구현한 클래스 선언
  * *implements* 키워드로 인터페이스 구현
  
  ~~~java
  class AncientPhone implements MobilePhoneInterface {
    //MobilePhoneInterface의 모든 메소드 구현
    public void sendCall() { ... }
    public void receiveCall() { ... }
    public void sendSMS() { ... }
    public void receiveSMS() { ... }
    
    //다른 메소드 추가 가능
    public int getTouch() { ... }
  }
  ~~~
  
  * 여러 개의 인터페이스 동시 구현 가능
  * 클래스 상속과 인터페이스 구현을 동시에 가능
  
  * [복합 인터페이스 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/InterfaceEx.java)
  
{% include support.md %}
