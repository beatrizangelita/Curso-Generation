/*
 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos 
 * e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
 */

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int idade, totalPar=0, totalImpar=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		// Se número for negativo sair do loop, se for positivo continua.
		while(idade >= 0) { 
			
			if(idade < 21) {
				totalPar ++; // irá contar total de idade menor que 21
			}
			else if(idade > 50) {
				totalImpar ++; // irá contar total de idade maior que 50
			}
			else {
				System.out.println("\n Erro - Favor contatar o ADM do programa kkkk ");
			}
			System.out.println("\n Digite novamente uma idade: ");
			idade = leia.nextInt();
		}

		System.out.println("\n Quantidade de pessoas com idade menor que 21 anos: " + totalPar);
		System.out.println("\n Quantidade de pessoas com idade maior que 50 anos: " + totalImpar);
	}

}
