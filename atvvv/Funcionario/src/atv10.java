package atvvv.Funcionario.src;

public class atv10 {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Vic", 50000, "Chefe");
		Funcionario funcionario2 = new Funcionario("Vini", 1800, "Subordinado");
		Funcionario funcionario3 = new Funcionario("Ivone", 40000, "Chefe");
		Funcionario funcionario4 = new Funcionario("Vanderlei", 10000, "Subordinado");
		
		System.out.println(funcionario1.nome);
		System.out.println(funcionario1.salario);
		System.out.println(funcionario1.cargo);
		
		System.out.println(funcionario2.nome);
		System.out.println(funcionario2.salario);
		System.out.println(funcionario2.cargo);
		
		System.out.println(funcionario3.nome);
		System.out.println(funcionario3.salario);
		System.out.println(funcionario3.cargo);
		
		System.out.println(funcionario4.nome);
		System.out.println(funcionario4.salario);
		System.out.println(funcionario4.cargo);


	}

}
