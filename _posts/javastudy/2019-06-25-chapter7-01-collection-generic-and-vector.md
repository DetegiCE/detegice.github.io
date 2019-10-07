---
title: "JAVA 21. Collection, Generic and Vector"
date: 2019-06-25
categories: java
---

{% include java2.md %}

**자바 초심자 2차 통곡의 벽에 오신걸 환영합니다**

# Collection, Generic and Vector

## Collection

쉽게 생각해 편한 링크드리스트라고 생각하세요

* 컬렉션
  * 요소(element)라고 불리는 가변 개수(variable number of) 객체(object)들(s)의 저장소
  * 객체들의 컨테이너 라고도 부름
  * 요소의 개수에 따라 크기가 자동 조절
  * 요소의 삽입, 삭제에 따른 요소의 위치 자동 이동

![0701](https://user-images.githubusercontent.com/26007107/60078594-30f06f80-9767-11e9-8186-fba96439047f.png)

## Characteristics of Collection

* 컬렉션은 제네릭 기법으로 구현
  * 제네릭
    * 특정 타입만 다루지 않고, 여러 종류의 타입으로 변할 수 있록 클래스나 메소드를 일반화
    * 위의 그림에서도 볼 수 있듯이, &lt;E&gt;, &lt;K&gt;, &lt;V&gt; 등의 타입매개변수 사용
  * 예시 : Vector&lt;E&gt;
    * &lt;E&gt;에서 E에 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 
    * Vector&lt;Integer&gt;, Vector&lt;String&gt; 등...

* 컬렉션의 요소는 객체만 사용 가능
  * int, char 등의 기본 데이터 타입은 사용 불가
  
  ~~~java
  Vector<Integer> v = new Vector<Integer>();
  ~~~
  
## Generic

* 제네릭
  * 클래스나 메소드를 찍어내듯이 생산할 수 있도록 일반화된 구조를 만드는 기법
  
  * JDK 1.5부터 도입
  * 모든 종류의 데이터 타입을 다룰 수 있도록 일반화된 매개 변수로 클래스나 메소드를 작성하는 기법
  * C++의 template와 동일
  

## Vector&lt;E&gt;

* *import java.util.Vector* 필요

* &lt;E&gt;에 사용할 요소의 특정 타입으로 구체화
* 배열을 가변 크기로 다룰 수 있게 하는 컨테이너
  * 배열의 길이가 무제한
  * 요소의 개수가 넘치면 자동으로 길이 조절
* 요소 객체들을 삽입, 삭제, 검색 가능
* 객체, null, Wrapper 객체 모두 삽입 가능

* Vector&lt;E&gt; 클래스의 주요 메소드

 메소드 | 설명 
:---|:---
★ boolean add(E element) | 벡터의 맨 뒤에 element 추가
★ void add(int index, E element) | index에 element 삽입
int capacity() | 벡터의 현재 용량 리턴
boolean addAll(Collection&lt;? extends E&gt; c) | 컬렉션 c의 모든 요소를 벡터의 맨 뒤에 추가
★ void clear() | 벡터의 모든 요소 삭제
★ boolean contains(Object o) | 벡터가 객체 o를 포함하면 true
★ E elementAt(int index) | index 위치의 요소 리턴
★ E get(int index) | index 위치의 요소 리턴
★ int indexOf(Object o) | o와 동일한 첫 번째 요소의 인덱스 리턴. 없으면 -1
★ boolean isEmpty() | 벡터가 비어있으면 true
★ E remove(int index) | index 위치의 요소 삭제
★ boolean remove(Object o) | o와 동일한 첫 번째 요소를 벡터에서 삭제
void removeAllElements() | 벡터의 모든 요소를 삭제하고 크기를 0으로 만듬
★ int size() | 벡터가 포함하는 요소의 개수 리턴
★ Object[] toArray() | 벡터의 모든 요소를 포함하는 배열 리턴


~~~java
Vector<Integer> v = new Vector<Integer>(7); //용량이 7인 벡터 생성

v.add(5); //5 삽입 : 5
v.add(new Integer(4)); //4 삽입 : 5, 4
v.add(-1); //-1 삽입 : 5, 4, -1

int n = v.size(); //n은 3
int c = v.capacity(); //c는 7

v.add(2, 100); //index2에 100 삽입 : 5, 4, 100, -1
//v.add(5, 100); //v.size()보다 큰 값에 삽입 불가능 (오류 발생)

Integer obj = v.get(1); //index1의 요소 가져오기
int i = obj.intValue(); //index1 요소를 정수 타입으로 변환

v.remove(1); //index1의 요소 삭제 : 5, 100, -1
//v.remove(4); //index4에 요소가 없으므로 오류 발생

int last = v.lastElement(); //last는 -1 : 마지막 요소 저장

v.removeAllElements(); //모든 요소 삭제
~~~

> **연습문제 1 : 아래 주어진 Point 클래스의 객체를 저장하는 벡터를 만들고 한번 위에 것들을 이용해서 활용해보시오. (PointVector.java)**

~~~java
class Point {
  private int x, y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public String toString() {
    return "("+x+","+y+")";
  }
}
~~~

[연습문제 1 : 예시코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter7/PointVector.java)

{% include support.md %}
