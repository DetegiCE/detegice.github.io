---
title : "JAVA 35. Java Thread"
date: 2019-06-29
categories: java gui
---

{% include java4.md %}

# Java Thread

## Thread

* 멀티태스킹 : 여러 작업이 동시에 수행되는 것
* 스레드 : 운영체제에 의해 관리되는 작업
* 멀티스레딩 : 여러 스레드를 동시에 실행시키는 프로그램을 작성하는 기법
* 스레드의 구성
  * 스레드 코드 : 작업을 실행하기 위해 작성한 프로그램 코드
  * 스레드 정보 : 스레드 명, ID, 소요 시간, 우선순위 등
  
## Multitasking and Multithreading

* 멀티프로세싱
  * 하나의 프로그램이 여러 프로세스를 생성하고, 각 프로세스가 하나의 작업을 처리하는 기법
  * 각 프로세스 독립된 메모리 영역을 보유하고 실행
  * 프로세스 사이의 문맥 교환에 따른 과도한 오버헤드와 시간 소모의 문제점을 가짐
  
* 멀티스레딩
  * 하나의 프로그램이 여러 스레드를 생성하고, 각 스레드가 하나의 작업을 처리하는 기법
  * 하나의 프로그램에 속한 스레드는 변수 메모리 등의 자원으로 문맥 교환되므로, 오버헤드가 매우 적음
  * 대부분의 OS에서 사용
  
## JAVA Thread and JVM

* 자바 스레드
  * JVM에 의해 스케쥴되는 실행 단위의 코드 블럭
  * 스레드의 생명 주기는 JVM에 의해 관리됨
  
* JVM과 자바의 멀티스레딩
  * 하나의 JVM은 하나의 자바 프로그램만 실행
  * 프로그램은 하나 이상의 스레드로 구성
  
![1201](https://user-images.githubusercontent.com/26007107/60381498-a5415080-9a90-11e9-8e8f-44a1b3e2da53.png)


## How to make Java Thread (1) - Inheritance of Thread Class

* 생성자
  * *Thread()* : 스레드 객체 생성
  * *Thread(Runnable target)* : Runnable 객체인 target을 이용하여 스레드 객체 생성
  * *Thread(String name)* : 이름이 name인 스레드 객체 생성
  * *Thread(Runnable target, String name)* : ㅇㅇ

* 주요 메소드

메소드 | 설명
:---|:---
void run() | JVM에 의해 호출. **반드시 이 메소드를 오버라이딩 하여 스레드 코드를 작성해야함.** 이 메소드 종료시, 스레드 종료
void start() | JVM에게 스레드 실행 시작 요청
void interrupt() | 스레드 강제 종료
static void yield() | 다른 스레드에게 실행 양보. JVM은 스레드 스케쥴링을 시행하여 다른 스레드 선택 실행
void join() | 스레드가 종료할 때 까지 기다림
long getId() | 스레드 ID 값 리턴
String getName() | 스레드 이름 리턴
int getPriority() | 스레드 우선순위 리턴. 1~10
void setPriority(int n) | 스레드 우선순위 변경
Thread.State getState() | 스레드 상태값 리턴
static void sleep(long mills) | 스레드를 mills 시간 동안 슬립
static Thread currentThread() | 현재 실행중인 스레드 객체의 레퍼런스 리턴

* 스레드 만들기
  * Thread를 상속받아 run() 오버라이딩
  
  ~~~java
  class SomeThread extends Thread {
    public void run() {

    }
  }
  ~~~
  
  * 스레드 객체 생성 : 생성된 객체는 필드와 메소드를 가진 객체. 스레드로 작동 X
  
  ~~~java
  SomeThread th = new SomeThread();
  ~~~
  
  * 스레드 시작 : 스레드로 작동 시작. run()의 실행. JVM에 의해 스케쥴링 됨
  
  ~~~java
  th.start();
  ~~~

* [TimerThread 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter12/TestTimerThread.java)


> **연습문제 1 : 위 TimerThread를 GUI로 구현한 프로그램 TimerThreadGUI.java를 작성하시오.**
>
> 프레임 제목 "GUI 타이머", 프레임 크기 250 x 150
>
> 라벨 폰트 설정 : Gothic, 기울임, 80px

[연습문제 1 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter12/TimerThreadGUI.java)


## How to make Java Thread (2) - Implementation of Runnable Interface

* 그냥 뭐 다 Thread Class랑 비슷

* 스레드 만들기
  * Runnable를 상속받아 run() 오버라이딩
  
  ~~~java
  class SomeThread implements Runnable {
    public void run() {

    }
  }
  ~~~
  
  * 스레드 객체 생성 
  
  ~~~java
  Thread th = new Thread(new SomeThread());
  ~~~
  
  * 스레드 시작 : 스레드로 작동 시작. run()의 실행. JVM에 의해 스케쥴링 됨
  
  ~~~java
  th.start();
  ~~~


> **연습문제 2 : 위 연습문제 1을 뭐 어떻게 하라는지 알겠지? (RunnableTimer.java)**

[연습문제 2 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter12/RunnableTimer.java)

{% include support.md %}
