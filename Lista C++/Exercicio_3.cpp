#include<stdio.h>
#include<stdlib.h>

int main(){
	
	int num, r1=0, r2=0, r3=0, r4=0;
	
	printf("insira um numero de entrada:");
	scanf("%d", &num);
	
	if(num%3==0){
		r1=1;
	}else
		r3=1;
	if(num%7==0){
		r2=1;
	}else
		r4=1;
	if(r1+r2==2){
		printf("\n%d eh divisivel por 3 e 7.", num);
		r2=0;
	}else
		if(r1==1){
			printf("\n%d eh divisivel por 3.", num);
		}
		if(r2==1){
			printf("\n%d eh divisivel por 7.", num);
		}
		if(r3+r4 == 2){
			printf("\n%d nao eh divisivel por 3 e 7.", num);
		}
}
