package aula_02_atividade;

import java.util.Scanner;

public class Funcionario {
	
	    private String nome;
	    private double salarioBruto;

	    public Funcionario(String nome, double salarioBruto) {
	        this.nome = nome;
	        this.salarioBruto = salarioBruto;
	    }

	    public double calcularSalarioLiquido() {
	        return salarioBruto;
	    }

	    public void aumentarSalario(double porcentagem) {
	        salarioBruto += salarioBruto * (porcentagem / 100);
	    }

	    public void exibirDados() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Salário Líquido: R$ " + String.format("%.2f", calcularSalarioLiquido()));
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);


	        System.out.print("Nome: ");
	        String nome = sc.nextLine();
	        System.out.print("Salario Bruto: ");
	        double salarioBruto = sc.nextDouble();


	        Funcionario funcionario = new Funcionario(nome, salarioBruto);


	        funcionario.exibirDados();


	        System.out.print("\nQual a porcentagem para aumentar o salário? ");
	        double porcentagem = sc.nextDouble();


	        funcionario.aumentarSalario(porcentagem);


	        System.out.println("\nDados atualizados:");
	        funcionario.exibirDados();

	        sc.close();
	    }
	}