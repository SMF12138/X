// 编写程序求n以内（包括n）能被3或7整除的所有自然数的倒数之和。
#include<iostream>
using namespace std;
int main() {
	int n;
	cin>>n;
	int i = 1;
	double sum = 0;
	while(i<=n){
		if(i%3==0||i%7==0){
			sum+=1.0/i;
		};
		i++;
	};
	cout << sum;
	return 0;
}
