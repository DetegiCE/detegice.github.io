---
title: "JAVA 04. Input and Operators
date: 2019-06-19
categories : JAVA
---

# 입력과 연산자

## System.in

* System.in
  * 키보드와 연결된 자바의 표준 입력 스트림
  * 입력되는 키를 바이트로 리턴하는 Low Level 스트림
* Scanner 클래스
  * 읽은 바이트를 문자, 정수, 실수, 불린, 문자열 등 다양한 타입으로 변환하여 리턴
  * *java.util.Scanner*
  * 객체의 생성
  ~~~java
  import java.util.Scanner; //import
  ...
  Scanner sc = new Scanner(System.in); //Scanner 객체 생성
  ~~~
* Scanner에서 키 입력받기
  * Scanner는 입력되는 키 값을 공백으로 구분되는 토큰 단위로 읽음
  * 공백 문자 : \t, \f, \r,  , \n
  
  ```
  Ryubin KoreaUniv 19 4.5 false
  ```
  
  ~~~java
  Scanner sc = new Scanner(System.in);
  
  String name = sc.next();
  String school = sc.next();
  int age = sc.nextInt();
  double gpa = sc.nextDouble();
  boolean marry = sc.nextBoolean();
  ~~~
  
<details><summary>Scanner 주요 메소드</summary>
{% highlight java %}
String next() : 다음 토큰을 문자열로 리턴
byte nextByte()
short nextShort()
int nextInt()
long nextLong()
float nextFloat()
double nextDouble()
String nextLine() : '\n'을 포함하는 한 라인을 읽고 '\n'을 버린 나머지만 리턴
void close() : Scanner 사용 종료
boolean hasNext() : 현재 입력된 토큰이 있으면 true, 아니면 새로운 입력이 들어올때까지 기다리고, 
                    새로운 입력이 들어오면 그때 true 리턴. Ctrl+Z 키가 입력되면 입력 끝이므로 false 리턴
{%end highlight %}
</details>

**연습문제 1 : Scanner 클래스를 이용하여 자신의 이름, 학교, 나이, 학점, 결혼 여부를 입력받고
다시 출력하는 프로그램 MyInfoScan.java을 작성하시오.**

<details><summary>연습문제 1 : 예시답안</summary>
{% highlight java %}
import java.util.Scanner;

public class MyInfoScan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int age = sc.nextInt();
		double gpa = sc.nextDouble();
		boolean marry = sc.nextBoolean();
		System.out.println(name+" "+school+" "+age+" "+gpa+" "+marry);
	}
}
{% endhighlight %}
</details>

## 연산자
| 연산의 종류 | 연산자 |
|:---:|:---|
| 증감 | ++ -- |
| 산술 | + - * / % |
| 비트 쉬프트 | >> << >>> |
| 비교 | > < >= <= == != |
| 비트 | & &#124; ^ ~ |
| 논리 | && &#124;&#124; ! ^ |
| 조건 | ?: |
| 대입 | = *= /= += -= &= ^= |= <<= >>= >>>= |

**연습문제 2 : 초 단위의 정수를 입력받고, 시간, 분, 초 단위로 출력하는 프로그램 TimeConvert.java를 작성시오**

<details><summary>연습문제 2 : 예시답안</summary>
{% highlight java %}
import java.util.Scanner;

public class TimeConvert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		
		int hour = time/60/60;
		int min = time/60%60;
		int sec = time%60;
		
		System.out.println(time+"초 = "+hour+"시간 "+min+"분 "+sec+"초");
	}
}
{% endhighlight %}
</details>

| 비트 연산자 | 설명 |
|:---:|:---|
| a & b | a와 b의 각 비트들의 AND 연산. 두 비트 모두 1일 때만 1이 되며 나머지는 0 |
| a &#124; b | a와 b의 각 비트들의 OR 연산. 두 비트 모두 0일 때만 0이 되며 나머지는 1 |
| a ^ b | a와 b의 각 비트들의 XOR 연산. 두 비트가 서로 다르면 1, 같으면 0 |
| ~a | 단항 연산자로서 a의 각 비트들의 NOT 연산. 1을 0, 0을 1로 변환 |
