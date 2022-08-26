package reservas;

public class Aviao extends Aeronave {//Aeronave classe mãe, avião classe filha.
	
	public Passageiro[][] lugares; //É um atributo do tipo matriz de passageiro.
	
	public Aviao (String modelo, int fileiras, int assentos) { //construtor
		
		super(modelo);//Chamar o construtor da classe mãe
		
		this.lugares = new Passageiro[fileiras][assentos]; //Instanciando a classe Passageiro
	}
	
	public boolean verificaLugarOcupado(int fileira, int assento) {
		
		return this.lugares[fileira][assento] != null; //Verifica se de fato o assento não possui reserva
	}
	
	public Passageiro getPassageiro(int fileira, int assento) {
		
		return this.lugares[fileira][assento];
	}
	
	public void setPassageiro(int fileira, int assento, Passageiro passageiro) {
		this.lugares[fileira][assento] = passageiro;
	}
	@Override
	public String toString() {
		return this.modelo;
	}//Garantir que o modelo não seja números
}
