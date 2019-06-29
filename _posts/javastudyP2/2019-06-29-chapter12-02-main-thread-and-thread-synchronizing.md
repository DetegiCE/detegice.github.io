---
title: "JAVA 36. main Thread and Thread Synchronizing"
date: 2019-06-29
categories: JAVA
---

{% include java4.md %}

# main Thread and Thread Synchronizing

# main Thread

* JVM이 프로그램을 실행할 때 디폴트로 생성되는 스레드

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
