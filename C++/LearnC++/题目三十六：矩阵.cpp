//编写程序，计算两个矩阵（均为2行3列）之和。
//输入分2*2行：前两行为第一个矩阵，后两行为第二个矩阵。 
#include<iostream> 
using namespace std;
int main(){
	int arr1[2][3],arr2[2][3],sum=0;
	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			cin>>arr1[i][j];
		};	
	};
	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			cin>>arr2[i][j];
		};
	};
	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			cout<<arr1[i][j]+arr2[i][j]<<" ";
		};	
		cout<<endl;
	};
	return 0;
}
