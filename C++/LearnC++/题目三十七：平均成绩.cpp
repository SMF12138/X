//编写程序，输入若干学生的成绩，计算平均分，并输出低于平均分的学生成绩。
//输入分2行：第一行为n的值，第二行为n个数；
//输出分2行：第一行为平均分，第二行为低于平均分的成绩。
#include<iostream>
using namespace std;
int main(){
	int n;
	double sum=0;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	};
	for(int i=0;i<n;i++){
		sum+=arr[i];
	};
	double result =  sum/n;
	cout<<result<<endl;
	for(int i=0;i<n;i++){
		if(arr[i]<result){
			cout<<arr[i]<<" ";	
		};
	};
	return 0;
} 
