//编写程序求Fibonacci数列前n项和，n由键盘输入。
#include<iostream>
using namespace std;
int main(){
	int n,num = 1,num1 = 1,num2 = 1;
	cin>>n;
	if(n < 1){
		cout << 0;
		return -1;	
	};
	for(int i = 1;i < n;i++){
		int temp = num2;
		num2 = num1 + num2;
		num1 = temp;
		num += num1;
	};
	cout<<num;
	return 0;
}

