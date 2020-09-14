---
title: "node.js os module"
date: 2020-09-15 00:22:20
categories: nodejs
---

## 모듈 추출하기

```js
var os = require('os');
```

## 메소드

|메소드|역할|
|---|---|
|hostname|os 호스트 이름 리턴|
|type|os 이름 리턴|
|platform|os 플랫폼 리턴|
|arch|os 아키텍처 리턴 (x86, x64 등)|
|release|os 버전 리턴|
|uptime|os 실행시간 리턴|
|loadavg|로드 애버리지 정보를 담은 배열 리턴|
|totalmem|시스템 총 메모리 리턴|
|freemem|시스템 사용 가능 메모리 리턴|
|cpus|cpu 정보를 담은 객체 리턴|
|networkInterfaces|네트워크 인터페이스 정보를 담은 배열 리턴|


```js
var os = require('os');

console.log(os.hostname());
console.log(os.type());
console.log(os.platform());
console.log(os.arch());
console.log(os.release());
console.log(os.uptime());
console.log(os.loadavg());
console.log(os.totalmem());
console.log(os.freemem());
console.log(os.cpus());
console.log(os.networkInterfaces());
```
