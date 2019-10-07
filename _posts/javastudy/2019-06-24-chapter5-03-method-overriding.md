---
title: "JAVA 16. Method Overriding"
date: 2019-06-24
categories: java
---

{% include java2.md %}

# Method Overriding

## 메소드 오버라이딩

* 메소드 오버라이딩
  * 서브클래스에서 슈퍼클래스의 메소드 중복 작성
  * 슈퍼클래스의 메소드 무력화
  * 항상 서브클래스에 오버라이딩한 메소드가 실행됨
  * 슈퍼클래스의 메소드의 원형(이름, 인자 타입 및 개수, 리턴 타입)이 동일해야 함
  
  ~~~java
  class A {
    void f() {
      System.out.println("A");
    }
  }
  
  class B extends A {
    void f() {
      System.out.println("B");
    }
  }
  ~~~
  
  ```
  B
  ```
  
  
## 다형성의 실현

* 메소드 오버라이딩으로 다형성의 실현
  * 하나의 인터페이스에 서로 다른 구현
  * 슈퍼클래스의 메소드를 서브클래스에서 각각의 목적에 맞게 다르게 구현
  
  * [메소드 오버라이딩 코드 예시](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/MethodOverridingEx.java)
  
![0505](https://user-images.githubusercontent.com/26007107/60011293-7142e580-96b4-11e9-8ef1-a384405f2fae.png)


## 동적 바인딩, 정적 바인딩

* 업캐스팅 된 상태에서도 오버라이딩 된 메소드가 호출된다. (동적바인딩)

![0506](https://user-images.githubusercontent.com/26007107/60011478-d1398c00-96b4-11e9-91e5-437b3a97176f.png)

* super 키워드를 이용하여 슈퍼클래스의 멤버/메소드에 접근할 수 있다. (정적바인딩)

> **연습문제 1 : 다음 코드의 출력을 작성하시오.**

[연습문제 1 : 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/SubObject.java)

<details><summary>정답</summary>

{% highlight text %}
Super
Sub
{% endhighlight %}

</details>


## 오버로딩 vs 오버라이딩

| 비교 | 메소드 오버로딩 | 메소드 오버라이딩 |
|:---:|:---|:---|
| 선언 | 같은 클래스나 상속 관계에서 동일한 이름의 메소드 중복 작성 | 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성 |
| 관계 | 동일한 클래스 내 혹은 상속 관계 | 상속 관계 |
| 목적 | 이름이 같은 여러 메소드를 중복 선언하여 사용의 편리성 향상 | 슈퍼 클래스의 메소드를 무시하고 서브 클래스에서 새로운 기능의 메소드를 재정의 |
| 조건 | 메소드 이름 동일. 인자 개수, 타입이 달라야 함 | 메소드 이름, 인자 타입, 인자 개수, 인자 리턴 타입이 모두 동일 |
| 바인딩 | 정적 바인딩 | 동적 바인딩 |

{% include support.md %}

