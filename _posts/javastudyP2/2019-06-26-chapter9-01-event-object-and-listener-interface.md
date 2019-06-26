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


## Event Object

* 이벤트 객체
  * 발생한 이벤트에 관한 정보를 가진 객체
  * 이벤트 리스너에 전달
* 이벤트 객체가 포함하는 정보
  * 이벤트 종류와 소스
  * 이벤트가 발생한 화면 좌표 및 컴포넌트 내의 조파ㅛ
  * 이벤트가 발생한 객체의 문자열
  * 마우스의 버튼 번호 및 클릭 횟수
  * 키보드 키의 코드 값과 문자 값
  * 컴포넌트의 체크 상태 (체크박스, 라디오버튼 등)

* 이벤트 소스를 알아내는 메소드

~~~java
Object getSource();
~~~
  
  * 발생한 이벤트의 소스 컴포넌트 리턴
  * *Object* 타입으로 리턴하므로 캐스팅필요
  * 모든 이벤트 객체에 대하여 적용
  * ![0902](https://user-images.githubusercontent.com/26007107/60147783-b4fb3380-9809-11e9-96bf-44a9e62e9fa9.png)

* 이벤트 객체 및 소스의 종류

이벤트 객체 | 이벤트 소스 | 이벤트의 발생 경우
:---|:---|:---
ActionEvent | JButton | 마우스나 Enter 키로 선택
ActionEvent | JMenuItem | 메뉴 아이템 선택
ActionEvent | JTextField | 텍스트 입력 중 Enter 키 입력
ItemEvent | JCheckBox | 체크박스의 선택 혹은 해제
ItemEvent | JRadioButton | 라디오 버튼의 선택 상태가 변할 때
ItemEvent | JCheckBoxMenuItem | 체크박스 메뉴 아이템의 선택 혹은 해제
ListSelectionEvent | JList | 리스트에 선택된 아이템이 변경 시
KeyEvent | Component | 키가 눌러지거나 눌러진 키가 떼어질 때
MouseEvent | Component | 마우스 버튼이 눌리거나 떼어질때, 클릭 될 때, 마우스가 올라갈 때, 올라간게 내려올 때, 드래그 될 때, 그냥 움직일 때
FocusEvent | Component | 컴포넌트가 포커스를 받거나 잃을 때
TextEvent | TextField | 텍스트 변경
TextEvent | TextArea | 텍스트 변경
WindowEvent | Window | Window를 상속받는 모든 컴포넌트에 대해 윈도우 활성화, 비활성화, 아이콘화, 아이콘에서 복구, 왼도우 열기, 닫기, 종류



{% include support.md %}
