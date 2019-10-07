---
title: "JAVA 14. Inheritance"
date: 2019-06-23
categories: java
---

{% include java2.md %}

**자바 초심자 1차 통곡의 벽에 오신걸 환영합니다**

# Inheritance

## Object Oriented Inheritance

* 객체 지향 상속
  * 부모의 유전자를 물려 받는 것과 비슷한 개념 
  
* 상속의 필요성
  * 중복된 내용을 줄이고, 간결하게 만들 수 있음
  
  ![0501](https://user-images.githubusercontent.com/26007107/59972108-2649a500-95c4-11e9-986c-5e551185557c.png)
  
  ![0502](https://user-images.githubusercontent.com/26007107/59972110-2cd81c80-95c4-11e9-9ff7-2c291fbcaf6c.png)

## Inheritance of Class and Object

* 상속 선언
  * *extends* 키워드로 선언 : 부모 클래스를 물려받아 확장
  
  ~~~java
  class Point {
    private int x, y;
    void set(int x, int y) {
      this.x = x; this.y = y;
    }
    void showPoint() {
      System.out.println("("+x+","+y+")");
    }
  }
  class ColorPoint extends Point { 
    ...
  }
  //ColorPoint는 Point를 상속받으므로, Point에 선언된 필드와 메소드의 선언이 필요 없음
  ~~~
  
> **연습문제 1 : 위의 Point 클래스를 상속받는 ColorPoint 클래스를 완성하시오. (ColorPointEx.java)**
>
> **ColorPoint 클래스에는 점의 색을 저장하는 private String color, 점의 색을 지정하는 setColor 메소드, 컬러 점의 좌표를 출력하는 showColorPoint 메소드가 있다.**
>
> **showColorPoint 호출시, red(3,4) 와 같은 형태로 출력이 되게 하라**

[연습문제 1 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/ColorPointEx.java)

* 자바 상속의 특징
  * 클래스 다중 상속 불가능 : 이후에 배울 인터페이스에서는 다중 상속 허용
  * 모든 자바 클래스는 Object 클래스를 상속받음 (java.lang.Object 클래스는 모든 클래스의 슈퍼 클래스)
  
## 접근 지정자

* 슈퍼 클래스의 멤버에 대한 서브 클래스의 접근
  * private 멤버 : 접근할 수 없음
  * default 멤버 : 동일한 패키지일 경우 접근 가능
  * protected 멤버 : 동일 패키지의 모든 클래스 접근 가능, 서브 클래스는 패키지 여부 상관 없이 가능
  * public 멤버 : 모든 클래스 접근 가능
  
| 슈퍼 클래스 멤버에 접근하는 클래스 종류 | private | default | protected | public |
|:---:|:---:|:---:|:---:|:---:|
| 같은 패키지의 클래스 | X | O | O | O |
| 다른 패키지의 클래스 | X | X | X | O |
| 같은 패키지의 서브 클래스 | X | O | O | O |
| 다른 패키지의 서브 클래스 | X | X | O | O |

![0503](https://user-images.githubusercontent.com/26007107/59972273-18e1ea00-95c7-11e9-9d2b-801c3bfcf6d5.png)


## 생성자

* 생성자의 호출 및 실행
  * 슈퍼 클래스 생성자와 서브 클래스 생성자 모두 실행
  * 호출 순서 : 서브 클래스 생성자 먼저 호출, 서브 클래스의 생성자는 실행 전 슈퍼 클래스 생성자 호출
  * 실행 순서 : 슈퍼 클래스의 생성자가 먼저 실행 후, 서브 클래스의 생성자 실행
  
[생성자 호출과 실행 관계 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/ConstructorEx.java)

* 서브 클래스와 슈퍼 클래스의 생성자 선택
  * 슈퍼 클래스와 서브 클래스 각각 여러개의 생성자 작성 가능
  * 서브 클래스의 객체 생성시, 슈퍼 1개 서브 1개가 실행

* 서브 클래스의 생성자와 슈퍼 클래스의 생성자가 결정되는 방식
  1. 개발자의 명시적 선택 : super() 키워드
  1. 컴파일러가 기본생성자 선택 : 자동으로 슈퍼클래스의 기본 생성자 선택

  * [컴파일러에 의해 슈퍼클래스의 기본생성자가 암묵적으로 선택되는 코드(방금 그 코드)](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/ConstructorEx.java)

  * [슈퍼클래스에 기본생서자가 없어 오류가 나는 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/ConstructorEx1.java)
    * BB()에 대한 짝인 AA()를 찾을 수 없음
    * *Implicit super constructor AA() is undefined. Must explicitly invoke another constructor.*
  
  * [개발자가 서브클래스의 생성자에 대해 슈퍼클래스의 생성자를 명시적으로 선택하지 않은 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/ConstructorEx2.java)
  
  
## super()

* 서브클래스에서 명시적으로 슈퍼클래스의 생성자 선택 호출
  * super(parameter);
  * 인자를 이용하여 슈퍼클래스의 생성자 호출
  * **반드시** 서브 클래스 생성자 코드의 제일 첫 줄에 와야 함

  * [super()로 슈퍼클래스의 생성자를 명시적으로 선택한 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/ConstructorEx3.java)

> **연습문제 2 : 위의 ColorPoint 클래스를 super을 이용하여 다시 작성하시오. (SuperPoint.java)**
>
> 단, ColorPoint로 하면 클래스 이름 중복으로 인해 오류가 발생하므로, ColorPointA로 하고 슈퍼클래스는 PointA로 하시오.

[연습문제 2 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter5/SuperPoint.java)

{% include support.md %}

