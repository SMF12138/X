#include<stdio.h>
#include <cstdlib>
char* Dapai(int people,int paixing,char pai,char Pai[],char X[],int i){
	int count = 0;
	if(i==17){
		switch(people){
		case 1:
			switch(paixing){
			case 1:case 3: 
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==1)
					return X;
					}	
				}
			case 2:case 4:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==2)
					return X;
					}
				}
			case 5:case 6:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==3)
					return X;
					}
				}
			case 7:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==4)
					return X;
					}
				}				
			}
		case 2:		
			switch(paixing){
			case 1:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==1)
					return X;
					}	
				}
			case 2:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==2)
					return X;
					}
				}
			case 5:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==3)
					return X;
					}
				}
			case 7:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==4)
					return X;
					}
				}				
			}
		case 0: 
			switch(paixing){
			case 1:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==1)
					return X;
					}	
				}
			case 2:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==2)
					return X;
					}
				}
			case 5:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==3)
					return X;
					}
				}
			case 7:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==4)
					return X;
					}
				}				
			}
		}
	}
	
	else{
		switch(people){
		case 1:
			switch(paixing){
			case 1:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==1)
					return X;
					}	
				}
			
			case 2:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==2)
					return X;
					}
				}
			case 7:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==4)
					return X;
					}
				}				
			}
		case 2:		
		switch(paixing){
			case 1:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==1)
					return X;
					}	
				}
			case 2:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==2)
					return X;
					}
				}
			case 7:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==4)
					return X;
					}
				}				
			}
		case 0: 
		switch(paixing){
			case 1:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==1)
					return X;
					}	
				}
			
			case 2:
				for(int j = 0;j<54;j++){
					if(X[j]==pai){
					X[j]=0; 
					count++;
					if(count==2)
					return X;
					}
				}		
			}
		} 
	}
}

char* Caice(int people,char Pai[],char X[],int i){
	printf("打出（1.单 2.对 3.顺 4.连对 5.三带 6.飞机 7.炸弹）\n");
	int paixing = 0;char pai = '0';char*temp;int p = 0;	int leng;
	scanf("%d",&paixing);
	switch(paixing){
		case 1:
			printf("打出的是单几\n");
			scanf(" %c",&pai);
			return Dapai(people,paixing,pai,Pai,X,i);
		case 2:		
			printf("打出的是对几\n");
			scanf(" %c",&pai);
			return Dapai(people,paixing,pai,Pai,X,i);
		case 3:
			printf("打出的是几顺\n");
			scanf("%d",&leng);
			printf("从几开始\n");
			scanf(" %c",&pai);
			switch(pai){
				case '3':temp = Dapai(people,paixing,pai,Pai,X,i);		
								p++;
				case '4':if(pai=='4')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='4';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
				case '5':if(pai=='5')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='5';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
				case '6':if(pai=='6')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='6';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
				case '7':if(pai==7)Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='7';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case '8':if(pai=='8')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='8';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case '9':if(pai=='9')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='9';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'O':if(pai=='O')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='O';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'J':if(pai=='J')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='J';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'Q':if(pai=='Q')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='Q';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'K':if(pai=='K')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='K';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'A':if(pai=='A')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='A';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
			}
		case 4:
			printf("打出的是几对\n");
			scanf("%d",&leng);
			printf("从几开始\n");
			scanf(" %c",&pai);
			switch(pai){
				case '3':temp = Dapai(people,paixing,pai,Pai,X,i);		
								p++;
				case '4':if(pai=='4')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='4';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
				case '5':if(pai=='5')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='5';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
				case '6':if(pai=='6')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='6';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
				case '7':if(pai==7)Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='7';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case '8':if(pai=='8')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='8';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case '9':if(pai=='9')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='9';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'O':if(pai=='O')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='O';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'J':if(pai=='J')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='J';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'Q':if(pai=='Q')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='Q';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'K':if(pai=='K')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='K';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
				case 'A':if(pai=='A')Dapai(people,paixing,pai,Pai,X,i);
						else {
							pai='A';
							temp = Dapai(people,paixing,pai,Pai,temp,i);
						}
								p++;
								if(p==leng) return temp;
			}
		case 5:		
			printf("打出的是三几\n");
			scanf(" %c",&pai);
			temp = Dapai(people,paixing,pai,Pai,X,i);
			printf("带（1.单 2.对）\n");
			scanf("%d",&paixing);
			if(paixing==1) printf("单几？\n");
			else  printf("对几？\n");
			scanf(" %c",&pai);
			return Dapai(people,paixing,pai,Pai,temp,i);
		case 6:		
			printf("打出的是三几\n");
			scanf(" %c",&pai);
			temp = Dapai(people,paixing,pai,Pai,X,i);
			printf("打出的是三几\n");
			scanf(" %c",&pai);
			temp = Dapai(people,paixing,pai,Pai,temp,i);
			printf("带（1.单 2.对）\n");
			scanf("%d",&paixing);
			if(paixing==1) printf("单几？\n");
			else  printf("对几？\n");
			scanf(" %c",&pai);
			temp = Dapai(people,paixing,pai,Pai,temp,i);
			if(paixing==1) printf("单几？\n");
			else  printf("对几？\n");
			scanf(" %c",&pai);
			return Dapai(people,paixing,pai,Pai,temp,i);
		case 7:		
			printf("打出的是几炸\n");
			scanf(" %c",&pai);
			return Dapai(people,paixing,pai,Pai,X,i);
	}
}

void BianliPai(char BlPa[]){
	for (int i = 0; i<54 ; i++) {
		printf("%c", BlPa[i]);
	}
	printf("\n");
}

char* ShengPai(char Pai[], char You[]){
	for(int j=0;j<54;j++){
		for(int k=0;k<54;k++){
			if(You[k]==Pai[j]){
				Pai[j]= 0;
				You[k]= 0;
				break;
			}
		}
	}
	return Pai; 
}

char* Paixu(char MyPai[],int Pai) {
	char* PaiXuMyPa = (char*)calloc(54, sizeof(char)); // 动态分配内存并初始化为0
	int i = 0;
	while (i < Pai) {
		switch (MyPai[i]) {
		case 'W':
			PaiXuMyPa[0] = 'W';
			break;
		case 'w':
			PaiXuMyPa[1] = 'w';
			break;
		case '2':
			if (PaiXuMyPa[2] == '\0')
				PaiXuMyPa[2] = '2';
			else if (PaiXuMyPa[3] == '\0')
				PaiXuMyPa[3] = '2';
			else if (PaiXuMyPa[4] == '\0')
				PaiXuMyPa[4] = '2';
			else if (PaiXuMyPa[5] == '\0')
				PaiXuMyPa[5] = '2';
			break;
		case 'A':
			if (PaiXuMyPa[6] == '\0')
				PaiXuMyPa[6] = 'A';
			else if (PaiXuMyPa[7] == '\0')
				PaiXuMyPa[7] = 'A';
			else if (PaiXuMyPa[8] == '\0')
				PaiXuMyPa[8] = 'A';
			else if (PaiXuMyPa[9] == '\0')
				PaiXuMyPa[9] = 'A';
			break;
		case 'K':
			if (PaiXuMyPa[10] == '\0')
				PaiXuMyPa[10] = 'K';
			else if (PaiXuMyPa[11] == '\0')
				PaiXuMyPa[11] = 'K';
			else if (PaiXuMyPa[12] == '\0')
				PaiXuMyPa[12] = 'K';
			else if (PaiXuMyPa[13] == '\0')
				PaiXuMyPa[13] = 'K';
			break;
		case 'Q':
			if (PaiXuMyPa[14] == '\0')
				PaiXuMyPa[14] = 'Q';
			else if (PaiXuMyPa[15] == '\0')
				PaiXuMyPa[15] = 'Q';
			else if (PaiXuMyPa[16] == '\0')
				PaiXuMyPa[16] = 'Q';
			else if (PaiXuMyPa[17] == '\0')
				PaiXuMyPa[17] = 'Q';
			break;
		case 'J':
			if (PaiXuMyPa[18] == '\0')
				PaiXuMyPa[18] = 'J';
			else if (PaiXuMyPa[19] == '\0')
				PaiXuMyPa[19] = 'J';
			else if (PaiXuMyPa[20] == '\0')
				PaiXuMyPa[20] = 'J';
			else if (PaiXuMyPa[21] == '\0')
				PaiXuMyPa[21] = 'J';
			break;
		case 'O':
			if (PaiXuMyPa[22] == '\0')
				PaiXuMyPa[22] = 'O';
			else if (PaiXuMyPa[23] == '\0')
				PaiXuMyPa[23] = 'O';
			else if (PaiXuMyPa[24] == '\0')
				PaiXuMyPa[24] = 'O';
			else if (PaiXuMyPa[25] == '\0')
				PaiXuMyPa[25] = 'O';
			break;
		case '9':
			if (PaiXuMyPa[26] == '\0')
				PaiXuMyPa[26] = '9';
			else if (PaiXuMyPa[27] == '\0')
				PaiXuMyPa[27] = '9';
			else if (PaiXuMyPa[28] == '\0')
				PaiXuMyPa[28] = '9';
			else if (PaiXuMyPa[29] == '\0')
				PaiXuMyPa[29] = '9';
			break;
		case '8':
			if (PaiXuMyPa[30] == '\0')
				PaiXuMyPa[30] = '8';
			else if (PaiXuMyPa[31] == '\0')
				PaiXuMyPa[31] = '8';
			else if (PaiXuMyPa[32] == '\0')
				PaiXuMyPa[32] = '8';
			else if (PaiXuMyPa[33] == '\0')
				PaiXuMyPa[33] = '8';
			break;
		case '7':
			if (PaiXuMyPa[34] == '\0')
				PaiXuMyPa[34] = '7';
			else if (PaiXuMyPa[35] == '\0') 
				PaiXuMyPa[35] = '7';
			else if (PaiXuMyPa[36] == '\0') 
				PaiXuMyPa[36] = '7';
			else if (PaiXuMyPa[37] == '\0') 
				PaiXuMyPa[37] = '7';
			break;
		case '6':
			if (PaiXuMyPa[38] == '\0') 
				PaiXuMyPa[38] = '6';
			else if (PaiXuMyPa[39] == '\0')
				PaiXuMyPa[39] = '6';
			else if (PaiXuMyPa[40] == '\0') 
				PaiXuMyPa[40] = '6';
			else if (PaiXuMyPa[41] == '\0') 
				PaiXuMyPa[41] = '6';
			break;
		case '5':
			if (PaiXuMyPa[42] == '\0') 
				PaiXuMyPa[42] = '5';
			else if (PaiXuMyPa[43] == '\0') 
				PaiXuMyPa[43] = '5';
			else if (PaiXuMyPa[44] == '\0')
				PaiXuMyPa[44] = '5';
			else if (PaiXuMyPa[45] == '\0') 
				PaiXuMyPa[45] = '5';
			break;
		case '4':
			if (PaiXuMyPa[46] == '\0') 
				PaiXuMyPa[46] = '4';
			else if (PaiXuMyPa[47] == '\0') 
				PaiXuMyPa[47] = '4';
			else if (PaiXuMyPa[48] == '\0')
				PaiXuMyPa[48] = '4';
			else if (PaiXuMyPa[49] == '\0') 
				PaiXuMyPa[49] = '4';
			break;
		case '3':
			if (PaiXuMyPa[50] == '\0')
				PaiXuMyPa[50] = '3';
			else if (PaiXuMyPa[51] == '\0') 
				PaiXuMyPa[51] = '3';
			else if (PaiXuMyPa[52] == '\0') 
				PaiXuMyPa[52] = '3';
			else if (PaiXuMyPa[53] == '\0')
				PaiXuMyPa[53] = '3';
			break;
		default:
			// 处理其他字符的错误或默认情况
			break;
		}
		i++;
	}
	return PaiXuMyPa;
}

int main() {
	char Pai[54] = {'W', 'w', '2', '2', '2', '2', 'A', 'A', 'A', 'A', 'K', 'K', 'K', 'K', 'Q', 'Q', 'Q', 'Q', 'J', 'J', 'J', 'J', 'O', 'O', 'O', 'O',
    		'9', '9', '9', '9', '8', '8', '8', '8', '7', '7', '7', '7', '6', '6', '6', '6', '5', '5', '5', '5', '4', '4', '4', '4', '3', '3', '3', '3'};
	printf("您是地主吗\n");
	printf("0：是 1：不是\n");
	int people;
	scanf("%d", &people);
	if(people) printf("默认您为农民1\n"); 
	int i;
	if (people == 1) {
		i = 17;
	}
	else {
		i = 20;
	}

	printf("输入您摸到的牌\n");
	int j = 0;
	char You[54]={0};
	while (j < i) {
		scanf(" %c", &You[j]);
		j++;
	}
	int c;
	while ((c = getchar()) != '\n' ) { }
	char* MyPai = Paixu(You,i);//返回的是排序好的You 
	printf("您摸到的牌是\n");
	BianliPai(MyPai);
	char* SP = ShengPai(Pai,MyPai);
	printf("场上剩下\n");
	BianliPai(SP);
	char*X;
	int key = 1;
	while(key){
	int x = 0;
	printf("是否是你出牌（0.不是 1.是）\n");
	scanf("%d",&x);
	if(x==0){
		switch(people){
		case 0:
			printf("请输入出牌人（1.农民1 2.农民2）\n");
			people = scanf("%d",&people);
		case 1:
			printf("请输入出牌人（0.地主 2.农民）\n");
			people = scanf("%d",&people);
		}
	}
	if(x) X=You;
	else X=SP;
	X=Caice(people,Pai,X,i);
	key = 0;
	for(j=0;j<54;j++){
		key = *(X+j)+key;
	}
	if(key!=0){
	printf("剩下\n");
	BianliPai(Paixu(X,i));
	if(x) MyPai=X;
	else SP=X;	
	}
}	
	free(SP);
	free(MyPai);
	printf("游戏结束\n");
	return 0;
}
