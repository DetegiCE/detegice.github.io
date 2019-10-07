---
title: "JAVA 25. Container Layout Manager"
date: 2019-06-25
categories: java gui
---

{% include java3.md %}

# Container Layout Manager

## 컨테이너 배치관리자

* 컨테이너마다 하나의 배치관리자 존재
* 컨테이너에 부착되는 컴포넌트들의 위치와 크기를 결정
* 대표 유형 4가지
  * FlowLayout 배치관리자 : 삽입 순서대로 왼쪽 → 오른쪽. 자리 없으면 아래로
  * BorderLayout 배치관리자 : 컨테이너 공간을 동서남북중앙 5개로 나눔
  * GridLayout 배치관리자 : 컨테이너를 프로그램에서 설정한 동일한 크기의 격자로 나눔. 순서대로 왼쪽 → 오른쪽. 자리 없으면 아래로.
  * CardLayout 배치관리자 : 카드를 쌓듯이 컴포넌트를 겹쳐서 배치

  * ![0810](https://user-images.githubusercontent.com/26007107/60096994-5db77d80-978d-11e9-9b37-719343206c90.png)

* Default 배치관리자
  * 컨테이너 생성시 자동으로 생성되는 배치관리자
  * e.g) JWindow, JFrame, JDialog : BorderLayout / JPanel, JApplet : FlowLayout
  
* 새로운 배치관리자의 설정
  * *setLayout(LayoutManager lm)* 메소드 호출
  
  ~~~java
  JPanel p = new JPanel();
  p.setLayout(new BorderLayout());
  
  Container c = frame.getContentPane();
  c.setLayout(new FlowLayout());
  
  //c.setLayout(FlowLayout); //당연히 오류 발생
  ~~~
  
## FlowLayout 배치관리자

* 컴포넌트를 컨테이너 내에서 왼쪽에서 오른쪽으로 배치, 자리 없으면 아래로
* FlowLayout의 생성자
  * *FlowLayout();*
  * *FlowLayout(int align, int hGap, int vGap);*
    * align : 컴포넌트 정렬 방법 : 좌측(FlowLayout.LEFT), 우측(FlowLayout.RIGHT), 중앙(FlowLayout.CENTER)(default)
    * hGap : 좌우 컴포넌트 사이의 수평 간격 (default 5px)
    * vGap : 상하 컴포넌트 사이의 수평 간격 (default 5px)
  * <details><summary>그림으로 보기</summary>
    <img src="https://user-images.githubusercontent.com/26007107/60097682-d703a000-978e-11e9-9e0c-8b0f70daf789.png">
    </details>
    
> **연습문제 1 : 프레임제목 "FlowLayout이다!", 프레임크기 400x200, { apple, banana, carrot, donut, eagle } 이름을 가지는 5개의 버튼을 FlowLayout을 이용하여 왼쪽 정렬로, 수평간격 30, 수직간격 40으로 배치하는 프로그램 FlowLayoutABC.java를 작성하시오.**

[연습문제 1 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter8/FlowLayoutABC.java)

<details><summary>연습문제 1 : 출력</summary>
<img src="https://user-images.githubusercontent.com/26007107/60098086-bc7df680-978f-11e9-8fae-fb60597dcbc0.png">
</details>


## BorderLayout 배치관리자

* 컨테이너 공간을 5구역으로 분할 배치 (동, 서, 남, 북, 중앙)
* BorderLayout의 생성자
  * *BorderLayout()*
  * *BorderLayout(int hGap, int vGap)
    * hGap : 좌우 컴포넌트 사이의 수평 간격 (default 0px)
    * vGap : 상하 컴포넌트 사이의 수직 간격 (default 0px)
* 공간에 배치하는 메소드 *add()* 의 메소드 오버로딩
  * *void add(Component comp, int index)*
    * comp 컴포넌트를 index 위치에 삽입
    * index : 동(BorderLayout.EAST), 서(BorderLayout.WEST), 남(BorderLayout.SOUTH), 북(BorderLayout.NORTH), 중앙(BorderLayout.CENTER)
* <details><summary>그림으로 보기</summary>
  <img src="https://user-images.githubusercontent.com/26007107/60098364-55147680-9790-11e9-93be-a04fdf7094c5.png">
  </details>
  
> **연습문제 2 : 프레임제목 "BorderLayout이다!", 프레임크기 350x250 { SKMirae, Gyoyang, Hakgwan, Gukje, Minju } 이름을 가지는 5개의 버튼을 BorderLayout을 이용하여 각각 동서남북중앙에 배치하고, 수평간격 30, 수직간격 20으로 배치하는 프로그램 BorderLayoutKU.java를 작성하시오.**

[연습문제 2 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter8/BorderLayoutKU.java)

<details><summary>연습문제 2 : 출력</summary>
<img src="https://user-images.githubusercontent.com/26007107/60098978-b557e800-9791-11e9-8f13-ae613a5cabcd.png">
</details>


## GridLayout 배치관리자

* 컨테이너 공간을 동일한 격자로 분할하고 각 셀에 컴포넌트를 하나씩 배치
* GridLayout의 생성자
  * *GridLayout()*
  * *GridLayout(int rows, int cols)*
  * *GridLayout(int rows, int cols, int hGap, int vGap)*
    * rows : 격자의 행 (default 1)
    * cols : 격자의 열 (default 1)
    * hGap : 좌우 컴포넌트 사이의 수평 간격 (default 0px)
    * vGap : 상하 컴포넌트 사이의 수직 간격 (default 0px)
* <details><summary>그림으로 보기</summary>
  <img src="https://user-images.githubusercontent.com/26007107/60099159-15e72500-9792-11e9-95a4-e89b00627e89.png">
  </details>
  
> **연습문제 3 : 프레임제목 "GridLayout이다!", 프레임크기 400x600, 9행 3열의 GridLayout 배치관리자로 2단부터 4단까지의 구구단의 버튼을 작성하고, 수평간격 5, 수직간격 5로 배치하는 프로그램 GridLayout99.java를 작성하시오.**

[연습문제 3 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter8/GridLayout99.java)

<details><summary>연습문제 3 : 출력</summary>
<img src="https://user-images.githubusercontent.com/26007107/60099670-17fdb380-9793-11e9-8534-591b0cf21ec7.png">
</details>


## CardLayout 배치관리자 설명은 없습니다. 이런거 쓰지 마세요.

## 배치관리자가 없는 컨테이너

* 배치관리자가 없는 컨테이너가 필요한 경우
  * 프로그램에서 직접 컴포넌트의 크기와 위치를 결정하고자 하는 경우
  * 개발자 임의로 결정하는 경우
  * 게임 프로그램과 같이 시간, 마우스, 키보드 입력에 따라 위치와 크기가 수시로 변하는 경우
  * 여러 컴포넌트들이 서로 겹쳐 출력되는 경우
  
* 배치관리자 없애기

~~~java
setLayout(null);
~~~

  * 배치관리자가 없어지면 컴포넌트에 대한 배치도 없어짐
  * 추가된 컴포넌트들의 크기가 0이 되며, 위치는 예측할 수 없음
  
* 배치관리자가 없는 컨테이너에 컴포넌트 삽입
  * 프로그램에서 컴포넌트의 절대 크기와 위치를 설정
  * 컴포넌트들이 겹치게 할 수 있음
  
* 컴포넌트의 크기와 위치를 설정하는 메소드

~~~java
void setSize(int width, int height);
void setLocation(int x, int y);
void setBounds(int x, int y, int width, int height); //위치크기동시설정
~~~

~~~java
JPanel p = new Jpanel();
p.setLayout(null);

JButton b1 = new JButton("Click");
b1.setSize(100,40);
b1.setLocation(50,50);
p.add(b1);
~~~

> **연습문제 4 : 프레임제목 "NullLayout이다!", 프레임크기 700x700, 1~1000 사이의 임의의 숫자를 가지는 10개의 버튼을 임의의 위치에 100x50 크기로 배치하는 프로그램 NullLayoutRand.java를 작성하시오.**
> 
> 단, 버튼은 프레임이 걸쳐있으면 안됨

[연습문제 4 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter8/NullLayoutRand.java)

<details><summary>연습문제 4 : 예시출력</summary>
<img src="https://user-images.githubusercontent.com/26007107/60100631-17661c80-9795-11e9-8b21-b549d88b504b.png">
</details>

{% include support.md %}

