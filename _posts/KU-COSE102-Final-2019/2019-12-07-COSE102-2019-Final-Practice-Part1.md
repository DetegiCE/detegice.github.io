---
title: "KU COSE102 2019기말고사 복습 Part 1"
date: 2019-12-07
categories: java ku
---

# KU COSE102 2019 기말고사 복습 Part 1

{% include mathjax_support.html %}

{% include youtube_support.html id="2HGVQl1c0_c" %} 되냐 되냐?

# 객체지향 프로그래밍 Object Oriented Programming (OOP)

[JAVA 09](https://detegice.github.io/chapter4-01-object-oriented-programming/)

> Object-oriented programming (OOP) involves programming using objects.

# 클래스와 객체 Class and Object

[JAVA 10](https://detegice.github.io/chapter4-02-class-and-object/#%ED%81%B4%EB%9E%98%EC%8A%A4%EC%99%80-%EA%B0%9D%EC%B2%B4)

> A class defines the properties and behaviors for objects.

> An object represents an entity in the real world that can be distinctly identified.
>
> For example, a student, a desk, a circle, a button, and even a loan can all be viewed as objects. 
>
> An object has a unique identity, state, and behavior.

# 생성자 Constructor

[JAVA 10](https://detegice.github.io/chapter4-02-class-and-object/#%EC%83%9D%EC%84%B1%EC%9E%90-constructor)

> A constructor is invoked to create an object using the ``new`` operator.

> A constructor must have the same name as the class itself.
>
> Constructors do not have a return type—not even void.
>
> Constructors are invoked using the new operator when an object is created. Constructors play the role of initializing objects.

# ``Date`` Class

[JAVA 42](https://detegice.github.io/chapterEX-05-date-calendar-class/#date-class)

# ``Random`` Class

[JAVA 20](https://detegice.github.io/chapter6-03-string-and-math-class/#math-class)

```java
Random r = new Random();
r.nextInt(); //random integer
r.nextInt(int n); //random integer between 0~n, excluding n
r.nextLong(); //random long
r.nextDouble(); //random double between 0.0~1.0, excluding 1.0
r.nextFloat(); //random float between 0.0F~1.0F, excluding 1.0F
r.nextBoolean(); //random boolean value
```

# ``static``

[JAVA 13](https://detegice.github.io/chapter4-05-static-and-final/#static-member)

> A static variable is shared by all objects of the class.
>
> A static method cannot access instance members of the class.

# Access Modifier (Visibility Modifier)

[JAVA 12](Visibility modifiers can be used to specify the visibility of a class and its members.)

> Visibility modifiers can be used to specify the visibility of a class and its members.

멤버에 접근하는 클래스 | private | default | protected | public
:---:|:---:|:---:|:---:|:---:
같은 패키지의 클래스 | X | O | O | O
다른 패키지의 클래스 | X | X | X | O
접근 가능 영역 | 클래스 내 | 동일 패키지 내 | 동일 패키지와 자식 클래스 | 모든 클래스

# Array of Objects

[JAVA 11](https://detegice.github.io/chapter4-03-object-array-and-method-overloading/#object-array)

# ``this``

[JAVA 10](https://detegice.github.io/chapter4-02-class-and-object/#this-%EB%A0%88%ED%8D%BC%EB%9F%B0%EC%8A%A4)

> The keyword this refers to the object itself.
>
> It can also be used inside a constructor to invoke another constructor of the same class.

# Wrapper Class

[JAVA 19](https://detegice.github.io/chapter6-02-object-class-and-wrapper-class/#wrapper-class)

> A primitive type value is not an object, but it can be wrapped in an object using a wrapper class in the Java API.

> A primitive type value can be automatically converted to an object using a wrapper class, and vice versa, depending on the context.

# ``BigInteger`` Class

> The BigInteger and BigDecimal classes can be used to represent integers or decimal numbers of any size and precision.

``import java.math.*;`` 필요

```java
import java.math.*;

public class Main {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("12313434247874365645");
        BigInteger b = new BigInteger("4641351341341141");

        BigInteger sum = a.add(b);
        BigInteger sub = a.subtract(b);
        BigInteger mul = a.multiply(b);
        BigInteger div = a.divide(b);
        BigInteger rem = a.remainder(b);
        BigInteger one = BigInteger.ONE;

        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
        System.out.println(one);
    }
}
```

**출력결과**

```
12313434247874365645
4641351341341141
12318075599215706786
12308792896533024504
57150974562887630658699188915500945
2652
4570490637659713
1
```

# ``String`` Class

[JAVA 20](https://detegice.github.io/chapter6-03-string-and-math-class/#string-class)

> A String object is immutable: Its content cannot be changed once the string is created.
