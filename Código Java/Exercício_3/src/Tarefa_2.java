import java.util.Arrays;
import java.util.Scanner;

public class Tarefa_2 {

    public static void main(String[] args) {

        double valores[] = new double[4];
        Scanner input = new Scanner(System.in);

            for(int i = 0; i< valores.length; i++){
                System.out.println("Digite o " + (i+1) + " valor: ");
                valores[i] = input.nextDouble();
            }

            String conjunto = conjunto(valores);
            double media = media(valores);
            double maior = maior(valores);
            double menor = menor(valores);

            System.out.println("Conjunto:"+ conjunto);
            System.out.println("Média: "+ media);
            System.out.println("Maior valor: "+ maior);
            System.out.println("Menor valor:"+ menor);
    }

    static String conjunto(double x[] ) {

        String r;

        r = Arrays.toString(x);

        return r;
    }
    static double media(double x[]){

        double soma=0, r;

        for(int i = 0; i<x.length; i++){
            soma=(soma+x[i]);
        }
        r=(soma/x.length);

        return r;
    }
    static double maior(double x[]){
        double maior=0, r;

        for(int i = 0; i<x.length; i++){
            if(maior<x[i]){
                maior = x[i];
            }
        }
        r=maior;

        return r;
    }
    static double menor(double x[]){
        double menor=x[0], r;

        for(int i = 0; i<x.length; i++){
            if(menor>x[i]){
                menor = x[i];
            }
        }
        r=menor;

        return r;
    }
}
