---
title: "Colorable 인터페이스"
date: 2019-12-27 03:22:49
categories: java ku
---

# DESCRIPTION
howToColor() method를 가지고  이름이 Colorable인 interface를 디자인하시오.  Colorable을 구현하고 GeometricObject에 기능을 추가한 Square, Rectangle 클래스를  디자인 하시오. howtocolor method는 howToColor: xxx을 출력 해야 합니다.

(The Colorable interface) Design an interface named Colorable with a void method named howToColor(). Every class of a colorable object must implement the Colorable interface. Design a class named Square that extends GeometricObject and implements Colorable. Implement howToColor to display the message Color all four sides.

# INPUT
* Line 1 : 도형의 개수 N

* Line 2 ~ N : Square or Rectangle / Square이면 한변의 길이 a, Rectangle 이면 두 변의 길이 a, b

# OUTPUT
* Line 1 ~ 4N : 각 테스트 케이스마다 샘플 출력과 같이 4줄씩 출력

- Line 1: 도형 모양

- Line 2 : howToColor: xxx

- Line 3 : area: 넓이

- Line 4 : perimeter: 네 변의 길이 합    

# SAMPLE CODE
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        GeometricObject[] aObject = new GeometricObject[N];
        for (int i = 0; i < N; i++) {
            String shape = sc.next();
            if (shape.equals("Square")) {
                aObject[i] = new Square(sc.nextDouble());
            } else if (shape.equals("Rectangle")) {
                aObject[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
        }
        for (int i = 0; i < aObject.length; i++) {
            if (aObject[i] instanceof Colorable)
                ((Colorable) aObject[i]).howToColor();
            System.out.println("area: " + aObject[i].getArea());
            System.out.println("perimeter: " + aObject[i].getPerimeter());
        }
    }
}

YOUR_CODE
```

# SAMPLE INPUT
```
3
Square 3
Square 5
Rectangle 10 2
```

# SAMPLE OUTPUT
```
Square
howToColor: xxx
area: 9.0
perimeter: 12.0
Square
howToColor: xxx
area: 25.0
perimeter: 20.0
Rectangle
howToColor: xxx
area: 20.0
perimeter: 24.0
```

<script src="https://gist.github.com/DetegiCE/762736be92413294efeaca3f6080e2ba.js"></script>
