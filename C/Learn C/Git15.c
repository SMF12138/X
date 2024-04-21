#include<stdio.h>
#include<string.h>
#include<assert.h>
void reserve(char* left, char*right){
	assert(left&&right);
	while(left<right){
		char tmp = *left;
		*left = *right;
		*right = tmp;
		right--;
		left++; 
	}
}

void left_rotate(char arr[],int k){
	int len = strlen(arr);
	k %= len;
	reserve(arr, arr+k-1);
	reserve(arr+k, arr+len-1);
	reserve(arr, arr+len-1);
}

int main(){
	char arr[] = "asdf";
	int k = 0;
	scanf("%d",&k);
	left_rotate(arr,k);
	printf("%s\n",arr);
	return 0;
}  
