//冒泡排序
#include <iostream>
using namespace std; 
void bubble_sort(int* arr, int length);
void swap(int &a, int &b);
int main(){
	int n = 0;
	cout<<"请数组输入长度"<<endl; 
	cin>>n;
	int arr[n]={0};
	for(int i = 0;i < n;i++){
		cout<<"请输入数字"<<endl; 
		cin>>arr[i];
	};
	bubble_sort(arr,n);
	for(int i = 0;i < n;i++){
		cout<<arr[i]<<" ";
	};
	return 0;
} 

void bubble_sort(int* arr,int length){
	int j = 0;
	while(j < length){
		int i= 0; 
		while(i < length-1-j){
//		降序排列 
			if(arr[i]<arr[i+1]){
				swap(arr[i],arr[i+1]);
			};
			i++; 
		}
		j++; 
	};
}

void swap(int &a, int &b){
	int temp = 0;
	temp = a;
	a = b;
	b = temp;
}
