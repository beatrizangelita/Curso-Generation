/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), 
 * o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float). 
 * A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.
 */

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		String nome;
		int cod;
		float salario, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\t Escolha a opção: ");
		
		System.out.println("\n 1 - Gerente");
		System.out.println("\n 2 - Vendedor");
		System.out.println("\n 3 - Supervisor");
		System.out.println("\n 4 - Motorista");
		System.out.println("\n 5 - Estoquista");
		System.out.println("\n 6 - Tecnico de TI");
			
		System.out.println("\n Informe o nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("\n Informe o código do cargo: ");
		cod = leia.nextInt();
		
		System.out.println("Informe o salário: ");
		salario = leia.nextFloat();
		
		switch(cod) {
		
		case 1:
			System.out.println("\n Nome do colaborador: " + nome);
			System.out.println(" Cargo: Gerente");
			novoSalario = salario + ((10 * salario)/100);
			System.out.printf(" Salário: $ %.2f", novoSalario);
			break;
		case 2:
			System.out.println("\n Nome do colaborador: " + nome);
			System.out.println("\n Cargo: Vendedor");
			novoSalario = salario + ((7 * salario)/100);
			System.out.printf("\n Salário: $ %.2f", novoSalario);
			break;
		case 3:
			System.out.println("\n Nome do colaborador: " + nome);
			System.out.println("\n Cargo: Supervisor");
			novoSalario = salario + ((9 * salario)/100);
			System.out.printf("\n Salário: $ %.2f", novoSalario);
			break;
		case 4:
			System.out.println("\n Nome do colaborador: " + nome);
			System.out.println("\n Cargo: Motorista");
			novoSalario = salario + ((6 * salario)/100);
			System.out.printf("\n Salário: $ %.2f", novoSalario);
			break;
		case 5:
			System.out.println("\n Nome do colaborador: " + nome);
			System.out.println("\n Cargo: Estoquista");
			novoSalario = salario + ((5 * salario)/100);
			System.out.printf("\n Salário: $ %.2f", novoSalario);
			break;
		case 6:
			System.out.println("\n Nome do colaborador: " + nome);
			System.out.println("\n Cargo: Técnico de TI");
			novoSalario = salario + ((8 * salario)/100);
			System.out.printf("\n Salário: $ %.2f", novoSalario);
			break;
			
			default:
				System.out.println("\n Opção inválida!");
		}

	}

}
