// Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java:

package Entrada_Saida_Operadores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\n Informe o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\n Informe o abono");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\n Seu novo salário é: %.2f",novoSalario);
	}

}
