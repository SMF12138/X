#include<stdio.h> 
#include<string.h>
#include<assert.h>  
void* my_memmove(void* dest,const void*src,size_t num){
	assert(dest&&src);
	void* ret = dest;
	if(dest<src){
		while(num--){
			*(char*)dest = *(char*)src;
			dest = (char*)dest + 1;
			src =  (char*)dest + 1;
		}
	}
	else{
		while(num--){
			*((char*)dest+num)=*((char*)src+num);
		}
	}
	return ret;
}
                               
int main(){
	int arr1[] = {1,2,3,4,5,6};
	int arr2[10] = {0};
	memmove(arr1+2,arr1,16);
	int i = 0;
	for(i = 0;i<6;i++){
		printf("%d ",arr1[i]);
	}
	return 0 ;
} 
