package atvvv.Produtos.src;

public class Produtos {

	String nome;
	String descricao;
	int qtd;
	
	public Produtos() {
		this.nome = "";
		this.descricao = "";
		this.qtd = 0;
		
	}
	
	public Produtos(String nome, String descricao, int qtd) {
		this.nome = nome;
		this.descricao = descricao;
		this.qtd = qtd;
		
	}
	
}
