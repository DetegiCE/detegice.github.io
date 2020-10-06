---
title: "node.js crypto module"
date: 2020-10-06 16:47:30
categories: nodejs
---

## 모듈 추출하기

```js
var crypto = require('crypto');
```

## crypto 모듈 해싱

```js
var crypto = require('crypto');

var shasum = crypto.createHash('sha256');
shasum.update('crypto_hash');
var output = shasum.digest('hex');

console.log('crypto_hash:',output);
```

``crypto_hash``라는 문자열을 ``sha256``을 이용하여 해싱하는 프로그램

<img width="552" alt="스크린샷 2020-10-06 오후 4 48 39" src="https://user-images.githubusercontent.com/26007107/95173553-c9dbba80-07f3-11eb-848e-3be3a20c75b5.png">

## crypto 모듈 암호화

```js
var crypto = require('crypto');

var key = 'anykey';
var input = 'PASSWORD';

var cipher = crypto.createCipher('aes192',key);
cipher.update(input, 'utf8', 'base64');
var cipheredOutput = cipher.final('base64');

var decipher = crypto.createDecipher('aes192',key);
decipher.update(cipheredOutput,'base64','utf8');
var decipheredOutput = decipher.final('utf8');

console.log('original: '+input);
console.log('cipher: '+cipheredOutput);
console.log('decipher: '+decipheredOutput);
```

``anykey``라는 키 값으로 ``PASSWORD``라는 문자열을 암호화하고 암호화 해제하는 프로그램

<img width="247" alt="스크린샷 2020-10-06 오후 4 49 31" src="https://user-images.githubusercontent.com/26007107/95173638-e972e300-07f3-11eb-9059-e0cdcabf0c44.png">
