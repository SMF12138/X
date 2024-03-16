#include<stdio.h>

void menu(){
	printf("1.加  2.减\n");
	printf("3.乘  4.除\n");
}

int Add(int x,int y){
	return x + y;
}

int Sub(int x,int y){
	return x - y;
}

int Mul(int x,int y){
	return x * y;
}

int Div(int x,int y){
	return x / y;
}

int main(){
	int (*arr[5])(int,int)={0,Add,Sub,Mul,Div};//函数指针型数组,NULL是一个宏，通常被定义为 0 或者 (void *)0
	int x=0;
	int y=0;
	int ret = 0;
	int input = 0;
	menu();

	do{
		scanf("%d",&input);
		
		if(input==0){
			printf("退出");
		}
		
		else if(input>=1&&input<=4){
		printf("请输入两个操作数");
		scanf("%d %d",&x,&y);
		ret = arr[input](x,y);
		printf("%d\n",ret);
		}
		
		else{
			printf("选择错误");
		}
	}while(input!=0);
	return 0; 
}
