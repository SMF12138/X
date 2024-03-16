#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void Huoshu(int Lun,float Jia,float Yi,float Bing,int*J,int*Y,int*B,int*S){
	*J=0;*Y=0;*B=0;*S=0;
    for (int i = 0; i < Lun; i++) {
    	int JiaXue=1;int YiXue=1;int BingXue = 1;
    	while(JiaXue+YiXue+BingXue>1){
        	float random1 = (float) rand() / RAND_MAX; 
       		if (random1 < Jia) {
          	if(YiXue!=0) YiXue=0;
           	else BingXue=0;
       }
       		float random2 = (float) rand() / RAND_MAX; 
        	if (random2 < Yi) {
            if(JiaXue!=0) JiaXue=0;
            else BingXue=0;
       }
       		float random3 = (float) rand() / RAND_MAX; 
        	if (random3 < Bing) {
            if(JiaXue!=0) JiaXue=0;
            else YiXue=0;
       }
	}
       if(JiaXue==1) (*J)++;
       if(YiXue==1) (*Y)++;
       if(BingXue==1) (*B)++;
       if(JiaXue==YiXue==BingXue==0) (*S)++;
       printf("第%d轮\n",i+1);
    }
}
    
int main() {
    float Jia = 8.0 / 10.0; 
    float Yi = 6.0 / 10.0; 
    float Bing = 4.0 / 10.0;
    int Lun = 1000000; 
    
    srand(time(0)); 
	int J,Y,B,S;
	Huoshu(Lun,Jia,Yi,Bing,&J,&Y,&B,&S);
    float Jhuo = (float) J / Lun;
    float Yhuo = (float) Y / Lun;
    float Bhuo = (float) B / Lun;
    float Sguang = (float) S / Lun;
 	printf("甲存活轮数%d\n",J);
    printf("甲存活概率%f\n",Jhuo);
	printf("乙存活轮数%d\n",Y);
    printf("乙存活概率%f\n",Yhuo); 
	printf("丙存活轮数%d\n",B);
    printf("丙存活概率%f\n",Bhuo);
	printf("全死轮数%d\n",S);
    printf("全死概率%f\n",Sguang);
    return 0;
}
