#include<stdio.h>
#include"stackS.c"
scanf 이용해서 5개의 데이터를 입력받아 push함
pop을 underflow될 때까지 함
아래 조건 충족
int main() {
	int item;
	printf("\n** 순차 스택 연산 **\n");
	int a,b,c,d,e;
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);
	scanf("%d", &d);
	scanf("%d", &e);
	printStack();
	push(a); printStack();
	push(b); printStack();
	push(c); printStack();
	push(d); printStack();
	push(e); printStack();
	
	item = peek(); printStack();
	printf("peek => %d", item);
	
	item = pop(); printStack();
	printf("\t pop => %d", item);
	
	item = pop(); printStack();
	printf("\t pop => %d", item);
	
	item = pop(); printStack();
	printf("\t pop => %d", item);
	
	item = pop(); printStack();
	printf("\t pop => %d", item);
	
	item = pop(); printStack();
	printf("\t pop => %d\n", item);
	
	getchar(); return 0;
}
