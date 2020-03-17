---
title: "Android 안드로이드 - java.io.IOException: Cleartext HTTP traffic to URL not permitted"
date: 2020-03-17 12:06:00
categories: android
---

http 주소로부터 사진을 불러오는데 ``java.io.IOException: Cleartext HTTP traffic to URL not permitted`` 에러가 발생했다.

안드로이드 API 28부터 네트워크 보안정책이 강화되어 그렇다고 한다.

아주 간단하게 해결할 수 있다.

``AndroidManifest.xml`` 파일로 들어간다.

``<application>`` 부분에 다음과 같이 추가해준다.

```
android:usesCleartextTraffic = "true"
```

cleartext HTTP와 같은 cleartext 네트워크 트래픽의 사용 여부를 나타내며, 

얘가 false면 일반 텍스트 트래픽 사용에 대해 요청을 거부한다고 한다.

[출처](https://developside.tistory.com/85)
