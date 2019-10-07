---
title: "JAVA 18. Package"
date: 2019-06-25
categories: java
---

{% include java2.md %}

# Package

## What is Package?

* 패키지의 필요성
  * 여러 명이 하나의 프로그램을 만드는 경우, 동일한 이름의 클래스가 존재 가능
  * 합칠 때 오류 발생 가능, 서로 다른 디렉토리로 코드 관리
  
* 패키지
  * 서로 관련된 클래스와 인터페이스를 컴파일한 클래스들을 묶은 디렉토리
  * 패키지는 jar파일로 압축됨
  * *java.util.Scanner*에서 *java.util*이 패키지
  
## Using Package

* *import*를 사용하지 않는 경우

  ~~~java
  public class ImportExample{
    public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
    }
  }
  ~~~

* 필요한 클래스만 import

  ~~~java
  import java.util.Scanner;
  public class ImportExample{
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
    }
  }
  ~~~

* 패키지 전체를 import

  ~~~java
  import java.util.*;
  public class ImportExample{
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
    }
  }
  ~~~

## Making Package

* 패키지 선언
  * 소스 파일의 맨 앞에 컴파일 후 저장될 패키지를 *package* 로 선언
  
  ~~~java
  package Building; //아래 Room을 컴파일하여 Building 패키지에 저장할 것을 지시
  
  public class Room { ... }
  ~~~
  
  ~~~java
  package OneRoom; //아래 Kitchen 클래스를 OneRoom 패키지에 저장
  
  import Building.Room; //Building.Room 클래스의 경로명 import
  
  public class Kitchen { ... }
  ~~~

* 패키지 선언이 없는 경우
  * 디폴트 패키지 (현재 디렉토리)에 소속

* JDK 표준 자바 패키지 구조 : rt.jar

![0601](https://user-images.githubusercontent.com/26007107/60069996-05ae5600-9750-11e9-9883-f8da760b6c00.png)


* 여러분들이 앞으로 사용할 주요 패키지들

  * *java.lang* : String, Math, IO 등... (auto import 되서 굳이 import 할 필요 없음)
  
  * *java.util* : date, time, Vector, HashMap 등의 클래스와 인터페이스
  
  * *java.io* : 키보드, 모니터, 프린터, 디스크 등에 입출력 하는 클래스와 인터페이스
  
  * *java.awt*, *java.swing* : GUI를 위한 패키지
  
{% include support.md %}
