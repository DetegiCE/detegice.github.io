---
title: "node.js util module"
date: 2020-10-06 16:37:18
categories: nodejs
---

## 모듈 추출하기

```js
var util = require('util');
```

### 주요 메소드

이름|설명
:---:|:---:
format(format[, ...]) | 매개변수로 입력한 포맷을 조합해 리턴

### 예제

```js
var util = require('util');

var data = util.format('%d + %d = %d',1,2,1+2);
console.log(data)
```

<img width="81" alt="스크린샷 2020-10-06 오후 4 39 07" src="https://user-images.githubusercontent.com/26007107/95172556-7452de00-07f2-11eb-9ea2-2674123f3597.png">
