---
title: "JAVA 03. Literal, Constant and Data Type Conversion"
date: 2019-06-19
categories: JAVA
---

{% include java.md %}

# 리터럴, 상수, 형 변환

## 리터럴 (Literal)

* 리터럴 : 프로그램에서 직접 표현한 값

* 정수 리터럴
  * 10진수, 8진수, 16진수, 2진수 리터럴
  
  ~~~java
  int n = 15; // 10진수 15
  int m = 015; // 8진수 15 (10진수 13)
  int k = 0x15; // 16진수 15 (10진수 21)
  int b = 0b0101; //2진수 0101 (10진수 5)
  ~~~
  
  * 정수 리터럴은 int형으로 컴파일 됨
  * long 타입인 경우, 숫자 뒤에 L을 붙여 표시
  
  ~~~java
  long g = 24L;
  ~~~
  
* 실수 리터럴
  * 소수점 형태나 지수 형태로 표현
  
  ~~~java
  12., 12.0, .1234, 0.1234, 1234E-4
  ~~~
  
  * 실수 리터럴은 double 형으로 컴파일 됨
  
  ~~~java
  double d = 0.1234;
  double e = 1234E-4; // 1234E-4 = 1234x10-4 이므로 0.1234와 동일
  ~~~
  
  * f나 d를 붙여 float나 double로 명시적으로 표현
  
  ~~~java
  float f = 0.1234f;
  double w = .1234D;
  ~~~
  
* 논리 리터럴
  * true 또는 false 뿐
  * boolean 타입 변수에 치환하거나 조건문에 이용
  
  ~~~java
  boolean a = true;
  boolean b = 10 > 0; // 10 > 0 이 참이므로 b는 true
  boolean c = 1; // 타입 불일치로 오류. C와 달리 자바에서는 1과 0을 참 거짓으로 사용 불가
  
  while(true) { ... } // 무한 루프
  ~~~
  
* null 리터럴 : 레퍼런스에 대입 사용

  ~~~java
  int n = null; // 기본 데이터 타입에 사용 불가
  String str = null; 
  ~~~
  
* 문자열 리터럴
  * 큰따옴표로 묶어 표현
  
  ~~~java
  "Good", "Korea", "University", "자바 공부 하기 귀찮아", "4.5", "A+"
  ~~~
  
  * 문자열 리터럴은 자동으로 String 클래스로 처리
  
## 상수
* 상수 선언
  * *final* 키워드 이용
  * 선언시 초기값 지정
  * 실행 중 값 변경 불가능
  
~~~java
final int LENGTH = 20;
final double PI = 3.141592;
~~~



> **연습문제1 : 반지름 4.5인 원의 면적을 구하는 CircleArea.java 프로그램을 작성해보자. (단, PI는 3.14)**

[연습문제1 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter2/CircleArea.java)

## 타입 변환
* 타입 변환 : 한 타입의 값을 다른 타입의 값으로 변환
* 자동 타입 변환
  * 컴파일러에 의하여 원래의 타입보다 큰 타입으로 자동 변환
  * 치환문(=)이나 수식 내에서 타입이 일치하지 않을 경우
  
  ~~~java
  long m = 25; // 25는 int이나, 큰 long으로 자동 변환
  double d = 3.14 * 10; // 실수 연산을 위해 10이 10.0으로 자동 변환
  ~~~
  
* 강제 타입 변환 (명시적 변환)
  * 개발자의 의도적 타입 변환
  * () 안에 명시적으로 타입 변환
  
  ~~~java
  int n = 300;
  byte b = n; //int 타입이 byte로 자동 변환 불가능
  byte b = (byte)n; //값 손실 (44)
  
  double d = 1.9;
  int k = (int)d; // 강제 타입 변환으로 소수점 이하 손실 (1)
  ~~~
  
> **연습문제 2 : 다음 프로그램의 출력을 작성하시오.**

~~~java
public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b + i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)b+i);
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}
~~~

<details><summary>정답</summary>
{% highlight text %}
227
2
2.5
A
-29
3.8
4
3
{% endhighlight%}
</details>

{% include support.md %}
