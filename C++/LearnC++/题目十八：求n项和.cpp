//计算该序列的前n项和，n由键盘输入。
#include<iostream>
using namespace std;
int main(){
	int n,k=0;
	cin>>n;
	double i = 1,j = 2,temp = 0,num=0;
	while(k<n){
		num += j/i;
		temp = i + j;
		i = j;
		j = temp;
		k++;	
	} 
	cout<<num;
	return 0;
}
