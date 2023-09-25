#define _CRT_SECURE_NO_WARNINGS 
#include <stdio.h>
#include <stdlib.h>

int main() {
	int* arr;
	int num = 0, count = 1, i;
	arr = (int*)malloc(sizeof(int) * count);
	
	while (num != EOF) {
		printf("수 입력, -1을 입력하면 종 료 : ");
		scanf("%d", &num);
		arr = (int*)realloc(arr, sizeof(int) * count);
		arr[count - 1] = num;
		for(i = 0; i < count; i++)
			printf("| %d ", arr[i]);
		printf("\n");
		count++;
		
	}
	return 0;
	
	
}
