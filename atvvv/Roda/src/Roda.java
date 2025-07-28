package atvvv.Roda.src;

public class Roda {

	String tipo;
	int tamanho;
	String cor;
	String material;
	
	public Roda() {
		
		this.tipo = "";
		this.cor = "";
		this.tamanho = 0;
		this.material = "";
		
	}
	
	public Roda(String tipo, int tamanho, String cor, String material) {
		
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.cor = cor;
		this.material = material;
	}
	
	
}
