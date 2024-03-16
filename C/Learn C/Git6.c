#include<stdio.h>
void menu(){
	printf("1.加  2.减\n");
	printf("3.乘  4.除\n");
}

void Calc(int(*p)(int,int)){
	int x=0;
	int y=0;
	int ret = 0;
	printf("请输入两个操作数");
	scanf("%d %d",&x,&y);
	ret=p(x,y);
	printf("%d\n",ret);
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
	int input = 0;
	do{
		menu();
		printf("请选择:\n");
		scanf("%d",&input);
		switch(input){
			case 1:
				Calc(Add);
				break;
			case 2:
				Calc(Sub);
				break;
			case 3:
				Calc(Mul);
				break;
			case 4:
				Calc(Div);
				break;
			case 0:
				printf("退出\n");
			break;
				default:
				printf("输入错误\n");
		}
	}while(input);
	return 0; 
}
