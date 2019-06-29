---
title: "JAVA 36. main Thread and Thread Synchronization"
date: 2019-06-29
categories: JAVA
---

{% include java4.md %}

# main Thread and Thread Synchronization

## main Thread

* JVM이 프로그램을 실행할 때 디폴트로 생성되는 스레드

* main() 메소드에서 현재 스레드 정보를 가진 Thread 객체를 알아내어 현재 실행중인 스레드에 관한 다양한 정보 출력
~~~java
public class ThreadMainEx {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(priority);
		System.out.println(s);
	}
}
~~~


## Thread Exit

* 스스로 종료 : run() 메소드에서 리턴 ([이 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter12/TimerThreadGUI.java)에서 보듯이, catch문 안의 return)
* 타 스레드에서 종료 : interrupt() 메소드 사용 (*th.interrupt()*)

> **연습문제 1 : [이 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter12/VibratingFrame.java)를 읽고 이 코드가 하는 일과 각 코드를 줄 별로 설명하시오.**

<details><summary>연습문제 1 : 예시답안</summary>
{% highlight text %}
코드역할 : 진동하는 컨텐트팬(프레임)이 클릭하면 멈춤
{% endhighlight %}
</details>


## Thread Synchronization

* 멀티스레드 프로그램의 작성시 주의점
	* 다수의 스레드가 공유 데이터에 동시 접근하는 경우, 예상치 못한 결과 발생 가능
	
* 스레드 동기화
	* 스레드 사이의 실행 순서 제어, 공유 데이터에 대한 접근을 원활화
* 공유 데이터의 동시 접근 문제 해결
	* 공유 데이터에 접근하는 모든 스레드를 한 줄로 세우기
	* 한 스레드가 공유 데이터에 대한 작업을 끝낼 때까지 다른 스레드가 대기

## synchronized Block
* *synchronized* 키워드
	* 스레드가 독점적으로 실행해야하는 부분을 표시하는 키워드
	* synchronized 블록 지정 : 메소드 전체 혹은 코드 블록
	
~~~java
synchronized void print(String text) { ... } // synchronized method

void execute(String text) {
	...
	synchronized(this) { // synchronized code block
		...
	}
	...
}
~~~
	
* synchronized 블록이 실행되는 경우
	* 모니터 : 해당 객체를 독점적으로 사용하는 권한 (monitoring)
	* 먼저 실행한 스레드가 모니터를 소유
	* 모니터를 소유한 스레드가 모니터를 내놓을 떄까지 다른 스레드가 대기
	
	
> **연습문제 2 : [이 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter12/SynchronizedEx.java)에서 *synchronized*를 추가하여 정상적으로 출력이 되도록 바꾸시오.**

[연습문제 2 : 정답](https://github.com/DetegiCE/JavaStudy/blob/master/chapter12/SynchronizedEx_.java)
	
	
## wait()-notify() Synchronization

* wait()-notify()가 필요한 경우
	* 공유 데이터로 두 개 이상의 스레드가 데이터를 주고 받는 경우
* 동기화 메소드
	* *wait()* : 다른 스레드가 notify()를 불러 줄 때까지 기다림
	* *notify()* : wait()를 호출하여 대기중인 스레드를 깨움
	
![1202](https://user-images.githubusercontent.com/26007107/60382684-c8283080-9aa1-11e9-8cad-3e0139b85354.png)

> **연습문제 3 : [이 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter12/TabAndThreadEx.java)에서 동기화가 되는 부분이 어느 부분인지 설명하고, 발생 가능한 오류를 모두 찾아 수정하시오.**
>
> 정답 없음

{% include support.md %}
