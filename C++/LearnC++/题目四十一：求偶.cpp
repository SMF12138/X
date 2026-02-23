// 输入n个数，找出其中的偶数并计算平均值后输出。
// 输入分2行：第一行为n的值，第二行为n个数；
// 输出分2行：第一行为其中的偶数，第二行为所有偶数的平均值。 
#include <iostream>
using namespace std;
int main(){
	int n;
	double count = 0,num = 0;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];	
	};
	for(int i=0;i<n;i++){
		if(arr[i]%2==0){
			cout<<arr[i]<<" ";	
			count++;
			num += arr[i];
		};
	};	
	if(count==0) return -1;
	cout << endl << num/count;
	return 0;
}
