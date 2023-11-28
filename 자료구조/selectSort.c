#include <stdio.h>

// 정수를 입력받아 배열에 저장하는 함수
void inputArray(int a[], int size) {
    int i;
    printf("정수를 입력하세요: ");
    for (i = 0; i < size; i++) {
        scanf("%d", &a[i]);
    }
}


// 배열을 출력하는 함수
void printArray(int a[], int size) {
    int i;
    for (i = 0; i < size; i++) {
        printf("%d ", a[i]);
    }
}


// 3. 오름차순 선택정렬 함수 호출
void SelectSort(int a[], int size) {
    int i, j, t, min, temp;
    
    for (i = 0; i < size - 1; i++) {
        min = i;
        for (j = i + 1; j < size; j++) {
            if (a[j] < a[min]) 
                min = j;
        }
        temp = a[i];
        a[i] = a[min];
        a[min] = temp;
        printf("\n%d단계: ", i + 1);
        for (t = 0; t < size; t++) 
            printf("%3d", a[t]);
    }
}
 // 4. 내림차순 선택정렬 함수
void selectSortDown(int a[], int size) {
    int i, j, t,max, temp;

    for (i = 0; i < size - 1; i++) {
        max = i;
        for (j = i + 1; j < size; j++) {
            if (a[j] > a[max]) {
                max= j;
            }
        }
        temp = a[i];
        a[i] = a[max];
        a[max] = temp;
        printf("\n%d단계: ", i + 1);
        for (t = 0; t < size; t++) 
            printf("%3d", a[t]);
    }
}



