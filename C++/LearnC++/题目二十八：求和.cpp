#include<iostream>
using namespace std;
int main(){
	int n;
	double sum1=1,sum2=1;
	cin>>n;
	for(int i = 1;i<n;i++){
		sum1 *=	i;
		sum2 += 1.0/sum1;
	};	
	cout<<sum2;
	return 0;
} 
