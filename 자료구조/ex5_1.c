#include<stdio.h>
#include"stackS.c"
scanf �̿��ؼ� 5���� �����͸� �Է¹޾� push��
pop�� underflow�� ������ ��
�Ʒ� ���� ����
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
