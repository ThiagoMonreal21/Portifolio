#include<stdio.h>
#include<stdlib.h>

int main(){
	 
	struct data_validade // tipo de dado
	{
		int dia;
		int mes;
		int ano;	
	}; // definição de struct
	 
	struct data_validade data1, data2;
	
	printf("Informe a data de hoje dd/mm/aaaa:");
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
	printf("Informe a data de validade dd/mm/aaaa:");
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
		printf("!!!Produto ainda nao esta vencido, porem vence ainda esse mes, ficar atento!!!");
	}else if(data1.ano==data2.ano && data1.mes<data2.mes){
		printf("!!!Produto ainda nao esta vencido, porem vence em 12 meses, ficar atento!!!");
	}else if(data1.ano<data2.ano){
		printf("Produto ainda em validade");		
	}else
		printf("!!!ATENCAO!!!\nProduto nao serve para consumo, data de vencimento ultrapassada!!!");
}
