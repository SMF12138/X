//编写程序，输入由数字字符构成的字符串，分别统计该字符串中数字字符对应的数字中奇数和偶数的个数。
#include<iostream>
using namespace std;
#include <iostream>
using namespace std;

int main() {
    string s;
    int even = 0, odd = 0;

    cin >> s;

    for (int i = 0; i < s.length(); i++) {
        if (s[i] >= '0' && s[i] <= '9') {
            int num = s[i] - '0';
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
    }

    cout << even << " " << odd;

    return 0;
}
