#include<stdio.h>
#include<stdlib.h>

int main(){
	
	int num, i;
	
	printf("Entre com um numero: ");
	scanf("%d", &num);
	
	if(num%3==0){
		printf("\n%d eh multiplo de 3", num);
	}
	else
	printf("\n%d nao eh multiplo de 3", num);
		if(num%5==0){
			printf("\n%d eh multiplo de 5", num);
		}
		else
		printf("\n%d nao eh multiplo de 5", num);
}

