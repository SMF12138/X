//动态内存管理 
#include<stdio.h>
#include<errno.h>
#include<stdlib.h>
#include<string.h>
int main(){
	//静态开辟(栈) 
	int arr[10]={0};
	//动态开辟(堆) 
	int*p = (int*)malloc(40);
	int*pp = (int*)calloc(10,sizeof(int));//开辟大小为int的10个元素并初始化为0 

	if(p == NULL){
		printf("%s\n",strerror(errno));
		return 1;
	} 
	int i = 0;
	for(i = 0;i<10;i++){
		*(p+i) = i;
	}
	for(i = 0;i<10;i++){
		printf("%d\n",*(p+i));
	}
	free(p);
	free(pp);
	p = NULL;//此时地址指向的内存已经不属于程序，指针赋成NULL避免出现悬挂指针(即指向未知内存)被错误使用 
	pp = NULL;
	return 0;
} 
