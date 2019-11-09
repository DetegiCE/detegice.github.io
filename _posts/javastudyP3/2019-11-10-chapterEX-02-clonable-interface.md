---
title: "JAVA 39. Clonable Interface"
date: 2019-11-10
categories: java
---

# ``Clonable`` Interface

[인터페이스?](https://detegice.github.io/chapter5-04-abstract-class-and-interface/)

```java
package java.lang;

public interface Clonable {

}
```

이 Clonable 인터페이스는 **marker interface**라 하여 그 내부가 비어있다.

![clonableinterface](https://user-images.githubusercontent.com/26007107/68531309-43ed9000-0354-11ea-9642-d7f49f321b96.PNG)
(It is used to denote that a class possesses certain desirable properties.)

이 ``Clonable`` 인터페이스를 구현(implement)하는 클래스는 clonable한 상태가 되며, 

``Object`` 클래스 내부에서 ``clone()`` 메소드를 이용하여 복제가 가능하다.

자바 라이브러리 상에 존재하는 ``Date``, ``Calendar``, ``ArrayList``등의 많은 클래스들이 ``Clonable`` 인터페이스를 구현하고 있다.

<script src="https://gist.github.com/DetegiCE/2230412c8b30570a995ac3db55842ee1.js"></script>

```
true
false
true
true
```

![39_01](https://user-images.githubusercontent.com/26007107/68531457-9aa79980-0355-11ea-8f0f-5c291422df0e.png)

대충 이런 느낌이다.

이해가 아직 안된다면 좀 더 명확한 코드를 봐보자

<script src="https://gist.github.com/DetegiCE/0a2f6b8a161947e6077081a6f36eb664.js"></script>

![39_02](https://user-images.githubusercontent.com/26007107/68531541-b8293300-0356-11ea-9af8-9f02d9eefa5c.png)
