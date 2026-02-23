//编写程序，从任意n个数中找出素数，计算素数之和，并按从大到小顺序排序。
//输入分2行：第一行为n的值，第二行为n个整数；
//输出分2行：第一行为素数之和，第二行为素数排序结果。 
#include<iostream>
#include<cmath>
bool is_prime(int n);
void Qsort(int left,int right,int prime[]); 
void swap(int &a,int &b);
using namespace std;
int main(){
	int n,num,sum=0,count=0;
	cin>>n;
	int arr[n],prime[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	};
	for(int i=0;i<n;i++){
		if(is_prime(arr[i])){
			prime[count++]=arr[i];
			sum+=arr[i];
		};
	};
	cout<<sum<<endl;
	Qsort(0,count-1,prime); 
	for(int i=0;i<count;i++){
		cout<<prime[i]<<" ";
	};
	return 0;
} 

bool is_prime(int n){
	if(n<2){
		return false;
	};
	for(int i=2;i<=sqrt(n);i++){
		if(n%i==0){
			return false;	
		};	
	};
	return true;
}

void Qsort(int left, int right, int prime[])
{
    if(left >= right) return;
    int i = left;
    int j = right;
    int pivot = prime[left];
    while(i < j)
    {
        while(i < j && prime[j] <= pivot)
            j--;

        while(i < j && prime[i] >= pivot)
            i++;

        if(i < j)
            swap(prime[i], prime[j]);
    }

    swap(prime[left], prime[i]);

    Qsort(left, i - 1, prime);
    Qsort(i + 1, right, prime);
}

void swap(int& a,int& b){
	int temp = a;
	a = b;
	b = temp;
}
