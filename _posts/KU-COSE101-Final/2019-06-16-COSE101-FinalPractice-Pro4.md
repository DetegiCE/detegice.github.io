---
title: "KU COSE101 2019기말대비 연습문제 4번"
date: 2019-06-16
categories: C_Language
---


| | | | | | |
|:---------:|:---:|:---:|:---:|:---:|:---:|
| 2019 연습 | [1번](https://detegice.github.io/COSE101-FinalPractice-Pro1) | [2번](https://detegice.github.io/COSE101-FinalPractice-Pro2) | [3번](https://detegice.github.io/COSE101-FinalPractice-Pro3) | **4번** | [5번](https://detegice.github.io/COSE101-FinalPractice-Pro5) |

소수는 매우 다양한 주제를 가지고 탐구해 볼 수 있는 수의 집합 중 하나이다.
소수란 약수가 1과 자기 자신 밖에 없는 1보다 큰 자연수를 말한다.

다양한 소수의 종류중, Right-Truncatable Prime은 하여 오른쪽을 제거하더라도 계속 소수가 되는 수를 말한다.

예를 들어 7193를 보면, 7193은 소수이고, 오른편을 뺀 719도 소수이고, 오른편을 뺀 71도 소수이고, 오른편을 뺀 7도 소수이므로,
7193는 Right-Truncatable Prime라 할 수 있다.

자연수 n이 입력되었을 때, n자리로 이루어진 Right-Truncatable Prime을 한 줄에 하나씩 오름차순으로 출력한다.

마지막 줄에는 Right-Truncatable Prime의 개수를 출력한다

***

<details><summary>예시답안</summary>

{% highlight c %}
#include<stdio.h>
 
int n, cnt;
 
int isprime(int x)      // 소수판별 함수
{
    for(int i = 2; i * i <= x; i++)
        if(x % i == 0)
            return 0;   //소수가 아니면 0
    return 1;           // 소수이면 1
}
 
// 백트래킹 함수(숫자 길이, 숫자)
void back(int len, int num)
{
    if(isprime(num))    // 소수이면
    {
        if(len == n)    // 길이가 n이면, 
        {
            cnt++;  // 개수 증가
            printf("%d\n", num); // 숫자 출력
            return ;
        }
        else    // 길이가 n보다 작은 경우 (1, 3, 7, 9)로 늘리기
        {
            back(len + 1, num * 10 + 1);
            back(len + 1, num * 10 + 3);
            back(len + 1, num * 10 + 7);
            back(len + 1, num * 10 + 9);
        }
    }
}
 
int main()
{
    scanf("%d", &n);
 
    // 시작수는 2, 3, 5, 7
    back(1, 2);
    back(1, 3);
    back(1, 5);
    back(1, 7);
 
    printf("%d", cnt);  // 개수 출력
    return 0;
}
{% endhighlight %}

</details>
