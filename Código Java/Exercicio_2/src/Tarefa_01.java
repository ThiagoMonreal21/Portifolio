import java.util.Random;
import java.util.Scanner;

public class Tarefa_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double x, y;
        String op;

        System.out.println("Qual a operação você deseja realizar?");
        op = input.nextLine();

        System.out.println("Entre com o primeiro número:");
        x = input.nextDouble();

        System.out.println("Entre com o segundo número:");
        y = input.nextDouble();

        if(op.equals("soma")){
            soma(x, y);
        }else if(op.equals("subtração")){
           sub(x,y);
        }else if(op.equals("multiplicação")){
            multi(x,y);
        }else if(op.equals("divisão")){
            div(x,y);
        }else{
            System.out.println("Nenhuma opção válida solicitada.");
        }

    }

    static void soma(double num1, double num2){
        System.out.println("O resultado da soma é: ");
        System.out.println(num1+num2);
    }
    static void sub(double num1, double num2){
        System.out.println("O resultado da subtração é:");
        System.out.println(num1-num2);
    }
    static void multi(double num1, double num2){
        System.out.println("O resultado da multiplicação é: ");
        System.out.println(num1*num2);
    }
    static void div(double num1, double num2){
        System.out.println("O resultado da divisão é: ");
        System.out.println(num1/num2);
    }
}
