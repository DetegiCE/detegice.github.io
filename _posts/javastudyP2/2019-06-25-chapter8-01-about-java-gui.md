---
title: "JAVA 23. About JAVA GUI"
date: 2019-06-25
categories: JAVA
---

{% include java3.md %}

**자바 초심자 3차 통곡의 벽에 오신걸 환영합니다**

# GUI : Graphic User Interface

## GUI 응용프로그램

* GUI : 사용자가 편리하게 입출력하도록 그래픽을 화면으로 구성하며, 마우스나 키보드로 입력을 받도록 지원하는 사용자 인터페이스
* 자바에서 GUI 작성
  * AWT와 Swing 패키지
  * ***세상에서 제일 쉬운*** GUI 프로그래밍

## AWT and Swing Package

* AWT (Abstract Windowing Toolkit)
  * 자바 첫 등장부터 배포된 GUI 패키지. 이젠 안씀
  * OS의 자원을 많이 소모하고 부담을 주지만 빠름
  
* Swing 패키지
  * AWT를 기반으로 작성된 자바 라이브러리
  * 모든 AWT 기능 + 추가 기능
  * 순수 자바 언어로 구현 가능
  * 현재 대부분의 자바 GUI로 사용됨
  
![0801](https://user-images.githubusercontent.com/26007107/60094255-81c39080-9786-11e9-982a-307e118d1c22.png)

![0802](https://user-images.githubusercontent.com/26007107/60094252-812afa00-9786-11e9-80ad-4659295966a0.png)

![0803](https://user-images.githubusercontent.com/26007107/60094253-812afa00-9786-11e9-8a95-9976f4832368.png)

![0804](https://user-images.githubusercontent.com/26007107/60094254-81c39080-9786-11e9-8650-515876ca5e6c.png)

* GUI 패키지의 계층 구조

![0805](https://user-images.githubusercontent.com/26007107/60094377-d1a25780-9786-11e9-9b69-d01e454bdea1.png)


## Container and Component

아래 내용을 읽으면서 위의 GUI 패키지 계층 구조를 동시에 보면 이해가 쉽습니다.

* Container
  * 다른 컴포넌트를 포함하는 GUI 컴포넌트 (*java.awt.Container* 상속)
  * 다른 컨테이너에 포함 가능
  
* Component
  * 컨테이너에 포함되어야 화면에 출력되는 GUI Object
  * 다른 컴포넌트를 포함할 수 없는 순수 컴포넌트 (*java.awt.Component* 상속)
  * 스윙 컴포넌트의 경우 *javax.swing.JComponent* 상속
  
* 최상위 Container
  * 다른 컨테이너에 포함되지 않고도 화면에 출력되며 독립적으로 존재가능
  * *JFrame, JDialog, JApplet* 등
  
* 컨테이너와 컴포넌트의 포함관계

![0806](https://user-images.githubusercontent.com/26007107/60094576-715fe580-9787-11e9-8424-d2451c9b8765.png)


{% include support.md %}
