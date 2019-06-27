---
title: "JAVA 30. JComponent, JLabel and JButton"
date: 2019-06-27
categories: JAVA
---

{% include java3.md %}

# JComponent, JLabel and JButton

[이미지 다운로드](https://github.com/DetegiCE/JavaStudy/tree/master/chapter10/image)

## Java GUI Programming

* 컴포넌트 기반 GUI 프로그래밍
  * 스윙 컴포넌트를 이용한 GUI 구축
  * 자바에서 제공하는 컴포넌트의 한계
* 그래픽 기반 GUI 프로그래밍
  * 그래픽을 이용한 GUI 구축
  * 개발자가 직접 그래픽으로 화면 구성
  * 독특한 GUI 구성
  * 실행 속도가 빠름
  
* 스윙 컴포넌트

![1001](https://user-images.githubusercontent.com/26007107/60225537-32827a80-98c2-11e9-898d-dcd920af198b.png)


## JComponent

* JComponent
  * 스윙 컴포넌트는 모두 상속받는 슈퍼 클래스
  * 스윙 컴포넌트들이 상속받는 공통메소드와 상수를 구현
  * 추상 클래스
  
  * 컴포넌트 모양 관련 메소드
  
    ~~~java
    void setForeground(Color) // 전경색 설정
    void setBackground(Color) // 배경색 설정
    void setOpaque(boolean) // 불투명성 설정
    void setFont(Font) // 폰트 설정
    Font getFont() // 폰트 리턴
    ~~~
    
  * 컴포넌트 상태 관련 메소드
  
    ~~~java
    void setEnabled(boolean) // 컴포넌트 활성화 여부
    void setVisible(boolean) // 컴포넌트 가시화 여부
    boolean isVisible() // 컴포넌트 보이는 상태 리턴
    ~~~
    
  * 컴포넌트 위치 및 크기 관련 메소드
    
    ~~~java
    int getWidth() // 폭
    int getHeight() // 높이
    int getX() // x좌표
    int getY() // y좌표
    Point getLocationOnScreen() // 스크린상의 컴포넌트 좌표
    void setLocation(int, int) // 위치 지정
    void setSize(int, int) // 크기 지정
    ~~~
    
  * 컨테이너를 위한 메소드
  
    ~~~java
    Component add(Component) // 자식 컴포넌트 추가
    void remove(Component) // 자식 컴포넌트 제거
    void removeAll() // 모든 자식 컴포넌트 제거
    Component[] getComponents() // 자식 컴포넌트 배열 리턴
    Container getParent() // 부모 컨테이너 리턴
    Container getTopLevelAncestor() // 최상위 부모 컨테이너 리턴
    ~~~
    
* [JComponent 활용 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter10/JComponentEx.java)


## JLabel

* JLabel : 문자열이나 이미지를 화면에 출력

* 생성자
  * *JLabel()* : 빈 레이블
  * *JLabel(Icon image)* : 이미지 레이블
  * *JLabel(String text)* : 문자열 레이블
  * *JLabel(String text, Icon image, int hAlign)* : 문자열과 이미지를 보두 가진 레이블
    * hAlign : SwingConstants.LEFT, SwingConstants.RIGHT, SwingConstants.CENTER
    
* 예시
  * 문자열 레이블
    
    ~~~java
    JLabel textLabel = new JLabel("I Hate Coding");
    ~~~

  * 이미지 레이블
  
    ~~~java
    ImageIcon image = new ImageIcon("images/korea.jpg");
    JLabel imageLabel = new JLabel(image);
    ~~~
    
  * 현재 파일 경로 알아내기
    * 이클립스 좌측의 **Project Explorer**에서 현재 파일 우클릭 > **Properties** 선택 > **Resources** > **Location**
    
* [JLabel 활용 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter10/JLabelEx.java)


## JButton

* JButton : 버튼 모양의 컴포넌트로 사용자로부터 명령을 입력받기 위한 목적

* 생성자
  * *JButton()* : 빈 버튼
  * *JButton(Icon image)* : 이미지 버튼
  * *JButton(String text)* : 문자열 버튼
  * *JButton(String text, Icon image)* : 문자열과 이미지 모두 가진 버튼
    
* 예시
  * 문자열 버튼
  
    ~~~java
    JButton btn = new JButton("Button!!!");
    ~~~
    
  * 이미지 버튼
    * 하나의 버튼에 3개의 이미지 등록
    * normalIcon : 버튼의 디폴트 상태의 이미지. 생성자에 전달 or setIcon(normalIcon);
    * rolloverIcon : 버튼에 마우스가 올라갈 때 출력되는 이미지. setRolloverIcon(rolloverIcon);
    * pressedIcon : 버튼을 누른 상태에 출력되는 이미지. setPressedIcon(pressedIcon);
    
    ~~~java
    ImageIcon nIcon = new ImageIcon("images/normal.png");
    ImageIcon rIcon = new ImageIcon("images/rollover.png");
    ImageIcon pIcon = new ImageIcon("images/pressed.png");
    
    JButton btn = new JButton("Button", nIcon);
    btn.setRolloverIcon(rIcon);
    btn.setPressedIcon(pIcon);
    ~~~
    
* [JButton 활용 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter10/JButtonEx.java)
    
{% include support.md %}
