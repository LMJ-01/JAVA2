#include <stdio.h>

// ������ �Է¹޾� �迭�� �����ϴ� �Լ�
void inputArray(int a[], int size) {
    int i;
    printf("������ �Է��ϼ���: ");
    for (i = 0; i < size; i++) {
        scanf("%d", &a[i]);
    }
}


// �迭�� ����ϴ� �Լ�
void printArray(int a[], int size) {
    int i;
    for (i = 0; i < size; i++) {
        printf("%d ", a[i]);
    }
}


// 3. �������� �������� �Լ� ȣ��
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
        printf("\n%d�ܰ�: ", i + 1);
        for (t = 0; t < size; t++) 
            printf("%3d", a[t]);
    }
}
 // 4. �������� �������� �Լ�
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
        printf("\n%d�ܰ�: ", i + 1);
        for (t = 0; t < size; t++) 
            printf("%3d", a[t]);
    }
}



