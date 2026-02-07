//编写程序找出一个正整数n的各位数字中最大的数字，n由键盘输入。
#include <iostream>
using namespace std;
int main(){
	int n; 
	cin>>n;
	int num = 0,temp = 0;
	while(n){
		num = n%10;
		if(num>temp){
			temp = num;
		}
		n/=10;
	};
	cout<<temp;
	return 0;
}
