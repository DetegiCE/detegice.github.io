---
title: "파이썬 크롤링 한글 오류"
date: 2020-01-23
categories: python
---

항상 파이썬으로 크롤링을 할 때 한글을 입력받으면 오류가 발생한다.

이거 처리할 때마다 너무 짜증나는 상황이 발생한다.

먼저 원래 코드를 보자

고려대학교의 나무위키 문서들을 긁어보자

``선언부``

```python
#-*- coding:utf-8 -*-
from urllib.request import urlopen
from bs4 import BeautifulSoup
```

``실행부``

```python
url = "https://namu.wiki/w/고려대학교/"
lsts = ["강의", "교통", "학부", "동아리"]

for strs in lsts:
    url = url + strs
    print(url)
    html = urlopen(url)
    source = html.read()
    html.close()
    
    soup = BeautifulSoup(source, "html5lib", from_encoding='utf-8')
    table = soup.find(class_="wiki-paragraph")
    
    print(table.get_text())
```

``https://namu.wiki/w/고려대학교/강의`` 얘만 출력되고 끝난다.

그리고 가장 ``UnicodeEncodeError: 'ascii' codec can't encode characters in position 7-11: ordinal not in range(128)`` 라는 에러를 뱉고 종료된다.

여기서 우린 quote라는 친구를 사용해준다.

``선언부``

```python
#-*- coding:utf-8 -*-
from urllib.request import urlopen
from urllib.parse import quote
from bs4 import BeautifulSoup
```

한줄이 추가됐다.

이 친구는 유니코드 에러로부터 우리를 구원해줄거다.

``실행부``

```python
url = "https://namu.wiki/w/"
url = url + quote("고려대학교")
url = url + "/"
lsts = [quote("강의"), quote("교통"), quote("학부"), quote("동아리")]

for strs in lsts:
    url = url + strs
    print(url)
    html = urlopen(url)
    source = html.read()
    html.close()
    
    soup = BeautifulSoup(source, "html5lib", from_encoding='utf-8')
    table = soup.find(class_="wiki-paragraph")
    
    print(table.get_text())
```

그리고 모든 한글에다가 ``quote("한글")`` 처리를 해준다.

**무조건 한글에다가만 해야한다**

안그러면 알 수 없는 단어라고 오류가 난다.

그럼 실행해보자.

``https://namu.wiki/w/%EA%B3%A0%EB%A0%A4%EB%8C%80%ED%95%99%EA%B5%90/%EA%B0%95%EC%9D%98`` 얘만 뜨고 끝난다.

왜 오류가 날까?

나무위키는 https이기 때문에 bs4 따위로는 접근할 수 없어서 ``HTTPError: HTTP Error 403: Forbidden`` 로 에러가 난다.

접근 가능성을 보았다.

이제 셀레늄을 이용해서 크롤링을 하면 된다.

