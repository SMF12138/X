#include<stdio.h>
#include<string.h>
void left_rotate(char arr[],int k){
	int i = 0;
	int len = strlen(arr);
	k %= len; 
	for(i=0;i<k;i++){
		char tmp = arr[0];
		int j = 0;
		for(j = 0;j<len-1;j++){
			arr[j]=arr[j+1];
			
		}
		arr[len-1] = tmp;
	}
}

int main(){
	char arr[] = "asdf";
	int k = 0;
	scanf("%d",&k);
	left_rotate(arr,k);
	printf("%s\n",arr);
	return 0;
}  
