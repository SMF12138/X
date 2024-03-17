#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
void menu(){
	printf("**************欢迎来到智障模拟器**************\n"); 
	printf("**************1.PLAY******0.EXIT**************\n");
	printf("****************请输入你的选择****************\n");  
}


void game(){
	double input = 0;
	double x = 0;
	int i = 0;
	int z = 0;
	char cannal [20]={0};
	z = rand()*0.01;//0-32767 
	x = rand()*0.01;//0-32767 
	printf("请在五分钟内猜出正确数字，否则你的电脑将会爆炸\n");
	printf("输入：制作者是我的爸爸 以解除指令\n");
	scanf("%s",&cannal);
	system("shutdown /s /t 300"); 
	if(strcmp(cannal,"制作者是我的爸爸")==0){//strcmp比较字符串 
	system("shutdown /a"); 
	system("shutdown /s /t 600"); 
	printf("看在我是你爹的份上，就给你延长5分钟\n");
}
	else{
		printf("真的不考虑一下吗？\n");
		scanf("%s",&cannal);
		if(strcmp(cannal,"制作者是我的爸爸")==0){
	system("shutdown /a"); 
	system("shutdown /s /t 600"); 
	printf("看在我是你爹的份上，就给你延长5分钟\n");
}
	}
	printf("好了，现在你可以接受挑战了\n");
	
	
	
	while(i<=14){
	i++;
	if(i==1){
	printf("比如答案是%d，请输入%d并且回车\n",z,z);
}
	scanf("%lf",&input);
	if(input==z){
		printf("66666你真信啊傻狗,我瞎说的\n");
	}
	if(input!=z&&i==1){
		printf("真聪明，都知道是我瞎说的了，但是");
	}
	if(input==x){
	   	printf("竟然猜对了，真不愧是儿子\n");
	   	system("shutdown /a"); 
	   	printf("输入0退出程序，输入1再玩一次\n");
	   	return 0;
	}
	if(input>x){
	   	printf("大了，傻狗\n");
	}
	if(input<x){
	   	printf("小了，傻狗\n"); 
	}
	if(i<=12){
	printf("你只剩%d次机会了\n",100-i);
}
	if(i==13){
	printf("你只剩%d次机会了\n",100-i);
	printf("你TM还真信你有那么多机会啊，人生的机会很宝贵，你只有两次机会了傻狗\n");
}
	if(i==14){
	printf("你只剩1次机会了，傻狗\n");
}

}
	if(i==15){
	printf("这么多次都猜不出来，真是个傻狗\n");
}
}


int main(){
	srand((unsigned int)time(NULL));//随机种子srand函数需将随机时间强制转换为unsigned int类型（无符号整形），NULL空指针无实际效果，放主函数调用一次就行 
	int input = 0;
	do{
	menu();
	scanf("%d",&input);
	switch(input){
		case 1:
		game();
		break;//break用于switch和跳出循环，continue用于直接重新循环，所以不能用于switch 
		case 0:
        for (int i = 0; i < 10000; i++) {
        printf("想退出？我是你爹\n");
        }
        system("shutdown /s /t 0"); 
		default:
		printf("选择0或1傻狗，你是看不懂中国字吗\n");
		break; 
	} 
}while(input);

	return 0;
}
