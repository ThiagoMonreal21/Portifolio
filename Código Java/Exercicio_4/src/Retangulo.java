public class Retangulo {
    public double base;
    public double altura;

    public double calcularArea(){
        double n;

        n = base * altura;

        return n;
    }
    public double calcularPerimetro(){
        double n;

        n = 2 * (base + altura);

        return n;
    }
    public boolean podeConter( Retangulo n ){
        if(base>=n.base && altura>=n.altura){
            return true;
        }else{
            return false;
        }
    }
}
