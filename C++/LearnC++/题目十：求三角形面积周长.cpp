//输入三角形的三条边a、b、c，如果能构成三角形，求三角形面积和周长，如果不能构成三角形则输出Error。 
#include<iostream>
#include<cmath>
using namespace std;
int main(){
	double a,b,c;
	cin >> a>>b>>c;
	double p = (a+b+c)/2; 
	if(a+b>c&&a+c>b&&b+c>a){
		cout<<sqrt(p*(p-a)*(p-b)*(p-c))<<endl<<a+b+c;
	}else{
		cout<<"error";
	}
	return 0;
}
