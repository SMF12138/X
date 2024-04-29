#include<stdio.h>
int main(){
	int m = 0;
	int n = 0;
	while(scanf("%d %d",&m,&n)==2){//成功读取两个整数 
		int min = n<m?n:m;
		int max = n>m?n:m;
		int i = min;
		//最大公约数 
		while(1){
			if(n%i==0&&m%i==0){
				break;
			}
			i--;
		}
		int j = max;
		while(1){
			if(j%n==0&&j%m==0){
				break;
			}
			i++;
		}
		printf("%d\n",i+j);
	}
	return 0;
}

//辗转相除法
i = n;
j = m;
while(r=i%j){
	i = j;
	j = r;
} 
//最大公约数j 
//最小公倍数m*n/j 



