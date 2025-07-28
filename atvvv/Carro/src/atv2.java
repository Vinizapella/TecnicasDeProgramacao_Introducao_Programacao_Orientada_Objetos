package atvvv.Carro.src;

public class atv2 {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Fusca", "121", 1978);
		Carro carro2 = new Carro("Chevorlet", "Celta", 2007);
		Carro carro3 = new Carro("Ford", "Ka", 2015);
		
		System.out.println(carro1.marca);
		System.out.println(carro1.modelo);
		System.out.println(carro1.ano);
		System.out.println(carro2.marca);
		System.out.println(carro2.modelo);
		System.out.println(carro2.ano);
		System.out.println(carro3.marca);
		System.out.println(carro3.modelo);
		System.out.println(carro3.ano);

	}

}
