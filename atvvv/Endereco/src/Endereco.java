package atvvv.Endereco.src;

public class Endereco {

	String rua;
	int numero;
	String cidade;
	
	public Endereco() {
		this.rua = "";
		this.numero = 0;
		this.cidade = "";
	}
	
	public Endereco(String rua, int numero, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		
	}
	
}
