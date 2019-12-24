---
title: "Longest common string (난이도:고급)"
date: 2019-12-25 01:58:00
categories: java ku
---

# DESCRIPTION
N개의 문자열을 입력으로 받아, 모든 문자열이 공통으로 가지는 longest common string을 출력하는 프로그램을 작성하세요.

Write a program that prompts the user to enter N strings and displays the longest common string of the N strings.

# INPUT
* Line 1 : 문자열의개수 N (1~100)

* Line 2 ~ N+1 : 문자열 (공백을 포함하며 길이는 100을 넘지 않는다)

 

# OUTPUT
* Line 1 : N개의 문자열에서 동일하게 나타나는 longest common string을 출력

 

# SAMPLE INPUT
```
4
AABB
AAABC
AABCC
AAAAA
```

# SAMPLE OUTPUT
```
AA
```

import java.util.*;
public class Main {
	public static String lcs_prog(String a, String b) {
		int alen = a.length();
		int blen = b.length();
		
		if(alen<blen) {
			String t = a;
			a=b;
			b=t;
		}
		alen = a.length();
		blen = b.length();
		
		for(int i=blen ; i>0 ; i--) {
			for(int j=0 ; i+j<=blen ; j++) {
				String ss = b.substring(j,i+j);
				if(a.contains(ss)) return ss;
			}
		}
		return "";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		sc.nextLine();
		String a[] = new String[n];
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextLine();
		}
		Arrays.sort(a);
		String t[] = new String[n];
		for(int i=0 ; i<n ; i++) {
			t[i] = a[n-i-1];
		}
		String ans = t[0];
		for(int i=1 ; i<n ; i++) {
			ans = lcs_prog(ans,t[i]);
		}
		System.out.println(ans);
	}
}
