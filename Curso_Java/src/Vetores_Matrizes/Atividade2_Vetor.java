/*
 *  Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
●	Todos os elementos dos índices ímpares do vetor 
●	Todos os elementos do vetor que são números pares
●	A Soma de todos os elementos do vetor
●	A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

 */

package Vetores_Matrizes;

import java.util.Scanner;

public class Atividade2_Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] numeros = new int[10];
		int par = 0, impar = 0, soma = 0;
		float media = 0;
		
		// condição para guardar os valores digitados no vetor
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + i + " º número: ");
			numeros[i] = leia.nextInt();
			
			// soma dos valores digitados
			soma += numeros[i];
			
			// media dos valores digitados
			media = soma / numeros[i];
			
			// Irá contar os números pares digitados
            if(numeros[i] % 2 == 0){
                par++;
            }

            // Irá contar os números impares digitados
            if(numeros[i] % 2 == 1){
                impar++;
            }
			
		}
		
		System.out.println("\n A soma dos valores digitados é: " + soma);
		System.out.printf(" A média dos valores digitados é: %.2f ", media);
		System.out.println("\n Todos os valores digitados par: " + par);
		System.out.println(" Todos os valores digitados impar: " + impar);
		
	}

}
