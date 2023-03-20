/*
 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
 * Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3. 
 */

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, cont = 0;
		float media;
		
		do {

			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero % 3 == 0) {
				soma += numero;
				cont++;
			}

		} while (numero != 0);
		
		media = soma / cont;
		System.out.println("A média de todos os números digitados, que sejam múltiplos de 3 é : " + soma);

	}
}
