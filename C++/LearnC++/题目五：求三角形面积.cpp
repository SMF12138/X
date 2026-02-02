//输入三角形的三条边长a，b，c（要求能构成三角形），求三角形面积。 
#include <iostream>
#include <cmath>
using namespace std;
int main(){
	cout<<"输入三角形的三条边："<<endl;
	double a,b,c;
	cin>>a>>b>>c; 
	if(a+b>c&&a+c>b&&b+c>a){
		double p = (a+b+c)/2;
		cout<<"三角形的面积为："<< sqrt(p*(p-a)*(p-b)*(p-c));
	}else{
		cout<<"非法的三角形边长"; 
	}
	return 0;
} 
