/*
输入5个小写字母，将其译成密码。密码规律是：用原来的字母后面第4个字母代替原来的字母。
例如，输入"ahoux"，'a'->'b'->'c'->'d'->'e'，所以字母'a'后面第4个字母是'e'，用'e'代替'a'；
字母'x'后面不足4个字母，则从'a'开始补充，'x'->'y'->'z'->'a'->'b'，所以字母'x'后面第4个字母是'b'，
用'b'代替'x'。因此，"ahoux"应译为"elsyb"。
*/
#include <iostream>
using namespace std;
int main(){
	char arr[5] = {};
	for(int i = 0; i < 5; i++){
		cin >> arr[i];
	};
	for(int i = 0; i < 5; i++){
		if(arr[i]<='u'){
			cout << char(arr[i]+4);
		}else{
			cout << char(arr[i]-22);
		}
	};
	return 0;
} 
