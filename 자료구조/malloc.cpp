#include <stdio.h>
#include <stdlib.h>

int main()
{
	int* arr;
	int num, i;

	printf("�迭�� ũ�� �Է� : ");
	scanf("%d", &num);
	arr = (int*)malloc(sizeof(int) * num);  // �޷θ� �����Ҵ� 
	
	for (i = 0; i< num-3; i++)
		arr[i] = i + 1; 
		
	for (i = 0; i < num; i++)
		printf("| %d ", arr[i]);
		
	return 0;
}



