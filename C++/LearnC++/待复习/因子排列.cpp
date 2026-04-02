//编写程序，输入n个正整数，按这些数的因子（包括这个数自身）个数从小到大排序，如果因子个数相等，则从大到小排序。
//例如：输入五个数1,2,3,4,5，因子个数分别为1,2,2,3,2，则排序结果为1(1),5(2),3(2),2(2),4(3)，括号内为这个数的因子个数。
//其中2,3,5的因子个数均为2，所以从大到小排序为5,3,2。输入分2行：第一行为n的值，第二行为n个数。 
#include<iostream>
using namespace std;

typedef struct factor{
	int num;
	int fac;
}factor;

factor factors[100];

int calculate_factors(int n);
void fac_sort(factor factors[],int left,int right);
void swap(factor& a,factor& b);

int main(){
	int n;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>factors[i].num;
	};
	for(int i=0;i<n;i++){
		factors[i].fac=calculate_factors(factors[i].num);
	};
	fac_sort(factors,0,n-1);
	for(int i=0;i<n;i++){
		cout<<factors[i].num<<" ";
	};
	return 0;
}

int calculate_factors(int n){
	int num = 0;
	for(int i = 1;i <= n;i++){
		if(n%i==0) num++;
	};
	return num;
}

void fac_sort(factor factors[],int left,int right){
	if(left>=right) return;
	factor temp = factors[left];
	int i=left,j=right;
	while(i<j){
		while(i<j&&(factors[j].fac > temp.fac || (factors[j].fac == temp.fac && factors[j].num <= temp.num)))j--;	
		while(i<j&&(factors[i].fac < temp.fac || (factors[i].fac == temp.fac && factors[i].num >= temp.num)))i++;
		if(i<j) swap(factors[i],factors[j]);
	};
	swap(factors[left],factors[i]);
	fac_sort(factors,left,i-1);
	fac_sort(factors,i+1,right);
}

void swap(factor& a,factor& b){
	factor temp = a;
	a = b;
    b = temp;
}
