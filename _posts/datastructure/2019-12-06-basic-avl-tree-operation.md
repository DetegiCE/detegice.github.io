---
title: "AVL Tree 01. AVL Tree 설명 및 의사코드"
date: 2019-12-06
categories: data_structure tree
---

# 미완성 포스트

# AVL Tree

* 러시아 수학자 G. M. **A**delson-**V**elskii와 E. M. **L**andis 의 이름을 따서 만든 트리 

## AVL 트리를 사용하는 이유

* BST를 사용하는 경우, 최악의 경우 탐색의 시간복잡도가 O(N)까지 갈 수 있음

* AVL의 Balancing을 사용하여 탐색의 시간복잡도를 O(lg N)으로 줄임

* AVL 트리는 각각의 노드들에서 +1, 0, -1의 balance factor를 가짐

## AVL 트리의 삽입 과정

### Left of Left

root의 balance factor가 +2 이므로 right rotation을 시행

* Simple right rotation

![syntax_tree (11)](https://user-images.githubusercontent.com/26007107/70288917-8781cf80-1816-11ea-8f8d-fd6c7b3de40d.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289195-67064500-1817-11ea-83fe-defd9367f640.png)
![syntax_tree (4)](https://user-images.githubusercontent.com/26007107/70288686-ba779380-1815-11ea-8de1-5a481a0c6ff4.png)

* Complex right rotation

![syntax_tree (12)](https://user-images.githubusercontent.com/26007107/70288933-98cadc00-1816-11ea-94e9-9000e22c1be5.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289195-67064500-1817-11ea-83fe-defd9367f640.png)
![syntax_tree (13)](https://user-images.githubusercontent.com/26007107/70288962-a84a2500-1816-11ea-9ce1-ca51cd4527b8.png)

### Right of Right

root의 balance factor가 -2 이므로 left rotation을 시행

* Simple left rotation

![syntax_tree (14)](https://user-images.githubusercontent.com/26007107/70288974-b5671400-1816-11ea-94a4-afd8d7a9da60.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289195-67064500-1817-11ea-83fe-defd9367f640.png)
![syntax_tree (8)](https://user-images.githubusercontent.com/26007107/70288857-4be70580-1816-11ea-9174-03d9f6b57120.png)

* Complex left rotation

![syntax_tree (15)](https://user-images.githubusercontent.com/26007107/70288996-c44dc680-1816-11ea-960b-8398db13ecfb.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289195-67064500-1817-11ea-83fe-defd9367f640.png)
![syntax_tree (16)](https://user-images.githubusercontent.com/26007107/70289012-d2034c00-1816-11ea-8fed-83b62b630e13.png)

### Right of Left

* Simple double rotation right

![syntax_tree (17)](https://user-images.githubusercontent.com/26007107/70289104-17277e00-1817-11ea-95d7-a4cb1c6d8145.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289195-67064500-1817-11ea-83fe-defd9367f640.png)
![syntax_tree (18)](https://user-images.githubusercontent.com/26007107/70289119-20184f80-1817-11ea-8140-47145978530e.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289195-67064500-1817-11ea-83fe-defd9367f640.png)
![syntax_tree (19)](https://user-images.githubusercontent.com/26007107/70289126-27d7f400-1817-11ea-9db5-fac84639f577.png)

* Complex double rotation right

![syntax_tree (20)](https://user-images.githubusercontent.com/26007107/70289247-89985e00-1817-11ea-8b80-17cc8066e9eb.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289195-67064500-1817-11ea-83fe-defd9367f640.png)
![syntax_tree (21)](https://user-images.githubusercontent.com/26007107/70289278-9ddc5b00-1817-11ea-81dd-63fc72fc9d20.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289195-67064500-1817-11ea-83fe-defd9367f640.png)
![syntax_tree (22)](https://user-images.githubusercontent.com/26007107/70289306-b2205800-1817-11ea-857b-515b261f77d5.png)

