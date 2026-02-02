//输入x值，输出y值
#include<iostream>
#include<cmath>
using namespace std;
int main(){
	double x = 0;
	cin >> x;
	if(x<0){
		cout<<3*x*x-5/x;
	}else if(0<=x<5){
		cout<<1/(2+cos(x));
	}else{
		cout<<sqrt(sin(x)+1);
	}
	return 0;
} 
