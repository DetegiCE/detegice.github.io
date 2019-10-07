---
title: "&lt;string.h&gt; header functions (2) - Copy and Concatenate"
date: 2019-06-15
categories: c_language string
---

# Copy and Concatenate Funtion

## strcpy : Copy string
~~~c
char* strcpy(char* destination, const char* source);
~~~

*destination* : Pointer to the destination array where the content is to be copied.

*source* : C string to be copied.

**Return Value**
- *destination* is returned

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str1[]="Sample string";
  char str2[40];
  char str3[40];
  strcpy (str2,str1);
  strcpy (str3,"copy successful");
  printf ("str1: %s\nstr2: %s\nstr3: %s\n",str1,str2,str3);
  return 0;
}
~~~
```
str1: Sample string
str2: Sample string
str3: copy successful
```

- - -

## strncpy : Copy characters from string
~~~c
char* strncpy(char* destination, const char* source, size_t num);
~~~

*destination* : Pointer to the destination array where the content is to be copied.

*source* : C string to be copied.

*num* : Maximum number of characters to be copied from *source*.

**Return Value**
- *destination* is returned.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str1[]= "To be or not to be";
  char str2[40];
  char str3[40];

  strncpy ( str2, str1, sizeof(str2) );

  strncpy ( str3, str2, 5 );
  str3[5] = '\0';   /* null character manually added */

  puts (str1);
  puts (str2);
  puts (str3);

  return 0;
}
~~~

```
To be or not to be
To be or not to be
To be
```

- - -

## strcat : Concatenate strings
~~~c
char* strcat(char* destination, const char* source);
~~~

*destination* : Pointer to the destination array, which should contain a C string, 
and be large enough to contian the concatenated resulting string.

*source* : C string to be appended. This should not overlap *destination*.

**Return Value**
- *destination* is returned.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str[80];
  strcpy (str,"these ");
  strcat (str,"strings ");
  strcat (str,"are ");
  strcat (str,"concatenated.");
  puts (str);
  return 0;
}
~~~

```
these strings are concatenated. 
```

- - -

## strncat : Append characters from string
~~~c
char* strncat(char* destination, const char* source, size_t num);
~~~

*destination* : Pointer to the destination array, which should contain a C string, 
and be large enough to contain the concatenated resulting string, 
including the additional null-character.

*source* : C string to be appended.

*num* : Maximum number of characters to be appended.

**Return Value**
- *destination* is returned.

~~~c
#include <stdio.h>
#include <string.h>

int main ()
{
  char str1[20];
  char str2[20];
  strcpy (str1,"To be ");
  strcpy (str2,"or not to be");
  strncat (str1, str2, 6);
  puts (str1);
  return 0;
}
~~~
```
To be or not
```
