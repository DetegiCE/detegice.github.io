---
title: "자바스크립트로 웹페이지 타이틀에 현재 시간 띄우기"
date: 2019-12-26 16:33:36
categories: javascript
---

## 서론

이걸 만드려고 했던 이유는 간단하다.

그냥 현재 시간을 보고 싶었다.

## 본론

총 3가지가 필요하다.

* 1초마다 갱신을 해줄 함수 ``setInterval``

* 현재 시간을 가져오는 함수 ``Date``

* html의 title 태그를 ``document.title``

### ``setInterval``

``setInterval``의 구조는 간단하다.

```js
setInterval(함수, 시간);
```

``함수``를 ``시간`` 밀리초 마다 실행하는 것이다.

### ``Date``

```js
var d = new Date()
```

를 해주면 ``d``에 현재 시간이 저장된다.

![time](https://user-images.githubusercontent.com/26007107/71464818-1a060500-27fe-11ea-8065-7441878315d5.PNG)

대충 그 내부는 이렇게 생겼다.

d를 그냥 출력하면

![curtime](https://user-images.githubusercontent.com/26007107/71464845-343fe300-27fe-11ea-9772-932929338c5e.PNG)

현재 시간이 나온다.

### ``document.title``

말 그대로 문서의 제목을 가져온다.

![dt](https://user-images.githubusercontent.com/26007107/71464883-55083880-27fe-11ea-9244-8f71c14980fe.PNG)

![dtin](https://user-images.githubusercontent.com/26007107/71464922-7406ca80-27fe-11ea-86b9-e982245e0882.PNG)

이렇게 대입을 통해 바꿔줄 수도 있다.

## 코드

이제 이 세 가지를 조합하여 만들어보자

```js
setInterval( function() { var d = new Date(); document.title = d; }, 1000);
```

그럼 이제 1초마다 title에서 시간이 바뀌는 것을 볼 수 있다.

<script>
setInterval( function() { var d = new Date(); document.title = d; }, 1000);
</script>
