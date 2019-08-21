---
title: "matplotlib을 이용한 그래프 그리기 02 - 그래프에 폰트 적용하기, 한글 출력하기"
date: 2019-08-22
categories: matplotlib python
---

지난 시간에 그래프의 제목, x축, y축에 한글을 넣어보려 했을 때

![fig2](https://user-images.githubusercontent.com/26007107/63453642-11827400-c484-11e9-9d20-2d4410cafa87.png)

위 처럼 네모가 출력됬다.

이는 한글 폰트가 없어서 발생하는 오류로, 한글 폰트를 적용해주면 정상적으로 출력이 된다.

~~~shell
DetegiCE:~$ sudo apt install fonts-nanum*
~~~

모든 나눔 폰트들을 설치해주자.

이 폰트들의 설치 위치는 ```/usr/share/fonts/truetype/nanum```에 설치되어 있다.

우리는 여기서 나눔고딕만 사용할 예정이기 때문에, 나눔고딕(NanumGothic.ttf)만 가져온다.

다른 폰트를 사용할 거라면 다른 폰트를 가져와도 된다.

프로그램을 실행할 경로로 가서 복사해주자

~~~shell
DetegiCE:~$ sudo cp /usr/share/fonts/truetype/nanum/NanumGothic.ttf ./
~~~

사용할 폰트를 가져왔으므로, 이제 이 폰트를 matplotlib에서 사용할 수 있게끔 해주자

본인의 matplotlib의 폰트들이 모여있는 json파일을 찾아가자

나같은 경우에는 ```~/.cache/matplotlib``` 에 있었다.

여기서 fontlist-v300.json을 열어보자.

~~~json
{
  "_version": 300,
  "ttflist": [
    {
      "variant": "normal",
      "name": "cmsy10",
      "size": "scalable",
      "fname": "fonts/ttf/cmsy10.ttf",
      "__class__": "FontEntry",
      "stretch": "normal",
      "style": "normal",
      "weight": 400
    },
    {
      "variant": "normal",
      "name": "STIXGeneral",
      "size": "scalable",
      "fname": "fonts/ttf/STIXGeneralBolIta.ttf",
      "__class__": "FontEntry",
      "stretch": "normal",
      "style": "italic",
      "weight": "bold"
    },
~~~

이렇게 생긴 친구들이 잔뜩 있을건데, 여기에 나눔고딕을 추가해주자

~~~json
    {
      "variant": "normal",
      "name": "NanumGothic",
      "size": "scalable",
      "fname": "fonts/ttf/NanumGothic.ttf",
      "__class__" : "FontEntry",
      "stretch": "normal",
      "style": "normal",
      "weight": "bold"
    },
~~~

여기까지 왔다면, 사실 우리가 나눔고딕 폰트를 우리 경로로 복사해올 필요가 없었다는 것을 알 수 있다.

이제 폰트를 적용해보도록 하자.

~~~shell
DetegiCE:~$ python3
Python 3.5.2 (default, Nov 12 2018, 13:43:14)
[GCC 5.4.0 20160609] on linux
Type "help", "copyright", "credits" or "license" for more information.
>>> import matplotlib.pyplot as plt
>>> plt.rcParams["font.family"] = 'NanumGothic'
>>> plt.title("점수 그래프")
plt.Text(0.5, 1.0, '점수 그래프')
>>> plt.xlabel("퍼센트")
Text(0.5, 0, '퍼센트')
>>> plt.ylabel("점수")
Text(0, 0.5, '점수')
>>> plt.plot([0,1,2,5,10,30,45,60,90,100], [100,97,87,79,67,45,42,30,23,19])
[<matplotlib.lines.Line2D object at 0x7fabd4d2ab70>]
>>> fig = plt.gcf()
>>> fig.savefig('./fig3.png')
~~~

전과 달라진 점은 코드가 한 줄 추가되었다.

```plt.rcParams["font.family"] = 'NanumGothic'``` 인데, 

우리가 사용할 그래프의 폰트 패밀리를 나눔고딕으로 설정한다는 코드이다.

이제 완성된 그래프를 봐보자.

![fig3](https://user-images.githubusercontent.com/26007107/63454955-c1f17780-c486-11e9-9c11-8c9d59e91e8f.png)

잘 나왔다.

다음번에는 그래프에 격자와 추가적인 선들을 추가해보도록 하자.

[이번에 사용한 코드(fig3.py)](https://github.com/DetegiCE/PythonStudy/blob/master/matplotlib/fig3.py)
