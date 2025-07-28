package atvvv.Animal.src;

public class atv7 {

	public static void main(String[] args) {
		Animal animal1 = new Animal("bellinha", "Pinscher", 10);
		Animal animal2 = new Animal("Pipoca", "Vira-Lata", 1);
		Animal animal3 = new Animal("Luna", "Gato", 8);
		Animal animal4 = new Animal("Bebê", "Calopsita", 3); 
		
		System.out.println(animal1.nome);
		System.out.println(animal1.raca);
		System.out.println(animal1.idade);
		
		System.out.println(animal2.nome);
		System.out.println(animal2.raca);
		System.out.println(animal2.idade);
		System.out.println(animal3.nome);
		System.out.println(animal3.raca);
		System.out.println(animal3.idade);
		System.out.println(animal4.nome);
		System.out.println(animal4.raca);
		System.out.println(animal4.idade);
	}

}
