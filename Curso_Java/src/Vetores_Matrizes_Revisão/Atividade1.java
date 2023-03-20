/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente.
 */

package Vetores_Matrizes_Revisão;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		int[] vetor = new int[5];

		int maiorPontuacao = 0, x;
		
		Scanner leia = new Scanner(System.in);
		
		//Para pegar números negativos
		System.out.println("Entre com um valor: ");
		vetor[0] = leia.nextInt();
		maiorPontuacao = vetor[0];
		
		// Condição para ler o número digitado | Só números positivos
		for(x=1; x < 5; x++) {
			System.out.println("Entre com um valor: ");
			vetor[x] = leia.nextInt(); // irá gravar os valores dentro das posições do vetor
			
			// condição para pegar o maior valor
			if(maiorPontuacao < vetor[x]) {
				maiorPontuacao = vetor[x];
			}
			
		}
		
		System.out.println("\n Maior pontuação é: " +maiorPontuacao);
		
	}

}
