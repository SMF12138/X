//编写程序，输入字符串（包含多个'*'），删除所有除前导和尾部以外的'*'。 
#include<iostream>
using namespace std;
int main(){
	string s;
	bool flag=0;
	cin>>s;
	for(int i=0;i<s.length();i++){
		if(s[i]=='*'&&flag){
			s[i]== ' ';
		};
	};
	for(int i=0;i<s.length();i++){
		cout<<s;
	}; 
}
 

