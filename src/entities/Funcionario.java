package entities;

public class Funcionario {

	private String nome;
	private double salario;
	private double taxa;
	
	public double salarioLiquido() {
		return salario - taxa;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	
	
	
	public Funcionario() {
		
	}


	public Funcionario(String nome, double salario, double taxa) {
		this.nome = nome;
		this.salario = salario;
		this.taxa = taxa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getTaxa() {
		return taxa;
	}


	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	


	@Override
	public String toString() {
		return  nome
				+ ", R$"
				+ String.format("%.2f", salarioLiquido() );
	}


	
	
}
