#include<stdio.h>
#include"stackS.c"

int main() {
	int item;
	printf("\n** ���� ���� ���� **\n");
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

	printf("peek => %d\n", item);
	while (!isStackEmpty()) {
    	item = pop();
    	printStack();
    	printf("pop => %d\n", item);
}

	
	getchar(); return 0;
}
