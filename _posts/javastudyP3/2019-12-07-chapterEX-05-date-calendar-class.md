---
title: "JAVA 42. Date and Calendar Class"
date: 2019-12-07
categories: java
---

# 미완성 포스트

# ``Date`` and ``Calendar`` Class

## ``Date`` Class

``Date`` 클래스를 사용하기 위해서는 ``import java.util.Date;``를 해줘야 함.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
    }
}
```

* 생성자
  * ``Date()`` : 현재의 날짜와 시간을 저장한 객체 생성
  * ``Date(long)`` : 지정한 UNIX 타임(1970.01.01. 00:00:00 부터 msec)을 저장한 객체 생성
