// 编写程序，将一个字符串首尾互换，并与原字符串连接后输出。
// 输入字符串（不包含空格），输出处理后的结果。 
#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n; 
	char arr[2*n];
	for(int i = 0;i<n;i++){
		cin>>arr[i];	
	};
	for(int i = 0;i<n;i++){
		arr[n+i]=arr[n-1-i];	
	};
	for(int i = 0;i<2*n;i++){
		cout<<arr[i];		
	};
	return 0;
}
