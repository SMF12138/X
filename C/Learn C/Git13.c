#include<stdio.h> 
#include<string.h>
#include<assert.h> 
int main(){
	int arr1[] = {1,2,3,4,5};
	int arr2[] = {1,3,2};
	int ret = memcmp(arr1,arr2,12);//比较内存空间数据，arr1大返回正数，否则返回负数，相等返回0 
	printf("%d\n",ret);
	char arr[] = "holle bit";
	memset(arr,'x',5);//内存设置函数，但是由于是以字节为单位修改内存，所以不能修改如int型的内容 
	printf("%s\n",arr); 
	return 0;
}
