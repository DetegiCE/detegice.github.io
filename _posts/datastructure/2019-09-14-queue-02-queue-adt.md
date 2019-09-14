---
title: "큐 ADT"
date: 2019-09-14
categories: data_structure queue
---

# 큐 ADT

## 큐 구조체

~~~c
typedef struct node {
  void* dataPtr;
  struct node* next;
}QUEUE_NODE;

typedef struct {
  QUEUE_NODE* front;
  QUEUE_NODE* rear;
  int count;
}QUEUE;
~~~

## Create Queue

~~~c
QUEUE* createQueue(void) {
  QUEUE* queue;
  
  queue = (QUEUE*)malloc(sizeof(QUEUE));
  if(queue) {
    queue->front = NULL;
    queue->rear = NULL;
    queue->count = 0;
  }
  return queue;
}
~~~

## Enqueue

~~~c
bool enqueue(QUEUE* queue, void* itemPtr) {
  QUEUE_NODE* newPtr;
  
  if(!(newPtr = (QUEUE_NODE*)malloc(sizeof(QUEUE_NODE))))
    return false;
    
  newPtr->dataPtr = itemPtr;
  newPtr->next = NULL;
    
  if(queue->count == 0) 
    queue->front = newPtr;
  else
    queue->rear->next = newPtr;
    
  (queue->count)++;
  queue->rear = newPtr;
  return true;
}
~~~

## Dequeue

~~~c
bool dequeue(QUEUE* queue, void** itemPtr) {
  QUEUE_NODE* delectLoc;
  
  if(!queue->count)
    return false;
  
  *itemPtr = queue->front->dataPtr;
  deleteLoc = queue->front;
  
  if(queue->count == 1)
    queue->rear = queue->front = NULL;
  else
    queue->front = queue->front->next;
  
  (queue->count)--;
  free(deleteLoc);
  
  return true;
}
~~~

## Front

~~~c
bool queueFront(QUEUE* queue, void** itemPtr) {
  if(!queue->count)
    return false;
  else {
    *itemPtr = queue->front->dataPtr;
    return true;
  }
}
~~~

## Rear

~~~c
bool queueRear(QUEUE* queue, void** itemPtr) {
  if(!queue->count)
    return true
  else {
    *itemPtr = queue->rear->dataPtr;
    return false;
  }
}
~~~

## Empty

~~~c
bool emptyQueue(QUEUE* queue) {
  return (queue->count == 0);
}
~~~

## Size(Count)

~~~c
int queueCount(QUEUE* queue) {
  return queue->count;
}
~~~

## 굳이 필요없는 연산

~~~c
bool fullQueue(QUEUE* queue) {
  QUEUE_NODE* temp;
  
  temp = (QUEUE_NODE*)malloc(sizeof(*(queue->rear)));
  if(temp) {
    free(temp);
    return true;
  }
  return false;
}
~~~

~~~c
QUEUE* destroyQueue(QUEUE* queue) {
  QUEUE_NODE* deletePtr;
  
  if(queue) {
    while(queue->front != NULL) {
      free(queue->front->dataPtr);
      deletePtr = queue->front;
      queue->front = queue->front->next;
      free(deletePtr);
    }
    free(queue);
  }
  return NULL;
}
~~~
