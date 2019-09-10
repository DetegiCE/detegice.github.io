---
title: "Stack 02. 스택 ADT"
date: 2019-09-10
categories: data_structure stack
---

# 스택 ADT

## 스택 구조체

~~~c
typedef struct node {
	void* dataPtr;
	struct node* link;
}STACK_NODE;

typedef struct {
	int count;
	STACK_NODE* top;
}STACK;
~~~

![stack02](https://user-images.githubusercontent.com/26007107/64574657-5296e580-d3ab-11e9-91e1-ddffad7cffdb.PNG)

## 스택의 생성

~~~c
STACK* createStack(void) {
	STACK* stack;
	
	stack = (STACK*)malloc(sizeof(STACK));
	if(stack) {
		stack->count = 0;
		stack->top = NULL;
	}
	return stack;
}
~~~

## push 연산

~~~c
bool pushStack(STACK* stack, void* dataInPtr) {
	STACK_NODE* newPtr;
	
	newPtr = (STACK_NODE*)malloc(sizeof(STACK_NODE));
	
	if(!newPtr) return false;
	
	newPtr->dataPtr = dataInPtr;
	newPtr->link = stack->top;
	
	stack->top = newPtr;
	(stack->count)++;

	return true;
}
~~~

## pop 연산 

~~~c
void* popStack(STACK* stack) {
	void* dataOutPtr;
	STACK_NODE* tmp;
	
	if(stack->count == 0) dataOutPtr = NULL;
	else {
		tmp = stack->top;
		dataOutPtr = stack->top->dataPtr;
		stack->top = stack->top->link;
		
		free(tmp);
		(stack->count)--;
	}
	
	return dataOutPtr;
}
~~~

## top 연산 

~~~c
void* stackTop(STACK* stack) {
	if (stack->count == 0) return NULL;
	else return stack->top->dataPtr;
}
~~~

## empty 연산

~~~c
bool emptyStack(STACK* stack) {
	return (stack->count == 0);
}
~~~

## size(count) 연산

~~~c
int stackCount(STACK* stack) {
  return stack->count;
}
~~~

## 굳이 필요없는 연산

~~~c
bool fullStack(STACK* stack) {
	STACK_NODE* tmp;
	if((tmp = (STACK_NODE*)malloc(sizeof(*(stack->top))))) {
		free(tmp);
		return false;
	}
	return true;
}
~~~

``malloc``이 실패한 경우, 스택이 꽉 찼다는 것이므로 true 리턴

~~~c
STACK* destroyStack(STACK* stack) {
	STACK_NODE* tmp;
	
	if(stack) {
		while(stack->top != NULL) {
			free(stack->top->dataPtr);
			
			tmp = stack->top;
			stack->top = stack->top->link;
			
			free(tmp);
		}
		free(stack);
	}
	return NULL;
}
~~~
