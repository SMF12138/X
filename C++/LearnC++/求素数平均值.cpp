//编写程序求m到n之间（包括m和n，m<=n）素数的个数及其平均值，
//如果没有素数则输出NO，m和n由键盘输入。
#include<iostream>
#include<cmath>
int prime_num(int n);
using namespace std;
int main(){
	int m,n;
	double num = 0,count = 0;
	cin>>m>>n;
	while(m<=n){
		int temp = num;
		num += prime_num(m);
		if(num>temp){
			count++;
		}
		m++;
	};
	if(count){
		cout<<count<<endl<<num/count;
	}else{
		cout<<"NO";
	}
	return 0;
}

int prime_num(int n){
	for(int i = 2;i<=sqrt(n);i++){
		if(n%i==0){
			return 0;
		};
	}
	return n;
}
