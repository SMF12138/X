//有一分段函数如下，请编写程序，输入x值，输出y值。
#include <iostream>
#include <cmath>
using namespace std;
int main(){
	double x;
	cin>>x;
	if(x<0){
		cout<<x*x+2/x+sin(x)<<endl;
	}else if(0<=x&&x<10){
		cout<<2*pow(x,5)-cos(x)<<endl;
	}else{
		cout<<1/sqrt(3*x*x-11);
	};
	return 0;
}
