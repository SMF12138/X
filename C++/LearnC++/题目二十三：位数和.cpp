//编写程序求所有满足下列条件不大于给定数n
//（100<=n<=999）的三位数的个数：
//个位数字和百位数字之和等于其十位上的数字。
#include<iostream>
using namespace std;
int main(){
	int a,b,c,n;
	cin>>n;
	if(n<100||n>999){
		return -1;
	};
	for(int i = 100;i<=n;i++){
		a=i%10;
		b=i/10%10;
		c=i/100;
		if(a+c==b){
			cout<<i<<endl;
		};
	};
	return 0;
}
