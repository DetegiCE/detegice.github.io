---
title: "&lt;string.h&gt; header functions (3) - Comparison"
date: 2019-06-17
categories: c_language string
---

# Compare Functions

## strcmp : Compare two strings

~~~c
int strcmp(const char* str1, const char* str2);
~~~

*str1* : C string to be compared

*str2* : C string to be compared

**Return Value**
- *<0* : The first character that does not match has a lower value in *ptr1* than in *ptr2*
- *0* : The contents of both strings are equal
- *>0* : The first character that does not match has a greater value in *ptr1* than in *ptr2*


~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char key[] = "apple";
  char buffer[80];
  do {
     printf ("Guess my favorite fruit? ");
     fflush (stdout);
     scanf ("%79s",buffer);
  } while (strcmp (key,buffer) != 0);
  puts ("Correct answer!");
  return 0;
}
~~~

```
Guess my favorite fruit? apple
Guess my favorite fruit? orange
Correct answer!
```

- - -

## strncmp : Compare characters of two strings

~~~c
int strncmp(const char* str1, const char* str2, size_t num);
~~~

*str1* : C string to be compared

*str2* : C string to be compared

*num* : Maximum number of characters to compare

**Return Value**
- *<0* : The first character that does not match has a lower value in *str1* than in *str2*
- *0* : The contents of both strings are equal
- *>0* : The first character that does not match has a greater value in *str1* than in *str2*

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str[][5] = { "R2D2" , "C3PO" , "R2A6" };
  int n;
  puts ("Looking for R2 astromech droids...");
  for (n=0 ; n<3 ; n++)
    if (strncmp (str[n],"R2xx",2) == 0)
    {
      printf ("found %s\n",str[n]);
    }
  return 0;
}
~~~

```
Looking for R2 astromech droids...
found R2D2
found R2A6
```

- - -

## strcoll : Compare two strings using locale

~~~c
int strcoll(const char* str1, const char* str2);
~~~

*str1* : C string to be compared

*str2* : C string to be compared

**Return Value**
- *<0* : The first character that does not match has a lower value in *str1* than in *str2*
- *0* : The contents of both strings are equal
- *>0* : The first character that does not match has a greater value in *str1* than in *str2*

***Not Using this Function Usually***

- - -

## strxfrm : Transform string using locale

~~~c
size_t strxfrm(char* destination, const char* source, size_t num);
~~~

*destination* : Pointer to the destination array where the content is to be copieed. 
(It can be NULL pointer if the argument for *num* is zero)

*source* : C string to be transformed

*num* : Maximum number of characters to be copied to *destination*

**Return Value**

The length of the transformed string, not including the terminating null-character.

***Not Using this Function Usually***
