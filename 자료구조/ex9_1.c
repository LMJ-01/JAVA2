#include <stdio.h>
#include <stdlib.h>
#include "selectSort.c"

void inputArray(int a[], int size);
void printArray(int a[], int size);
void SelectSort(int a[], int size);
void selectSortDown(int a[], int size);

int main(void) {
    int size;
    printf("배열의 크기를 입력하세요: ");
    scanf("%d", &size);

    int a[size];

    //정수를 입력받아 배열에 저장하는 함수
    inputArray(a, size);

    printf("\n\n입력된 배열: ");
    //배열을 출력하는 함수
    printArray(a, size);

    // 오름차순 선택정렬 함수
    printf("\n\n정렬 후 (오름차순) 배열 ");
    SelectSort(a, size);
    

    // 내림차순 선택정렬 함수
    printf("\n\n정렬 후 (내림차순) 배열 ");
    selectSortDown(a, size);
    

    return 0;
};



