/*
 * Escreva um algoritmo em Java, 
 * que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número 
 * é par ou ímpar e se o número é positivo ou negativo
 */

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int n1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Informe um número: ");
		n1 = leia.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("\n Número é par!");
		}
		else {
			System.out.println("\n Número é impar!");
		}
		
		if(n1 > 0) {
			System.out.println("\n Número é positivo!");
		}
		else {
			System.out.println("\n Número é negativo!");
		}

	}

}
