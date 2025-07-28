package atvvv.Emprestimo.src;

public class Emprestimo {

	double valor;
	String dataE;
	int numeroP;
	
	public Emprestimo() {
		this.valor = 0.0;
		this.dataE = "";
		this.numeroP = 0;
		
	}
	
	public Emprestimo(double valor, String dataE,int  numeroP) {
		
		this.valor = valor;
		this.dataE = dataE;
		this.numeroP = numeroP;
		
	}
	
}
