public class Circulo {
    public double raio;

    public double calcularArea(){
        double n;

        n =  3.14 * (raio*raio);

        return n;
    }
    public double calcularPerimetro(){
        double n;

        n = 2 * 3.14 * raio;

        return n;
    }
}
