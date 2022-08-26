package reservas;

public class Voo {
	
	//Atributos
	private int nro;
	private String data, hora; 

	public Voo(Aviao aeronave, int nro, String data, String hora) throws Exception{
		if(aeronave == null)
			throw new Exception("Avião não pode ser nulo");
		this.nro = nro;
		this.data = data;
		this.hora = hora;
	}//Construtor
	
	public int getNro()
	{
		return this.nro;
	}
	public String getData()
	{
		return this.data;
	}
	public String getHora()
	{
		return this.hora;
	}
}
