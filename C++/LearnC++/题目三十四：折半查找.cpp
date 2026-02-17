//编写程序，利用折半查找法从一个升序排列的数列中查找某数是否存在，
//如果存在则输出该数的下标，否则输出NO。输入分3行：
//第一行为n的值，代表数列中数的个数，第二行为n个数（升序排列），
//第三行为要查找的数。 
#include<iostream>
int binary_search(int num,int arr[],int left,int right);
using namespace std;
int main(){
	int n,num;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];	
	};
	cin>>num;
	int index = binary_search(num,arr,0,n-1); 
	if(index==-1){
		cout<<"NO";
	}else{
		cout<<index;
	};
	return 0;
}

int binary_search(int num,int arr[],int left,int right){
	if(left>right)return -1;
	int mid = (left+right)/2;
	if(num==arr[mid]){
		return mid;
	}else if(num>arr[mid]){
		return binary_search(num,arr,mid+1,right);
	}else{
		return binary_search(num,arr,left,mid-1);
	};
} 
