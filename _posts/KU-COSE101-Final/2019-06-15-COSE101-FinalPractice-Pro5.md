---
title: "KU COSE101 2019기말대비 연습문제 5번"
date: 2019-06-15
categories: C_Language
---

| | | | | | | |
|:---------:|:---:|:---:|:---:|:---:|:---:|-----|
| 2016 기출 | [1번](https://detegice.github.io/COSE101-2016Final-Pro1) | [2번](https://detegice.github.io/COSE101-2016Final-Pro2) | [3번](https://detegice.github.io/COSE101-2016Final-Pro3) | [4번](https://detegice.github.io/COSE101-2016Final-Pro4) | [5번](https://detegice.github.io/COSE101-2016Final-Pro5) |     |
| 2017 기출 | [1번](https://detegice.github.io/COSE101-2017Final-Pro1) | [2번](https://detegice.github.io/COSE101-2017Final-Pro2) | [3번](https://detegice.github.io/COSE101-2017Final-Pro3) | [4번](https://detegice.github.io/COSE101-2017Final-Pro4) | [5번](https://detegice.github.io/COSE101-2017Final-Pro5) |     |
| 2018 기출 | [1번](https://detegice.github.io/COSE101-2018Final-Pro1) | [2번](https://detegice.github.io/COSE101-2018Final-Pro2) | [3번](https://detegice.github.io/COSE101-2018Final-Pro3) | [4번](https://detegice.github.io/COSE101-2018Final-Pro4) | [5번](https://detegice.github.io/COSE101-2018Final-Pro5) | [6번](https://detegice.github.io/COSE101-2018Final-Pro6) |
| 2019 연습 | [1번](https://detegice.github.io/COSE101-FinalPractice-Pro1) | [2번](https://detegice.github.io/COSE101-FinalPractice-Pro2) | [3번](https://detegice.github.io/COSE101-FinalPractice-Pro3) | [4번](https://detegice.github.io/COSE101-FinalPractice-Pro4) | **5번** | |

다음과 같은 계산 식이 있다.

```
5 + 10 - 7 * 3 / 2
```

위와 같은 계산식을 Linked List를 이용하여 입력 한 뒤, 계산하시오.
단, 각 숫자는 20 이하이다.

~~~c
struct calc{
  int num;
  char oper;
  struct calc* next;
};
typedef struct calc calc;
typedef calc *calcPtr;
~~~

값을 대입하는 *insert*함수는 다음과 같다.
~~~c
void insert(calcPtr sPtr, int val, char op);
~~~

해를 구하는 *solve*함수는 다음과 같다.
~~~c
int solve(calcPtr sPtr);
~~~

*main*함수의 구조는 다음과 같다.
~~~c
int main()
{
	calcPtr head = (calcPtr)malloc(sizeof(calc));
	head->next = NULL;
	
	char a[100];
	gets(a);
	
	//삽입하는 부분
	
	printf("%d", solve(head));
}
~~~

계산은 int형으로만 진행된다. (ex) 3/2 = 1)

연산자 우선순위는 (곱셈, 나눗셈), (덧셈, 뺄셈)순서이다. (괄호는 없다)

위 계산은 다음과 같이 진행되어야 한다.
```
5 + 10 - 7 * 3 / 2
5 + 10 - 21 / 2
5 + 10 - 10
15 - 10
5
```

***

<details><summary>예시답안</summary>
	
{% highlight c %}
#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct calc{
	int num;
	char oper;
	struct calc* next;
};
typedef struct calc calc;
typedef calc *calcPtr;

int solve(calcPtr sPtr) {
	calcPtr prevPtr = sPtr;
	calcPtr curPtr = sPtr->next;
	while(curPtr != NULL){
		while(curPtr->oper == '*' || curPtr->oper == '/'){
			if(curPtr->oper == '*'){
				curPtr->num *= curPtr->next->num;
			}
			if(curPtr->oper == '/'){
				curPtr->num /= curPtr->next->num;
			}
			curPtr->oper = curPtr->next->oper;
			curPtr->next = curPtr->next->next;	
		}
		prevPtr = curPtr;
		curPtr = curPtr->next;
	}
	
	prevPtr = sPtr;
	curPtr = sPtr->next;
	while(curPtr != NULL){
		while(curPtr->oper == '+' || curPtr->oper == '-'){
			if(curPtr->oper == '+'){
				curPtr->num += curPtr->next->num;
			}
			if(curPtr->oper == '-'){
				curPtr->num -= curPtr->next->num;
			}
			curPtr->oper = curPtr->next->oper;
			curPtr->next = curPtr->next->next;
		}
		
		prevPtr = curPtr;
		curPtr = curPtr->next;
	}
	
	return sPtr->next->num;
}

void insert(calcPtr sPtr, int val, char op)
{
	calcPtr newPtr = (calcPtr)malloc(sizeof(calc));
	newPtr->num = val;
	newPtr->oper = op;
	newPtr->next = NULL;
	
	calcPtr curPtr = sPtr;
	while(curPtr != NULL){
		if(curPtr->next == NULL){
			curPtr->next = newPtr;
			break;
		}
		curPtr = curPtr->next;
	}
}

int main()
{
	calcPtr head = (calcPtr)malloc(sizeof(calc));
	head->next = NULL;
	
	char a[100];
	gets(a);
	
	char* temp = strtok(a, " ");
	int tv;
	char to;
	while(temp!=NULL){
		tv = atoi(temp);
		temp = strtok(NULL," ");
		if(temp==NULL){
			insert(head, tv, 0);
			break;
		}
		to = temp[0];
		temp = strtok(NULL," ");
		insert(head, tv, to);
	}
	
	printf("%d", solve(head));
}
{% endhighlight %}
	
</details>
