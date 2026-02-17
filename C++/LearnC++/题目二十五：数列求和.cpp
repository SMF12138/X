#include<iostream>
using namespace std;
int main(){
	int sum1 = 1,sum2 = 0,n;
	cin>>n;
	for(int i = 1;i<=n;i++){
		sum1 *= i;
		sum2 += sum1;
	};
	cout<<sum2;
	return 0;
} 
