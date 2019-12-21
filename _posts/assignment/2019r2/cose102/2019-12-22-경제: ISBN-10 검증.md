---
title: "경제: ISBN-10 검증"
date: 2019-12-22 01:11:00
categories: java ku
---

# DESCRIPTION
ISBN-10 (International Standard Book Number)은 10자리 숫자로 되어 있습니다. ISBN-10의 각 숫자를 차례대로 d1d2d3d4d5d6d7d8d9d10 라고 했을때, 마지막 숫자 d10 은 앞의 9개의 숫자를 다음 공식에 넣어서 구한 값입니다.  

An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula:

![](https://withcs.net/img/java2015/isbn.png)

만약 위 식을 통해서 구한 값이 10이라면 ISBN-10 전통에 따라 마지막 숫자는 X로 표기합니다. 사용자로부터 10-digit ISBN의 9개 숫자를 입력으로 받아, d10의 값을 계산하는 프로그램을 작성하세요.

If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). Your program should read the input as an integer. 


# INPUT
* Line 1 : ISBN의 9개의 숫자

 

# OUTPUT
* Line 1 : ISBN-10 문자열

 

# SAMPLE INPUT
```
013601267
```
# SAMPLE OUTPUT
```
0136012671
```

<script src="https://gist.github.com/DetegiCE/5190af9fee79ec1a36486c17656d4fcf.js"></script>
