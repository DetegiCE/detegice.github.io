---
title: "과학: 날짜로 요일계산"
date: 2019-12-22 01:12:00
categories: java ku
---

# DESCRIPTION
Zeller’s congruence는 날짜의 요일을 계산하기 위해서 Christian Zeller에 의해서 고안된 알고리즘이며 그 식은 다음과 같습니다. 식에서 모든 분수 계산은 버림으로 수행 되어야 하므로 주의해야 합니다.

Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is

![](https://withcs.net/img/java2015/day_of_the_week.png)

사용자로부터 년도, 월, 일로 구성된 날짜을 입력받아 해당 날짜는 무슨 요일인이 출력하는 프로그램을 작성하세요.

Note that the division in the formula performs an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.

[Zeller's Congruence(제라의 공식) 참고 링크](https://detegice.github.io/zellers-congruence/)

# INPUT
* Line 1 : year (1500~2500)

* Line 2 : month (1-12)

* Line 3 : day (1-31)

 

# OUTPUT
* Line 1 : 해당 날짜에 해당되는 요일(Saturday, Sunday, Monday, Tuesday, Wednesday, Thursday, Friday)

# SAMPLE INPUT
```
2015
1
25
```
# SAMPLE OUTPUT
```
Sunday
```

# HINT
January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year

<script src="https://gist.github.com/DetegiCE/0f4174d67e1de2593cad510a142b8f8c.js"></script>
