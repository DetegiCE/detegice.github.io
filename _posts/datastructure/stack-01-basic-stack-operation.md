---
title: "Stack 01. 스택 기본 연산 및 의사 코드 구현"
date: 2019-09-09
categories: data_structure stack
---

# 스택 기본 연산 및 의사 코드

## 스택(Stack)

- Last In First Out(LIFO) 구조를 가지는 자료구조
- 데이터가 한 쪽 끝으로만 추가/제거가 가능
- 스택 기본 연산
  > Push Pop Top Size Empty

### Push

- 값을 스택의 맨 위에 넣음
- 넣은 값은 스택의 top이 됨
- 만약에 스택에 넣을 공간이 없다면 overflow(오버플로우) 상태가 되며, 넣을 수 없음

### Pop

- 맨 위 값을 스택에서 제거
- 맨 위의 아래의 값이 스택의 top이 됨
- 만약에 스택에 제거할 값이 없다면 underflow(언더플로우) 상태가 되며, 뺄 수 없음

### Top

- 맨 위의 값을 리턴

## Linked List로의 구현 - 필요한 구조체

- 두 가지의 구조체가 필요 : head, data

![stack01](https://user-images.githubusercontent.com/26007107/64519804-d612f100-d32f-11e9-814e-fffb05fad7a9.PNG)

### head 구조체

- top을 가리킬 포인터
- 스택의 size

### data 구조체

- 일반적인 연결 리스트의 구조와 비슷

- 내 값
- 내 아래로의 link

~~~c
stack
  count
  top
end stack

node
  data
  link
end node
~~~

## Linked List로의 구현 - 스택 연산 구현

### 스택 생성

~~~c
createStack:
  allocate memory for stack head
  set count to 0
  set top to null
  return stack head
~~~

### push 연산

~~~c
pushStack(stack,data):
  allocate new node
  store data in new node
  make current top node the second node
  make new node the top
  increment stack count
~~~

### pop 연산

~~~c
popStack(stack,dataOut):
  if stack empty:
    set success to false
  else:
    set dataOut to data in top node
    make second node the top node
    decreemnt stack count
    set success to true
  end if
  return success
~~~

### top 연산

~~~c
stackTop(stack,dataOut):
  if stack empty:
    set success to false
  else:
    set dataOut to data in top node
    set success to true
  end if
  return success
~~~

### empty 연산

~~~c
emptyStack(stack):
  if stack count is 0:
    return true
  else
    return false
  end if
~~~

### size(count) 연산

~~~c
stackCount(stack):
  return stack count
~~~

### 굳이 알 필요 없는 연산

- full stack : 스택에 할당할 메모리를 직접 지정해 주지 않는 한, 거의 사용하지 않음

~~~c
fullStack(stack):
  if memory not available:
    return true
  else:
    return false
  end if
~~~

- destroy stack : while문으로 스택이 비었을 때까지 pop하면 됨

~~~c
destroyStack(stack):
  if stack not empty:
    loop stack not empty:
      delete top node
    end loop
  end if
  delete stack head
~~~
