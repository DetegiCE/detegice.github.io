---
title: "KU COSE101 2019기말대비 연습문제 4번"
date: 2019-06-15
categories: C_Language
---

다음과 같은 계산 식이 있다.

```
5 + 10 - 7 * 3 / 2
```

위와 같은 계산식을 Linked List를 이용하여 입력 한 뒤, 계산하시오.
단, 각 숫자는 20 이하이다.

~~~c
struct calc{
  int num;
  char oper;
  struct calc* next;
};
typedef struct calc calc;
typedef CALC *calcPtr;
~~~

계산은 int형으로만 진행된다. (ex) 3/2 = 1)

즉 위 계산은 다음과 같이 진행되어야 한다.
```
5 + 10 - 7 * 3 / 2
5 + 10 - 21 / 2
5 + 10 - 10
15 - 10
5
---

***
