---
title: "node.js QueryString module"
categories: nodejs
date: 2020-10-06 16:32:05
---

## 모듈 추출하기

```js
var querystring = require('querystring');
```

## 메소드

이름|설명
:---:|:---:
stringify(obj[, sep='&'][.eq='='][, options]) | 쿼리 객체를 쿼리 문자열로 변환해 리턴
parse(str[,sep='&'][.eq='='][, options]) | 쿼리 문자열을 쿼리 객체로 변환해 리턴

## 예제

```js
var url = require('url');
var qs = require('querystring');

var parsedObj = url.parse('https://github.com/DetegiCE/detegice.github.io/tree/master/_posts/nodejs?some=abcde');
console.log(qs.parse(parsedObj.query));
```

<img width="304" alt="스크린샷 2020-10-06 오후 4 36 05" src="https://user-images.githubusercontent.com/26007107/95172271-08707580-07f2-11eb-8ef2-cde1e5e16578.png">
