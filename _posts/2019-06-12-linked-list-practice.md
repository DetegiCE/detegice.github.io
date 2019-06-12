---
title: "Linked List Practice"
date: 2019-06-12 12:43:11 +0900
categories: Data_Structure C_Language
---

inserting characters in alphabetical order (function *insert*)
or remove a character from the list (function *remove*)

	#include<stdio.h>
	#include<stdlib.h>

	struct node{
		char val;
		struct node* next;
	};

	typedef struct node Node;
	typedef Node *NodePtr;

	void insert(NodePtr *sPtr, char value) {
		NodePtr newPtr = (NodePtr)malloc(sizeof(Node));
		newPtr->val = value;
		newPtr->next = NULL;

		NodePtr prevPtr = *sPtr;
		NodePtr curPtr = (*sPtr)->next;

		if(curPtr == NULL){
			prevPtr->next = newPtr;
		}

		while(curPtr != NULL){
			if(curPtr->next == NULL && curPtr->val != value && curPtr->val < value){
				curPtr->next = newPtr;
				break;
			}
			if(curPtr->val == value) break;
			if(prevPtr->val < value && value < curPtr->val){
				prevPtr->next = newPtr;
				newPtr->next = curPtr;
				break;
			}
			prevPtr = curPtr;
			curPtr = curPtr->next;
		}

	}

	void remove(NodePtr *sPtr, char value)
	{
		NodePtr prevPtr = (*sPtr);
		NodePtr curPtr = (*sPtr)->next;
		while(curPtr != NULL){
			if(curPtr->val == value){
				prevPtr->next = curPtr->next;
				break;
			}
			prevPtr = curPtr;
			curPtr = curPtr->next;
		}
	}

	void printNode(NodePtr *sPtr){
		NodePtr curPtr = (*sPtr)->next;
		printf("The list is:\n");
		while(curPtr != NULL){
			printf("%c --> ",curPtr->val);
			curPtr = curPtr->next;
		}
		printf("NULL\n\n");
	}

	int main()
	{
		NodePtr startPtr = (NodePtr)malloc(sizeof(Node));
		startPtr->next = NULL;
		int m;
		char n;

		printf("Enter your choice:\n");
		printf("   1 to insert an element into the list.\n");
		printf("   2 to delete an element from the list.\n");
		printf("   3 to end.\n");

		while(1){
			printf("? ");
			scanf("%d",&m);
			if(m<=2){
				printf("Enter a character: ");
				scanf("\n%c",&n);
			} 
			if(m==1){
				insert(&startPtr, n);
				printNode(&startPtr);
			}
			if(m==2){
				remove(&startPtr, n);
				printNode(&startPtr);
			}
			if(m==3) break;
		}
	}

