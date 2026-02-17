//其中分母为n以内（包括n）的素数，计算该序列之和，n由键盘输入。
#include <cmath>
#include <iostream>
using namespace std;
bool if_prime_num(int num);
int prime_num(int i);
int main(){
	int n;
	cin>>n;
	double sum = 0;
	for(int i = 1;i <= n;i++){
		int num = prime_num(i);
		sum += 1.0 / num;	
	};
	cout<<sum;
	return 0;
}

int prime_num(int n){
	int num = 0,count = 0;
	while(count < n){
		num++;
		if(if_prime_num(num)){
			count++;
		};
	};
	return num;
}

bool if_prime_num(int n){
	if(n < 2) return false;   
    
    for(int i = 2; i <= sqrt(n); i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;
}
