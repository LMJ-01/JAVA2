#include <stdio.h>
#include <stdlib.h>

int main()
{
	int* arr;
	int num, i;

	printf("배열의 크기 입력 : ");
	scanf("%d", &num);
	arr = (int*)malloc(sizeof(int) * num);  // 메로리 동적할당 
	
	for (i = 0; i< num-3; i++)
		arr[i] = i + 1; 
		
	for (i = 0; i < num; i++)
		printf("| %d ", arr[i]);
		
	return 0;
}



