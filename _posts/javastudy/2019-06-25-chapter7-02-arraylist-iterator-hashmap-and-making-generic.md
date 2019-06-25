---
title: "JAVA 22. ArrayList, Iterator, HashMap and Making Generic"
date: 2019-06-25
categories: JAVA
---

{% include java2.md %}

# ArrayList, Iterator, HashMap and Making Generic

## ArrayList&lt;E&gt;

* *java.util.ArrayList* 를 import 해야됨

* 가변 크기 배열을 구현한 클래스
  * &lt;E&gt;에 요소로 사용할 특정 타입을 구체화
* 벡터와 거의 동일함
  * 다수의 스레드를 동시에 접근 시, 동기화가 되지 않음 (동시 작업이 안됨)
  * 위 내용 그냥 알 필요 없음. 그냥 어차피 안쓰니까 벡터랑 비슷하다고 보면 됨
  
~~~java
ArrayList<String> = new ArrayList<String>();
~~~

 메소드 | 설명 
:---|:---
★ boolean add(E element) | ArrayList의 맨 뒤에 element 추가
★ void add(int index, E element) | index에 element 삽입
boolean addAll(Collection&lt;? extends E&gt; c) | 컬렉션 c의 모든 요소를 벡터의 맨 뒤에 추가
★ void clear() | ArrayList의 모든 요소 삭제
★ boolean contains(Object o) | ArrayList가 객체 o를 포함하면 true
★ E elementAt(int index) | index 위치의 요소 리턴
★ E get(int index) | index 위치의 요소 리턴
★ int indexOf(Object o) | o와 동일한 첫 번째 요소의 인덱스 리턴. 없으면 -1
★ boolean isEmpty() | ArrayList가 비어있으면 true
★ E remove(int index) | index 위치의 요소 삭제
★ boolean remove(Object o) | o와 동일한 첫 번째 요소를 ArrayList에서 삭제
★ int size() | ArrayList가 포함하는 요소의 개수 리턴
★ Object[] toArray() | ArrayList의 모든 요소를 포함하는 배열 리턴


~~~java
ArrayList<String> a = new ArrayList<String>(7);

a.add("Hello"); //Hello
a.add("Korea"); //Hello, Korea
a.add("Yonsei"); //Hello, Korea, Yonsei

int n = a.size(); //n은 3

a.add(2, "SNU"); //Hello, Korea, SNU, Yonsei

String str = a.get(1); //str은 Korea

a.remove(3); //Hello, Korea, SNU

a.clear(); //요소 삭제
~~~

> **연습문제 1 : 이름을 4개 입력받아 ArrayList에 저장하고, ArrayList에 저장된 이름을 모두 출력한 후, 가장 긴 이름을 출력하는 프로그램 NameArrayList.java를 작성하시오.**

[연습문제 1 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter7/NameArrayList.java)


## Iterator&lt;E&gt;

* 리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 인터페이스
  * Vector&lt;E&gt;, ArrayList&lt;E&gt;, LinkedList&lt;E&gt;가 상속받는 인터페이스
* Iterator 객체 얻어내기
  * 컬렉션의 iterator() 메소드 호출
  * 해당 컬렉션을 순차 검색할 수 있는 Iterator 객체 리턴
  * 컬렉션 검색 코드 작성
  
  ~~~java
  Vector<Integer> v = new Vector<Integer>();
  Iterator<Integer> it = v.iterator();
  
  while(it.hasNext()) { //모든 요소 방문
    int n = it.next(); //다음 요소 리턴
  }
  ~~~

메소드 | 설명
:---|:---
boolean hasNext() | 다음 반복에서 사용될 요소가 있으면 true
E next() | 다음 요소 리턴
void remove() | 마지막으로 리턴된 요소 제거


> **연습문제 2 : 벡터에 4개의 정수를 넣고, 이터레이터를 이용하여 그 정수의 합을 구하는 프로그램 SumIterator.java를 작성하시오.**

[연습문제 2 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter7/SumIterator.java)


## HashMap&lt;K,V&gt;

* *java.util.HashMap* 을 import 해야함

* Key와 Value의 쌍으로 구성되는 요소를 다루는 컬렉션
  * K : 키로 사용할 요소의 타입
  * V : 값으로 사용할 요소의 타입
  * 키와 값이 한 쌍으로 삽입
  * 값을 검색하기 위해서는 키를 이용
  
~~~java
HashMap<String, String> h = new HashMap<String, String>();
~~~

메소드 | 설명
:---|:---
★ void clear() | HashMap의 모든 요소 삭제
★ boolean containsKey(Object key) | 지정된 키를 포함하면 true 리턴
★ boolean containsValue(Object value) | 하나 이상의 키를 지정된 값에 매핑 시킬 수 있으면 true 리턴
★ V get(Object key) | 키에 매핑되는 값 리턴. 없으면 null
★ boolean isEmpty() | HashMap이 비어있으면 true
★ Set&lt;K&gt; keySet() | HashMap에 있는 모든 키를 담은 Set&lt;K&gt; 컬렉션 리턴
★ V put(K key, V value) | 키와 값을 매핑하여 HashMap에 저장
★ V remove(Object key) | 지정된 키와 이에 매핑된 값을 HashMap에서 삭제
★ int size() | HashMap에 포함된 요소의 개수 리턴


~~~java
HashMap<String, String> h = new HashMap<String, String>(); //객체 생성

h.put("c", "씨"); // (c, 씨)
h.put("java", "자바"); // (c, 씨), (java, 자바)
h.put("python", "파이썬"); // (c, 씨), (java, 자바), (python, 파이썬)

String kor = h.get("java"); //kor에 "자바"

h.remove("java"); // (c, 씨), (python, 파이썬)

int n = h.size(); //n은 2
~~~


> **연습문제 3 : 영단어와 그에 맞는 한글 단어 쌍 3개를 입력받아 HashMap에 저장하고, 영단어로 한글 단어를 검색하는 프로그램 DicHashMap.java를 작성하시오.**

[연습문제 3 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter7/DicHashMap.java)


## Making Generic

* 제네릭 클래스 작성
  * 클래스 옆에 일반화된 타입 매개 변수 추가
 
~~~java
public class MyClass<T> {
  T val;
  void set(T a) {
    val = a;
  }
  T get() {
    return val;
  }
}
~~~

  * 제네릭 객체 생성 및 활용

~~~java
MyClass<String> s = new MyClass<String>();
s.set("hello");
System.out.println(s.get()); //hello 출력

MyClass<Integer> n = new MyClass<Integer>();
n.set(6);
System.out.println(n); //6 출력
~~~

> **연습문제 4 : 제네릭 클래스 GVector를 만들어 값을 넣고 n번째 위치의 값을 출력해주는 기능을 만들어 String 형과 Integer 형으로 사용하는 프로그램 GenericVector.java를 작성하시오.**

[연습문제 4 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter7/GenericVector.java)

{% include support.md %}
