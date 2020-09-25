---
title: "Text Encoding Conversion in MAC"
date: 2020-09-26 01:57:28
categories: mac
---

윈도우에서 작성된 텍스트 파일을 열면 가끔 

<img width="532" alt="스크린샷 2020-09-26 오전 1 58 13" src="https://user-images.githubusercontent.com/26007107/94295115-bd599580-ff9b-11ea-88a6-28b2186954a6.png">

위 처럼 뜰 때가 있다.

이 CP949를 UTF-8로 변경해줘야 하는데

```css
iconv -f cp949 < text.txt > conv.txt
```

<img width="767" alt="스크린샷 2020-09-26 오전 2 00 18" src="https://user-images.githubusercontent.com/26007107/94295318-07427b80-ff9c-11ea-8c9a-3b53e057a0a0.png">

반대로 UTF-8에서 CP949로 변경할 때는

```css
iconv -f utf8 < text.txt > conv.txt
```

를 해주면 된다.
