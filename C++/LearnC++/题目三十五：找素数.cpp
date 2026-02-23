//编写程序，从任意n个数中找出素数并输出。
//输入分2行：第一行为n的值，第二行为n个整数。
#include <iostream>
#include <cmath>
bool is_prime(int num);
using namespace std;
int main(){
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	};
	for(int i=0;i<n;i++){
		if(is_prime(arr[i])) {
			cout<<arr[i];	
		};
	};
	return 0;
}

bool is_prime(int num){
	if(num<=1){
		return false;
	};
	for(int i=2;i<=sqrt(num);i++){
		if(num%i==0){
			return false;
		};
	};
	return true;
}
