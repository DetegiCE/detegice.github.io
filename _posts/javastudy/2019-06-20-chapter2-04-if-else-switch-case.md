---
title: "JAVA 05. if-else, switch-case"
date: 2019-06-20
categories: JAVA
---

{% include java.md %}

# if-else, switch-case

## if문, if-else 문
* 단순 if문
  * if의 괄호 안에 조건식 (논리형 변수 or 논리 연산)
  
  ~~~java
  if(n%2==0){
    System.out.print(n);
    System.out.println("은 짝수 입니다.");
  }
  if(score>=80 && score<=89)
    System.out.println("학점은 B+입니다.");
  ~~~
  
* if-else 문
  * 조건식이 true면 if문, false면 else문 실행
  
  ~~~java
  if(score>=90)
    System.out.println("합격");
  else
    System.out.println("불합격");
  ~~~
  
* 다중 if문
  * 조건문이 많은 경우, switch문 사용 권장
  
  ~~~java
  if(score>=90) grade = 'A';
  else if(score>=80) grade = 'B';
  else if(score>=70) grade = 'C';
  else if(score>=60) grade = 'D';
  else grade = 'F';
  ~~~
  
> **연습문제 1 : 다중 if-else 문을 이용하여 성적에 학점을 부여하는 프로그램 Grading.java를 작성하시오.**

[연습문제 1 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter2/Grading.java)

## switch-case 문

* switch 문은 식과 case문의 값을 비교
  * case의 비교 값과 일치함녀 해당 case의 실행문 수행
  * case의 비교 값과 일치하는 것이 없으면 default문 실행 (default 생략 가능)
  
* switch 문 내의 break 문
  * break를 만나면 switch 문을 벗어남
  * break 문이 없는 경우, 다음 case문으로 계속 실행함
  
* case 문의 값
  * 문자, 정수, 문자열 리터럴(JDK 1.7부터)만 허용
  * 실수 리터럴은 허용되지 않음
  
> **연습문제 2 : switch-case문을 이용하여 1~12월 사이의 월을 입력받아 봄, 여름, 가을, 겨울을 판단하는 Weather.java를 작성하시오.**

[연습문제 2 : 예시풀이](https://github.com/DetegiCE/JavaStudy/blob/master/chapter2/Weather.java)

{% include support.md %}
