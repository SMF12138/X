//编写程序，将一个数组中的数循环左移。
//输入分2行：第一行为n的值，第二行为n个数。
#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];	
	};
	int temp = arr[0];
	for(int i=0;i<n;i++){
		if(i!=n-1){
			arr[i]=arr[i+1];	
		}else{
			arr[i]=temp;
		}
	};
	for(int i=0;i<n;i++){
		cout<<arr[i];	
	};
	return 0;
} 
