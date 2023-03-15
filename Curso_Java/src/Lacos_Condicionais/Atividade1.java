/*
 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C. 
 */


package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int a, b, c, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Informe o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("\n Informe o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("\n Informe o valor de C: ");
		c = leia.nextInt();
		
		soma = a + b;
		System.out.println("\n A soma de A + B é: " + soma);
		
		if (soma > c ) {
			System.out.println("\n A Soma de A + B é Maior que C.");
		}
		else if (soma < c) {
			System.out.println("\n A Soma de A + B é Menor que C.");
		}
		else {
			System.out.println("\n A Soma de A + B é Igual que C.");
		}
	}

}
