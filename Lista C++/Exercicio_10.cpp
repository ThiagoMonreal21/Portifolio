#include<stdio.h>
#include<stdlib.h>

int main(){
	
	int num1, num2, num3;
	int	Qnum1, Qnum2, Qnum3, Qtotal;
	
	printf("Inserir o primeiro numero entrada: ");
	scanf("%d", &num1);
	printf("Inserir o segundo numero de entrada: ");
	scanf("%d", &num2);
	printf("Inserir o terceiro numero de entrada: ");
	scanf("%d", &num3);
	
	Qnum1=num1*num1;
	Qnum2=num2*num2;
	Qnum3=num3*num3;
	
	Qtotal=Qnum1+Qnum2+Qnum3;
	
	printf("\nA soma dos quadrados eh equivalente ah: %d", Qtotal);

}
