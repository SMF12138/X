#include <stdio.h>

// 函数计算最大公约数
int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main() {
    int num1, num2;
    
    printf("请输入两个整数（用空格分隔）：");
    scanf("%d %d", &num1, &num2);
    
    int result = gcd(num1, num2);
    
    printf("最大公约数是：%d\n", result);
    
    return 0;
}
