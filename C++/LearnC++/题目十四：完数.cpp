//一个数恰好等于它的因子之和，这个数就称为"完数"。
//例如，6的因子为1、2、3，并且6=1+2+3，因此6是"完数"。
//编写程序找出小于给定数n的所有"完数"，n由键盘输入。
#include<iostream>
using namespace std;
void perfect_num(int n);
int main(){
	int n; 
	cin >> n;
	while(n){
		perfect_num(n);
		n--;
	};
	return 0;
}

void perfect_num(int n){
	int i = n-1;
	int num = 0;
	while(i>0){
		if(n%i==0){
			num += i;
		};
		i--;
	};
	if(num==n){
		cout<<n<<endl;
	}
}
