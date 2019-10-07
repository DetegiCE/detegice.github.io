---
title: "JAVA 34. Images and repaint"
date: 2019-06-27
categories: java gui
---

{% include java3.md %}

# Images and repaint()

[이미지 다운로드](https://github.com/DetegiCE/JavaStudy/tree/master/chapter11/image)

## Images

* JLabel을 이용한 이미지
  * ~~~java
    ImageIcon img = new ImageIcon("image/korea.jpg");
    JLabel la = new JLabel(img);
    p.add(la);
    ~~~
  * 장점 : 편함
  * 단점 : 크기조절 안됨
  
* Graphics의 drawImage()
  * 장점 : 크기 조절 가능
  * 단점 : 컴포넌트를 이용한 관리 불가

## drawImage()의 생성자

* 원본으로 그리기
  * *boolean drawImage(Image img, int x, int y, Color bgColor, ImageObserver observer)*
  * *boolean drawImage(Image img, int x, int y, ImageObserver observer)*
    * img : 이미지 객체
    * x, y : 좌표
    * bgColor : 이미지가 투명일 경우, 투명한 부분을 채우는 색상
    * observer : 이미지 그리기의 완료를 통보받는 객체
    
* 크기 조절 하기
  * *boolean drawImage(Image img, int x, int y, int width, int height, Color bgColor, ImageObserver observer)*
  * *boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)*
    * width : 크기 조절된 폭
    * height : 크기 조절된 높이
    
* ImageObserver 
  * 이미지가 다 그려졌을 때 통보받는 객체를 지정하는 매개변수
  * 경우에 따라 디코딩의 시간이 다르기 때문에, 이미지 그리기가 완료되었는지 통보받을 때 사용
  * 일반적인 경우, *this*나 *null*을 사용하여 통보를 받지 않음
  
## Drawing Image

* 이미지 로딩

  ~~~java
  ImageIcon imgicon = new ImageIcon("image/korea.jpg");
  Image img = imgicon.getImage();
  ~~~
  
* 경우에 따라 이미지 그리기
  * (20,20)에 원본 크기로 그리기
  
    ~~~java
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(img, 20, 20, this);
    }
    ~~~
    
  * (20,20)에 100 x 100 크기로 그리기
  
    ~~~java
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(img, 20, 20, 100, 100, this);
    }
    ~~~
    
  * 이미지를 패널에 꽉차게 그리기
  
    ~~~java
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
    ~~~  
  

  
> **연습문제 1 : yonseimilk.jpg를 창 전체에 맞추어 띄운 뒤, 창 크기가 변하면 연세우유 사진의 크기도 변하는 프로그램 DrawImageYMilk.java를 작성하시오.**
>
> 고대빵 화이팅 ^^
>
> 프레임제목 "사진 크기 바꾸기", 프레임초기 크기 500 x 500
>
> ![1103](https://user-images.githubusercontent.com/26007107/60380612-593bdf00-9a83-11e9-8d5f-2d50b6761e48.png)
    
[연습문제 1 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter11/DrawImageYMilk.java)
    
    
## repaint()

* repaint()
  * 모든 컴포넌트가 가진 메소드
  * 자바 플랫폼에게 컴포넌트 그리기를 강제하는 메소드
  * repaint() 호출시 컴포넌트의 paintComponent() 호출
  
* 사용 목적
  * 프로그램에서 컴포넌트의 모양과 위치를 변경하고 바로 화면에 반영시키고자 하는 경우
  * 컴포넌트가 다시 그려져야 그 때 변경된 위치에 변경된 모양으로 출력됨

* 상속 관계에서의 repaint()
  * 컴포넌트 repaint()가 불리면, 새로운 위치에 다시 그려지지만, 이전 위치의 모양이 남아있음
  * 부모 컴포넌트의 repaint()가 불리면, 부모 컨테이너의 모든 내용을 지우고 자식을 다시 그림
  
  ~~~java
  component.getParent().repaint();
  ~~~
    
* [repaint() 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter11/RepaintOval.java)

> **연습문제 2 : 위의 예시 코드는 타원을 그리면 흔적이 남는다. 흔적이 남지 않도록 프로그램을 수정하시오.**

[연습문제 2 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter11/RepaintOval_.java)
    
    
{% include support.md %}
