#include<stdio.h>
#include<errno.h>
struct S{
	int i;
	char name[20];
}; 

int main(){
	struct S s = {1,"AAAAA"};
	FILE*pf = fopen("test.txt","w");
	if(pf==NULL){
		perror("fopen");//获取错误信息并打印 
		return 1;
	}
	fputc('a',pf);//(由内存到文件)写出一个字符
	fputs("aaaa\n",pf);//(由内存到文件)写出一行字符
	fprintf(pf,"%d %s",s.i,s.name);//格式化写出 
	fclose(pf);
	pf = NULL;
	return 0;
} 
