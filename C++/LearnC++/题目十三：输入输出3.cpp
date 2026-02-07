#include <iostream>
#include <cmath>
using namespace std;
int main(){
	double x = 0;
	cin>>x;
	if(x<=-1){
		cout<<2*x+cos(x);
	}else if(x>-1&&x<1){
		cout<<1/cbrt(pow(x+1,2));
	}else{
		cout<<sin(x)*sin(x);
	}
	return 0;
} 
