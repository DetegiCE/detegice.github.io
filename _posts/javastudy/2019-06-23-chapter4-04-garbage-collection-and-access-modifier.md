---
title: "JAVA 12. Garbage Collection and Access Modifier"
date: 2019-06-23
categories: JAVA
---

# Garbage Collection and Access Modifier

## Object Extinction

* 객체 소멸
  * *new*에 의해 할당 받은 객체와 배열 메머리를 자바 가상 기계(JVM)로 되돌려주는 행위
  * 소멸된 공간은 가용 메모리가 됨
* 자바는 사용자 임의로 객체 소멸 불가
  * 따로 객체 소멸 연산자가 없음
  * 객체 소멸은 JVM 고유의 역할
  
## Garbage Collection

* 가비지 : 가리키는 레퍼런스가 하나도 없는 객체
* 가비지 컬렉션
  * JVM의 가비지 컬렉터가 자동으로 가비지 수집, 반환
  
  ~~~java
  University a, b;
  a = new University("고려대학교");
  b = new University("연세대학교");
  b = a; //b가 가리키던 객체는 가비지가 됨
  ~~~
  
> **연습문제 1 : 다음 코드에서 언제 가비지가 발생하는지 설명하시오.**

[연습문제 1 : 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/GarbageEx.java)

<details><summary>정답</summary>

<img src = "https://user-images.githubusercontent.com/26007107/59971008-a6fda680-95ae-11e9-9f65-123f5d79ae09.png">

</details>
