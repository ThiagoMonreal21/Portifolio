#include<stdio.h>
#include<stdlib.h>

int main(){
	
	int seg_total, dias, horas, min, seg;
	
	printf("Insira o total de segundo para conversao: ");
	scanf("%d", &seg_total);
	
	dias = seg_total / 86400;
	horas = (seg_total%86400) / 3600;
	min = seg_total%3600 / 60;
	seg = min%60;
		
	printf("\nOs segundos correspondem a %d dias, %d horas, %d minutos e %d segundos.", dias, horas, min, seg);
}
