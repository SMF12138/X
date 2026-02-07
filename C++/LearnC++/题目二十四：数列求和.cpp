#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int sum1 = 0;
	double sum2 = 0;
	for(int i = 1;i <= n;i++){
		sum1 += i;	
		sum2 += 1.0/sum1;
	};
	cout<<sum2;
	return 0;
}
