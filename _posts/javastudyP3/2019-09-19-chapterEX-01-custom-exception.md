---
title: "JAVA 38. Custom Exception"
date: 2019-09-19
categories: java
---

# Custom Exception

[까먹었으면 다시 읽고 오기 (JAVA 08. Exception)](https://detegice.github.io/chapter3-03-exception/)

## 예제

### Description

**WithCS 4429 : 16진법 예외처리**

Sample Code를 참고하여 입력 문자열이 16진법이 아니면 16진법 예외가 발생한 위치를 알려주는 프로그램을 구현하시오.

본 문제에서 사용하는 16진법은 아라비아 숫자와 알파벳 대문자__(소문자는 예외처리)__로만 표현된 숫자라고 가정한다. 0X, 0x 표기는 생략한다.

### Input

Line 1 : 문자열의 개수 N

Line 2 ~ 1+N : 16진법이거나 아닌 문자열들

### Output
Line 1 ~ N : 16진법이라면 10진수로 변환 /

16진법이 아니라면

HexFormatException: Illegal hex character: "16진법이 아닌 문자" 출력

### Sample Code

~~~java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String hex = sc.next();
            int value;
            try {
                value = HexFormat.parseHex(hex);
            } catch (HexFormatException ex) {
                System.out.println(ex);
                continue;
            }
            System.out.println(value);
        }
    }

}

YOUR_CODE
~~~

### Sample Input

~~~text
5
A5
FAA
T10
ABC
10.
~~~

### Sample Output

~~~text
165
4010
HexFormatException: Illegal hex character: T
2748
HexFormatException: Illegal hex character: .
~~~

## Custom Exception

예외는 또 하나의 클래스이기 때문에, **Exception** 클래스를 상속받는 새로운 클래스를 만들어 줌

~~~java
class HexFormatException extends Exception {
}
~~~

Exception 클래스의 생성자의 매개변수가 String인 경우, 예외 문자열을 출력을 한다.

이를 이용해 해당 클래스 안에 예외가 발생할 때 출력될 문자열을 넣은 생성자를 만들어 준다.

~~~java
class HexFormatException extends Exception {
  public HexFormatException(char a) {
    super("Illegal hex character: "+a);
  }
}
~~~

예제를 보면, ``HexFormatException``이 ``HexFormat`` 클래스의 ``parseHex`` 메소드를 다룰 때 발생하므로,

``HexFormat`` 클래스와 그 안에 ``parseHex`` 메소드를 만들어준다.

이 ``parseHex`` 메소드가 ``HexFormatException``을 발생시키기 때문에, 

메소드 뒤에 ``throws HexFormatException``을 붙여준다.

~~~java
class HexFormat {
  static int parseHex(String str) throws HexFormatException {
  
  }
}
~~~

그리고 예외가 발생하는 조건문 안에서 ``throw`` 키워드를 이용해 예외를 발생시킨다.

예를 들어, ``str.charAt(i)``가 ``G``인 경우 예외가 발생한다고 할 때, 다음과 같이 작성한다.

~~~java
if(str.charAt(i) == 'G') {
  throws new HexFormatException(str.charAt(i));
}
~~~

{% include support.md %}
