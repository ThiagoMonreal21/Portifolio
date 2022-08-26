#include<stdio.h>
#include<stdlib.h>

int main(){
	 
	struct data_crono // tipo de dado
	{
		int dia;
		int mes;
		int ano;	
	}; // definição de struct
	 
	struct data_crono data1, data2;
	
	printf("Informe a primeira data com dd/mm/aaaa:");
	printf("\nDia: ");
	scanf("%d", &data1.dia);
	while(data1.dia>31){
		printf("\nUm mes dura no maximo 31 dias, isira um dia valido: ");
		scanf("%d", &data1.dia);
	}
	printf("\nMes: ");
	scanf("%d", &data1.mes);
	while(data1.mes>12){
		printf("\nUm ano dura no maximo 12 meses, isira um mes valido: ");
		scanf("%d", &data1.mes);
	}
	printf("\nAno: ");
	scanf("%d", &data1.ano);
	system("cls");	
	// Primeiro ano.
	printf("Informe a segunda data com dd/mm/aaaa:");
	printf("\nDia: ");
	scanf("%d", &data2.dia);
	while(data2.dia>31){
		printf("\nUm mes dura no maximo 31 dias, isira um dia valido: ");
		scanf("%d", &data2.dia);
	}
	printf("\nMes: ");
	scanf("%d", &data2.mes);
	while(data2.mes>12){
		printf("\nUm ano dura no maximo 12 meses, isira um mes valido: ");
		scanf("%d", &data2.mes);
	}
	printf("\nAno: ");
	scanf("%d", &data2.ano);
	system("cls");
	//Segundo ano.
	//Comparar datas
	if(data1.ano==data2.ano && data1.mes==data2.mes && data1.dia<data2.dia){
		printf("A data: %d/%d/%d eh cronologicamente anterior a data %d/%d/%d.", data1.dia,data1.mes,data1.ano,data2.dia,data2.mes,data2.ano);
	}else if(data1.ano==data2.ano && data1.mes<data2.mes){
		printf("A data: %d/%d/%d eh cronologicamente anterior a data %d/%d/%d.", data1.dia,data1.mes,data1.ano,data2.dia,data2.mes,data2.ano);
	}else if(data1.ano<data2.ano){
		printf("A data: %d/%d/%d eh cronologicamente anterior a data %d/%d/%d.", data1.dia,data1.mes,data1.ano,data2.dia,data2.mes,data2.ano);		
	}else
		printf("A data: %d/%d/%d eh cronologicamente anterior a data %d/%d/%d.", data2.dia,data2.mes,data2.ano,data1.dia,data1.mes,data1.ano);
}
