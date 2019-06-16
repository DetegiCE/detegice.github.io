---
title: "KU COSE101 2019기말대비 연습문제 1번"
date: 2019-06-15
categories: C_Language
---

| | | | | | |
|:---------:|:---:|:---:|:---:|:---:|:---:|
| 2019 연습 | **1번** | [2번](https://detegice.github.io/COSE101-FinalPractice-Pro2) | [3번](https://detegice.github.io/COSE101-FinalPractice-Pro3) | [4번](https://detegice.github.io/COSE101-FinalPractice-Pro4) | [5번](https://detegice.github.io/COSE101-FinalPractice-Pro5) |

다음 프로그램의 출력을 작성하시오.
~~~c
#include<stdio.h>

int x = 20;
int y = -2;

void func1();
void func2(int*);
void func3(int*);

int main()
{
	int x = 5;
	int y = 7;
	printf("%d, ",x);
	{
		int y = 9;
		printf("%d, ",y);
	}
	func1(); func2(&x); func3(&y);
	func2(&y); func3(&x); func1();
	printf("%d, ", x);
	printf("%d", y);
}

void func1() {
	static int y = 12;
	printf("%d, ", y);
	y++;
	x+=y;
}

void func2(int* y) {
	printf("%d, ", ++(*y));
	++x;
	printf("%d, ", x);
	{
		int y = 10;
		printf("%d, ", y);
	}
}

void func3(int* x) {
	printf("%d, ", *x);
	y++;
	(*x)+=y;
	printf("%d, ", *x);
}
~~~

***

<details><summary>정답</summary>

{% highlight text %}
5, 9, 12, 6, 34, 10, 7, 6, 7, 35, 10, 6, 6, 13, 6, 7

1) 5 : main함수의 x
2) 9 : main함수의 중괄호 블록 안의 y
3) 12 : func1함수의 y
4) 6 : func2함수로 main함수의 x(5)가 넘어왔고, 1을 더했으므로, 6
5) 34 : func1 함수에서 global x(20)에 y(13)를 더했고, 후에 1을 다시 더했으므로 34
6) 10 : func2 함수의 중괄호 블록 안의 y
7) 7 : func3함수로 main함수의 y(7)가 넘어왔으므로 7
8) 6 : global y(-2)에 1을 더하여 (-1)이 되고, *x(main::y=7)에 -1을 더하여 6
9) 7 : func2 함수로 main::y(6)이 넘어왔고, 1을 더하여 출력하므로 7
10) 35 : global x에 1을 더하여 출력하므로 35
11) 10 : func2 함수의 중괄호 블록 안의 y
12) 6 : func3 함수로 main::x(6)이 넘어왔으므로 6
13) 6 : global 변수의 y에 1을 더하여 0이 되고, *x(main::x=6)에 0을 더하므로 6
14) 13 : static 변수이므로 이전에 더했던 1이 저장되어있으므로 13
15) 6 : main::x은 6
16) 7 : main::는 7
{% endhighlight %}

</details>
