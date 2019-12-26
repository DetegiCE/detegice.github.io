---
title: "비교가능한 GeometricObject"
date: 2019-12-27 03:21:32
categories: java ku
---

# DESCRIPTION
GeometricObject를 비교할 수 있도록 Comparable 인터페이스를 구현하고, 주어진 두 개의 GeometricObject 객체 중 더 큰 객체를 반환하는 정적 메소드 max 를 정의하시오.

(Enable GeometricObject comparable) Modify the GeometricObject class to implement the Comparable interface, and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects. 

# INPUT
Line 1 : 문자열의 개수 N

Line 2 ~ 1+N : radius color weight 순으로 출력

# OUTPUT
Line 1 ~ N : radius 크기 순서대로 정렬

# SAMPLE CODE
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        GeometricObject1[] aCircle1 = new Circle1[N];
        for (int i = 0; i < N; i++) {
            aCircle1[i] = new Circle1(sc.nextDouble(), sc.next(), sc.nextDouble());
        }
        Arrays.sort(aCircle1);
        for (GeometricObject1 c1 : aCircle1) {
            System.out.println(c1);
        }
    }
}

YOUR_CODE
```

# SAMPLE INPUT
```
3
5.1 white 2
3 black 1
9 red 10
```

# SAMPLE OUTPUT
```
radius:3.0, color:black, weight:1.0
radius:5.1, color:white, weight:2.0
radius:9.0, color:red, weight:10.0
```

<script src="https://gist.github.com/DetegiCE/ce1a24aae05712371c5c4a156ec3940f.js"></script>
