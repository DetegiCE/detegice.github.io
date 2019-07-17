---
title: "JAVA 08. Exception"
date: 2019-06-22
categories: JAVA
---

{% include java.md %}

# Exception

## 예외의 발생
* 예외 : 실행 중 오동작이나 결과에 악영향을 미치는 예상치 못한 상황의 발생
  * 실행 중 에러(런타임에러)를 예외로 처리 가능
* 런타임 에러 발생시
  * 예외를 처리하도록 호출
  * 예외 미 처리시, 프로그램 강제 종료
* 예외 발생의 예시
  * 0으로 나누는 경우
  * 배열의 크기보다 큰 인덱스로 배열의 원소를 접근하는 경우
  * 정수를 읽는 코드가 실행 중일때, 문자를 입력받는 경우
  
  [0으로 나누는 경우 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter3/DivideByZero.java)
  
  * 위의 코드에서 나누는 수를 0으로 입력하면 *ArithmeticException* 에러가 발생한다.
  
  
## 예외 처리 방법 (try-catch 문)

* 예외 처리
  * 발생한 예외에 대하여 개발자가 작성한 프로그램 코드에서 대응하는 것
  * try-catch(-finally) 문 사용
  
  ~~~java
  try {
    예외가 발생할 수 있는 실행문
  }
  catch (처리할 예외 타입 선언) {
    예외 처리문
  }
  finally { //finally는 생략 가능
    예외 발생 여부에 상관 없이 무조건 실행되는 문장
  }
  ~~~
  
  * 예외가 발생한 경우 : try --> catch --> finally
  * 예외가 발생하지 않은 경우 : try --> finally
  
## 예외 클래스
* 프로그램 실행 중 오류를 탐지할 수 있도록 많은 예외를 클래스의 형태로 제공

| 예외 타입 (클래스) | 예외 발생 경우 | import 패키지 |
|:---:|:---|:---:|
| ArithmeticException | 정수를 0으로 나눌 때 발생 | java.lang |
| NullPointerException | null 레퍼런스를 참조할 때 발생 | java.lang |
| ClassCastException | 변환할 수 없는 타입으로 객체를 변환할 때 발생 | java.lang |
| OutOfMemoryError | 메모리가 부족한 경우 발생 | java.lang |
| ArrayIndexOutOfBoundsException | 배열의 범위를 벗어난 접근 시 발생 | java.lang |
| IllegalArgumentException | 잘못된 인자 전달 시 발생 | java.lang |
| IOException | 입출력 동작 실패 또는 인터럽트 시 발생 | java.io |
| NumberFormatException | 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생 | java.lang |
| InputMismatchException | 입력받는 메소드와 입력 타입이 다른 경우 | java.util |

* 예외 처리 예시

~~~java
int intArray[] = new int [5];

try {
  intArray[3] = 10;
  intArray[6] = 5; //에러 발생
}
catch(ArrayIndexOutOfBoundsException e) {
  System.out.println("배열 접근 에러");
}
~~~


> **연습문제 1 : try-catch-finally 문을 이용하여 위에 주어진 코드를 수정하여, 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다"를 출력하는 프로그램 DivideZeroCatch.java를 작성하시오.**

[연습문제 1 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter3/DivideZeroCatch.java)


> **연습문제 2 : 3개의 정수를 입력받아 합을 구하는 프로그램 IntSumCatch.java를 작성하시오. 단, 정수가 아닌 문자을 입력할 시 다시 입력하도록 하시오.** 

[연습문제 2 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter3/IntSumCatch.java)


{% include support.md %}
