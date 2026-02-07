//编写程序求n的阶乘，n由键盘输入
#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	double sum=1;
	for(int i = 1;i<=n;i++){
		sum*=i;
	};
	cout<<sum;
	return 0;
}
