//输入一个华氏温度，要求输出摄氏温度。公式为：c=5/9*(F-32)。 
#include <iostream>
using namespace std;
int main(){
	float F = 0; 
	cout << "请输入一个华氏度:" << endl;
	cin >> F;
	float c = 5*(F-32)/9;
	cout << "摄氏度为：" << c << endl;
	return 0;
} 

