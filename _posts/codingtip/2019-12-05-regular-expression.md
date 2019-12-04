---
title: "Regular Expression"
date: 2019-12-05
categories: data_structure java python string
---

# Regular Expression

* 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식 언어

* 정규식에서 사용되는 기호를 **Meta** 문자라고 함.

# Meta Characters

* ``^`` : 문자열의 시작을 표현
  * ``^abc`` : **abc**로 시작하는 문자열 (**abc**, **abc**de, ...)
* ``$`` : 문자열의 종료를 표현
  * ``man$`` : **man**으로 끝나는 문자열 (**man**, hu**man**) 
* ``.`` : 개행을 제외한 임의의 한 문자
  * ex) **helloworld**
* ``[]`` : 괄호 안의 문자를 찾음
  * ``[abc]`` : 문자열에서 **a, b, c**를 찾음 (hum**a**n, **a**vo**ca**do)
