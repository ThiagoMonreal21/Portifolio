public class Quadrado {
    public double lado;

    public double calcularArea(){
        double n;

        n = lado * lado;

        return n;
    }
    public double calcularPerimetro(){
        double n;

        n = 4 * lado;

        return n;
    }
    public boolean podeConter( Quadrado n ){
        if(lado>=n.lado){
            return true;
        }else{
            return false;
        }
    }
}
