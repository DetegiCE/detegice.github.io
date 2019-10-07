---
title: "C printf/fprintf format"
date: 2019-10-03
categories: c_language stdio
---

# C printf/fprintf 포맷

**포함 라이브러리 : ``stdio.h`` (C++ Only : ``cstdio``)**

**Using Library : ``stdio.h`` (C++ Only : ``cstdio``)**

## 포맷 프로토타입 Format Prototype

``
%[flags][width][.precision][length]specifier
``

## flags

| flags | description |
|:---:|:---|
|``-``|주어진 너비에서 왼쪽 정렬. 기본 설정은 오른쪽 정렬 (width 참고)<br>Left justify within the given field width. Right justification is default. |
|``+``|양(+), 음(-) 기호를 붙임. 기본 설정은 음수에만 음(-) 기호<br>Forces to preceed the result with a plus or minus sign even for positive numbers. |
|_(None)_|아무런 flag도 없는 경우 설정한 너비만큼 공백이 채워짐.<br>If no flag is written, blank space is inserted according to width setted.|
|``#``|specifier에서 ``o``, ``x``, ``X``에서 0이 아닌 수에 대해 ``0``, ``0x``, ``0X``으로 시작함.<br>``a``, ``A``, ``e``, ``E``, ``f``, ``F``, ``g``, ``G``와 오는 경우, 뒤에 소수가 없더라도 소수점이 포함<br>Used with ``o``, ``x``, ``X`` specifiers the value is preceeded with ``0``, ``0x``, ``0X`` respectively for values different than zero.<br>Used with ``a``, ``A``, ``e``, ``E``, ``f``, ``F``, ``g``, ``G``, it forces the written output to contain a decimal point even if no more digits follow.|
|``0``|왼쪽에 공백이 있는 경우 0으로 대체함<br>Left-pads the number with zeros instead of spaces when padding is specified.|

## width

| width | description |
|:---:|:---|
|_(Number)_|출력될 너비를 설정. 출력 값이 길이보다 작을 경우 나머지는 공백. 클 경우에는 값 무시.<br>Minimum number of characters to be printed. If the value to be printed is shorter than this number, the result is padded with blank. The value is not truncated even if the result is larger.|

## .precision

| .precision | description |
|:---:|:---|
|``.``_(Number)_|``d``, ``i``, ``o``, ``'u``, ``x``, ``X``인 specifier에서 적힐 숫자의 수. 적히는 수의 길이가 이 수보다 짧은 경우, 0으로 채워짐.<br>``a``, ``A``, ``e``, ``E``, ``f``, ``F``인 specifier에서 소수점에 적힐 수. (기본은 6자리)<br>``g``, ``G``인 specifier에서 유효 숫자의 최대 수.<br>``s`` specifier에서 출력될 문자의 수<br>For specifiers ``d``, ``i``, ``o``, ``'u``, ``x``, ``X``, it specifies the minimum number of digits to be written. If the value to be written is shorter than this number, the result is padded with leading zeros.<br>For specifiers ``a``, ``A``, ``e``, ``E``, ``f``, ``F``, it is the number of digits to be printed after the decimal point (default is 6)<br>For specifiers ``g``, ``G``, it is maximum number of significant digits to be printed.<br>For specifier ``s``, it is the maximum number of characters to be printed.|

## length

| length \ specifiers | **d i** | **u o x X** | **f F e E g G a A** | **c** | **s** | **p** | **n** |
|:---:|:---|:---|:---|:---|:---|:---|:---|
|_(none)_|`int`|`unsigned int`|`double`|`int`|`char*`|`void*`|`int*`|
|`hh`|`signed char`|`unsigned char`|||||`signed char*`|
|`h`|`short int`|`unsigned short int`|||||`short int*`|
|`l`|`long int`|`unsigned long int`||`wint_t`|`wchar_t*`||`long int*`|
|`ll`|`long long int`|`unsigned long long int`|||||`long long int*`|
|`j`|`intmax_t`|`uintmax_t`|||||`intmax_t*`|
|`z`|`size_t`|`size_t`|||||`size_t*`|
|`t`|`ptrdiff_t`|`ptrdiff_t`|||||`ptrdiff_t*`|
|`L`|||`long double`||||

## specifier

specifier | Output
:---:|:---
``d`` or ``i`` | 부호있는 10진수 정수<br>signed decimal integer
``u`` | 부호없는 10진수 정수<br>unsigned decimal integer
``o`` | 부호없는 8진수<br>unsigned octal
``x`` | 부호없는 16진수 정수<br>unsigned hexadecimal integer
``X`` | 부호없는 대문자 16진수 정수<br>unsigned hexadecimal integer in uppercase
``f`` | 10진수 부동 소수점<br>decimal floating point
``F`` | 10진수 부동 소수점 (대문자)<br>decimal floating point (uppercase)
``e`` | 과학적 표기법 (가수/지수)<br>scientific notation (mantissa/exponent)
``E`` | 과학적 표기법 대문자 (가수/지수)<br>scientific notation in uppercase (mantissa/exponent)
``g`` | %e나 %f 중 짧은 표현 사용<br>use the shorter representation between &e and %f
``G`` | %E나 %F 중 짧은 표현 사용<br>use the shorter representation between %E and %F
``a`` | 16진수 부동 소수점<br>hexadecimal floating point
``A`` | 대문자 16진수 부동 소수점<br>hexadecimal floating point in uppercase
``c`` | 문자<br>character
``s`` | 문자열<br>string of characters
``p`` | 포인터 주소<br>pointer address
``n`` | 공백<br>nothing printed.
