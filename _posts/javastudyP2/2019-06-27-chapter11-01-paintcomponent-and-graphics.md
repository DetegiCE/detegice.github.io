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
      super.paintComponent(g); //패널 내에 이전에 그려진 잔상을 지우기 위함
      //code
    }
  }
  ~~~
  
* JPanel
  * 비어 있는 컨테이너
  * 개발자가 다양한 GUI를 창출할 수 있는 캔버스
  * JPanel을 상속받아 임의의 모양을 가지는 패널로 사용

* [paintComponent로 도형 그리는 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter11/paintJPanelEx.java)


## Graphic Driven GUI Programming

* 그래픽 기반 GUI 프로그래밍
  * 스윙 컴포넌트를 쓰지 않고 선, 원, 이미지 등을 이용하여 직접 화면을 구성
* 목적
  * 컴포넌트의 한계 극복
  * 화면 출력속도가 더 빠름

* Graphics의 기능
  * 색상 선택
  * 문자열 그리기
  * 도형 그리기, 칠하기
  * 이미지 그리기
  * 클리핑
  
## Color, Font and String

* 색상 선택
  * *Color(int r, int g, int b)*
  * *Color(int rgb)*
  
* 폰트 선택
  * *Font(String fontFace, int style, int size)*
    * fontFace : 폰트 이름 ("나눔고딕", "Arial" 등)
    * style : Font.BOLD, Font.ITALIC, Font.PLAIN 중 한 값
    * size : 픽셀 단위의 크기
 
* 색과 폰트 설정
  * *void setColor(Color color)*
  * *void setFont(Font font)*
  
* 문자열 그리기
  * *void drawString(String str, int x, int y)*
  * ~~~java
    Graphics g;
    g.drawString("텐서플로우 꿀잼", 30, 30);
    ~~~

* [Color와 Font를 활용한 예제 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter11/GraphicsColorFontEx.java)
  * ![1101](https://user-images.githubusercontent.com/26007107/60263557-e7955100-991b-11e9-8e39-3768700dc22f.png)


## Shape Draw and Color

* 도형 그리기
  * 선, 타원, 사각형, 둥근 모서리 사각형, 원호, 폐다각형
  * 단, 선의 굵기는 조절 불가능

  * *void drawLine(int x1, int y1, int x2, int y2)*
  * *void drawOval(int x, int y, int w, int h)*
  * *void drawRect(int x, int y, int w, int h)*
  * *void drawRoundRect(int x, int y, int w, int h, int arcWidth, int arcHeight)*
    * arcWidth : 모서리 원의 수평 반지름
    * arcHeight : 모서리 원의 수직 반지름
  * *void drawArc(int x, int y, int w, int h, int startAngle, int arcAngle)*
  * *void drawPolygon(int[] x, int[] y, int n)*

* 도형 칠하기
  * 도형을 그리고 내부를 칠하는 기능
  * 도형을 칠하는 메소드는 draw 대신 fill로 메소드 명을 대체

> **연습문제 1 : draw와 fill을 이용해서 놀아보자.**





