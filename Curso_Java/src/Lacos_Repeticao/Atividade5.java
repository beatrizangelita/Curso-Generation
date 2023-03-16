/*
 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
 * Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos
 */

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		int numero, soma = 0, cont = 0;
		
		Scanner leia = new Scanner (System.in);

		do {
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero >= 0) {
				soma += numero;
				
			}
			
		}while(numero != 0);
			
		System.out.println("A soma dos números positivos: " + soma); 

	}

}
