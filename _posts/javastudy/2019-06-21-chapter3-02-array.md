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
