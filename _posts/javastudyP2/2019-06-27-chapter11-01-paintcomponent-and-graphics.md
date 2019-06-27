---
title: "JAVA 33. paintComponent and Graphics"
date: 2019-06-27
categories: JAVA
---

{% include java3.md %}

# paintComponent and Graphics

## paintComponent

* swing의 페인트 기본
  * 모든 컴포넌트는 자신의 모양을 스스로 그림
  * 모든 스윙 컴포넌트는 자신의 모양을 그리는 *paintComponent()* 메소드 보유
  
* *public void paintComponent(Graphics g)*
  * 스윙 컴포넌트가 자신의 모양을 그리는 메소드
  * 호출
    * 컴포넌트가 그려져야 하는 시점에 호출
    * 크기 변경, 위치 변경, 컴포넌트가 가려질 때 호출
  * *Graphics* 객체
    * 그래픽 컨텍스트 : 컴포넌트 그리기에 필요한 도구를 제공하는 객체
    * 자바 플랫폼에 의해 공급
    * 색 지정, 도형 그리기, 클리핑, 이미지 그리기 등의 메소드 제공
    
* paintComponent() 오버라이딩
  * 개발자가 JComponent를 상속받아 새로운 컴포넌트 설계
  * 기존 컴포넌트의 모양에 변화를 주고자 할때 사용
  
  ~~~java
  class NewComponent extends JXXX {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      //code
    }
  }
  ~~~
  
* JPanel
  
















