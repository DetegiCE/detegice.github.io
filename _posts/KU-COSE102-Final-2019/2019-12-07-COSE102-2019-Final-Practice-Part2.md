---
title: "KU COSE102 2019기말고사 복습 Part 2"
date: 2019-12-07
categories: java ku
---

# KU COSE102 2019 기말고사 복습 Part 2

{% include mathjax_support.html %}

{% include youtube_support.html id="GBaKmkppD5A" %} 되냐 되냐?

# 상속

[JAVA 14](https://detegice.github.io/chapter5-01-inheritance/#inheritance)

> Object-oriented programming allows you to define new classes from existing classes. This is called inheritance.
>
> Inheritance enables you to define a general class (i.e., a superclass) and later extend it to more specialized classes (i.e., subclasses).

# ``super``

[JAVA 14](https://detegice.github.io/chapter5-01-inheritance/#super)

[JAVA 14 - constructor relation](https://detegice.github.io/chapter5-01-inheritance/#%EC%83%9D%EC%84%B1%EC%9E%90)

> The keyword super refers to the superclass and can be used to invoke the superclass’s methods and constructors.

The ``this`` Reference, introduced the use of the keyword ``this`` to reference the calling object. 

The keyword ``super`` refers to the superclass of the class in which ``super`` appears. 

It can be used in two ways:

* To call a superclass constructor.
* To call a superclass method.

# Override

[JAVA 16](https://detegice.github.io/chapter5-03-method-overriding/#%EB%A9%94%EC%86%8C%EB%93%9C-%EC%98%A4%EB%B2%84%EB%9D%BC%EC%9D%B4%EB%94%A9)

> To override a method, the method must be defined in the subclass using the same signature and the same return type as in its superclass.

# Overloading

[JAVA 11](https://detegice.github.io/chapter4-03-object-array-and-method-overloading/#method-overloading)

[Overload vs Override](https://detegice.github.io/chapter5-03-method-overriding/#%EC%98%A4%EB%B2%84%EB%A1%9C%EB%94%A9-vs-%EC%98%A4%EB%B2%84%EB%9D%BC%EC%9D%B4%EB%94%A9)

> Overloading means to define multiple methods with the same name but different signatures.
>
> Overriding means to provide a new implementation for a method in the subclass.

# ``Object`` Class

[JAVA 19](https://detegice.github.io/chapter6-02-object-class-and-wrapper-class/#properties-of-object-class)

> Every class in Java is descended from the java.lang.Object class.

# ``toString()``

[JAVA 19](https://detegice.github.io/chapter6-02-object-class-and-wrapper-class/#tostring)

```java
public String toString()
```

> Invoking toString() on an object returns a string that describes the object. 
>
> By default, it returns a string consisting of a class name of which the object is an instance, an at sign (@), and the object’s memory address in hexadecimal.

# ``equals()``

[JAVA 19](https://detegice.github.io/chapter6-02-object-class-and-wrapper-class/#object-comparison-and-equals)

> Like the toString() method, the equals(Object) method is another useful method defined in the Object class.

```java
public boolean equals(Object o)
```

**default implementation**

```java
public boolean equals(Object obj) {
  return (this == obj);
}
```

# ``ArrayList``

[JAVA 22](https://detegice.github.io/chapter7-02-arraylist-iterator-hashmap-and-making-generic/#arrayliste)

> An ArrayList object can be used to store a list of objects.

# ``final``

[JAVA 13](https://detegice.github.io/chapter4-05-static-and-final/#final)

# Error & Exception

[JAVA 08](https://detegice.github.io/chapter3-03-exception/#%EC%98%88%EC%99%B8%EC%9D%98-%EB%B0%9C%EC%83%9D)

> Exception handling enables a program to deal with exceptional situations and continue its normal execution.

> Exceptions are thrown from a method. The caller of the method can catch and handle the exception.

> Exceptions are objects, and objects are defined using classes. The root class for exceptions is java.lang.Throwable.

# Custom Exception

[JAVA 38](https://detegice.github.io/chapterEX-01-custom-exception/#custom-exception-1)

# ``try-catch-finally``

[JAVA 08](https://detegice.github.io/chapter3-03-exception/#%EC%98%88%EC%99%B8-%EC%B2%98%EB%A6%AC-%EB%B0%A9%EB%B2%95-try-catch-%EB%AC%B8)

# Abstract Class 추상 클래스

[JAVA 17](https://detegice.github.io/chapter5-04-abstract-class-and-interface/#abstract-class)

> A superclass defines common behavior for related subclasses. An interface can be used to define common behavior for classes (including unrelated classes).

> An abstract class cannot be used to create objects. An abstract class can contain abstract methods, which are implemented in concrete subclasses.

> An abstract method cannot be contained in a nonabstract class. 
>
> If a subclass of an abstract superclass does not implement all the abstract methods, the subclass must be defined as abstract.
>
> In other words, in a nonabstract subclass extended from an abstract class, all the abstract methods must be implemented. 
>
> Also note that abstract methods are nonstatic.

> A class that contains abstract methods must be abstract.
>
> However, it is possible to define an abstract class that doesn’t contain any abstract methods.
>
> In this case, you cannot create instances of the class using the ``new`` operator. 
>
> This class is used as a base class for defining subclasses.

# Interface 인터페이스

[JAVA 17](https://detegice.github.io/chapter5-04-abstract-class-and-interface/#interface)

> An interface is a class-like construct that contains only constants and abstract methods.

> An interface is treated like a special class in Java.
>
> Each interface is compiled into a separate bytecode file, just like a regular class. 
>
> You can use an interface more or less the same way you use an abstract class.

![abcandint](https://user-images.githubusercontent.com/26007107/70375009-a5495480-193c-11ea-98bc-9cacef9a4c0a.PNG)

# ``Calendar`` Class

[JAVA 42](https://detegice.github.io/chapterEX-05-date-calendar-class/#calendar-class)

# ``Comparable`` Interface

> The Comparable interface defines the compareTo method for comparing objects.

```java
package java.lang;

public interface Comparable<E> {
    public int compareTo(E o);
}
```

> The ``compareTo`` method determines the order of this object with the specified object ``o`` and returns a negative integer, zero, or a positive integer if this object is less than, equal to, or greater than o.

> The ``Comparable`` interface is a generic interface. 
>
> The generic type ``E`` is replaced by a concrete type when implementing this interface.

![comparable](https://user-images.githubusercontent.com/26007107/70374926-9615d700-193b-11ea-85cf-3099c0f77c7c.PNG)

> Since all Comparable objects have the compareTo method, the ``java.util.Arrays.sort(Object[])`` method in the Java API uses the compareTo method to compare and sorts the objects in an array, provided that the objects are instances of the Comparable interface.

{% include open_support_none.html title="예시코드" content='<script src="https://gist.github.com/DetegiCE/4a7c551aa2241731215293b2a4c5431e.js"></script>' %}

**출력결과**

```
Width: 3.4 Height: 5.4 Area: 18.36
Width: 1.4 Height: 25.4 Area: 35.559999999999995
Width: 7.4 Height: 35.4 Area: 261.96
Width: 13.24 Height: 55.4 Area: 733.496
```

# ``Cloneable`` Interface

[JAVA 39](https://detegice.github.io/chapterEX-02-cloneable-interface/)

[JAVA 41](https://detegice.github.io/chapterEX-04-cloneable-interface-2/)

> The ``Cloneable`` interface specifies that an object can be cloned.
