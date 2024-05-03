#include<stdio.h>
#include<string.h>
#include<errno.h>

int main(){
	
	FILE*pf = fopen("test.txt","r");
	if(pf==NULL){
		printf("%s\n",strerror(errno));
		return 1;
	}
	fseek(pf,5,SEEK_SET);//定位文件指针为起始，偏移量为5
	char ch = fgetc(pf);
	printf("%c\n",ch);
	printf("%d\n",ftell(pf));//打印此时相对起始位置的偏移量 
	rewind(pf);//让指针回到起始位置 
	fclose(pf); 
	pf = NULL;
	return 0;
} 
