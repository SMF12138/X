#include<stdio.h>
#include<string.h>
#include<errno.h>
struct S{
	int i;
	char name[20];
}; 

int main(){
	struct S s = {0};
	FILE*pf = fopen("test.txt","r");
	if(pf==NULL){
		printf("%s\n",strerror(errno));
		return 1;
	}
	char ch1 = fgetc(pf);//读一个字符 
	if(ch1 != EOF)//读取失败返回EOF 
	printf("%c\n",ch1);
	char arr[20]; 
	char*p = fgets(arr,5,pf);//将(读)一行字符储存到arr(实际读到四个字符加一个\0)，返回arr首地址(可不接收) 
	if(p != NULL)//读取失败返回NULL，不接收则丢失 
	printf("%s\n",arr);
	fscanf(pf,"%d %s",&(s.i),s.name);//格式化(由文件到内存)写入，若格式不符则失败 
	printf("%d %s\n",s.i,s.name);
	fprintf(stdout,"%d %s\n",s.i,s.name);//stdout为标准输出流，替换pf使打印位置改为屏幕 
	fclose(pf);
	pf = NULL;
	return 0;
} 
