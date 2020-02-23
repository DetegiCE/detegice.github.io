---
title: "JAVA 한글 컴파일 에러 대처"
date: 2020-02-23 20:42:00
categories: java
---

외부 프로그램을 만들고 컴파일을 하던 중에 오류가 발생했다.

![jkr-1](https://user-images.githubusercontent.com/26007107/75111448-4a8ee180-567d-11ea-8d1e-6efbfdd64c0b.png)

error: unmappable character 이라고 하니 대충 글자가 깨진것 같다.

이럴땐 쉽게 바로 encoding UTF-8을 적용해주면 된다.

![jkr-2](https://user-images.githubusercontent.com/26007107/75111449-4bc00e80-567d-11ea-8393-d7181618bfe8.png)

``javac -encoding UTF-8 -d . ~~~.java``
