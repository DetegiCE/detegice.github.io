---
title: "Android 002. Button Internet"
date: 2020-01-13 04:38:00
categories: android
---

이번엔 버튼을 눌러서 인터넷 창을 띄워보겠다.

얘는 intent 객체를 사용하는데, 화면 전환을 담당하는 액티비티다.

![02-am](https://user-images.githubusercontent.com/26007107/72224515-bda53280-35be-11ea-8e44-130d63a76ac7.png)

버튼 하나 추가하고, 메소드 이름 정해준다

```java
public void onButton2Clicked(View v) {
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://detegice.github.io/"));
    startActivity(intent);
}
````

메소드 하나 추가해준다.

![02-ph](https://user-images.githubusercontent.com/26007107/72224559-22608d00-35bf-11ea-9226-a783d779a524.png)

잘 넘어가진다.

**여기서 의문점**은 난 분명히 버튼을 HELLO ANDROID 아래에 놔뒀는데 버튼이 (0,0)으로 이동했다.

이유는 간단하다.

![02-er](https://user-images.githubusercontent.com/26007107/72224576-4d4ae100-35bf-11ea-9806-74e3c5abc564.PNG)

레이아웃 속성을 지정 안해줬다.
