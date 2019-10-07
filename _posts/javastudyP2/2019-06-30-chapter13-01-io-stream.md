---
title: "JAVA 37. IO Stream"
date: 2019-06-30
categories: java
---

{% include java4.md %}

# IO Stream

## Input-Output Stream

* 입출력 스트림
  * 입력 스트림 : 입력 장치로부터 자바 프로그램으로 데이터를 전달하는 객체
  * 출력 스트림 : 자바 프로그램에서 출력 장치로 데이터를 보내는 객체
  * 바이트를 기본단위로 움직임
  * 단방향 QUEUE 자료구조를 가짐
  
* 문자 스트림 (Text Stream)
  * 문자만 입출력하는 스트림
  * 바이너리 데이터 처리 X, 문자가 아닌 데이터를 넣으면 깨짐
  * ![1302](https://user-images.githubusercontent.com/26007107/60392577-ee50dd80-9b40-11e9-8592-de54687ce471.png)

* 바이트 스트림 (Byte Stream)
  * 입출력 데이터를 단순 바이트의 흐름으로 처리
  * 문자나 바이너리나 상관 X
  * ![1301](https://user-images.githubusercontent.com/26007107/60392574-da0ce080-9b40-11e9-997b-5e1e6f281591.png)


## Stream Connection

* 스트림 연결
  * 여러 개의 스트림을 연결하여 사용

~~~java
InputStreamReader rd = new InputStreamReader(System.in);
while(true) {
  int c = rd.read();
  if(c == -1) break;
}
~~~


## File Read

* 텍스트 파일 읽기
  * 파일 입력 스트림 생성
  
    ~~~java
    FileReader fin = new FileReader("C:\\Test.txt");
    ~~~
    
  * 파일 읽기
    
    ~~~java
    int c;
    while((c = fin.read()) != -1) {
      System.out.print((char)c);
    }
    ~~~

  * 스트림 닫기
    
    ~~~java
    fin.close();
    ~~~
    
* 예외 처리
  * 스트림 생성 에러 : *FileNotFoundException*
    * 경로 오류, 디스크 고장 등
  * 파일 읽기, 쓰기, 닫기 도중 에러 : *IOException*
    * 디스크 오동작, 파일이 중간에 깨진 경우, 디스크 공간이 모자란 경우
    
  * try-catch문 예시
  
    ~~~java
    try {
      FileReader fin = new FileReader("C:\\hatejava.txt");
      int c = fin.read();
      fin.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("파일을 열 수 없습니다");
    }
    catch (IOException e) {
      System.out.println("입출력 오류");
    }
    ~~~

* 생성자
  * *FileReader(File file)* : file에 지정된 파일을 읽는 FileReader 생성
  * *FileReader(String name)* : name 이름의 파일을 읽는 FileReader 생성
  
* 주요 메소드
  * *int read()* : 한 개의 문자를 읽어 정수형 리턴
  * *int read(char[] cbuf)* : 최대 cbuf 배열의 크기만큼 문자들을 읽거 cbuf 배열에 저장. 읽는 중 EOF를 만나면 실제 읽은 문자 개수 리턴
  * *int read(char[] cbuf, int off, int len)* : 최대 len 만큼 읽어 cbuf 배열에 off부터 저장. 읽는 도중 EOF를 만나면 실제 읽은 문자 개수 리턴
  * *String getEncoding()* : 스트림이 사용하는 문자 집합의 이름 리턴
  * *void close()* : 입력 스트림을 닫고 관련 시스템 
  
  
> **연습문제 1 : C:\Windows\system.ini 파일을 읽는 ReadSecretFile.java를 작성하시오. ~~이래서 맥은 ㅉㅉ~~ 만약에 파일 경로명이 틀리거나 없다면 "파일을 열 수 없습니다" 를, 파일이 중간에 깨진 경우, "입출력 오류"가 출력되도록 하시오.
  
[연습문제 1 : 예시코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter13/ReadSecretFile.java)


## File Write

* 텍스트 파일 쓰기
  * 파일 출력 스트림 생성
    
    ~~~java
    FileWriter fout = new FileWrite("C:\\Test.txt");
    ~~~
    
  * 파일 쓰기
    
    * *write()*로 문자 하니씩 기록
    
      ~~~java
      fout.write('A');
      ~~~
      
    * 블록 단위로 기록
    
      ~~~java
      char buf[] = new char[1024];
      fout.write(buf, 0, buf.length);
      ~~~
      
  * 스트림 닫기
    
    ~~~java
    fout.close();
    ~~~
    
* 생성자
  * *FileWriter(File file)* : file에 데이터를 저장할 FileWriter 생성
  * *FileWriter(String name)* : name 파일에 데이터를 저장할 FileWriter 생성
  * *FileWriter(File file, boolean append)* : FileWriter를 생성하여 append가 true 면, 파일의 마지막부터 데이터 저장
  * *FileWriter(String name, boolean append)* : ㅇㅇ
  
* 주요 메소드
  * *void write(int c)* : c를 char로 변환하여 하나의 문자 출력
  * *void write(char[] cbuf)* : ㅇㅇ
  * *void write(String str, int off, int len)* : 인덱스 off부터 len개의 문자를 str 문자열에서 출력
  * *void write(char[] cbuf, int off, int len)* : ㅇㅇ
  * *void flush()* : 스트림에 남아있는 데이터 모두 출력
  * *String getEncoding()* : 스트림이 사용하는 문자 집합의 이름 리턴
  * *void close()* : 출력 스트림을 닫고 관련된 시스템 자원 해제


> **연습문제 2 : C:\Windows\system.ini 파일을 읽어와서 그 내용을 text.txt에 그대로 작성하는 프로그램 SecretFileRevealed.java를 작성하시오.**


{% include support.md %}
