#include<stdio.h>
//枚举
enum Day{
	//枚举常量，若赋值自动默认从0开始 
	Mon=1,
	Tues,
	Wed,
	Thur,
	Fri,
	Sat,
	Sun
}; 

int main(){
	enum Day W = Wed;
	printf("%d\n",Mon);
	printf("%d\n",Tues);
	printf("%d\n",W);
	return 0;
} 
