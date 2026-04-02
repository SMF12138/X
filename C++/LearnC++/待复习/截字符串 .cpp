//编写程序，输入字符串（包含多个'*'），删除所有除前导和尾部以外的'*'。 
#include<iostream>
using namespace std;

int main(){
    string s;
    cin >> s;

    char result[1000];
    int n = s.length();

    int i = 0;
    int k = 0;

    // 前导*
    while(i < n && s[i] == '*'){
        result[k++] = '*';
        i++;
    }

    // 找尾部*
    int j = n - 1;
    while(j >= 0 && s[j] == '*')
        j--;

    // 中间非*
    for(int t = i; t <= j; t++){
        if(s[t] != '*')
            result[k++] = s[t];
    }

    // 尾部*
    for(int t = j+1; t < n; t++)
        result[k++] = '*';

    result[k] = '\0';

    cout << result;

    return 0;
}
