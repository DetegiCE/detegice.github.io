---
title: "JAVA 02. Basic Structure of Java Program"
date: 2019-06-19
categories: JAVA
---

# Basic Structure of Java Program

## Basic Structure

~~~java
public class Hello {
	public static int sum(int n, int m) {
		return n+m;
	}
	public static void main(String[] args) {
		int i=20;
		int s;
		char a;
		
		s = sum(i,10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
~~~
```
?
Hello
30
```

* 클래스
  * Hello 이름의 클래스 선언
    ~~~java
    public class Hello { ... }
    ~~~
  * *class* 키워드로 클래스 선언
  * *public*으로 선언하면 다른 클래스에서 접근 가능

* 메소드
  * C/C++의 함수에 해당
    ~~~java
    public static int sum (int n, int m) { ... }
    ~~~
  * 클래스 바깥에 작성 가능
  
* main() 메소드
  * 자바 프로그램은 main() 에서 실행 시작
    ~~~java
    public static void main(String[] args) { ... }
    ~~~
  * *public static void* 로 선언
  * *String[] args* 로 실행인자 전달 받음
  
* 출력문
  * 표준 출력 스트림에 메시지 출력
    ~~~java
    System.out.println("Hello"); //syso를 한 뒤 Ctrl+Space 로 바로 가능
    ~~~
  * println()은 여러 타입의 데이터 출력 가능
  * 출력 후 다음 행으로 커서 이동
  
## 식별자 (identifier)
* 식별자
  * 클래스, 변수, 상수, 메소드 등에 붙이는 이름
  * 식별자 원칙
    * @, #, ! 등의 특수문자, 공백, 탭은 식별자로 사용 불가능하나, _, $는 사용 가능
    * 유니코드 문자 사용 가능, 한글 사용 가능 ~~힘들게 영어로 뭐할지 생각 안해도 됨~~
    * 키워드는 식별자로 사용 불가 (int, char 등)
    * 시겹ㄹ자의 첫 문자는 숫자로 불가능
    * 길이 제한 없음
  * 대소문자 구별 (bar과 Bar은 서로 다른 식별자)
  
* 식별자 예시
```
int name;
char student_ID; // _ 사용 가능
void $func() { } // $ 사용 가능
class Monster3 { } // 숫자 가능
int doyouknowwhatismynamemynameisryubinkimthemanagerofthissite; // 길이 제한 없음
int barChart, barchart; // 대소문자 구분
int 가격; // 한글 가능

int 3Chapter; // 숫자로 시작 불가능
class if { } // 키워드 사용 불가
class %calc { } // 특수문자 사용 불가
```

## 데이터 타입 (data type)
* 기본 데이터 타입
```
boolean, char, byte, short, int, long, float, double
```
* 레퍼런스 타입
  * 레퍼런스 : C언어의 구조체나 포인터 같은 느낌. 일단은 있다고만 알아둡시다
  * class에 대한 레퍼런스
  * interface에 대한 레퍼런스
  * array에 대한 레퍼런스
  
* 특징
  * 기본 데이터 타입의 크기는 CPU나 OS에 따라 변하지 않음
  * boolean : 1바이트 (true, false)
  * char : 2바이트 (Unicode)
  * byte : 1바이트 (-128 ~ 127)
  * short : 2바이트 (-32768 ~ 32767)
  * int : 4바이트 (-2<sup>31</sup> ~ 2<sup>31</sup>-1)
  * long : 8바이트 (-2<sup>63</sup> ~ 2<sup>63</sup>-1)
  * float : 4바이트 (-3.4E38 ~ 3.4E38)
  * double : 8바이트 (-1.7E308 ~ 1.7E308)
  
## 문자열 (String)
* 문자열은 기본 타입이 아님
* *String* 클래스를 이용하여 문자열 표현
~~~java
String name = "R.B.Kim";
String person = name + "(19)"; //R.B.Kim(19)
System.out.println(name + "가 정보관에 출몰함"); //R.B.Kim(19)가 정보관에 출몰함
~~~
