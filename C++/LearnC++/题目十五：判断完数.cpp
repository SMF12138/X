//一个数恰好等于它的因子之和，这个数就称为"完数"。
//例如，6的因子为1、2、3，并且6=1+2+3，因此6是"完数"。
//编写程序判断一个数是否为"完数"，如果是则输出YES，否则输出NO。
#include<iostream>
using namespace std;
int perfect_num(int n);
int main(){
	int n; 
	cin >> n;
	cout << (perfect_num(n)?"YES":"NO");	
	return 0;
}

int perfect_num(int n){
	int i = n-1;
	int num = 0;
	while(i>0){
		if(n%i==0){
			num += i;
		};
		i--;
	};
	if(num==n){
		return 1;
	}else{
		return 0;
	}
}

