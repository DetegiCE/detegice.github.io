---
title: "&lt;string.h&gt; header functions (1) - memory"
date: 2019-06-13
categories: c_language string
---

# Memory Related Function

## memcpy : Copy block of memory
~~~c
void* memcpy(void* destination, const void* source, size_t num);
~~~

*destination* : Pointer to the destination where the content is to be copied, type-casted to a pointer of type *void**.

*source* : Pointer to the source of data to be copied, type-casted to a pointer of type *const void**.

*num* : Number of bytes to copy.

~~~c
#include<stdio.h>
#include<string.h>

struct{
  char name[40];
  int age;
}person, person_copy;

int main() {
  char myname[] = "R.B.Kim";
  memcpy(person.name, myname, strlen(myname)+1);
  person.age = 19;
  
  memcpy(&person_copy, &person, sizeof(person));
  
  printf("person_copy : %s, %d\n", person_copy.name, person_copy.age);
}
~~~
```
person_copy: R.B.Kim, 19
```

- - -

## memmove : Move block of memory
~~~c
void* memmove(void* destination, const void* source, size_t num);
~~~

same parameters as *memcpy*

**Return Value**
- *destination* is returned

~~~c
#include<stdio.h>
#include<string.h>

int main()
{
  char str[] = "Now we know memmove";
  memmove(str+12, str+15, 12);
  puts(str);
}
~~~
```
Now we know move
```

- - -

## memcmp : Compare two blocks of memory
~~~c
int memcmp(const void* ptr1, const void* ptr2, size_t num);
~~~

*ptr1* : Pointer to block of memory.

*ptr2* : Pointer to block of memory.

*num* : Number of bytes to compare.

**Return Value**
- *<0* : the first byte that does not match in both memory blocks has a lower value in *ptr1* than in *ptr2*
- *=0* : the contents of both memory blocks are equal
- *>0* : the first byte that does not match in both meomry blocks has a greater value in *ptr1* than in *ptr2*

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char buffer1[] = "DWgaOtP12df0";
  char buffer2[] = "DWGAOTP12DF0";

  int n;

  n=memcmp ( buffer1, buffer2, sizeof(buffer1) );

  if (n>0) printf ("'%s' is greater than '%s'.\n",buffer1,buffer2);
  else if (n<0) printf ("'%s' is less than '%s'.\n",buffer1,buffer2);
  else printf ("'%s' is the same as '%s'.\n",buffer1,buffer2);

  return 0;
}
~~~
```
'DWgaOtP12df0' is greater than 'DWGAOTP12DF0'.
```

- - -

## memchr : Locate character in block of memory
~~~c
void* memchr (void* ptr, int value, size_t num);
~~~
~~~c++
const void* memchr (const void* ptr, int value, size_t num);
~~~

*ptr* : Pointer to the block of memory where the search is performed.

*value* : Value to be located.

*num* : Number of bytes to be analyzed.

**Return Value**
- A pointer to the first occurrence of *value* in the block of memory pointed by *ptr*.
- If *value* is not found, the function returns a NULL pointer.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char * pch;
  char str[] = "Example string";
  pch = (char*) memchr (str, 'p', strlen(str));
  if (pch!=NULL)
    printf ("'p' found at position %d.\n", pch-str+1);
  else
    printf ("'p' not found.\n");
  return 0;
}
~~~
```
'p' found at position 5.
```

- - -

## memset : Fill block of memory
~~~c
void* memset (void* ptr, int value, size_t num);
~~~

*ptr* : Pointer to the block of memory to fill.

*value* : Value to be set.

*num* : Number of bytes to be set to the *value*.

**Return Value**
- *ptr* is returned.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str[] = "almost every programmer should know memset!";
  memset (str,'-',6);
  puts (str);
  return 0;
}
~~~
```
------ every programmer should know memset!
```
