---
title: "[C언어] Loop Control1 (Snippet)"
date: 2020-04-17 04:52:11
categories: c_language ku
---

# DESCRIPTION
다음 코드에서 "print a×b times"를 a×b번 출력해보자.

# INPUT
* Line 1: a, b가 공백으로 구분되어 한 줄로 주어진다.

# OUTPUT
* Line 1~a×b: "print a×b times"를 a×b번 출력한다.

# SAMPLE CODE
```c
#include <stdio.h>
void main(){
    int a, b;
    scanf("%d %d",&a,&b);
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            printf("print %d times\n",a*b);
            YOUR_CODE 
            printf("do not print this\n");
            printf("do not print this\n");
        }
    }
}
```

# SAMPLE INPUT
```
3 5
```

# SAMPLE OUTPUT
```
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
print 15 times
```

```c
continue;
```

설마 이걸 모를리가?
