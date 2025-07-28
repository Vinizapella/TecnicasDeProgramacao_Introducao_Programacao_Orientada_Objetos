package atvvv.Funcionario.src;

public class Funcionario {

	String nome;
	double salario;
	String cargo;
	
	public Funcionario() {
		this.nome = "";
		this.salario = 0;
		this.cargo = "";
		
	}
	
	public Funcionario(String nome, double salario, String cargo) {
		
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		
	}
	
}
