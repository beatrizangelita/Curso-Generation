package JavaIntroducao;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		/*
		 * Estrutura de (Array)Matriz
		 * 
		 * Inicia na posição 0 Matriz tem N dimensões
		 */

		// Dimensão 3 por 3

		// Linha 0 x Coluna 0
		// Linha 0 x Coluna 1
		// Linha 0 x Coluna 2
		// Linha 1 x Coluna 0
		// Linha 1 x Coluna 1
		// Linha 1 x Coluna 2
		// Linha 2 x Coluna 0
		// Linha 2 x Coluna 1
		// Linha 2 x Coluna 2

		int[][] numeros = new int[3][3];
		int linha, coluna, somaMatriz = 0, somaDiagonal = 0;

		// Toda vez que for matriz vai ser FOR(PARA) encadeado, um FOR dentro do outro, se os dados forem pré-definido.
		// Caso não tenha os dados definidos, pode utilizar o While ou DoWhile.
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Entre com um número: ");
				numeros[linha][coluna] = leia.nextInt();
				
				// Faz a soma das matrizes
				somaMatriz += numeros[linha][coluna];
				
				// Criar um laço de decisão - Soma dos dados diagonal principal
				if(linha == coluna) {
					somaDiagonal += numeros[linha][coluna];
				}
			}
		}
		
		System.out.println("\n Soma dos valores das matrizes: " + somaMatriz);
		System.out.println("\n Soma dos valores da diagonal principal " + somaDiagonal);
	}

}
