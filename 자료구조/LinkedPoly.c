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

	//������ �ٲپ� �Է��ص� ������ ���� ����� �Է� 
	// L->head == NULL ��� �ְų�,expo > L->head->expo �� ���� ������ ���� ���� ��
	if (L->head == NULL || expo > L->head->expo) {
        newNode->link = L->head;
        L->head = newNode;
        
    } else {
    	// �������� 
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
