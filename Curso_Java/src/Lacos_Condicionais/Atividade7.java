/*
 * Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. 
 * O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). 
 * A seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, 
 * mostre a mensagem Operação Inválida!
 */

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		int cal =0;
		float numero1, numero2, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\t Calculadora: ");
		
		System.out.println(" 1 - Soma");
		System.out.println(" 2 - Subtração");
		System.out.println(" 3 - Multiplicação");
		System.out.println(" 4 - Divisão");
		
		System.out.println("\n Digite o código da operação: ");
		cal = leia.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("\n Digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		switch(cal) {
			
		case 1: 
			System.out.println("Adição");
			resultado = numero1 + numero2;
			System.out.println("Soma dos valores: " + numero1 + " +" + numero2 + " = " + resultado);
			break;
			
		case 2: 
			System.out.println("Subtração");
			resultado = numero1 - numero2;
			System.out.println("Soma dos valores: " + numero1 + " - " + numero2 + " = " + resultado);
			break;
			
		case 3: 
			System.out.println("Multiplicação");
			resultado = numero1 * numero2;
			System.out.println("Soma dos valores: " + numero1 + " * " + numero2 + " = " + resultado);
			break;
			
		case 4: 
			System.out.println("Divisão");
			resultado = numero1 / numero2;
			System.out.println("Soma dos valores: " + numero1 + " / " + numero2 + " = " + resultado);
			break;
			
			default : 
				System.out.println("\n Opção inválida! ");
		}
	}

}
