package atvvv.livro.src.livro;

public class atv3 {

	public static void main(String[] args) {
		Livro livro1 = new Livro("George Orwell", "1984", 1949);
		Livro livro2 = new Livro("Machado de Assis", "Dom Casmurro", 1899);
		Livro livro3 = new Livro("J.R.R. Tolkien", "O Senhor dos Anéis", 1954);
		
		System.out.println(livro1.autor);
		System.out.println(livro1.titulo);
		System.out.println(livro1.anoPublicacao);
		System.out.println(livro2.autor);
		System.out.println(livro2.titulo);
		System.out.println(livro2.anoPublicacao);
		System.out.println(livro3.autor);
		System.out.println(livro3.titulo);
		System.out.println(livro3.anoPublicacao);
		
	}

}
