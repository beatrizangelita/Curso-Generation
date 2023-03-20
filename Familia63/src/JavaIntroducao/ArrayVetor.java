package JavaIntroducao;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		/*
		 * Estrutura de (Array)Vetor
		 * 
		 * Vetor tem somente 1 dimensão colchetes [] - significa 1 única dimensão
		 * Inicial é a posição 0
		 */

		float[] media = new float[3]; // está instanciando a variavel media, definindo o tamanho do array
		float n1, n2, n3, somaMedia = 0, mediaGeral; 
		int x;

		// condição PARA executar diversas vezes um mesmo bloco de instruções nesse caso 3x
		for (x = 0; x < 3; x++) {
			System.out.println("Informe a 1º nota: ");
			n1 = leia.nextFloat();

			System.out.println("Informe a 2º nota: ");
			n2 = leia.nextFloat();

			System.out.println("Informe a 3º nota: ");
			n3 = leia.nextFloat();
			
			// x é minha posição
			media[x] = (n1 + n2 + n3) / 3;
			System.out.printf("Sua média foi: %.2f ", media[x]);
			
			// calculo da somaMedia = somaMedia + media[x]
			somaMedia += media[x];
			
			// condição SE verificar se o aluno está aprovado
			if(media[x] >= 7 && media[x] <= 10) {
				System.out.println("\n Alune aprovade! ");
			}
			
			// condição SE NÃO  verificar se o aluno está recuperado
			else if(media[x] >= 5 && media[x] < 7) {
				System.out.println("\n Alune de recuperação! ");
			}
			
			// condição OU aluno reprovado
			else {
				System.out.println("\n Alune reprovade! ");
			}
		}

			// irá mostrar a média geral dos alunos
			mediaGeral = somaMedia / 3;
			System.out.printf("\n Média geral: %.2f", mediaGeral);
			
			// Irá mostrar a média do aluno individual
			for(x=0;x<3;x++) {
				System.out.println("\n Média do Alune " + (x+1) + " : " + media[x]);
			}
	}

}
