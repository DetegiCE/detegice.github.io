---
title: "JAVA 32. JList, JComboBox, JMenu and JOptionPane"
date: 2019-06-27
categories: JAVA
---

{% include java3.md %}

# JList, JComboBox, JMenu and JOptionPane

[이미지 다운로드](https://github.com/DetegiCE/JavaStudy/tree/master/chapter10/image)

## JList

* JList : 하나 이상의 아이템을 보여주고 아이템을 선택하도록 하는 리스트
  * JScollPane에 JList 컴포넌트를 삽입하여야 스크롤 가능
  
* 생성자
  * *JList()* : 빈 리스트
  * *JList(Vector listData)* : 벡터로부터 아이템을 가져옴
  * *JList(Object[] listData)* : 배열로부터 아이템을 가져옴
  
* 예시

  ~~~java
  String[] building = {"과학도서관", "우정정보관", "아산이학관", "이학관별관", "애기능학생회관", "애기능생활관", "창의관", "하나과학관"};
  JList strlist = new JList(building);
  ~~~

  ~~~java
  ImageIcon[] img = { new ImageIcon("image/icon1.png"), new ImageIcon("image/icon2.png"), new ImageIcon("image/icon3.png") };
  JList imgList = new JList(img);
  ~~~
  
* [JList 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter10/JListEx.java)

* ![1006](https://user-images.githubusercontent.com/26007107/60231740-45527a80-98d5-11e9-98ca-23d9fcdc028c.png)


## JComboBox

* JComboBox : 텍스트필드 + 버튼 + 드롭다운 리스트
  * 드롭다운 리스트에서 선택한 것이 텍스트필드에 나타남
  
* 생성자
  * *JComboBox()* : 빈 콤보박스
  * *JComboBox(Vector items)* : 벡터로부터 아이템을 가져옴
  * *JComboBox(Object[] items)* : 배열로부터 아이템을 가져옴
  
* 이벤트는 Action 클래스/리스너로 처리
  
> **연습문제 1 : "정보대학", "이과대학", "문과대학"의 이름을 가진 콤보박스를 가지고, 사용자가 선택한 대학의 이미지를 콤보박스 옆에 출력하는 프로그램 JComboBoxCol.java를 작성하시오.**
>
> 프레임제목 "ComboBox 예제", 프레임크기 300 x 250
>
> 정보대학 파일명 - jungbo.png, 이과대학 파일명 - eegwa.png, 문과대학 파일명 - mungwa.png
> 
> 컨텐트팬 배치관리자 : FlowLayout
>
> 콤보박스에서 선택된 값의 인덱스 가져오는 메소드 : *getSelectedIndex();*
>
> 이미지 라벨을 변경하는 메소드 : *setIcon(ImageIcon);*
>
> ![1007](https://user-images.githubusercontent.com/26007107/60232473-b2670f80-98d7-11e9-8824-73ca173074e2.png)

[연습문제 1 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter10/JComboBoxCol.java)


{% include support.md %}
