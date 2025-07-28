package atvvv.Roda.src;

public class atv6 {

	public static void main(String[] args) {
		Roda roda1 = new Roda("Carro", 15, "Preta", "Aço");
		Roda roda2 = new Roda("Bicicleta", 26, "Azul", "Alumínio");
		Roda roda3 = new Roda("Moto", 17, "Prata", "Aço");

		System.out.println(roda1.tipo);
		System.out.println(roda1.tamanho);
		System.out.println(roda1.cor);
		System.out.println(roda1.material);
		
		System.out.println(roda2.tipo);
		System.out.println(roda2.tamanho);
		System.out.println(roda2.cor);
		System.out.println(roda2.material);
		
		System.out.println(roda3.tipo);
		System.out.println(roda3.tamanho);
		System.out.println(roda3.cor);
		System.out.println(roda3.material);
		
	}

}
