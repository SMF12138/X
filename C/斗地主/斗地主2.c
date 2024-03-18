#include<stdio.h>
#include <cstdlib>
char* Dapai(int people,int paixing,char pai,char Pai[],char MyPai[],int i){
	int count = 0;
	if(i==17){
		switch(people){
		case 1:
			switch(paixing){
			case 1:
				for(int j = 0;j<54;j++){
					if(MyPai[j]==pai){
					MyPai[j]=0; 
					count++;
					if(count==1)
					return MyPai;
					}	
				}
			
			case 2:
				for(int j = 0;j<54;j++){
					if(MyPai[j]==pai){
					MyPai[j]=0; 
					count++;
					if(count==2)
					return MyPai;
					}
				}		
			}
		case 2:	break;	
		case 0: break;
		} 
	}
	
	else{
		switch(people){
		case 1:
			
		case 2:
			
		case 0:
			switch(paixing){
			case 1:
				for(int j = 0;j<54;j++){
					if(MyPai[j]==pai){
					MyPai[j]=0; 
					count++;
					if(count==1)
					return MyPai;
					}
				}
			
				case 2:
					for(int j = 0;j<54;j++){
						if(MyPai[j]==pai){
						MyPai[j]=0; 
						count++;
						if(count==2)
						return MyPai;
						}
					}
				} 
			}
		}
	}

char* Caice(int people,char Pai[],char MyPai[],int i){
	printf("打出（1.单 2.对 3.顺 4.连对 5.三代 6.飞机 7.炸弹）\n");
	int paixing = 0;char pai = '0';
	scanf("%d",&paixing);
	switch(paixing){
		case 1:
			printf("打出的是单几\n");
			scanf(" %c",&pai);
			return Dapai(people,paixing,pai,Pai,MyPai,i);
		case 2:		
			break;
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
				Pai[j]= 0;//这里由于改变了Pai使传入指针接收时发生截断 
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
	printf("0：不是 1：是\n");
	int Dizhu;
	scanf("%d", &Dizhu);

	int i;
	if (Dizhu == 0) {
		i = 17;
	}
	else {
		i = 20;
	}

	printf("输入您摸到的牌\n");
	int j = 0;
	char You[i]={0};
	while (j < i) {
		scanf(" %c", &You[j]);
		j++;
	}
	int c;
	while ((c = getchar()) != '\n' ) { }
	char* MyPai = Paixu(You,i);
	printf("您摸到的牌是\n");
	BianliPai(MyPai);
	char* SP = ShengPai(Pai,MyPai);
	while(1){
	printf("场上剩下\n");
	BianliPai(SP);
	printf("请输入出牌人（1.农民1 2.农民2 0.地主）\n");
	int people = 0;
	scanf("%d",&people);
	SP=Caice(people,Pai,SP,i);
}	
	free(SP);
	free(MyPai);
	return 0;
}
