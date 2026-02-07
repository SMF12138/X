#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int n=0;
	double sum=0,j=1;
	cin>>n;
	for(int i=1;i<=n;i++){
		sum+=(j/i)*pow(-1,i+1);
	};
	cout<<sum; 
	return 0;
} 
