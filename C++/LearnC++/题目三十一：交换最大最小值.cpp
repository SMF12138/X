//编写程序，从任意n个数中找出最大数和最小数，并将它们相互交换后输出。
//输入分2行：第一行为n的值，第二行为n个数。
#include <iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	double arr[n];
	for(int i = 0;i < n;i++){
		cin>>arr[i];
	};
	double temp1 = arr[0],temp2 = arr[0];
	int num1,num2;
	for(int i = 0;i < n;i++){
		if (arr[i]>=temp1){
			temp1 = arr[i];	
			num1 = i;
		};
		if (arr[i]<=temp2){
			temp2 = arr[i];
			num2 = i;	
		};
	};
	arr[num1]=temp2;
	arr[num2]=temp1;
	for(int i = 0;i < n;i++){
		cout<<arr[i]<<" ";
	};
	return 0;
}
