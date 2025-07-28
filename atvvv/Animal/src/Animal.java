package atvvv.Animal.src;

public class Animal {

	String nome;
	String raca;
	int idade;
	
	public Animal() {
		this.nome = "";
		this.raca = "";
		this.idade = 0;
		
	}
	
	public Animal(String nome, String raca, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		
	}
	
}
