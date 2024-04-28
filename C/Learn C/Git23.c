//错误
#include<stdio.h>
#include<errno.h>
#include<stdlib.h>
#include<string.h>
int main(){
	int *p = (int*)malloc(40);
	if(p == NULL){
		return 1;
	} 
	*p = 20;//否则可能对空指针解引用 
	free(p);
	p = NULL; 
	return 0;
} 

int main(){
	int *p = (int*)malloc(40);
	if(p == NULL){
	printf("%s\n",strerror(errno));
	return 1;
} 
	int i = 0;
	for(i = 0;i<=10;i++){//越界访问 
		p[i]=i;
	} 
	free(p);
	p = NULL;
	return 0;
}

int main(){
	int a = 1; 
	int *p = &a;
	free(p);//对非动态开辟的内存使用free 
	p = NULL;
	return 0;
}

int main(){
	int *p = (int*)malloc(40);
	if(p == NULL){
	printf("%s\n",strerror(errno));
	return 1;
} 
	int i = 0;
	for(i = 0;i<=10;i++){ 
		*p=i;
		p++;//指针移动不在起始位置 
	} 
	free(p);//找不到起始位置 
	p = NULL;
	return 0;
}

int main(){
	int *p = (int*)malloc(40);
	free(p);
	free(p);//重复释放 
	return 0;
}

void test(){
	int *p = (int*)malloc(40);
	//...
	if(...){
		return;//如果中途返回 
	}
	//...
	free(p);//无法释放，内存泄露 
	p = NULL;	
} 

int* test(){
	int *p = (int*)malloc(40);
	//...
	return p;//被主函数接收使用，但主函数忘记释放造成的泄露 
} 
