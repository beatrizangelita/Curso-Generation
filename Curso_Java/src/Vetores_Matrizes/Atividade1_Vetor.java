/*
 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, 
 * onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. 
 * Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.
 */

package Vetores_Matrizes;

import java.util.Scanner;

public class Atividade1_Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int i, num, cont = 0;
		
		for(i = 0; i < 10; i++) {
			System.out.println("Entre com um número: ");
			vetor[i] = leia.nextInt();		
		}
		
		System.out.println("Informe um valor para procurar no vetor: ");
		num = leia.nextInt();
		
		for (i = 0; i < 10; i++ ) {
			
			if(vetor[i] == num) {
				System.out.println("Posição do número digitado é: " + i);
				cont++;
			}
		}
		
		if (cont == 0) {
			System.out.println("Não foi encontrado!");
		}
	}

}
