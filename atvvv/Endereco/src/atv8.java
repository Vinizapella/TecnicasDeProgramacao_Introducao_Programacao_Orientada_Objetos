package atvvv.Endereco.src;

public class atv8 {

	public static void main(String[] args) {
		Endereco endereco1 =  new Endereco("Aqui", 1, "Jaras");
		Endereco endereco2 =  new Endereco("Lá", 11, "Jaras");
		Endereco endereco3 =  new Endereco("Lá perto", 111, "Jaras");
		Endereco endereco4 =  new Endereco("Lá longe", 1111, "Jaras");
		
		System.out.println(endereco1.rua);
		System.out.println(endereco1.numero);
		System.out.println(endereco1.cidade);
		
		System.out.println(endereco2.rua);
		System.out.println(endereco2.numero);
		System.out.println(endereco2.cidade);
		
		System.out.println(endereco3.rua);
		System.out.println(endereco3.numero);
		System.out.println(endereco3.cidade);
		
		System.out.println(endereco4.rua);
		System.out.println(endereco4.numero);
		System.out.println(endereco4.cidade);
		
	}

}
