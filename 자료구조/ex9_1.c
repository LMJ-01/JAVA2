#include <stdio.h>
#include <stdlib.h>
#include "selectSort.c"

void inputArray(int a[], int size);
void printArray(int a[], int size);
void SelectSort(int a[], int size);
void selectSortDown(int a[], int size);

int main(void) {
    int size;
    printf("�迭�� ũ�⸦ �Է��ϼ���: ");
    scanf("%d", &size);

    int a[size];

    //������ �Է¹޾� �迭�� �����ϴ� �Լ�
    inputArray(a, size);

    printf("\n\n�Էµ� �迭: ");
    //�迭�� ����ϴ� �Լ�
    printArray(a, size);

    // �������� �������� �Լ�
    printf("\n\n���� �� (��������) �迭 ");
    SelectSort(a, size);
    

    // �������� �������� �Լ�
    printf("\n\n���� �� (��������) �迭 ");
    selectSortDown(a, size);
    

    return 0;
};



