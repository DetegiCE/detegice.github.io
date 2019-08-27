---
title: "matplotlib을 이용한 그래프 그리기 EXTRA 01 - 3x3 격자 그리기"
date: 2019-08-27
categories: matplotlib python
---

봇 코딩을 하던 중에 3x3 격자에 색을 칠한 것을 약 80개 가량 그려야 할 일이 생겼다.

![ex0101](https://user-images.githubusercontent.com/26007107/63779189-1aaa8f80-c921-11e9-836a-18df128eeb9f.png)

위 9개의 숫자들의 나열이 각각의 칸이 되고,

숫자마다 색깔이 지정되어 있다.

``pillow``라는 이미지 처리 라이브러리가 있다고는 하지만,

새롭게 뭘 설치하기는 귀찮아서 ``matplotlib``을 그대로 사용하기로 했다.


먼저 대강의 도안을 생각해보자

3x3이므로, 1픽셀의 선과 100픽셀의 칸이면 괜찮다고 생각했다.

|좌표|내용|
|:---:|:---:|
|0, 101, 202, 303|선|
|1-100, 102-201, 203-302|칸|

먼저 pyplot을 import 해주자

```python
import matplotlib.pyplot as plt
```

그리고 우리가 파일을 저장할 경로를 설정해주자.

지금은 테스트용 프로그램이기 때문에 대충 만들어준다

```python
route = './testbuff.png'
```

우리는 그림을 그래프 위에 그리는 것이기 때문에,

우리가 그림을 그릴 캔버스의 크기를 좌표로 제한을 둔다.

```python
plt.xlim(0,303)
plt.ylim(0,303)
```

그리고 우리가 색을 채워줄 문자열을 하나 준비한다.

```python
stri = '010121010'
```

아마 위의 경우에는 십(+)자 모양이 될 것이다.

이제 대강의 준비는 완료됬다.

각 칸마다 ``Rectangle``을 이용해서 색을 채워줄건데,

그 칸의 좌표들을 list에 저장해주자

```python
xst = [1,102,203,1,102,203,1,102,203]
yst = [203,203,203,102,102,102,1,1,1]
```

각 숫자별의 색생들도 list에 저장해주자

```python
clr = ['#AAAAAA','#19FFFF','#FFFFFF']
```

``for``문에 넣을 준비는 끝났다.

```python
for i in range(0,9):
	plt.gca().add_patch(plt.Rectangle((xst[i],yst[i]),100,100,fc=clr[int(stri[i])]))
```

``plt.gca().add_patch()``함수는 add_patch()의 괄호 안의 오브젝트(Patch)를

그래프 상에 그리는 함수이다. [(공식문서 링크)](https://matplotlib.org/3.1.0/api/_as_gen/matplotlib.axes.Axes.add_patch.html)

``Rectangle``함수 안의 인자들은 각각 ``시작좌표, x크기, y크기, **kwargs``인데, 

여기 ``**kwargs``의 ``fc``는 face color를 의미한다.


색을 채웠으니 선을 추가해주자

```python
hehe=[0,101,202,303]
hehl=[1,0.5,0.5,1]
for h in range(0,4):
	plt.axvline(x=hehe[h], color='#000000', linewidth=hehl[h])
	plt.axhline(y=hehe[h], color='#000000', linewidth=hehl[h])
```

``hehe``랑 ``hehl``은 그냥 이름을 막 지은거다.

``for``문 안에서 ``axvline``함수와 ``axhline``함수를 사용했는데,

각각 ``선을 그릴 좌표, **kwargs``이다.

여기 ``**kwargs``의 ``color``는 선의 색상, ``linewidth``는 선의 두께이다.

코드를 보면, 시작과 끝은 1이지만 중간은 0.5로 해놨는데, 

시작과 끝은 선이 반으로 갈라지지만, 중간은 그대로 나오기 때문에 그렇게 해놨다.


마지막으로, 그래프가 아닌 그림이 되게 하기 위해서 margin을 없애줘야한다.

그래프를 그리게 되면, 상하좌우에 빈 공간이 생기는데, 이는 그림을 저장할 때 불편하게 한다.

```python
plt.axis('off')
```

먼저 축을 없애준 뒤,

```python
plt.subplots_adjust(left=0,bottom=0,right=1,top=1,hspace=0,wspace=0)
```

margin들을 없애준다.

그리고 그림을 저장해주면 끝!

```python
fig = plt.gcf()
fig.set_size_inches(1,1)
fig.savefig(route, dpi=303)
```

![testbuff](https://user-images.githubusercontent.com/26007107/63780734-90aff600-c923-11e9-97a1-cb4575156644.png)

잘 나왔다.

이제 나머지 친구들은 바깥에 반복문을 하나 추가해준 뒤, 프로그램을 약간 수정하면 된다.

끝!

[오늘 사용한 코드](https://github.com/DetegiCE/PythonStudy/blob/master/matplotlib/mybuff.py)
