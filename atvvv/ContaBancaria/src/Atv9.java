package atvvv.ContaBancaria.src;

public class Atv9 {

	public static void main(String[] args) {
		ContaBancaria contaB1 = new ContaBancaria(11101, 1900.30);
		ContaBancaria contaB2 = new ContaBancaria(22202, 9000);
		
		System.out.println(contaB1.numeroC);
		System.out.println(contaB1.saldo);
		System.out.println(contaB2.numeroC);
		System.out.println(contaB2.saldo);

	}

}
