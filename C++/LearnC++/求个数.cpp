//编写程序，输入字符串（不包含空格），统计英文字母、数字字符及其他字符的个数。 
//样例输入：abc129++*ABC 样例输出：6 3 3
#include<iostream>
#include<string>
using namespace std;
int main(){
	string s;
	cin>>s;
	int count1=0,count2=0,count3=0;
	for(int i=0;i<s.length();i++){
		if(s[i]>='A'){
			count1++;
		}else if(s[i]>='0'){
			count2++;
		}else{
			count3++;
		} 
	};
	cout<<count1<<" "<<count2<<" "<<count3<<endl;
	return 0;
} 
