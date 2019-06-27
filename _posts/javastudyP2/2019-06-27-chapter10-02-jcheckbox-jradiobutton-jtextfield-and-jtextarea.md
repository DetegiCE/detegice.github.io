---
title: "JAVA 31. JCheckBox, JRadioButton, JTextField, and JTextArea"
date: 2019-06-27
categories: JAVA
---

{% include java3.md %}

# JCheckBox, JRadioButton, JTextField, and JTextArea

## JCheckBox

* JCheckBox : 선택과 비선택 상태를 가지는 버튼

* 생성자
  * *JCheckBox()* : 빈 체크박스
  * *JCheckBox(Icon image)* : 이미지 체크박스
  * *JCheckBox(Icon image, boolean selected)* : 체크된 이미지 체크박스
  * *JCheckBox(String text, Icon image)* : 문자열과 이미지를 가진 체크박스
  * *JCheckBox(String text, Icon image, boolean selected)* : 문자열과 이미지를 가진 체크된 체크박스
  
* 예시
  * 문자열 체크박스
     
     ~~~java
     JCheckBox apple = new JCheckBox("사과");
     JCheckBox pear = new JCheckBox("배", true);
     ~~~
     
 > **연습문제 1 : 컴프, 전수, 아잉 3개의 문자열 체크박스를 가진 프로그램 JCheckBoxEx.java 작성하시오. 단, 전수 체크박스는 미리 활성화가 되어있다.**
 >
 > 프레임 제목 "CheckBox 예제", 프레임 크기 250 x 150
 >
 > 컨텐트팬 배치관리자는 FlowLayout으로 설정

* JCheckBox에 이벤트 처리하기 (Item)
  * 체크박스의 선택 상태 변화가 생길때 발생하는 이벤트
  * 이벤트가 발생하면 ItemEvent 객체 생성
  * ItemListener 리스너를 이용하여 이벤트 처리
  
  * ItemListener의 추상메소드 및 주요 메소드
  
    ~~~java
    void itemStateChanged(ItemEvent e) //추상메소드
    
    int getStateChange() // 체크박스가 선택된 경우 ItemEvent.SELECTED, 아닌경우 ItemEvent.DESELECTED 리턴
    Object getItem() // 이벤트를 발생시킨 아이템 객체 리턴
    ~~~

> **연습문제 2 : 컴프, 전수, 아잉 3개의 체크박스를 만들고, 각 과목을 클릭하면 세 과목의 평균을 JLabel로 출력하는 프로그램 JCheckBoxGrade.java를 작성하시오.**
>
> 프레임 제목 "CheckBox 이벤트 예제", 프레임 크기 250 x 200
>
> 컨텐트팬 배치관리자는 FlowLayout으로 설정
>
> 단, JCheckBox는 객체 배열로 작성하시오.
>
> ![1002](https://user-images.githubusercontent.com/26007107/60228411-965e7080-98cd-11e9-8a56-e1cbd0e32c88.png)

[연습문제 2 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter10/JCheckBoxGrade.java)


## JRadioButton

* JRadioButton : 버튼 그룹을 형성하여 그룹에 속한 버튼 중 하나만 선택되는 라디오버튼

* 생성자
  * *JRadioButton()* : 빈 라디오버튼
  * *JRadioButton(Icon image)* : 이미지 라디오버튼
  * *JRadioButton(Icon image, boolean selected)* : 선택초기화 이미지 라디오버튼
  * *JRadioButton(String text)* : 문자열 라디오버튼
  * *JRadioButton(String text, boolean selected)* : 선택초기화 문자열 라디오버튼
  * *JRadioButton(String text, Icon image)* : 문자열과 이미지 라디오버튼
  * *JRadioButton(String text, Icon image, boolean selected)* : 선택초기화 문자열과 이미지 라디오버튼

* 라디오버튼의 생성
  * 버튼 그룹 객체 생성
  
    ~~~java
    ButtonGroup group = new ButtonGroup();
    ~~~
    
  * 라디오버튼 생성
    
    ~~~java
    JRadioButton a = new JRadioButton("과학도서관");
    JRadioButton b = new JRadioButton("우정정보관");
    JRadioButton c = new JRadioButton("이학관별관");
    ~~~
    
  * 그룹에 라디오버튼을 삽입
  
    ~~~java
    group.add(a);
    group.add(b);
    group.add(c);
    ~~~
    
  * 컨테이너에 라디오버튼을 삽입
    
    ~~~java
    cont.add(a);
    cont.add(b);
    cont.add(c);
    ~~~

* JRadioButton에 이벤트 처리 (Item)
  * 라디오버튼이 선택/해제되어 상태가 달라지면 Item 이벤트 발생

> **연습문제 3 : 과학도서관, 우정정보관, 이학관별관으로 라디오버튼을 만들고, 각 건물은 선택하면 그 건물을 대여했다는 문구를 JLabel로 출력하는 프로그램 JRadioButtonBuild.java를 작성하시오.**
>
> 프레임 제목 "RadioButton 예제", 프레임 크기 350 x 200
>
> 컨텐트팬 배치관리자는 FlowLayout으로 설정
>
> 단, JRadioButton은 객체 배열로 작성하시오.
>
> ![1003](https://user-images.githubusercontent.com/26007107/60229086-ad05c700-98cf-11e9-83c6-975f58c848a1.png)

[연습문제 3 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter10/JRadioButtonBuild.java)


## JTextField

* JTextField : 한 줄의 문자열을 입력받는 창
  * 텍스트 입력 중 ENTER가 입력되면 Action 이벤트 발생
  
* 생성자
  * *JTextField()* : 빈 텍스트필드
  * *JTextField(int cols)* : 입력 창의 열의 개수가 cols개인 텍스트필드
  * *JTextField(String text)* : text 문자열로 초기화된 텍스트필드
  * *JTextField(String text, int cols)* : ㅇㅇ
  
> **연습문제 4 : 이름, 학과, 주소를 입력받는 텍스트필드가 있는 프로그램 JTextFieldInfo.java를 작성하시오.**
>
> 프레임제목 "TextField 예제", 프레임 크기 300 x 150
>
> 컨텐트팬 배치관리자는 3행 1열의 GridLayout으로 설정, 행간 간격은 10으로 설정
>
> 단, 각 텍스트필드의 열의 개수는 20이다.
>
> 힌트 : Label과 TextField를 Panel에 넣어서 Panel을 Container에 넣으면 된다. 각 Panel의 배치관리자는 FlowLayout으로 설정.
>
> Panel, Label, TextField 모두 객체 배열로 작성하시오.
>
> ![1004](https://user-images.githubusercontent.com/26007107/60229933-3bc71380-98d1-11e9-9e89-53d2c44e0dfd.png)

[연습문제 4 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter10/JTextFieldInfo.java)


## JTextArea

* JTextArea : 여러 줄의 문자열을 입력받을 수 있는 창
  * 스크롤바 미지원
  * 후에 JScrollPane 객체에 삽입하여 스크롤바를 사용 가능
  
* 생성자
  * *JTextArea()* : 빈 텍스트영역
  * *JTextArea(int rows, int cols)* : 입력 창이 rows x cols 개의 문자 크기인 텍스트영역
  * *JTextArea(String text)* : text 문자열로 초기화된 텍스트영역
  * *JTextArea(String text, int rows, int cols)* : ㅇㅇ
  
* 예시

  ~~~java
  JTextArea ta = new JTextArea("hello", 7, 20);
  c.add(ta);
  ~~~

  ~~~java
  JTextArea ta = new JTextArea("hello", 7, 20);
  c.add(new JScrollPane(ta)); // 스크롤바 붙이기
  ~~~

> **연습문제 5 : TextField에 이름을 입력하면 TextArea의 뒤에 추가되는 프로그램 JTextAreaNames.java를 작성하시오.**
>
> 프레임제목 "TextArea 예제", 프레임크기 300 x 300
>
> 배경색은 검정(Color.BLACK)으로 설정
>
> 컨텐트팬의 배치관리자는 FlowLayout으로 설정
>
> TextField는 20칸, TextArea는 7x20칸 & 스크롤바 있음
> 
> 힌트 : TextArea의 뒤에 값을 추가하려면 *textArea.append(String);* 을 사용하시오.
>
> ![1005](https://user-images.githubusercontent.com/26007107/60231059-01f70c80-98d3-11e9-91b4-92f44a98a696.png)

[연습문제 5 : 예시답안](https://github.com/DetegiCE/JavaStudy/blob/master/chapter10/JTextAreaNames.java)


{% import support.md %}
