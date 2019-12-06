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

### Left or Left

* Simple right rotation

![syntax_tree (3)](https://user-images.githubusercontent.com/26007107/70288681-ae8bd180-1815-11ea-87ab-9cc3b4e9403a.png)
![syntax_tree (4)](https://user-images.githubusercontent.com/26007107/70288686-ba779380-1815-11ea-8de1-5a481a0c6ff4.png)

* Complex right rotation

![syntax_tree (5)](https://user-images.githubusercontent.com/26007107/70288737-e8f56e80-1815-11ea-80c7-a959f0fe26aa.png)
![syntax_tree (6)](https://user-images.githubusercontent.com/26007107/70288757-fa3e7b00-1815-11ea-9ef9-38c0e03a628c.png)
