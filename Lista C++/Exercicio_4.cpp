#include<stdio.h>
#include<stdlib.h>

int main(){
	
	int num1, num2, num3, big=0;
	
	printf("Entre com o primeiro numero: ");
	scanf("%d", &num1);
	printf("\nEntre com o segundo numero: ");
	scanf("%d", &num2);
	printf("\nEntre com o terceiro numero: ");
	scanf("%d", &num3);
	
	if(num1>=num2 && num1>=num3){
		big=num1;
	}
	if(num2>=num1 && num2>=num3){
		big=num2;
	}
	if(num3>=num1 && num3>=num2){
		big=num3;
	}
	printf("\n%d Eh o maior numero.", big);
}
