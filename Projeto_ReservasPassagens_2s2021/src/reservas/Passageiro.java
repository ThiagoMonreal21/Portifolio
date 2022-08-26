package reservas;

public class Passageiro {
	
	private String nome, cpf;
	
	public Passageiro(String nome, String cpf) throws Exception {
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) throws Exception{
		if(this.validacao(cpf)) {
			this.cpf = cpf;
		}
		else {
			throw new Exception("O Cpf necessita de 11 digitos");
		}
	}
	
	private boolean validacao(String cpf) {
		if(cpf.length() != 11) {
			return(false);
		}
		return true;
	}
}
