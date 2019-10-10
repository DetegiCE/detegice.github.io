---
title: "List 01. 선형 리스트 기본 연산 및 의사 코드"
date: 2019-10-10
categories: data_structure linear_list
---

# 선형 리스트 기본 연산 및 의사 코드

## 선형 리스트

* 선형 목록
* 리스트 기본 연산

> 삽입(insertion) 삭제(deletion) 검색(retrieval) 순회(traversal)

### insertion

* ordered list의 경우, 크기에 따라서 순서가 정해짐
* random list(chronological list)의 경우, 삽입된 순서대로 값이 들어감

### deletion

* 원소를 삭제하는 과정

### retrieval

* 데이터의 위치를 반환

### traversal

* 리스트의 순회

![list01](https://user-images.githubusercontent.com/26007107/66530030-f0afd400-eb40-11e9-8a20-16e30d002891.PNG)

## implementation - structs

### list 구조체
* list 원소의 개수
* list의 첫번째 노드의 위치

### node 구조체
* list의 원소
* list의 다음 노드

~~~c
list
  count
  head
end list

node
  data
  link
end node
~~~

## 선형 리스트 연산 구현

### createList

~~~c
createList(list):
  allocate(list)
  set list head to null
  set list count to 0
end createList
~~~

### insertion

* 삽입의 기본 과정
> 1. 새 노드에 메모리를 할당 후 노드에 데이터를 넣음
> 1. 다음 노드에게 링크
> 1. 전 노드의 링크를 새 노드로 설정

1. 빈 리스트에 값을 넣는 경우

  ~~~c
  set pNew link to list head
  set list head to pNew
  ~~~
  
1. 맨 앞에 넣는 경우

  ~~~c
  set pNew link to list head
  set list head to pNew
  ~~~
  
1. 중간에 넣는 경우

  ~~~c
  set pNew link to pPre link
  set pPre link to pNew
  ~~~
  
1. 마지막에 넣는 경우

  ~~~c
  set pNew link to null pointer
  set pPre link to pNew
  ~~~

전체
~~~c
insertNode(list, pPre, dataIn):
  allocate(pNew)
  set pNEw data to dataIn
  if(pPre null):
    set pNew link to list head
    set list head to pNew
  else:
    set pNew link to pPre link
    set pPre link to pNew
  end if
  return true
end insertNode
~~~

### deletion

1. 맨 앞 값을 지우는 경우

  ~~~c
  set list head to pLoc link
  recycle(pLoc)
  ~~~
  
1. 그 외의 경우
  
  ~~~c
  set pPre link to pLoc link
  recycle(pLoc)
  
전체

~~~c
deleteNode(list, pPre, pLoc, dataOut):
  move pLoc data to dataOut
  if (pPre null):
    set list head to pLoc link
  else:
    set pPre link to pLoc link
  end if
  recycle(pLoc)
end deleteNode
~~~

### search

Ordered list의 경우

조건 | pPre | pLoc | return
:---:|:---|:---|:---:
target < first node | null | first node | false
target = first node | null | first node | true
first < target < last | largest node < target | first node > target | false
target = middle node | predecessor | equal node | true
target = last node | predecessor of last | last node | true
target > last node | last node | null | false

~~~c
searchList(list, pPre, pLoc, target):
  set pPre to null
  set pLoc to list head
  loop (pLoc not null AND target > pLoc key):
    set pPre to pLoc
    set pLoc to pLoc link
  end loop
  
  if(pLoc null):
    set found to false
  else:
    if (target equal pLoc key):
      set found to true
    else:
      set found to false
    end if
  end if
  return found
end searchList
~~~

### retrieval

~~~c
retrieveNode(list, key, dataOut):
  set found to searchList(list, pPre, pLoc, key)
  if (found):
    move pLoc data to dataOut
  end if
  return found
end retrieveNode
~~~

### empty

~~~c
emptyList(list):
  if (list count equal 0):
    return true
  else:
    return false
end emptyList
~~~

### full

메모리가 다 찼는지 확인

~~~c
fullList(list):
  if (memory full):
    return true
  else:
    return false
  end if
  return true
~~~

### count

~~~c
listCount(list):
  return (list count)
end listCount
~~~

### traversal

~~~c
getNext(list, fromWhere, dataOut):
  if(empty list):
    return false
  if(fromWhere is beginning):
    set list pos to list head
    move current list data to dataOut
    return true
  else:
    if (end of list):
      return false
    else:
      set list pos to next node
      move current list data to dataOut
      return true
    end if
  end if
end getNext
~~~

### destroy

~~~c
destroyList(pList):
  loop (not at end of list):
    set list head to successor node
    release memory to heap
  end loop
  set list pos to null
  set list count to 0
end destroyList
~~~
