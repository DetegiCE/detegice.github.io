---
title: "&lt;string.h&gt; header functions (4) - Search"
date: 2019-06-20
categories: c_language string
---

# Search Functions

## strchr : Locate first occurrence of character in string

~~~c
const char* strchr(const char* str, int character); //for C++
      char* strchr(      char* str, int character); //for C
~~~

*str* : C string

*character* : Character to be located. It is passed as its *int* promotion, 
but it is internally converted back to *char* for the comparison.

**Return Value**

A pointer to the first occurrence of *character* in *str*.
If the *character* is not found, the function returns a null pointer.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str[] = "This is a sample string";
  char * pch;
  printf ("Looking for the 's' character in \"%s\"...\n",str);
  pch=strchr(str,'s');
  while (pch!=NULL)
  {
    printf ("found at %d\n",pch-str+1);
    pch=strchr(pch+1,'s');
  }
  return 0;
}
~~~

```
Looking for the 's' character in "This is a sample string"...
found at 4
found at 7
found at 11
found at 18
```

- - -

## strcspn : Get span until character in string

~~~c
size_t strcspn(const char* str1, const char* str2);
~~~

*str1* : C string to be scanned.

*str2* : C string containing the charcters to match.

**Return Value**

The length of the initial part of *str1* **not** containing any of the characters that are part of *str2*.

This is the length of *str1* if none of the characters in *str2* are found in *str1*.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str[] = "fcba73";
  char keys[] = "1234567890";
  int i;
  i = strcspn (str,keys);
  printf ("The first number in str is at position %d.\n",i+1);
  return 0;
}
~~~

```
The first number in str is at position 5
```

- - -

## strpbrk : Locate characters in string

~~~c
const char* strpbrk(const char* str1, const char* str2); //for C++
      char* strpbrk(      char* str1, const char* str2); //for C
~~~

*str1* : C string to be scanned.

*str2* : C string containing the characters to match.

**Return Value**

A pointer to the first occurrence in *str1* of any of characters that are part of *str2*, 
or a null pointer if none of the characters of *str2* is found in *str1* before the terminating null-character.

If none of the characters of *str2* is found in *str1*, a null pointer is returned.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str[] = "This is a sample string";
  char key[] = "aeiou";
  char * pch;
  printf ("Vowels in '%s': ",str);
  pch = strpbrk (str, key);
  while (pch != NULL)
  {
    printf ("%c " , *pch);
    pch = strpbrk (pch+1,key);
  }
  printf ("\n");
  return 0;
}
~~~

```
Vowels in 'This is a sample string': i i a a e i
```

- - -

## strrchr : Locate last occurrence of character in string

~~~c
const char* strrchr(const char* str, int character); //for C++
      char* strrchr(      char* str, int character); //for C
~~~

*str* : C string

*character* : Character to be located. 
It is passed as its *int* promotion, but it is internally converted back to *char*.

**Return Value**

A pointer to the last occurrence of *character* in *str*.

If the *character* is not found, the function returns a null pointer.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str[] = "This is a sample string";
  char * pch;
  pch=strrchr(str,'s');
  printf ("Last occurence of 's' found at %d \n",pch-str+1);
  return 0;
}
~~~

```
Last occurrence of 's' found at 18
```

- - -

## strspn : Get span of character set in string

~~~c
size_t strspn(const char* str1, const char* str2);
~~~

*str1* : C string to be scanned

*str2* : C string containing the characters to match

**Return Value**

The length of the initial portion of *str1* containing only characters that appear in *str2*.

Therefore, if all of the charactres in *str1* are in *str2*, the function returns the length of the entire *str1* string,
and if the first character in *str1* is not in *str2*, the function returns zero.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  int i;
  char strtext[] = "129th";
  char cset[] = "1234567890";

  i = strspn (strtext,cset);
  printf ("The initial number has %d digits.\n",i);
  return 0;
}
~~~

```
The initial number has 3 digits.
```

- - -

## strstr : Locate substring

~~~c
const char* strstr(const char* str1, const char* str2); //for C++
      char* strstr(      char* str1, const char* str2); //for C
~~~

*str1* : C string to be scanned.

*str2* : C string containing the sequence of characters to match.

**Return Value**

A pointer to the first occurence in *str1* of the entire sequence of characters specified in *str2*,
or a null pointer if the sequence is not present in *str1*.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str[] ="This is a simple string";
  char * pch;
  pch = strstr (str,"simple");
  strncpy (pch,"sample",6);
  puts (str);
  return 0;
}
~~~

```
This is a sample string
```

- - -

## strtok : Split string into tokens

~~~c
char* strtok(char* str, const char* delimiters);
~~~

*str* : C string to truncate.

*delimiters* : C string containing the delimiter characters.

**Return Value**

If a token is found, a pointer to the beginning of the token.
Otherwise, a null pointer.

A null pointer is always returned when the end of the string is reached in the string being scanned.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str[] ="- This, a sample string.";
  char * pch;
  printf ("Splitting string \"%s\" into tokens:\n",str);
  pch = strtok (str," ,.-");
  while (pch != NULL)
  {
    printf ("%s\n",pch);
    pch = strtok (NULL, " ,.-");
  }
  return 0;
}
~~~

```
Splitting string "- This, a sample string." into tokens:
This
a
sample
string
```
