---
title: "MyCharacter 클래스"
date: 2019-12-25 10:57:00
categories: java ku
---

# DESCRIPTION
샘플 입력에 대해서 샘플 아웃풋과 같은 결과를 보여주는 MyCharacter를 만들자. The Character class is provided in the Java library. Provide your own implementation for this class. Name the new class MyCharacter.

# INPUT
* Line 1 : 테스트케이스 T (1~1,000)

* Line 2 ~ T+1 : 문자

 

# OUTPUT
* Line 1 ~ 12T : 각 테스트 케이스마다 샘플 출력과 같이 12줄씩 출력

 

# SAMPLE CODE
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            char ch = sc.next().charAt(0);
            MyCharacter c = new MyCharacter(ch);
            System.out.println(c.charValue());
            System.out.println(c.compareTo(new MyCharacter('i')));
            System.out.println(c.equals(new MyCharacter('i')));
            System.out.println(c.isDigit());
            System.out.println(c.isDigit(ch));
            System.out.println(MyCharacter.isDigit(ch));
            System.out.println(MyCharacter.isLetter(ch));
            System.out.println(MyCharacter.isLetterOrDigit(ch));
            System.out.println(MyCharacter.isLowerCase(ch));
            System.out.println(MyCharacter.isUpperCase(ch));
            System.out.println(MyCharacter.toUpperCase(ch));
            System.out.println(MyCharacter.toLowerCase(ch));
        }
    }
}

YOUR_CODE
```

# SAMPLE INPUT
```
3
1
i
Z
```

# SAMPLE OUTPUT
```
1
-56
false
true
true
true
false
true
false
false
1
1
i
0
true
false
false
false
true
true
true
false
I
i
Z
-15
false
false
false
false
true
true
false
true
Z
z
```

<script src="https://gist.github.com/DetegiCE/9aa652aa8fcfc3949c83920785c2f00b.js"></script>
