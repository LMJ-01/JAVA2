#include<stdio.h>
#include"LinkedPoly.h"



ListHead* createLinkedList(void) {
	ListHead* L;
	L = (ListHead*)malloc(sizeof(ListHead));
	L->head = NULL;
	return L;
}


void appendTerm(ListHead* L, float coef, int expo) {
	ListNode* newNode;
	ListNode* p;
	newNode = (ListNode*)malloc(sizeof(ListNode));
	newNode->coef = coef;
	newNode->expo = expo;
	newNode->link = NULL;

	//순서를 바꾸어 입력해도 차수가 높은 순대로 입력 
	// L->head == NULL 비어 있거나,expo > L->head->expo 새 항의 차수가 가장 높을 때
	if (L->head == NULL || expo > L->head->expo) {
        newNode->link = L->head;
        L->head = newNode;
        
    } else {
    	// 내림차순 
        ListNode* current = L->head;
        while (current->link != NULL && expo < current->link->expo) {
            current = current->link;
        }
        
        newNode->link = current->link;
        current->link = newNode;
    }
}

void addPoly(ListHead* A, ListHead* B, ListHead* C) {
	ListNode* pA = A->head;
	ListNode* pB = B->head;
	float sum;

	
	while (pA && pB) {
		
		if (pA->expo == pB->expo) {
			sum = pA->coef + pB->coef;
			appendTerm(C, sum, pA->expo);
			pA = pA->link; pB = pB->link;
		}
	
		else if (pA->expo > pB->expo) {
			appendTerm(C, pA->coef, pA->expo);
			pA = pA->link;
		}
		
		else {
			appendTerm(C, pB->coef, pB->expo);
			pB = pB->link;
		}
	}
	
	for (; pA != NULL; pA = pA->link)
		appendTerm(C, pA->coef, pA->expo);

	
	for (; pB != NULL; pB = pB->link)
		appendTerm(C, pB->coef, pB->expo);
}


void printPoly(ListHead* L) {
	ListNode* p = L->head;
	for (; p; p = p->link) {
		printf("%3.0fx^%d", p->coef, p->expo);
		if (p->link != NULL) printf(" +");
	}
}
