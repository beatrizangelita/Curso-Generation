/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) 
 * e a quantidade comprada deste item (número inteiro). 
 * A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
 */

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		int num, quantidade;
		float valorTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\t Escolha o Produto abaixo: ");
		
		System.out.println("\n 1 - Cachorro Quente");
		System.out.println("\n 2 - X-Salada");
		System.out.println("\n 3 - X-Bacon");
		System.out.println("\n 4 - Bauru");
		System.out.println("\n 5 - Refrigerante");
		System.out.println("\n 6 - Suco de Laranja");
			
		
		System.out.println("\n Digite o código do produto: ");
		int produto = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(produto) {
		
		case 1:
			System.out.println("\n Produto: Cachorro Quente");
			valorTotal = quantidade * 10;
			System.out.printf("\n Valor Total: $ %.2f", valorTotal);
			break;
		case 2:
			System.out.println("\n Produto: X-Salada");
			valorTotal = quantidade * 15;
			System.out.printf("\n Valor Total: $ %.2f", valorTotal);
			break;
		case 3:
			System.out.println("\n Produto: X-Bacon");
			valorTotal = quantidade * 18;
			System.out.printf("\n Valor Total: $ %.2f", valorTotal);
			break;
		case 4:
			System.out.println("\n Produto: Bauru");
			valorTotal = quantidade * 12;
			System.out.printf("\n Valor Total: $ %.2f", valorTotal);
			break;
		case 5:
			System.out.println("\n Produto: Refrigerante");
			valorTotal = quantidade * 8;
			System.out.printf("\n Valor Total: $ %.2f", valorTotal);
			break;
		case 6:
			System.out.println("\n Produto: Suco de Laranja");
			valorTotal = quantidade * 13;
			System.out.printf("\n Valor Total: $ %.2f", valorTotal);
			break;
			
			default:
				System.out.println("\n Opção inválida!");
		}

	}

}

