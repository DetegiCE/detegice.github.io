---
title: "GregorianCalendar"
date: 2019-12-25 02:56:00
categories: java ku
---

# DESCRIPTION
날짜와 시간을 입력받아 +1000일을 한뒤 -1000초를 해서 계산된 날짜와 시간을 출력하는 프로그램을 작성하세요.

 

# INPUT
* Line 1 : 테스트케이스 T (1~1,000)

* Line 2 ~ T+1 : 년 월 일 시 분 초 (공백으로 구분된 6개의 정수)

- 년의 범위는 1,000~3,000

- 월의 범위는 1~12

- 일의 범위는 1~31

- 시의 범위는 0~23

- 분과 초의 범위는 0~59

 
# OUTPUT
* Line 1 ~ T : 년 월 일 시 분 초 (샘플 아웃풋 처럼 구분된 6개의 정수)

# SAMPLE INPUT
```
3
1999 12 24 23 0 0
2000 1 1 1 0 0 
2015 10 16 21 38 29
```
# SAMPLE OUTPUT
```
2002.09.19 22:43:20
2002.09.27 00:43:20
2018.07.12 21:21:49
```

<script src="https://gist.github.com/DetegiCE/6b066a428fcc96674de6ec2e0b1daa65.js"></script>
