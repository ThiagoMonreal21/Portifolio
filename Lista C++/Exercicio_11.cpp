#include<stdio.h>
#include<stdlib.h>

int maior (int n, int *v_num);
int menor (int n, int *v_num);

int main(){
	
	int i, maior_num, menor_num;
	int v_num[15];
	
	for(i=0; i<15; i++){
		printf("Escreva o %d do vetor: ", i+1);
		scanf("%d", &v_num[i]);
	}
	
	//chamar funcao
	maior_num = maior (15,v_num);
	menor_num = menor (15,v_num);
	
	//Escrever o retorno da funcao
	
	printf("\nO maior numero do vetor eh: %d e o menor foi o %d.\n\n", maior_num, menor_num);
	
	system("pause");
	return 0;
}

/*Funcao para calcular o maior numero do vetor
passando a quantidades de numero com "N" e o vetor
como *v_num na posição 0.
Retorna m */

int maior(int n, int *v_num){
	
	int i, m, maior=0;
	//buscando o maior
	for(i=0;i<n;i++){
		if(v_num[i]>maior){
			maior=v_num[i];
		}
	}
	//retorna m
	m = maior;
	return m;
}
/*Funcao para calcular o menor numero do vetor
passando a quantidades de numero com "N" e o vetor
como *v_num na posição 0.
Retorna m */

int menor(int n, int *v_num){
	
	int i, m, menor=100;
	//buscando o menor
	for(i=0;i<n;i++){
		if(v_num[i]<menor){
			menor=v_num[i];
		}
	}
	//retorna m
	m = menor;
	return m;
}



