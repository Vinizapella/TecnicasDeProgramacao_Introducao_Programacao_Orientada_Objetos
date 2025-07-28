package atvvv.Produtos.src;

public class atv11 {

	public static void main(String[] args) {
		Produtos produto1 = new Produtos("Iphone", "Semi-novo", 1);
		Produtos produto2 = new Produtos("CPU", "Usada", 1);
		Produtos produto3 = new Produtos("Teclado", "Ergonomico", 20);
		Produtos produto4 = new Produtos("Fone", "JBL", 100);
		
		System.out.println(produto1.nome);
		System.out.println(produto1.descricao);
		System.out.println(produto1.qtd);
		
		System.out.println(produto2.nome);
		System.out.println(produto2.descricao);
		System.out.println(produto2.qtd);
		
		System.out.println(produto3.nome);
		System.out.println(produto3.descricao);
		System.out.println(produto3.qtd);
		
		System.out.println(produto4.nome);
		System.out.println(produto4.descricao);
		System.out.println(produto4.qtd);
		

	}

}
