/*
 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
●	Todos os elementos da Diagonal Principal
●	Todos os elementos da Diagonal Secundária
●	A Soma de todos os elementos da Diagonal Principal
●	A Soma de todos os elementos da Diagonal Secundária
 */

package Vetores_Matrizes;

import java.util.Scanner;

public class Atividade1_Matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//int tam = 3; // tamanho da matriz 3 x 3 
		int [][] numeros = new int [3][3];
		int linha, coluna = 0, somaDiagonal = 0, somaSecundario = 0;

		for (linha = 0; linha < 3; linha++) {
			//System.out.println("\n Elementos da Diagonal Principal: " + numeros[linha][linha]);
			for (coluna = 0; coluna < 3; coluna++) {
				//System.out.println("\n Elementos da Diagonal Principal: " + numeros[coluna][coluna]);
				
				System.out.println("Entre com um número: ");
				numeros[linha][coluna] = leia.nextInt();
				
				// Criar um laço de decisão - Soma dos dados diagonal principal
				if(linha == coluna) {
					somaDiagonal += numeros[linha][coluna];
				}
				
				if(coluna < 3-linha-1) {
					somaSecundario += numeros[linha][coluna];
				}
				
			}
		}
		
		System.out.println();
		System.out.println("Elementos da diagonal principal: ");
		for (linha = 0; linha < 3; linha++) {
			System.out.println(numeros[linha][linha] + " , ");
		}
		
		System.out.println();
		System.out.println("Elementos da diagonal secundaria: ");
		for (linha = 0; linha < 3; linha++) {
			System.out.println(numeros[linha][3 - 1 - linha] + " , ");
			
			
		}		
		
		System.out.println("\n Soma dos valores da diagonal principal " + somaDiagonal);
		System.out.println("\n Soma dos valores da diagonal secundaria " + somaSecundario);
		
	}

}
