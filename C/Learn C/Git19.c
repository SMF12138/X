//结构体内存对齐
#include<stdio.h>
#include<stddef.h>
struct S1{
	char c1;
	int i;
	char c2;
};
//结构体按照成员顺序开辟内存，按顺序开辟，总内存为对齐数的整数倍 
struct S2{
	char c1;
	char c2;
	int i;
};
//如果嵌套了结构体，则嵌套的结构体按其对齐数取其结构体内数 
int main(){
	printf("%d\n",sizeof(struct S1));
	//offsetof计算类型在结构中偏移量 
	printf("%d\n",offsetof(struct S1,c1));
	printf("%d\n",offsetof(struct S1,i));
	printf("%d\n",offsetof(struct S1,c2));
	printf("%d\n",sizeof(struct S2));
	printf("%d\n",offsetof(struct S2,c1));
	printf("%d\n",offsetof(struct S2,i));
	printf("%d\n",offsetof(struct S2,c2));
	return 0;
} 
