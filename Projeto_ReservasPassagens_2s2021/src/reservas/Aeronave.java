package reservas;

public class Aeronave {
	
	protected String modelo;//para acessar a classe filha Aviao

	public Aeronave (String modelo) {
		this.setModelo(modelo);
	}//Construtor
	
	public String getModelo() {
		return this.modelo;
	}//getter
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}//setter
}
