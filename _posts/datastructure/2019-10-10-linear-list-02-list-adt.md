---
title: "List 02. 선형 리스트 ADT"
date: 2019-10-10
categories: data_structure linear_list
---

# 선형 리스트 ADT

![list02](https://user-images.githubusercontent.com/26007107/66531048-53a36a00-eb45-11e9-9aef-c6b4887638de.PNG)

## 리스트 구조체

~~~c
typedef struct node {
  void* dataPtr;
  struct node* link;
} NODE;

typedef struct {
  int count;
  NODE* pos;
  NODE* head;
  NODE* rear;
  int (*compare)(void* arg1, void* arg2);
} LIST;
~~~

## function prototype

~~~c
LIST* createList (int (*compare)(void* arg1, void* arg2));
LIST* destroyList (LIST* list);

int addNode (LIST* pList, void* dataInPtr);
bool removeNode (LIST* pList, void* keyPtr, void** dataOutPtr);
bool searchList (LIST* pList, void* pArg, void** pDataOut);
bool retrieveNode (LIST* pList, void* pArg, void** dataOutPtr);
bool traverse (LIST* pList, int fromWhere, void** dataOutPtr);

int listCount (LIST* pList);
bool emptyList (LIST* pList);
bool fullList (LIST* pList);

# internal function
static int _insert (LIST* pList, NODE* pPre, void* dataInPtr);
static void _delete (LIST* pList, NODE* pPre, NODE* pLoc, void** dataOutPtr);
static bool _search (LIST* pList, NODE** pPre, NODE** pLoc, void* pArg);
~~~

## Create List
~~~c
LIST* createList (int (*compare)(void* arg1, void* arg2)) {
  LIST* list;
  
  list = (LIST*)malloc(sizeof(LIST));
  if (list) {
    list -> pos = NULL;
    list -> head = NULL;
    list -> rear = NULL;
    list -> count = 0;
    list -> compare = compare;
  }
  return list;
}
~~~

## Add Node
~~~c
int addNode (LIST* pList, void* dataInPtr) {
  bool found;
  bool success;
  
  NODE* pPre;
  NODE* pLoc;
  
  found = _search(pList, &pPre, &pLoc, dataInPtr);
  if(found)
    return 1;
  
  success = _insert(pList, pPre, dataInPtr);
  if(!success)
    return -1;
    
  return 0;
}
~~~

## internal function

### insert

~~~c
static bool _insert (LIST* pList, NODE* pPre, void* dataInPtr) {
  NODE* pNew;
  
  if(!(pNew = (NODE*)malloc(sizeof(NODE))))
    return false;
    
  pNew->dataPtr = dataInPtr;
  pNew->link = NULL;
  
  if (pPre == NULL) {
    pNew -> link = pList -> head;
    pList -> head = pNew;
    if (pList -> count == 0) 
      pList -> rear = pNew;
  }
  else {
    pNew -> link = pPre -> link;
    pPre -> link = pNew;
    
    if (pNew -> link = NULL)
      pList -> rear = pNew;
  }
  
  (pList -> count)++;
  return true;
}
~~~
