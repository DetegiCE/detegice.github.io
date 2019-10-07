---
title: "Zeller's Congruence (제라의 공식)"
date: 2019-09-19
categories: math
---

# Zeller's Congruence (제라의 공식)

제라의 공식은 날짜가 주어졌을 때 요일을 구하는 공식입니다.

그레고리안력 기준

![](https://wikimedia.org/api/rest_v1/media/math/render/svg/0f95195dcc0d98b351294277071736e97053324e)

* _h_ : 요일 (토요일 = 0, 일요일 = 1, ..., 금요일 = 6)
* _q_ : 일 (1일, 2일, 3일,...)
* _m_ : 월 (3 = 3월, 4 = 4월, ..., 13 = 1월, 14 = 2월)
* _k_ : 연을 100으로 나눈 나머지
* _j_ : 연을 100으로 나눈 몫
* _└ ┘ 기호_ : 내림

**단, 1월 2월의 경우, 연을 1씩 빼줘야 합니다.**

이 공식을 이용해 달력을 출력하는 경우, 해당 월의 1일의 요일을 알아낸 다음

2차원 배열을 이용해 채워나가면 됩니다.

## Java 예시

~~~java
import java.util.*;
public class Zeller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[] = {"Satur","Sun","Mon","Tues","Wednes","Thurs","Fri"};
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		if(m<=2) {
			m+=12;
			y--;
		}
		int k = y%100;
		int j = y/100;
		
		int h = (d+(26*(m+1)/10)+k+k/4+j/4+5*j)%7;
		System.out.println(a[h]+"day");
	}
}
~~~

{% include support.md %}
