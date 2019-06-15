---
title: "KU COSE101 2019기말고사 연습문제 3번"
date: 2019-06-15
categories: C_Language
---

> 입력예시에 등장하는 이름은 실존하는 인물과는 연관이 없습니다.

학생들의 수 n과, n명의 이름(성, 이름), 학번, 컴퓨터프로그래밍 점수와 전산수학 점수가 *input.txt* 파일로 주어진다.
컴퓨터프로그래밍의 점수가 높은 순으로 정렬하되, 컴퓨터프로그래밍의 점수가 동일하면 전산수학 점수가 높은 순으로 정렬하시오.
정렬 후, 5등한 학생의 이름(성을 제외한 이름)을 *output.txt*에 출력하시오.

구조체는 다음과 같이 주어진다.
~~~c
struct student{
  char name[20];
  int stdnum; //학번
  int cpGrade; //컴프성적
  int laGrade; //전수성적
};
~~~

input.txt의 예시는 다음과 같다.
```
5
Kim Ryubin 127 100 100
Lee Sangwook 94 60 30
Jung Muyeong 112 60 80
Jung Woosung 110 80 90
Hong Seungjae 4 70 50
```

***

<details><summary>예시답안</summary>

{% highlight c %}
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct student{
	char name[20]; //성
	int stdnum; //학번
	int cpGrade; //컴프성적
	int laGrade; //전수성적
};

int main()
{
	int n,i,j;
	struct student st[10], tmp;
	char a[300];
	char b[10][100];
	FILE *fp = fopen("input.txt","r"); 
	FILE *out = fopen("output.txt","w"); 
	
	fread(a,1,300,fp);
	n = atoi(strtok(a,"\n"));
	for(i=0 ; i<n ; i++){
		strcpy(b[i],strtok(NULL,"\n"));
	}
	
	for(i=0 ; i<n ; i++){
		strcpy(st[i].name,strtok(b[i]," "));
		strcat(st[i].name," ");
		strcat(st[i].name,strtok(NULL," "));
		st[i].stdnum = atoi(strtok(NULL," "));
		st[i].cpGrade = atoi(strtok(NULL," "));
		st[i].laGrade = atoi(strtok(NULL," "));
	}
	
	for(i=0 ; i<n-1 ; i++){
		for(j=0 ; j<n-i-1 ; j++){
			if(st[j].cpGrade < st[j+1].cpGrade){
				tmp = st[j];
				st[j] = st[j+1];
				st[j+1] = tmp;
			}
			if(st[j].cpGrade == st[j+1].cpGrade){
				if(st[j].laGrade < st[j+1].laGrade){
					tmp = st[j];
					st[j] = st[j+1];
					st[j+1] = tmp;
				}
			}
		}
	}

	char* names = st[4].name;
	strtok(names," ");
	fprintf(out,"%s",strtok(NULL," "));
}
{% endhighlight %}

</details>
