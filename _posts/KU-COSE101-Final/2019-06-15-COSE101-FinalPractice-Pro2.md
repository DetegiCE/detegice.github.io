---
title: "KU COSE101 2019기말대비 연습문제 2번"
date: 2019-06-15
categories: c_language ku
---

| | | | | | |
|:---------:|:---:|:---:|:---:|:---:|:---:|
| 2019 연습 | [1번](https://detegice.github.io/COSE101-FinalPractice-Pro1) | **2번** | [3번](https://detegice.github.io/COSE101-FinalPractice-Pro3) | [4번](https://detegice.github.io/COSE101-FinalPractice-Pro4) | [5번](https://detegice.github.io/COSE101-FinalPractice-Pro5) |

다음 프로그램의 출력을 작성하시오.
~~~c
#include<stdio.h>

void hello(int k)
{
	if(k){
		hello(k/10);
		printf("%d",(k>>2)%10);
	}
}

int main()
{
	hello(59382);
	return 0;
}
~~~

***

<details><summary>정답</summary>

{% highlight text %}
14845

hello(59382)
 - hello(5938)
   - hello(593)
     - hello(59)
       - hello(5)
         - hello(0)
       - 5를 4로 나눈 값의 일의자리 "1" 출력
     - 59를 4로 나눈 값의 일의자리 "4" 출력
   - 593을 4로 나눈 값의 일의자리 "8" 출력
 - 5938을 4로 나눈 값의 일의자리 "4" 출력
59382를 4로 나눈 값의 일의자리 "5" 

{% endhighlight %}

</details>
