---
title: "JAVA 12. Garbage Collection and Access Modifier"
date: 2019-06-23
categories: java
---

{% include java.md %}

# Garbage Collection and Access Modifier

## Object Extinction

* 객체 소멸
  * *new*에 의해 할당 받은 객체와 배열 메모리를 자바 가상 기계(JVM)로 되돌려주는 행위
  * 소멸된 공간은 가용 메모리가 됨
* 자바는 사용자 임의로 객체 소멸 불가
  * 따로 객체 소멸 연산자가 없음
  * 객체 소멸은 JVM 고유의 역할
  
## Garbage Collection

* 가비지 : 가리키는 레퍼런스가 하나도 없는 객체
  
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

* 가비지 컬렉션
  * JVM이 가비지 자동 회수
    * 가용 메모리 공간이 일정 이하로 부족해질 때
    * 가비지를 수거하여 가용 메모리 공간으로 확보
  * 가비지 컬렉터에 의해 자동 수행
  
  * 강제 가비지 컬렉션 수행
  ~~~java
  System.gc(); //제발 쓰지 말자
  ~~~
  
## Package
* 패키지
  * 상호 관련 있는 클래스 파일(.class)을 저장하여 관리하는 디렉토리
  * 자바 프로그램은 하나 이상의 패키지로 구성
  
## Access Modifier
* 접근 지정자
  * private, protected, public, default(생략 가능)
  
* 접근 지정자의 목적
  * 클래스나 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용
  * 객체 지향 언어의 캡슐화의 목적이 멤버를 보호하는 것
  
![0407](https://user-images.githubusercontent.com/26007107/59971055-36a35500-95af-11e9-9b83-8509e2867854.png)

* 클래스 접근 지정
  * 다른 클래스에서 사용하도록 허용할지 지정
  * *public* 클래스 : 다른 모든 클래스에게 접근 허용
  * *default* 클래스 : 같은 패키지의 클래스에만 접근 허용
  
  ~~~java
  public class World { ... } // public class
  class Local { ... } // default class
  ~~~
  
![0408](https://user-images.githubusercontent.com/26007107/59971063-81bd6800-95af-11e9-83ef-a1d755659522.png)

* 멤버 접근 지정
  * *public* 멤버 : 패키지에 관계 없이 모든 클래스에게 접근 허용
  * *private* 멤버 : 동일 클래스 내에만 접근 허용. 상속 받은 서브 클래스에서 접근 불가
  * *protected* 멤버 : 동일 패키지 내의 다른 모든 클래스에게 접근 허용. 상속 받은 서브 클래스는 다른 패키지에 있어도 접근 가능
  * *default* 멤버 : 같은 패키지 내의 다른 클래스에게 접근 허용
  
| 멤버에 접근하는 클래스 | private | default | protected | public |
|:---:|:---:|:---:|:---:|:---:|
| 같은 패키지의 클래스 | X | O | O | O |
| 다른 패키지의 클래스 | X | X | X | O|
| 접근 가능 영역 | 클래스 내 | 동일 패키지 내 | 동일 패키지와 자식 클래스 | 모든 클래스 |

<details><summary>private member</summary>
<img src="https://user-images.githubusercontent.com/26007107/59971085-4b341d00-95b0-11e9-9691-11cfa1e9778d.png">
</details>

<details><summary>default member</summary>
<img src="https://user-images.githubusercontent.com/26007107/59971102-964e3000-95b0-11e9-974a-12fa9472b3f3.png">
</details>

<details><summary>protected member</summary>
<img src="https://user-images.githubusercontent.com/26007107/59971107-b382fe80-95b0-11e9-9e68-361ca7996901.png">
</details>

<details><summary>public member</summary>
<img src="https://user-images.githubusercontent.com/26007107/59971111-cc8baf80-95b0-11e9-835b-96c10098b054.png">
</details>

> **연습문제 2 : 다음 코드에서 에러가 발생하는 이유를 설명하시오.**

[연습문제 2 : 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter4/AccessEx.java)

<details><summary>정답</summary>
  
field4는 SampleClass의 private 멤버이므로 SampleClass 외에 다른 클래스에서 접근할 수 없다.

</details>


{% include support.md %}
