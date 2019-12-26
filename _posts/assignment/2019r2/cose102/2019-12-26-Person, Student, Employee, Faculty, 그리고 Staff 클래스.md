---
title: "Person, Student, Employee, Faculty, 그리고 Staff 클래스"
date: 2019-12-26 11:40:00
categories: java ku
---

# DESCRIPTION
Person이라는 이름의 클래스와, 이를 상속받는 Student와 Employee라는 이름의 클래스를 만드시오. Employee를 상속받아 Faculty와 Staff라는 이름을 갖는 클래스를 만드시오. 사람(Person)에게는 이름, 주소, 전화 번호, 이메일 주소가 있다. 학생(Student)에게는 학년 상태가 있다.(freshman, sophomore, junior, 혹은 senior). 이 상태를 상수로 지정하시오. 피고용인(Employee)에게는 사무실, 봉급, 채용일자가 있다. 채용일자를 정의하기 위해 연습문제 10.14의 MyDate 클래스를 이용하시오. 교수진(Faculty)에게는 근무 시간, 계급이 있다. 직원(Staff)에게는 칭호(title)가 있다. toString 메소드를 오버라이드하여 클래스 이름과 사람의 이름을 표시하시오. 클래스들의 UML 다이어그램을 그리고 구현하시오. Person, Student, Employee, Faculty, 그리고 Staff를 생성하고, toString() 메소드를 호출하는 테스트 프로그램을 작성하시오.

 

(The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student and Employee. Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and email address. A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. An employee has an office, salary, and date hired. Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. A faculty member has office hours and a rank. A staff member has a title. Override the toString method in each class to display the class name and the person’s name. Draw the UML diagram for the classes and implement them. Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.

# INPUT
* Line 1 : Person의 수 N (1~1,000)

* Line 2 ~ N+1 : 탭으로 구분된 name, address, phoneNumber, email, class, title

 - name, address, phoneNumber, email, class, title는 공백없이 길이가 50을 넘지 않는 문자열

 

# OUTPUT
Sample Output 형식으로 출력

# SAMPLE CODE
```java
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Person> list = new ArrayList<>();
        int N = sc.nextInt();
        sc.nextLine();
        for (int n = 0; n < N; n++) {
            String[] items = sc.nextLine().split("\t");
            Person p = null;
            if (items[4].equals("Student")) {
                Student p1 = new Student();
                if (items[5].equals("FRESHMAN")) p1.status = Student.FRESHMAN;
                else if (items[5].equals("SOPHOMORE")) p1.status = Student.SOPHOMORE;
                else if (items[5].equals("JUNIOR")) p1.status = Student.JUNIOR;
                else if (items[5].equals("SENIOR")) p1.status = Student.SENIOR;
                p = p1;
            } else if (items[4].equals("Employee")) {
                Faculty p1 = new Faculty();
                if (items[5].equals("LECTURER")) p1.rank = Faculty.LECTURER;
                else if (items[5].equals("ASSISTANT_PROFESSOR")) p1.rank = Faculty.ASSISTANT_PROFESSOR;
                else if (items[5].equals("ASSOCIATE_PROFESSOR")) p1.rank = Faculty.ASSOCIATE_PROFESSOR;
                else if (items[5].equals("PROFESSOR")) p1.rank = Faculty.PROFESSOR;
                p = p1;
            } else if (items[4].equals("Staff")) {
                Staff p1 = new Staff();
                p1.title = items[5];
                p = p1;
            }
            p.name = items[0];
            p.address = items[1];
            p.phoneNumber = items[2];
            p.email = items[3];
            list.add(p);
        }
        for (Person p : list) System.out.println(p);
    }
}

YOUR_CODE
```

# SAMPLE INPUT
```
5
Milass	64642	010-2808-2327	Milass24@daum.com	Staff	ACADEMIC_AFFAIRS
Elijah	98778	010-1807-4212	Elijah18@yahoo.com	Student	SOPHOMORE
Connor	19331	010-6685-1955	Connor28@gmail.com	Staff	BUSINESS_ADMINISTRATIVE_AFFAIRS
Evelynss	71931	010-6929-5816	Evelynss2@daum.com	Employee	ASSOCIATE_PROFESSOR
Gracess	47917	010-7317-5923	Gracess26@hotmail.com	Employee	PROFESSOR
```

# SAMPLE OUTPUT
```
Milass is Staff
Elijah is Student
Connor is Staff
Evelynss is Faculty
Gracess is Faculty
```

<script src="https://gist.github.com/DetegiCE/156b5dd2c33f085477b179a4fc901493.js"></script>
