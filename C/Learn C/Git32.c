#include<stdio.h>
//找两个不同数 
void find(int arr[],int sz,int*dog1,int*dog2){
	int i = 0;
	int ret = 0;
	//所有数异或，同数消除 
	for(i;i<sz;i++){
		ret^=arr[i];
	}	
	//找出两数异或后的1(即不同位) 
	int pos = 0; 
	for(pos;pos<32;pos++){
		if(((ret>>pos)&1)==1){
			break;
		}
	} 
	//按该位分组
	for(i=0;i<sz;i++){
		//同时异或，相同数字相消，最后只剩下不同数 
		if(((arr[i]>>pos)&1)==1){
			*dog1^=arr[i];
		}
		else{
			*dog2^=arr[i];
		}
	} 
}

int main(){
	int arr[]={1,2,3,4,6,5,4,3,2,1};
	int sz = sizeof(arr)/sizeof(arr[0]);
	int dog1 = 0;
	int dog2 = 0;
	find(arr,sz,&dog1,&dog2);
	printf("%d %d\n",dog1,dog2);
	return 0;
} 
