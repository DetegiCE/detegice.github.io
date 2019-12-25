---
title: "기하: MyRectangle2D 클래스"
date: 2019-12-25 10:51:00
categories: java ku
---

# DESCRIPTION
 다음 내용을 포함하는 MyRectangle2D를 만들어 보자. 

* 직사각형의 중심의 좌표를 나타내는 두 double형의 x와 y필드를 설정하고 반환하는 method를 가진다. (직사각형의 변은 x와 y축에 평행하다고 가정한다.)
* 너비와 높이를 설정하고 반환하는 method를 가진다.
* 직사각형의 x, y를 각각 (0, 0), 너비와 높이를 각각 1로 만드는 무(無)인자(no-arg)생성자를 가진다.
* x, y, 너비, 높이를 설정하는 생성자를 가진다.
* 사각형의 넓이를 반환하는 getArea() 메소드를 가진다.
* 사각형의 둘레를 반환하는 getPerimeter() 메소드를 가진다.
* 특정한 점(x, y)가 이 직사각형 안에 있으면 true를 반환하는 contains(double x, double y) 메소드를 가진다. (Figure 10.24a)
* 특정한 직사각형이 이 직사각형 안에 있으면 true를 반환하는 contains(MyRectangle2D r) 메소드를 가진다. (Figure 10.24b)
* 특정한 직사각형이 이 직사각형과 겹치면 true를 반환하는 overlaps(MyRectangle2D r) 메소드를 가진다. (Figure 10.24c)

Define the MyRectangle2D class that contains:

* Two double data fields named x and y that specify the center of the rectangle with getter and setter methods. (Assume that the rectangle sides are parallel to x- or y- axes.) 
* The data fields width and height with getter and setter methods.
* A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and 1 for both width and height.
* A constructor that creates a rectangle with the specified x, y, width, and height.
* A method getArea() that returns the area of the rectangle.
* A method getPerimeter() that returns the perimeter of the rectangle.
* A method contains(double x, double y) that returns true if the specified point (x, y) is inside this rectangle (see Figure 10.24a).
* A method contains(MyRectangle2D r) that returns true if the specified rectangle is inside this rectangle (see Figure 10.24b). 
* A method overlaps(MyRectangle2D r) that returns true if the specified rectangle overlaps with this rectangle (see Figure 10.24c).
 



여러분이 작성한 코드는 아래 샘플코드의 YOUR_CODE 부분에 들어가 컴파일 됩니다.

# INPUT
* Line 1 : 테스트케이스 T (1~1,000)

* Line 2 ~ T+1 : x1 y1 w1 h1 x2 y2 w2 h2 x3 y3 (공백으로 구분된 10개의 실수)

- 실수의 범위는 -100 ~ 100

- 사각형의 width와 height의 범위는 1~100 

- x1 y1 w1 h1는 사각형 r1의 정점

- x2 y2 w2 h2는 사각형 r2의 정점

- x3 y3는 정점 p

# OUTPUT
* Line 1 ~ 4T : 각 테스트 케이스마다 샘플 출력과 같이 4줄씩 출력

 - Line 3 : r1이 p를 포함하면 true 아니라면 false 

 - Line 4 : r1이 r2를 포함하면 contain, r1와 r2가 겹치면 overlaps, 만나지 않는다면 no overlap을 출력

# SAMPLE CODE
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            x4 = sc.nextDouble();
            y4 = sc.nextDouble();
            x5 = sc.nextDouble();
            y5 = sc.nextDouble();

            MyRectangle2D r1 = new MyRectangle2D(x1, y1, x2, y2);
            MyRectangle2D r2 = new MyRectangle2D(x3, y3, x4, y4);

            System.out.printf("Area is %.1f\n", r1.getArea());
            System.out.printf("Perimeter is %.1f\n", r1.getPerimeter());
            System.out.println(r1.contains(x5, y5));
            if (r1.contains(r2)) {
                System.out.println("contain");
            } else if (r1.overlaps(r2)) {
                System.out.println("overlaps");
            } else {
                System.out.println("no overlap");
            }
        }
    }
}

YOUR_CODE
```

# SAMPLE INPUT
```
3
0 0 3 3 0 0 1 1 3 0
0 0 2 2 2 0 2 2 1 0
0 0 2 2 2 2 2 2 1 0
```

# SAMPLE OUTPUT
```
Area is 9.0
Perimeter is 12.0
false
contain
Area is 4.0
Perimeter is 8.0
true
overlaps
Area is 4.0
Perimeter is 8.0
true
overlaps
```

<script src="https://gist.github.com/DetegiCE/f84ab78fac28801f3eb5b102cf145e89.js"></script>
