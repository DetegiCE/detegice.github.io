---
title: "measuring javascript execution time using console 콘솔을 이용해 자바스크립트 실행 시간 측정"
date: 2020-09-08 22:00:00
categories: js
---

```js
console.time('alpha');

var output = 1;
for(var i = 1 ; i <= 10 ; i++) {
    output *= i;
}
console.log('Res: ',output);

console.timeEnd('alpha');
```

```text
Res:  3628800
alpha: 5.987ms
```
