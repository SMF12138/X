#include<stdio.h>
//创建Stu结构体类型 
struct Stu{
	char name[20];
	int age;
};
//匿名结构体类型 
struct {
	char name[20];
	int age;
}x;
//对于编译器来说x，y是两种不同的类型 
struct {
	char name[20];
	int age;
}y;
//结构体自引用(链表) 
struct Node{
	int data;
	struct Node* next;
}; 
//自定义结构体两种写法 
typedef struct NodeList1{
	int data;
	struct NodeList1* next;
}NodeList1;  
//等价于 
struct NodeList2{
	int data;
	struct NodeList2* next;
};  
typedef struct NodeList2 NodeList2;

int main(){} 
