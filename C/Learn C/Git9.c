#include<stdio.h>
//仿照qsort的冒泡排序 
int cmp_int(const void* e1,const void* e2){
	return (*(int*)e2-*(int*)e1);//e2代表后一个元素，e1代表前一个元素！！ 
}

void Swap(char*buf1,char*buf2,int width){
	int i = 0;
	for(i+0;i<width;i++){
		char tmp = *buf1;
		*buf1 = *buf2;
		*buf2 = tmp;
		buf1++;
		buf2++;
	}
}

void bubble_sort(void* base,int sz,int width,int(*cmp)(const void*e1,const void*e2)){//函数指针接收函数 
	int i=0;
	for(i=0;i<sz-1;i++){
		int flag = 1;
		int j = 0;
		for(j=0;j<sz-1-i;j++){
			if(cmp((char*)base+j*width,(char*)base+(j+1)*width)>0){//这里仿照qsort函数，如果return大于0就交换！！ 
				Swap((char*)base+j*width,(char*)base+(j+1)*width,width);//用这种形式能够收容所有类型的数组或结构体，只需给出首地址和宽度 
				flag = 0;
			}
		}
		if(flag==1){
			break;;
		}
	}
}

int main(){
	int arr[]={1,2,3,4,5,6,7,8,9};
	int sz = sizeof(arr)/sizeof(arr[0]);
	bubble_sort(arr,sz,sizeof(arr[0]),cmp_int);
	int i = 0;
	for(i=0;i<sz;i++){
		printf("%d ",arr[i]);
	}
}
