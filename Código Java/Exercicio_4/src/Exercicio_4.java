import java.util.Scanner;

public class Exercicio_4 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();
        Circulo c1 = new Circulo();

        System.out.println("Informe o lado do quadrado 1: ");
        q1.lado = input.nextDouble();
        //Quadrado 1
        System.out.println("Informe o lado do quadrado 2: ");
        q2.lado = input.nextDouble();
        //Quadrado 2
        System.out.println("Informe a base do retangulo 1: ");
        r1.base = input.nextDouble();
        //Retangulo 1
        System.out.println("Informe a altura do retangulo 1: ");
        r1.altura = input.nextDouble();
        //Retangulo 1
        System.out.println("Informe a base do retangulo 2: ");
        r2.base = input.nextDouble();
        //Retangulo 2
        System.out.println("Informe a altura do retangulo 2: ");
        r2.altura = input.nextDouble();
        //Retangulo 2
        System.out.println("Informe raio do circulo: ");
        c1.raio = input.nextDouble();
        //Circulo 1

        System.out.println("\nA area do quadrado 1 eh de: " + q1.calcularArea());
        System.out.println("O perimetro do quadrado 1 eh de: " + q1.calcularPerimetro());
        //Quadrado 1
        System.out.println("\nA area do quadrado 2 eh de: " + q2.calcularArea());
        System.out.println("O perimetro do quadrado 2 eh de: " + q2.calcularPerimetro());
        //Quadrado 2
        System.out.println("\nO quadrado q1 pode conter o quadrado q2? " + q1.podeConter(q2));//deve ser falso
        System.out.println("O quadrado q2 pode conter o quadrado q1? " + q2.podeConter(q1));//deve ser verdadeiro
        //Verificação de espaço de locação
        System.out.println("\nA area do retangulo 1 eh de: " + r1.calcularArea());
        System.out.println("O perimetro do retangulo 1 eh de: " + r1.calcularPerimetro());
        //Retangulo 1
        System.out.println("\nA area do retangulo 2 eh de: " + r2.calcularArea());
        System.out.println("O perimetro do retangulo 2 eh de: " + r2.calcularPerimetro());
        //Retangulo 2
        System.out.println("\nO retangulo r1 pode conter o retangulo r2? " + r1.podeConter(r2));//deve ser falso
        System.out.println("O retangulo r2 pode conter o retangulo r1? " + r2.podeConter(r1));//deve ser verdadeiro
        //Verificação de espaço de locação
        System.out.println("\nA area do circulo eh de: " + c1.calcularArea());
        System.out.println("O perimetro do circulo eh de: " + c1.calcularPerimetro());
        //Circulo

        /*double ladoQuadrado1, ladoQuadrado2;

        System.out.println("Informe o lado do quadradro 1: ");
        ladoQuadrado1 = input.nextDouble();

        System.out.println("Informe o lado do quadradro 2: ");
        ladoQuadrado2 = input.nextDouble();

        double areaQuadradro1 = calcularArea(ladoQuadrado1);
        double areaQuadradro2 = calcularArea(ladoQuadrado2);
        double perimetroQuadradro1 = calcularPerimetro(ladoQuadrado1);
        double perimetroQuadradro2 = calcularPerimetro(ladoQuadrado2);

        System.out.println("A area do quadrado 1 eh de: " + areaQuadradro1);
        System.out.println("O perimetro do quadrado 1 eh de: " + perimetroQuadradro1);
        System.out.println("A area do quadrado 2 eh de: " + areaQuadradro2);
        System.out.println("O perimetro do quadrado 2 eh de: " + perimetroQuadradro2);*/

    }
}
