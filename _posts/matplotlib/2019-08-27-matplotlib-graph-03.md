---
title: "matplotlib을 이용한 그래프 그리기 03 - 그래프에 격자 그리기"
date: 2019-08-27
categories: matplotlib python
---

이번에 우리는 그래프에 격자들을 추가할 것이다.

이 격자들은 그래프에서 x, y축들의 이름을 따라간다.

자세히 설명하자면 우리가 격자가 될 값들을 정해주는 것이다.

우리는 ``pyplot``의 ``xtics``와 ``yticks`` 함수를 사용할 것이다.


왜 ticks인가 했더니

![whatisticks](https://user-images.githubusercontent.com/26007107/63707917-107b8900-c86e-11e9-8bd4-61ad0a667d82.PNG)

점이란 뜻이다.


아무튼 저번에 만든 그래프에 xticks을 한번 추가해보자

저번 코드에서 아래 코드 한줄을 추가해주자

```python
plt.xticks([0,10,20,30,40,50,60,70,80,90,100])
```

![fig4](https://user-images.githubusercontent.com/26007107/63708073-6819f480-c86e-11e9-9b6d-3cdc88920813.png)

원래는 20, 40, 60, 80, 100 이었던 얘들을 10~100까지로 바꿔주었다.

y축도 동일하게 해주자.

```python
plt.yticks([0,10,20,30,40,50,60,70,80,90,100])
```

![fig5](https://user-images.githubusercontent.com/26007107/63708189-b0d1ad80-c86e-11e9-9eff-17796a0ebdd8.png)

하지만 이번에는 바뀌지 않았다.

그 이유는 y축에서 10까지 표시할 이유가 없기 때문이다.

우리의 데이터를 보면 y의 최솟값이 19이기 때문에 굳이 10까지 갈 필요가 없는 것이다.

여기서 우리는 경계값을 추가해준다.

```python
plt.xlim(0,100)
plt.ylim(0,100)
```

x축과 y축의 경계를 설정해주는 함수이다.

이 코드를 적은 뒤 실행해보자.

![fig6](https://user-images.githubusercontent.com/26007107/63708410-5a18a380-c86f-11e9-9de7-57e3876c356d.png)

이제 우리는 격자가 눈에 보이게 하고 싶다.

``grid``함수를 이용하여 격자의 특성을 정해주자.

``grid``함수는 크게 4가지의 인자를 갖는데,

|인자|설명|값|필수|
|:---:|:---|:---|:---:|
|b|격자의 유무|True, False|X|
|which|어느 선을 격자로 표시할 지|major, minor, both|X|
|axis|어느 축을 격자로 표시할 지|x, y, both|X|
|**kwargs|선의 설정|``Line2D Properties``|X|

``which``인자에서 major, minor, both는 주축과 보조축을 의미한다.

일반적으로 축을 만들어보자.

```python
plt.grid(b=True, which='major', axis='both')
```

![fig7](https://user-images.githubusercontent.com/26007107/63708732-373abf00-c870-11e9-9120-0b62b9cb1a19.png)


잘 나왔다

다음번에는 임의의 선과 텍스트를 추가해보자
