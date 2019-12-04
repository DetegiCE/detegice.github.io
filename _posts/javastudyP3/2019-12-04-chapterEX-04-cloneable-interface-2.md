---
title: "JAVA 41. Cloneable Interface (2)"
date: 2019-12-04
categories: java
---

내용 코드 출처 : [객체 클로닝에 관하여 - javacan](https://javacan.tistory.com/entry/31)

# ``Cloneable`` Interface

[``Cloneable`` Interface 1편](https://detegice.github.io/chapterEX-02-cloneable-interface/)

## 단순 클로닝 구현

```java
public class MyClass implements Cloneable {
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
```

위와 같은 cloning의 경우, **shallow cloning**이라 부르며, 객체 레퍼런스가 아닌 단순 필드에 대한 클로닝에만 작동한다.

## ``clone()`` 메소드의 필수 요소

**``Cloneable`` 인터페이스** : ``clone()`` 메소드를 제공하기 위한 ``Cloneable`` 인터페이스를 상속해야함.

**``Object`` 클래스에서 구현된 ``clone`` 메소드** : 객체의 모든 *필드*를 복사

**``CloneNotSupportedException`` 클래스** : 클래스의 ``clone()`` 메소드가 지원되지 않을 경우를 위한 예외 클래스.

이 예외는 실행 시 발생하는 예외로 컴파일 시에는 발견되지 않음.

**``Object.clone()`` 메소드** : 객체의 복사본을 생성하여 반환. 즉, ``x.clone() != x``

## 배열을 포함한 객체 클로닝

**deep cloning**이 필요한 부분

```java
public class MyArrayClass implements Cloneable {
  private int[] numbers = null;
  
  public MyArrayClass() {
    numbers = new int[10];
  }
  
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
```

이 객체의 ``clone()``의 경우, 객체의 복사본을 만드나 새로운 배열을 생성하지 않고 원본에서 생성된 배열을 공유함.

따라서 ``clone()`` 부분을 다음과 같이 바꾸어 주어야 함.

```java
public Object clone() throws CloneNotSupportedException {
  MyArrayClass myObj = super.cloen();
  myObj.numbers = (int[])numbers.clone();
  return myObj;
}
```

## 객체 레퍼런스를 포함한 객체 클로닝

**deep cloning**이 필요한 부분

```java
public class MyReferenceClass implements Cloneable {
  private MyData data = null;
  
  public MyReferenceClass() {
    data = new MyData();
  }
  
  public Object clone() throws CloneNotSupportedException {
    MyReferenceClass myObj = super.clone();
    myObj.data = (MyData)data.clone();
    return myObj;
  }
}
```

단, 이 클로닝이 되기 위해서는 ``MyData`` 클래스가 클로닝이 보장되어야 한다.

## Collection을 포함한 객체 클로닝

[Collection?](https://detegice.github.io/chapter7-01-collection-generic-and-vector/)

```java
public class MyCollectionClass implements Cloneable {
  private Vector vector = null;
  
  public MyCollectionClass() {
    vector = new Vector();
  }
  
  public Object clone() throws CloneNotSupportedException {
    MyCollectionClass myObj = super.clone();
    myObj.vector = (Vector)vector.clone();
    return myObj;
  }
}
```

``Collection`` 계열의 객체들은 클로닝을 지원하므로 ``clone()``메소드를 이용한 클로닝 구현 가능


### 참고문헌

* [객체 클로닝에 관하여 - javacan](https://javacan.tistory.com/entry/31)
* [Cloneable 인터페이스 그리고 deep copy vs shallow copy - marshallslee](https://marshallslee.tistory.com/entry/%EC%9E%90%EB%B0%94-Cloneable-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4-%EA%B7%B8%EB%A6%AC%EA%B3%A0-deep-copy-vs-shallow-copy)
