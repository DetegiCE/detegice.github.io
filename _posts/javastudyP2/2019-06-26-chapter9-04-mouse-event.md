---
title: "JAVA 29. Mouse Event"
date: 2019-06-26
categories: JAVA
---

{% include java3.md %}

# Mouse Event

## Mouse Event

* 사용자의 마우스 조작에 따라 발생하는 이벤트

  * ![0906](https://user-images.githubusercontent.com/26007107/60163417-89427280-9836-11e9-8019-f15cd8bfb384.png)
  * *mouseClicked()* : 마우스가 눌러진 위치에서 그대로 떼어질 때 호출
  * *mouseReleased()* : 마우스가 눌러진 위치에서 그대로 떼어지든 아니든 항상 호출
  * *mouseDragged()* : 마우스가 드래그 되는 동안 계속 여러번 호출
  
* 마우스가 눌러진 위치에서 떼어지는 경우 메소드 호출
  * *mousePressed()* --> *mouseReleased()* --> *mouseClicked()*
* 마우스가 드래그 될 때 호출되는 메소드 호출
  * *mousePressed()* --> *mouseDragged()* 여러번 --> *mouseReleased()*
  
## Mouse Listener

* 마우스 리스너 달기
  * ~~~java
    c.addMouseListener(myMouseListener);
    ~~~
* 컴포넌트가 무브, 드래그를 함께 등록하고자 하면 MouseMotion 리스너 따로 등록
  * ~~~java
    c.addMouseMotionListener(myMouseMotionListener);
    ~~~
    
* MouseEvent 객체 활용
  * 마우스 포인터의 위치 : *int getX()*, *int getY()*
  * 마우스 클릭 횟수 : *int getClickCount()*
  
[MouseEvent 객체 예시 코드](https://github.com/DetegiCE/JavaStudy/blob/master/chapter9/MouseEventAllEx.java)
  
  
{% include support.md %}
