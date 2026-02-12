//任何一个大于1的数如果只能被1和这个数自身整除，这个数就称为"素数"或"质数"。
//例如，2、3、5是"素数"。输入m和n（m<=n），编写程序计算[m,n]范围内"素数"之和。
#include<iostream>
#include<cmath>
using namespace std;
int prime_number(int m);
int main(){
	int m,n;
	cin>>m>>n;
	int num = 0;
	while(m<=n){
		num+=prime_number(m);
		m++;
	};
	cout<<num;
	return 0;
}

int prime_number(int n){
	if(n < 2) return 0;   
	for(int i = 2;i <= sqrt(n); i++){
		if(n%i==0){
			return 0;
		};
	};
	return n;
}
