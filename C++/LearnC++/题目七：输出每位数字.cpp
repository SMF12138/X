//输入一个正整数n（100<=n<=999），依次输出n的百位数字、十位数字、个位数字（以空格分隔）。 
#include <iostream>
using namespace std;
int main(){
	int n = 0;
	cin >> n;
	cout << n / 100 <<" "<< n / 10 % 10 << " " << n % 10;
	return 0;
}


