---
title: "JAVA 07. Array"
date: 2019-06-21
categories: JAVA
---

# Array

## 배열 (Array)

* index와 index에 대응하는 data들로 이루어진 data structure
  * 한번에 많은 메모리 공간 선언 가능
* 같은 타입의 데이터들이 순차적으로 저장되는 공간
  * 원소 데이터들이 순차적으로 저장
  * 인덱스를 이용하여 원소의 데이터에 접근
* index
  * 0부터 시작
  * index : 배열의 시작 위치에서부터 데이터가 있는 상대 위치
 
## 배열의 선언과 생성

**1. 배열에 대한 레퍼런스 변수 intArray 선언**

  ~~~java
  int intArray [];
  ~~~

  *int* : 배열 타입

  *intArray* : 배열에 대한 레퍼런스 변수

  *[]* : 배열 선언



**2. 배열 생성**

  ~~~java
  intArray = new int [5];
  ~~~

  *intArray* : 배열에 대한 레퍼런스 변수

  *new* : 배열 생성

  *int* : 데이터 타입

  *[5]* : 원소의 개수


* 선언과 동시에 배열을 생성

~~~java
int intArray[] = new int [5];
~~~

* 배열 초기화

~~~java
int intArray[] = {4, 3, 2, 1, 0};
double doubleArray[] = {0.01, 0.02, 0.03, 0.04};
~~~


## 배열 인덱스와 배열 원소 접근

* 배열의 인덱스는 0부터 시작

~~~java
int intArray[] = new int[5]; 
intArray[0] = 3;
intArray[3] = 7;
int n = intArray[3];
~~~

* 반드시 배열을 생성한 후 접근해야함
~~~java
int intArray[]; //레퍼런스만 선언됨
intArray[1] = 7; //오류발생 : 배열이 생성되어 있지 않음
~~~

## 레퍼런스 치환과 배열 공유

* 레퍼런스 교환으로 두 레퍼런스가 하나의 배열을 공유
~~~java
int intArray[] = new int [5];
int myArray[] = intArray;

intArray[1] = 2;
myArray[1] = 6;
System.out.println(intArray[1]); // 6
~~~


> **연습문제 1 : 양수 5개를 입력받아 배열에 저장하고, 가장 큰 수를 출력하는 프로그램 ArrayMax.java을 작성하시오.**

[연습문제 1 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter3/ArrayMax.java)


## 배열의 크기 및 length 필드

* 자바의 배열은 object로 처리됨 : length 라는 필드가 존재
* 배열의 크기는 배열 객체의 length 필드에 저장

~~~java
int intArray[] = new int[5];
int size = intArray.length; //size = 5
~~~

> **연습문제 2 : 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 출력하는 ArrayAverage.java를 작성하시오.**

[연습문제 2 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter3/ArrayAverage.java)


## for-each 문

* for-each문 : 배열이나 나열(enum)의 원소를 순차접근할때 유용한 fora문

~~~java
for(변수 : 배열레퍼런스) {
  작업문
}
~~~

~~~java
int n[] = {1, 2, 3, 4, 5};
int sum = 0;
for(int k : n) {
  sum+=k;
}
~~~

> **연습문제 3 : 양수 5개를 받아 배열에 저장한 후, for-each 문을 활용하여 배열의 합을 구하는 프로그램 ForEachSum.java를 작성하시오.**

[연습문제 3 : 예시풀이]


## 2차원 배열

* 2차원 배열의 선언

~~~java
int intArray[][];
~~~

* 2차원 배열의 생성

~~~java
intArray = new int[2][5];
~~~

* 선언과 생성을 동시에

~~~java
int intArray[][] = new int[2][5];
~~~

* 선언과 동시에 초기화

~~~java
int intArray[][] = {{0,1,2},{3,4,5},{6,7,8}};
~~~

> **연습문제 4 : 2차원 배열에 학년별로 1, 2학기 학점을 입력받아 저장하고, 4년 전체 학점 평균을 출력하는 프로그램 FourYearGrade.java를 작성하시오.**

[연습문제 4 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter3/FourYearGrade.java)


## 배열을 리턴하는 메소드

* 배열 리턴 : 배열의 레퍼런스만 리턴 (배열 전체가 리턴되는 것이 아님)

* 메소드의 리턴 타입
  * 리턴하는 배열 타입과 리턴 받는 배열 타입의 일치
  * 리턴 타입에 배열의 크기를 지정하지 않음
  
~~~java
int[] makeArray() {
  int temp[] = new int[4];
  return temp;
}

//main 메소드에서는
int[] intArray;
intArray = makeArray();
~~~

> **연습문제 5 : 1차원 정수 배열을 생성하여 리턴하는 makeArray()를 작성하고, 이 메소드로부터 배열을 전달받는 프로그램 ReturnArray.java를 작성하시오.**

[연습문제 5 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter3/ReturnArray.java)
