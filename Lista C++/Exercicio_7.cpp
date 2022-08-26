#include<stdio.h>
#include<stdlib.h>

int main(){
	
	int num1, num2, num3;
	int bigger=0, smaller=0, medium=0;
	
	printf("Inserir o primeiro numero entrada: ");
	scanf("%d", &num1);
	printf("Inserir o segundo numero de entrada: ");
	scanf("%d", &num2);
	printf("Inserir o terceiro numero de entrada: ");
	scanf("%d", &num3);
	
	bigger=num1;
	smaller=num1;
	
	if(num2<smaller){
		smaller=num2;
	}
	if(num2>bigger){
		bigger=num2;
	}
	if(num3<smaller){
		smaller=num3;
	}
	if(num3>bigger){
		bigger=num3;
	}
	system("cls");
	printf("O maior numero eh %d e o menor foi o %d", bigger, smaller);
}

