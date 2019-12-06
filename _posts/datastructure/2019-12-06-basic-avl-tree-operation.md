---
title: "AVL Tree 01. AVL Tree 설명 및 의사코드"
date: 2019-12-06
categories: data_structure tree
---

# 미완성 포스트

# AVL Tree

기본적인 구조는 BST와 유사 

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
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (4)](https://user-images.githubusercontent.com/26007107/70288686-ba779380-1815-11ea-8de1-5a481a0c6ff4.png)

* Complex right rotation

![syntax_tree (12)](https://user-images.githubusercontent.com/26007107/70288933-98cadc00-1816-11ea-94e9-9000e22c1be5.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (13)](https://user-images.githubusercontent.com/26007107/70288962-a84a2500-1816-11ea-9ce1-ca51cd4527b8.png)

### Right of Right

root의 balance factor가 -2 이므로 left rotation을 시행

* Simple left rotation

![syntax_tree (14)](https://user-images.githubusercontent.com/26007107/70288974-b5671400-1816-11ea-94a4-afd8d7a9da60.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (8)](https://user-images.githubusercontent.com/26007107/70288857-4be70580-1816-11ea-9174-03d9f6b57120.png)

* Complex left rotation

![syntax_tree (15)](https://user-images.githubusercontent.com/26007107/70288996-c44dc680-1816-11ea-960b-8398db13ecfb.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (16)](https://user-images.githubusercontent.com/26007107/70289012-d2034c00-1816-11ea-8fed-83b62b630e13.png)

### Right of Left

* Simple double rotation right

![syntax_tree (17)](https://user-images.githubusercontent.com/26007107/70289104-17277e00-1817-11ea-95d7-a4cb1c6d8145.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (18)](https://user-images.githubusercontent.com/26007107/70289119-20184f80-1817-11ea-8140-47145978530e.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (19)](https://user-images.githubusercontent.com/26007107/70289126-27d7f400-1817-11ea-9db5-fac84639f577.png)

* Complex double rotation right

![syntax_tree (20)](https://user-images.githubusercontent.com/26007107/70289247-89985e00-1817-11ea-8b80-17cc8066e9eb.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (21)](https://user-images.githubusercontent.com/26007107/70289278-9ddc5b00-1817-11ea-81dd-63fc72fc9d20.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (22)](https://user-images.githubusercontent.com/26007107/70289306-b2205800-1817-11ea-857b-515b261f77d5.png)

### Left of Right

* Simple double rotation right

![syntax_tree (23)](https://user-images.githubusercontent.com/26007107/70289652-c0bb3f00-1818-11ea-80f6-7f06221283e5.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (24)](https://user-images.githubusercontent.com/26007107/70289670-cf095b00-1818-11ea-9405-f7203d4df3bf.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (25)](https://user-images.githubusercontent.com/26007107/70289671-d03a8800-1818-11ea-8b7f-0de262bf8282.png)

* Complex double rotation right

![syntax_tree (26)](https://user-images.githubusercontent.com/26007107/70289704-f3fdce00-1818-11ea-9652-08c9e46ec7b1.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (27)](https://user-images.githubusercontent.com/26007107/70289707-f52efb00-1818-11ea-8d18-9cf17bbfbb2a.png)
![arrow](https://user-images.githubusercontent.com/26007107/70289542-67eba680-1818-11ea-9b2e-080d5795fc7e.png)
![syntax_tree (28)](https://user-images.githubusercontent.com/26007107/70289708-f5c79180-1818-11ea-92a1-776d1680434f.png)

## AVL ADT

### 삽입 (insert)

```c
function AVLInsert (root, newData):
  if subtree is empty:
    insert newData as root
    return root
  if newData < root:
    AVLInsert (left subtree, newData)
    if left subtree is taller:
      leftBalance (root)
  else:
    AVLInsert (right subtree, newData)
    if right subtree is taller:
      rightBalance (root)
  return root
```

### 삭제 (Delete)

```c
function AVLDelete (root, dltKey, success):
  if subtree is empty:
    set success to false
    return null
  if dltKey < root:
    set left subtree to AVLDelete (left subtree, dltKey, success)
    if tree is shorter:
      set root to deleteRightBalance (root)
  else if dltKey > root:
    set right subtree to AVLDelete (right subtree, dltKey, success)
    if tree is shorter:
      set root to deleteLeftBalance (root)
  else:
    save root
    if no right subtree:
      set success to true
      return left subtree
    else if no left subtree:
      set success to true
      return right subtree
    else:
      find largest node on left subtree
      save largest key
      copy data in largest to root
      set left subtree to AVLDelete (left subtree, largest key, success)
      if tree is shorter:
        set root to deleteRightBalance (root)
  return root
```

### 삽입 중 균형 (Balance)

```c
function leftBalance (root):
  if left tree is higher:
    rotateRight (root)
  else:
    rotateLeft (left subtree)
    rotateRight (root)
```

```c
functino rightBalance (root):
  if right tree is higher:
    rotateLeft (root)
  else:
    rotateRight (right subtree)
    rotateLeft (root)
```

### 회전 (Rotate)

```c
function rotateRight (root):
  exchange left subtree with right subtree of left subtree
  make left subtree a new root
```

```c
function rotateLeft (root):
  exchange right subtree with left subtree of right subtree
  make right subtree a new root
```

### 삭제 중 균형 (Delete Balance)

```c
function deleteRightBalance (root):
  if tree is not balanced:
    set rightOfRight to right subtree
    if left of rightOfRight is higher:
      set leftOfRight to left subtree of rightOfRight
      set right subtree to rotateRight (rightOfRight)
      set root to rotateLeft (root)
    else:
      set root to rotateLeft (root)
  return root
```
