#include<stdio.h>
#include<string.h>

int main(){
	//strtok一般第一次传入指针，后面传入NULL 
	const char* sep = "@.";
	char email[] = "wsnbb@qq.com";
	char*ret = strtok(email,sep);//找到指定的字符并改成\0,同时返回开始地址并保存当前指针(字符)位置 
	//因为srrtok会改变字符串内容所以一般对临时拷贝进行操作
	//如果前一个参数为空指针，则函数会找下一个标记，都找不到返回NULL 
	printf("%s\n",ret);
	//传空指针可以在上次截断的字符串结尾继续找 
	ret = strtok(NULL,sep);
	printf("%s\n",ret);
	ret = strtok(NULL,sep);
	printf("%s\n",ret);
	return 0;
}
	//巧妙写法
	ret = NULL;
	for(ret = strtok(email,sep);ret != NULL; strtok(NULL,sep)){
	printf("%s\n",ret);
} 
