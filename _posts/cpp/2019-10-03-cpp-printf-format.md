---
title: "C printf/fprintf format"
date: 2019-10-03
categories: c-language file
---

# 미완성 포스트 


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


