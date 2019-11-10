---
title: "JAVA 40. BufferedReader, BufferedWriter"
date: 2019-11-10
categories: java
---

## ``BufferedReader`` & ``BufferedWriter``

이 두 클래스는 ``java.io``안에 있는 클래스로, 입력과 출력의 속도를 향상시킨 클래스입니다.

입력된 데이터가 바로바로 전달되는 방식이 아니라 중간에 버퍼를 거쳐서 간접적으로 전달이 되기 때문에 더욱 효율적으로 처리가 가능합니다.

### ``BufferedReader``

우리가 일반적으로 사용하는 ``Scanner`` 클래스는 모든 공백을 기준으로 데이터를 분리하기 때문에 사용에 용이하다는 장점이 있습니다. [[System.in / Scanner 클래스]](https://detegice.github.io/chapter2-03-input-and-operators/#systemin)

하지만 ``BufferedReader`` 클래스는 모든 입력값이 String으로 고정되어 있기 때문에 필요에 따라 이를 분리해주어야 합니다.

```java
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
  } 
}
```

먼저 이 클래스의 사용을 위해서는 ``java.io.*`` 의 import가 필요합니다.

또한, 예외처리가 반드시 필요하기 때문에, ``throws Exception`` 또는 ``throws IOException``을 반드시 적어주어야 합니다. 

만약, 우리가 입력받은 값을 정수로 바꾸고 싶다면, [Wrapper 클래스](https://detegice.github.io/chapter6-02-object-class-and-wrapper-class/#wrapper-class)의 각종 parse메소드를 이용하여 변환시켜주시면 됩니다.

```java
int n = Integer.parseInt(br.readLine());
```

**주요 메소드**

메소드 | 설명
:---:|:---
``int read()`` | 한 문자를 읽어 int형 리턴
``int read(char[] buf)`` | 문자열 배열 buf의 크기만큼의 문자를 읽고, 문자 수를 리턴
``String readLine()`` | 한 줄을 읽어 문자열 리턴
``void mark()`` | 현재 위치를 마크. 후에 ``reset()`` 메소드를 이용하여 마크된 위치부터 시작
``void reset()`` | 마크된 위치가 있으면 그 커서부터 시작. 그렇지 않는 경우 처음부터 시작
``long skip(int n)`` | n개의 문자를 스킵
``void close()`` | 스트림을 닫음

### ``BufferedWriter``

일반적인 출력방식은 ``System.out.println()`` 함수를 이용하는데, 적은 양의 경우 println() 메소드가 더 빠르지만,

많은 양을 처리할 때는 입력과 동일하게 버퍼를 사용합니다.

```java
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = "I want to print this sentence.";
    bw.write(str+"\n");
    bw.flush();
    bw.close();
  } 
}
```

BufferedWriter의 write() 메소드의 경우, 자동 개행 기능이 없기 때문에 반드시 개행이 필요한 경우, ``\n``을 처리 해주서야 합니다.

또한, 버퍼가 잡혀있는 상태이기 떄문에 반드시 ``flush()``와 ``close()``를 해주어야 합니다.

**주요 메소드**

메소드 | 설명
:---:|:---
``void write(int c)`` | int형으로 문자 데이터를 출력
``void write(String s)`` | String형으로 출력
``void newLine()`` | 줄바꿈
``void flush()`` | 버퍼에 남은 데이터 모두 출력
