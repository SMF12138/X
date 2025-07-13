#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define LEN 10

bool FindMax_Min(int *max, int *min, int *arr, int len);
void MFSort(int max, int min, int *arr, int *result, int len);
void PrintArr(int pInt[], int len);

int main() {
    int max, min;
    int arr[LEN] = {1, 6, -8, 86, 98, 54, 23, 41, 57, 35};
    int *result = malloc(sizeof(int) * LEN);

    if (!FindMax_Min(&max, &min, arr, LEN)) {
        printf("Invalid input.\n");
        return 1;
    }

    MFSort(max, min, arr, result, LEN);
    PrintArr(result, LEN);
    free(result);
    return 0;
}

void PrintArr(int pInt[], int len) {
    for (int i = 0; i < len; ++i) {
        printf("%d ", pInt[i]);
    }
    printf("\n");
}

bool FindMax_Min(int *max, int *min, int *arr, int len) {
    if (len <= 0) return false;

    *max = *min = arr[0];
    for (int i = 1; i < len; ++i) {
        if (arr[i] > *max) *max = arr[i];
        if (arr[i] < *min) *min = arr[i];
    }
    return true;
}

// 分桶排序思想实现的排序函数
void MFSort(int max, int min, int *arr, int *result, int len) {
    int range = max - min + 1;

    // 创建“桶”，使用计数排序思想
    int *bucket = calloc(range, sizeof(int));
    for (int i = 0; i < len; ++i) {
        bucket[arr[i] - min]++;
    }

    int idx = 0;
    for (int i = 0; i < range; ++i) {
        while (bucket[i] > 0) {
            result[idx++] = i + min;
            bucket[i]--;
        }
    }

    free(bucket);
}
