//动态内存管理 
#include<stdio.h>
#include<errno.h>
#include<stdlib.h>
#include<string.h>
int main(){
	int*p = (int*)malloc(40);
	if(p == NULL){
		printf("%s\n",strerror(errno));
		return 1;
	} 
	int i = 0;
	for(i = 0;i<10;i++){
		*(p+i) = i+1;
	}
	int* pp = (int*)realloc(p,80);//扩容，增加了40字节(若后面空间不够则返回新的能开辟成功的地址，此时旧空间被自动释放)
	if(pp != NULL){
		p = pp;//避免开辟失败的情况引入pp指针 
	}
	free(p);
	p = NULL;  
	return 0;
} 
