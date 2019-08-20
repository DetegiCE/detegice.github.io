---
title: "matplotlib을 이용한 그래프 그리기 01 - matplotlib 설치 및 간단한 그래프 그리기"
date: 2019-08-21
categories: matplotlib python
---

매년 2~3회 정도 그래프를 그리다 보면 내가 직접 엑셀에 값을 입력해서 PPT로 옮기곤 했다.

이 짓이 슬슬 귀찮아지기 시작해서 matplotlib을 이용해서 그래프를 그리기로 했다.

matplotlib을 사용하기 위해서는 numpy도 설치하래서 둘다 설치했다.

~~~python
pip install matplotlib
pip install numpy
~~~

이러면 설치 끝이다.

~~~sh
DetegiCE:~$ python3
Python 3.5.2 (default, Nov 12 2018, 13:43:14)
[GCC 5.4.0 20160609] on linux
Type "help", "copyright", "credits" or "license" for more information.
>>> import matplotlib
>>>
~~~

import matplotlib을 입력했을 때 오류가 뜨지 않으면 완료된거다.

이제 간단한 그래프 하나 그려보자.

그래프를 그리기 위해서는 matplotlib의 pyplot 라이브러리가 필요하다.

~~~python
import matplotlib.pyplot as plt
~~~

간단한 제목과 x축, y축 이름을 붙여주자

~~~python
plt.title("Score graph")
plt.xlabel("Percent")
plt.ylabel("Score")
~~~

테스트 값들을 몇개 넣어주자

~~~python
plt.plot([0,1,2,5,10,30,45,60,90,100], [100,97,87,79,67,45,42,30,23,19])
~~~

원래는 ```plt.show()```를 하면 바로 보이는데,

내가 GUI를 사용하는 것이 아니기 때문에 사진으로 저장해서 보도록 하자

~~~python
fig = plt.gcf()
fig.savefig('./fig1.png')
~~~

입력한 전체 코드는 다음과 같다.

~~~shell
>>> import matplotlib.pyplot as plt
>>> plt.title("Score graph")
Text(0.5, 1.0, 'Score graph')
>>> plt.xlabel("Percent")
Text(0.5, 0, 'Percent')
>>> plt.ylabel("Score")
Text(0, 0.5, 'Score')
>>> plt.plot([0,1,2,5,10,30,45,60,90,100], [100,97,87,79,67,45,42,30,23,19])
[<matplotlib.lines.Line2D object at 0x7f3d27219b00>]
>>> fig = plt.gcf()
>>> fig.savefig('./fig1.png')
~~~

마지막으로 ```exit()```를 통해 나가준 뒤, 현재 경로에 있는 fig1.png를 열어보자

![fig1](https://user-images.githubusercontent.com/26007107/63390528-6f627d80-c3ea-11e9-908f-ebd2399a4150.png)

이제 제목, x,y축 라벨들을 한글로 써보자.

~~~shell
>>> import matplotlib.pyplot as plt
>>> plt.title("점수 그래프")
Text(0.5, 1.0, '점수 그래프')
>>> plt.xlabel("퍼센트")
Text(0.5, 0, '퍼센트')
>>> plt.ylabel("점수")
Text(0, 0.5, '점수')
>>> plt.plot([0,1,2,5,10,30,45,60,90,100], [100,97,87,79,67,45,42,30,23,19])
[<matplotlib.lines.Line2D object at 0x7f45cc8e4b38>]
>>> fig = plt.gcf()
>>> fig.savefig('./fig2.png')
~~~

출력은 잘된척 하지만 fig2.png를 열어보면

![fig2](https://user-images.githubusercontent.com/26007107/63390696-ed268900-c3ea-11e9-8fd0-945a33186d5e.png)

이 상태가 되어있다.

다음번엔 이거를 고쳐보도록하자.

