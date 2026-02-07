//任何一个大于1的数如果只能被1和这个数自身整除，这个数就称为"素数"或"质数"。
//例如，2、3、5是"素数"。
//编写程序判断一个数是否为"素数"，如果是则输出YES，否则输出NO。
#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int n;
	int flag = 0;
	cin>>n;
	for(int i = 2;i <= sqrt(n); i++){
		if(n%i==0){
			flag=1;
			break;
		};
	};
	if(flag){
		cout<<"NO";
	}else{
		cout<<"YES";
	};
	return 0;
} 
