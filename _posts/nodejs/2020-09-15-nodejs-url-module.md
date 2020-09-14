---
title: "node.js url module"
date: 2020-09-15 00:32:26
categories: nodejs
---

## 모듈 추출하기

```js
var url = require('url')
```

## 메소드

|메소드|역할|
|parse(urlStr[, parseQueryString=false][, slashesDenoteHost=false])|URL 문자열을 URL 객체로 변환해 리턴|
|format(urlObj)|URL 객체를 URL 문자열로 변환해 리턴|
|resolve(from, to)|매개변수를 조합해 URL 문자열을 생성해 리턴|

```js
var url = require('url');

var parseObj = url.parse('https://github.com/DetegiCE/detegice.github.io/tree/master/_posts/nodejs');
var mergeObj = url.format(parseObj);
console.log(parseObj);
console.log(mergeObj);
```

<img width="565" alt="스크린샷 2020-09-15 오전 12 37 04" src="https://user-images.githubusercontent.com/26007107/93106692-940f4e80-f6eb-11ea-9cdb-8241e666984a.png">
