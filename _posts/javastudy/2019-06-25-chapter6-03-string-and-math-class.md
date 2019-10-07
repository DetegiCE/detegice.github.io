---
title: "JAVA 20. String and Math Class"
date: 2019-06-25
categories: java
---

{% include java2.md %}

C에서 역겹도록 봤던 그 string이 자바에서 또 나옵니다

# String and Math Class

## String Class

코드로 보는 String 클래스

~~~java
public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a+"의 길이는 "+a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "Java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for(int i=0 ; i<s.length ; i++)
			System.out.println("분리된 문자열 "+i+" : "+s[i]);
		
		a = a.substring(5);
		System.out.println(a);
		
		char c = a.charAt(2);
		System.out.println(c);
	}
}
~~~

```
 C#의길이는3
true
 C#,C++
C#,C++
Java,C++
분리된 문자열 0 : Java
분리된 문자열 1 : C++
C++
+
```

* *length()* : 문자열의 길이 (문자 개수)
* *contains(CharSequence)* : 포함 관계
* *concat(String)* : 문자열 연결
* *trim()* : 공백 제거
* *replace(char, char)* : 대체
* *split(regex)* : 일종의 tokenizer
* *substring(int)* : 부분문자열
* *charAt(int)* : int번째 문자

## StringBuffer Class

* 가변 스트링을 다루는 클래스

~~~java
StringBuffer sb = new StringBuffer("java");
~~~

* String 클래스와 달리 문자열의 변경이 가능함
  * 가변 크기의 버퍼를 가지고 있어 문자열의 수정이 가능
  * 문자열의 수정이 많은 작업에 적합함
  
~~~java
StringBuffer sb = new StringBuffer("This");

sb.append(" is pencil");
sb.insert(7, " my");
sb.replace(8, 10, "your");
~~~

* *append(String)* : 뒤에 추가
* *insert(int, String)* : int자리에 String 삽입
* *replace(int, int, String)* : 1번 int부터 (2번 int)-1 자리를 String함

## StringTokenizer Class

String 클래스의 split과는 다른 『진짜』 Tokenizer

~~아 너무 싫어 근데 C언어에서 했던 strtok보단 100배 쉬움 ㄹㅇ 신세계임~~

* 구분문자를 기준으로 문자열을 분리하는 클래스
  * 구분 문자 (delimiter) : 문자열을 구분할 때 사용되는 문자
  * 토큰 (token) : 구분 문자로 분리된 문자열
  
~~~java
String query = "name=ryubin&grade=a+&age=19";
StringTokenizer st = new StringTokenizer(query, "&=");

int count = st.countTokens(); //토큰의 개수 맞춤 count에 6
String token = st.nextToken(); //다음 토큰을 얻어냄 token에 name
~~~

## Math Class

* 기본 산술 연산 메소드를 제공하는 클래스
* 모든 메소드는 static으로 선언
* Math.random() 메소드로 난수 발생 (0 이상 1.0 미만 실수 난수 발생)

~~~java
int n = (int)(Math.random()*100+1); //1~100사이 랜덤 정수
~~~

* 귀찮으면 *java.util.Random*을 import 해서 사용 가능

~~~java
Random r = new Random();
int n = r.nextInt(); // 정수 범위 난수
int m = r.nextInt(100); // 0이상 99이하의 정수 난수
~~~

~~~java
public class MathEx{
  public static void main(String[] args) {
    System.out.println(Math.abs(-3.14)); // 절댓값 = 3.14
    System.out.println(Math.sqrt(9.0)); // 루트 = 3.0
    System.out.println(Math.exp(2)); // e(2.71 그거)의 제곱 = 7.38....
    System.out.println(Math.round(3.14)); // 반올림 = 3
  }
}
~~~

{% include support.md %}
