---
title: "JAVA 26. Event Object and Listener Interface"
date: 2019-06-26
categories: JAVA
---

{% include java3.md %}

# Event Object and Listener Interface

## Event Driven Programming (이벤트 기반 프로그래밍)

* 이벤트의 발생에 의하여 프로그램의 흐름이 결정
  * 이벤트가 발생하면 이벤트를 처리하는 이벤트 리스너 실행
  * 실행될 코드는 이벤트의 발생에 의해 전적으로 결정
* 반대되는 개념 : 배치 프로그래밍
  * 프로그램 개발자가 프로그램의 흐름을 결정
* 이벤트의 종류
  * 사용자 입력 : 마우스, 키보드 등
  * 센서 입력, 네트워크 송수신
  
* 이벤트의 처리 과정
  * 이벤트 발생
  * 이벤트 객체 생성
  * 응용프로그램에 작성된 이벤트 리스너 찾기
  * 이벤트 리스너 실행
  
> ![0901](https://user-images.githubusercontent.com/26007107/60147599-06ef8980-9809-11e9-8b78-937355353de0.png)
> 
> 위 예시에서 발생한 이벤트는 *Action* 이벤트, 이벤트 소스는 *JButton*, 이벤트 개체는 *ActionEvent*, 이벤트 리스너는 *이벤트 리스터 4*


{% include support.md %}
