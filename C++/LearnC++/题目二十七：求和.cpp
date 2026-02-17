#include<cmath>
#include<iostream>
using namespace std;
int main(){
	int a,n,sum1=0,sum2=0;
	cin>>a>>n;
	for(int i = 0;i < n;i++){
		sum1 += pow(10,i)*a;
		sum2 += sum1;
	};
	cout<<sum2;
	return 0;
}
