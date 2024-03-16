#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        // 提前退出冒泡循环的标志位
        int flag = 0;
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                // 交换元素
                swap(&arr[j], &arr[j+1]);
                flag = 1;
            }
        }
        // 如果一轮比较没有发生交换，则说明已经有序
        if (!flag) {
            break;
        }
    }
}

int main() {
    int data[100000];
    // 生成随机数据
    for (int i = 0; i < 100000; i++) {
        data[i] = rand() % 1000000;
    }

    clock_t start, end;
    double cpu_time_used;

    start = clock();

    bubbleSort(data, 100000);

    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;

    // 打印排序后的结果
    for (int i = 0; i < 100000; i++) {
        printf("%d ", data[i]);
    }

    printf("\n程序运行时间：%f 秒\n", cpu_time_used);

    return 0;
}


