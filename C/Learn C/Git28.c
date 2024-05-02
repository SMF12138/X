#include<stdio.h>
#include<errno.h>
struct S{
	int i;
	char name[20];
}; 

int main(){
	struct S s = {1,"AAAAA"};
	FILE*pf = fopen("test.txt","wb");//二进制写入 
	if(pf==NULL){
		perror("fopen");//获取错误信息并打印 
		return 1;
	}
	fwrite(&s,sizeof(struct S),1,pf);//写出一个大小为结构体的数据到文件(不同于之前的函数适用所有输入流，只用于文件)
	fclose(pf);
	pf = NULL;
	return 0;
} 
