package atvvv.livro.src.livro;

public class Livro {

	String autor;
	String titulo;
	int anoPublicacao;
	
	public Livro() {
		this.autor = "";
		this.titulo = "";
		this.anoPublicacao = 0;
		
	}
	
	public Livro(String autor, String titulo, int anoPublicacao) {
		this.autor = autor;
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		
	}
	
}
