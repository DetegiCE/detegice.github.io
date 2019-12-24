---
title: "Rectangle 클래스"
date: 2019-12-25 02:52:00
categories: java ku
---

# DESCRIPTION
다음 특징을 가지는 Rectangle 클래스를 만들기 바랍니다.

* double 형의 width와 height를 필드로 가진다.
* 인자가 없는 생성자와 width와 height를 인자로 가지는 생성자를 가진다.
* getArea() 메소드는 사각형의 넓이를 리턴한다.
* getPerimeter() 메소드는 사각형의 둘레를 리턴한다. 

여러분이 작성한 코드는 아래 샘플코드의 YOUR_CODE 부분에 들어가 컴파일 됩니다. 



(The Rectangle class) Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle. The class contains:

* Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
* A no-arg constructor that creates a default rectangle.
* A constructor that creates a rectangle with the specified width and height.
* A method named getArea() that returns the area of this rectangle.
* A method named getPerimeter() that returns the perimeter. 

Your code is compiled into the YOUR_CODE part of the sample code below


# INPUT
* Line 1 : 사각형의 너비 (1~1,000 범위의 실수)

* Line 2 : 사각형의 높이 (1~1,000 범위의 실수)


# OUTPUT
* Line 1 : 사각형의 넓이 (소수점 둘째 자리로 반올림)

* Line 2 : 사각형의 둘레 (소수점 둘째 자리로 반올림)


# SAMPLE CODE
```java
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double w1, h1;
        w1 = sc.nextDouble();
        h1 = sc.nextDouble();

        Rectangle r1 = new Rectangle();
        r1.width = w1;
        r1.height = h1;
        System.out.printf("%.2f\n", r1.getArea());

        Rectangle r2 = new Rectangle(w1, h1);
        System.out.printf("%.2f\n", r2.getPerimeter());
    }
}

YOUR_CODE
```

# SAMPLE INPUT
```
2
3
```

# SAMPLE OUTPUT
```
6.00
10.00
```

<script src="https://gist.github.com/DetegiCE/02c7de290f4a364dc8743be2427ca5af.js"></script>
