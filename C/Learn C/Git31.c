#include<stdio.h>
//定义宏 
#define SQUARE1(x) x*x
//更好的写法 
#define SQUARE2(x) ((x)*(x))
//宏在编译时先替换参数，再替换宏，但注意宏不能递归
#define PRINT(N) printf("the value of "#N"is %d",N)//#N相当于"N"，即把参数插入字符串中 
#define CAT(a,b) a##b//##用于把两个符号合成一个符号 
//参数在宏中超过一次，若参数带有副作用可能造成危险 
int main(){
	int r1 = SQUARE1(5);
	int r2 = SQUARE1(5+1);
	//实际上计算的是5+1*5+1 
	printf("%d\n",r1);
	printf("%d\n",r2);
	printf("aaa""sss");//打印结果aaasss 
	return 0;
} 
//宏运算效率较函数更高，且不受类型限制(但不够严谨) 
//宏无法调试，容易使程序变长
#undef X//用来取消定义 

//条件编译 
#ifdef __DEBUG__//如果定义了__DEBUG__为真，否则为假 
	...//运行语句 
#endif 

#if ...
	...//运行语句 
#elif ...
	...
#else ...
	...
#endif 
	
#if defined(MAX)//如果定义了为真 
	...
#endif	
	
#if !defined(MAX)//如果不定义为真 
	...
#endif
//另一种写法 
#ifdef MAX//如果定义了为真 
	...
#endif

#ifndef MAX//如果不定义为真 
	...
#endif
//这些指令可嵌套使用

//将下面内容放到头文件中避免头文件多次引用编译时产生大量冗余代码 
#ifndef __TEST_H_//TEST.H为自己定义的头文件名
#define __TEST_H_
...//头文件中内容
#endif 
 
#pragma once//或是这种写法
...//头文件中内容

//<>和""头文件查找方式不同，前者在库目录中查找，后者先去代码所在路径查找，找不到去库目录查找 
