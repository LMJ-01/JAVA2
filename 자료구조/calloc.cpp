#include <stdio.h>
#include <stdlib.h>

int main()
{
	int* arr;
	int num;
	scanf("%d", &num);
	arr = (int*)calloc(num,sizeof(int));
	
	for (int i = 0; i< num-2; i++) {
		arr[i] = i + 1; 
	}
	for (int i = 0; i < num; i++) {
		printf("| %d ", arr[i]);
	}
	return 0;
 } 
