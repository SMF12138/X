//柔性数组(结构体成员中最后一个，前面至少有一个其他成员)
#include<stdio.h> 
#include<stdlib.h>
typedef struct a {
	int i;
	int a[0];//或int a[];
}a;
int main() {
	int sz = sizeof(struct a);//返回的结构大小不包括柔性数组的内存 
	printf("%d\n", sz);
	struct a* ps = (struct a*)malloc(sizeof(struct a) + 40);//除了结构体成员所占内存，单独给a开辟了40个字节
	if (ps == NULL) {
		return 1;
	}
	ps->i = 100;
	for (int j = 0;j < 10;j++) {
		ps->a[j] = j;
	}
	struct a* p = (struct a* p)realloc(ps, sizeof(struct a) + 80);
	if (p != NULL) {
		ps = p;
		p = NULL;
	}
	free(ps);
	ps = NULL;
	return 0;
}
//通过给指针分配内存也能达到同样的效果，但需要先后开辟和释放两次空间(结构体和指针)，留下内存碎片 
