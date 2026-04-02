//编写程序，从键盘输入一任意字符串（不包含空格），然后输入所要查找字符。
//如果存在则输出它在字符串中第一次出现的位置，否则输出NO。
//样例输入：Hello a 样例输出：NO 样例输入：Hello l 样例输出：2 
#include<iostream>
#include<string>
using namespace std;
int main(){
	string s;
	cin>>s;
	char x;
	bool flat = false;
	cin>>x;
	for(int i=0;i<s.length();i++){
		if(s[i]==x){
			cout<<i;
			flat = true;
			break;
		};
	}
	if(!flat) cout<<"NO";
	return 0;
}
