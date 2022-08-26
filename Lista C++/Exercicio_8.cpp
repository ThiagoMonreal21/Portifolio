#include<stdio.h>
#include<stdlib.h>

int main(){
	
	char product[20];
	float value, bss_value=0, ac=0;
	
	printf("Informe o nome do produto: ");
	scanf("%s", &product);
	
	printf("informe o valor de custo do/a %s:", product);
	scanf("%f", &value);
	
	bss_value=value*1.3;
	ac=bss_value-value;
	
	printf("\nO valor do/a produto %s eh de %.2f", product,bss_value);
	printf("\nE o valor de acressimo foi de %.2f", ac);
}
