#include <iostream>
#include <cmath>
using namespace std; 
int main(){
	int n,sum1 = 1;
	double sum2 = 0,x;
	cin>>n>>x;
	if(n<0)return -1;
	for(int i = 1;i<n;i++){
		sum1 *= i;
		sum2 += -pow(-1,i)*pow(x,i)/sum1;
	};
	cout<<sum2+1;
	return 0;
}
