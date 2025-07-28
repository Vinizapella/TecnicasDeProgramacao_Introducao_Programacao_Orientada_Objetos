package atvvv.Aluno.src;

public class Aluno {

	String nome;
	int matricula;
	double notaF;
	
	public Aluno() {
		this.nome = "";
		this.matricula = 0;
		this.notaF = 0.0;
		
	}
	
	public Aluno(String nome, int matricula, double notaF) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.notaF = notaF;
		
	}
	
}
