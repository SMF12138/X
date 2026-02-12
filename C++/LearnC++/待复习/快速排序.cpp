//编写程序，将任意n个数按从大到小的顺序排序。
//输入分2行：第一行为n的值，第二行为n个数。
#include <iostream>
void Qsort(int low,int high,int arr[]);
void swap(int& a,int& b);
using namespace std;
int main(){
	int n;
	cin>>n;
	int arr[n]; 
	for(int i = 0;i < n;i++){
		cin>>arr[i];
	};
	Qsort(0,n-1,arr);
	for(int i = 0;i < n;i++){
		cout<<arr[i]<<" ";
	};
	return 0;
}

void Qsort(int low,int high,int arr[]){
    if(low >= high) return;

    int i = low;
    int j = high;
    int pivot = arr[low];

    while(i < j){
        while(i < j && arr[j] <= pivot) j--;
        while(i < j && arr[i] >= pivot) i++;
        if(i < j)
            swap(arr[i], arr[j]);
    }

    swap(arr[low], arr[i]);

    Qsort(low, i-1, arr);
    Qsort(i+1, high, arr);
}


void swap(int& a,int& b){
	int temp = a;
	a = b;
	b = temp;
}
