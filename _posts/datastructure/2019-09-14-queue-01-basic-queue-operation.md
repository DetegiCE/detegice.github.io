---
title: "Queue 01. 큐 기본 연산 및 의사 코드 구현"
date: 2019-09-14
categories: data_structure queue
---

# 큐 기본 연산 및 의사 코드

## 큐(Queue)
* First In First Out(FIFO) 구조를 가지는 자료구조
* 한쪽으로 삽입하고, 한쪽으로 제거
* 큐 기본 연산
  > Push(Enqueue) Pop(Dequeue) Front Back(Rear) Size Empty
  
### Push(Enqueue)
* 삽입 연산
* 값을 큐의 rear에 넣음
* 삽입을 할 공간이 없다면 overflow 상태가 됨

### Pop(Dequeue)
* 제거 연산
* 값을 큐의 front에서 뺌
* 뺄 값이 없다면 underflow 상태가 됨

### Front
* 큐의 맨 앞 값을 리턴 함
* 리턴할 값이 없다면 underflow 상태가 됨

### Back(Rear)
* 큐의 맨 뒷 값을 리턴 함
* 리턴할 값이 없다면 underflow 상태가 됨

![queue01](https://user-images.githubusercontent.com/26007107/64901986-bdf9f380-d6da-11e9-8201-0223888cc96d.PNG)

## Linked List로의 구현 - 필요한 구조체
* Stack과 동일하게 두 가지의 구조체가 필요

### queue head 구조체
* queue의 기본 정보를 담고 있는 구조체
* front, rear의 포인터와 노드의 개수를 가짐

### node 구조체
* 값과 다음 링크의 포인터를 가짐

~~~c
queueHead
  front
  count
  rear
end queueHead

node
  data
  link
end node
~~~

## 큐 연산 구현

### Create Queue

~~~c
createQueue:
  allocate queue head
  set queue front to null
  set queue rear to null
  set queue count to 0
  return queue head
~~~

### Enqueue

~~~c
enqueue(queue,dataIn):
  if queue full:
    return false
  allocate new node
  move dataIn to new node data
  set new node next to null pointer
  if queue empty:
    set queue front to address of new data
  else:
    set next pointer of rear node to address of new node
  set queue rear to address of new node
  increment queue count
  return true
~~~

### Dequeue

~~~c
dequeue(queue,item):
  if queue empty:
    return false
  move front data to item
  if only 1 node in queue
    set queue rear to null
  set queue front to queue front next
  decrement queue count
  return true
~~~

### Front

~~~c
queueFront(queue,dataOut):
  if queue empty:
    return false
  move data at front of queue to dataOut
  return true
~~~

### Empty

~~~c
emptyQueue(queue):
  if queue count equal 0:
    return true
  else
    return fale
~~~

### Size(Count)

~~~c
queueCount(queue):
  return queue count
~~~

### 굳이 알 필요 없는 연산

* Full Queue : 큐에 할당할 메모리를 직접 지정해 주지 않는 한, 거의 사용하지 않음

~~~c
fullQueue(queue):
  if memory not available:
    return true
  else:
    return false
~~~

* Destroy Queue : while문으로 큐가 빌 때까지 dequeue하면 됨

~~~c
destroyQueue(queue):
  if queue not empty:
    loop queue not empty:
      delete front node
  delete head structure
~~~

