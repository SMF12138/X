// 求水仙花数：各位数字的三次幂之和等于它本身的三位数
#include <iostream>
using namespace std;

int main() {
    for (int num = 100; num <= 999; num++) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }

        if (sum == num) {
            cout << num << endl;
        }
    }

    return 0;
}

