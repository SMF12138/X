#include<stdio.h>
#include<string.h>

char* my_strstr(const char*str1,const char*st2){
	assert(arr1&&arr2);
	const char* s1 = str1; 
	const char* s2 = str2;
	const char* p = str1;
	while(*p){
		s1 = p;
		s2 = str2;
		while(*s1==*s2&&*s1!='\0'){
			s1++;
			s2++;
		}
		if(*s2=='\0')
		return (char*)p;
		p++;
	} 
	return NULL;
} 

int main(){
	char arr1[20] = "zhangsan";
	char arr2[20] = "lisi";
	//有长度限制的拷贝函数，将前两个字符拷贝过去(长度不够补\0) 
	strncpy(arr1,arr2,2)
	//有长度的字符串追加，将前三个字符追加过去(长度不够不补) 
	strncat(arr1,arr2,3) 
	////有长度的字符串比较 
	int x = strncmp(arr1,arr2,3);
	int ret = strcmp(arr1,arr2);
	if(ret<0)
	printf("<\n");
	else if(ret==0)
	printf("=\n");
	else
	printf(">\n");
	//查找arr1中有没有arr2，如果有返回arr1中找到的地址，没有返回NULL 
	strstr(arr1,arr2) 
	return 0 ;
}

















 
