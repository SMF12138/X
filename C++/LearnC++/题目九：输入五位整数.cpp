// 输入一个不多于5位的正整数，要求分3行输出以下信息，
// 第1行输出它是几位数；
// 第2行从高位到低位依次输出每一位数字（以空格分隔，下同）；
// 第3行从低位到高位依次输出每一位数字。 
#include<iostream>
using namespace std;
int main(){
	int n,count=0;
	cin>>n;
	int temp = n;
	while(temp){
		temp/=10; 
		count++;
	};
	cout<<count<<endl;
	int arr[5]= {0};
	int i = 0;
	while(i<count){
		arr[i]=n%10;
		n/=10;
		i++;
	};
	for(int j = count - 1;j>=0;j--){
		cout<<arr[j]<<" ";
	};
	cout<<endl;
	for(int j = 0;j<count;j++){
		cout<<arr[j]<<" ";
	};
}
