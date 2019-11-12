---
title: "BST 01. 이진 탐색 트리(Binary Search Tree) 설명 및 의사코드"
date: 2019-11-13
categories: data_structure tree
---

# 이진 탐색 트리 (Binary Search Tree)

## 특성

- 좌측 트리의 요소들은 현재 노드보다 작다
- 우측 트리의 요소들은 현재 노드보다 크거나 같다
- 각각의 서브 트리는 BST를 이룬다

![bst01](https://user-images.githubusercontent.com/26007107/68706521-5aede580-05d3-11ea-98e4-3b648ccd5351.PNG)

## BST ADT

### 탐색 (search)

```c
function searchBST(root, target):
  if tree is empty:
    return null
  if target < root:
    return searchBST(left subtree, target)
  else if target > root:
    return searchBST(right subtree, target)
  else
    return root
```

### 삽입 (add/insert)

```c
function addBST(root, newNode):
  if tree is empty:
    set root to newNode
    return newNode
  if newNode < root:
    return addBST(left subtree, newNode)
  else
    return addBST(right subtree, newNode)
```

### 삭제 (delete/remove)

삭제 과정에서는 삭제할 노드에 대하여 4가지의 고려할 점이 필요
- 자식 트리가 없는 경우 : 그냥 삭제
- 우측 서브트리만 있는 겨우 : 우측 서브트리를 삭제한 노드의 위치로 이동
- 좌측 서브트리만 있는 경우 : 좌측 서브트리를 삭제한 노드의 위치로 이동
- 양측 서브트리 모두 있는 경우 : 좌측에서 가장 큰 값 또는 우측에서 가장 작은 값을 삭제한 노드의 위치에 놓고 부수 트리를 알아서 설정

```c
function deleteBST(root, target):
  if tree is empty:
    return false
  if target < root:
    return deleteBST(left subtree, target)
  else if target > root:
    return deleteBST(right subtree, target)
  else
    if no left subtree:
      make right subtree to root
      return true
    else if no right subtree:
      make left subtree to root
      return true
    else:
      save root in deleteNode
      set largest to largestBST(left subtree)
      move data in largest to deleteNode
      return deleteBST(left subtree of deleteNode, key of largest)
```

