/*
 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
 * onde o primeiro número deve ser menor do que o segundo número. 
 * Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
 * Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5
 */

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int num1, num2, intervalo;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = leia.nextInt();
		
		for ( num1 = 0; num1 <= num2; num1++) {
			
	        if (num1 % 3 == 0 && num1 % 5 == 0) {
	            System.out.print("\n Números multiplos de 3 e 5: " + num1);
	        }
	        else {
	        	System.out.print("\n Invalido ");
	        }
	    }

	}

}
