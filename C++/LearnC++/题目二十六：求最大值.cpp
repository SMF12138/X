#include<iostream>
using namespace std;
int main(){
	int n,num,min;
	cin>>n;
	if(n<=0){
		return -1;
	};
	for(int i = 0;i < n;i++){	
		cin>>num;
		if(i==0)min = num;
		if(num<min){
			min = num;
		};
	};	
	cout<<min;
	return 0;
} 
