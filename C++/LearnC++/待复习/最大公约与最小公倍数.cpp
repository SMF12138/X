//输入两个正整数m和n，编写程序求其最大公约数和最小公倍数。
#include <iostream>
using namespace std;

int gcd(int a, int b) {
    while (b != 0) {
        int r = a % b;
        a = b;
        b = r;
    }
    return a;
}

int main() {
    int m, n;
    cin >> m >> n;

    int g = gcd(m, n);
    int l = m * n / g;

    cout << g << endl << l;
    return 0;
}

