//输入n名学生的学号和一门课的成绩，求出平均分并输出；把高于平均分的学生学号和成绩打印出来。
#include<iostream>
using namespace std;
typedef struct student{
	int index;
	int score;
}student;
double average(student students[],int n);
int main(){
	student students[100];
	int n;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>students[i].index;
		cin>>students[i].score; 
	};
	double ave = average(students,n);
	for(int i = 0;i<n;i++){
		if(students[i].score>ave){
			cout<<students[i].index<<" ";
			cout<<students[i].score<<endl;
		};
	};
	return 0;
} 

double average(student students[],int n){
	if(n<=0) return 0; 
	double sum=0;
	for(int i=0;i<n;i++){
		sum+=students[i].score;
	};
	return sum/n;
}
