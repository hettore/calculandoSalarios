package salario;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario um = new Funcionario();
		System.out.println("Por favor digite um nome: ");
		um.setNome(sc.nextLine());
		System.out.println("Por favor digite o sálario bruto: ");
		um.setSalario(sc.nextDouble());
		System.out.println("Por favor digite a taxa: ");
		um.setTaxa(sc.nextDouble());
		
		System.out.println("Empregado: " + um);
		
		System.out.println("Qual a porcentagem para aumentar o salário: ");
		double porcentagem = sc.nextDouble();
		um.aumentarSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + um);
		
		
		sc.close();
	}

}
