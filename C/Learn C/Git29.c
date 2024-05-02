#include<stdio.h>
#include<string.h>
#include<errno.h>
struct S{
	int i;
	char name[20];
}; 

int main(){
	struct S s = {0};
	FILE*pf = fopen("test.txt","rb");//二进制读取 
	if(pf==NULL){
		printf("%s\n",strerror(errno));
		return 1;
	}
	fread(&s,sizeof(struct S),1,pf);//写入一个大小为结构体的数据到结构体(不同于之前的函数适用所有输入流，只用于文件) 
	printf("%d %s\n",s.i,s.name); 
	fclose(pf);
	pf = NULL;
	return 0;
} 
