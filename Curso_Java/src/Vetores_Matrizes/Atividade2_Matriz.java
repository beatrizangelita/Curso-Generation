/*
 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. 
 * As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, 
 * logo cada linha da matriz serão as notas de um participante. 
 * Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.
 */

package Vetores_Matrizes;

import java.util.Scanner;

public class Atividade2_Matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int i = 0, j = 0, y = 0, m = 0;
		String[] participante = new String[10];
		double[][] nota = new double[10][4];
		double[] media = new double[m];

		// Condição para gravar o nome dos alunos
		for (i = 0; i < 10; i++) {
			System.out.println("Qual nome do " + (i + 1) + "º participante: ");
			participante[i] = leia.nextLine();
			leia.nextLine(); // limpa cache

			// Condição para gravar as notas dos alunos por bimestre
			for (j = 0; j < 10; j++) {
				for (y = 0; y < 4; y++) {
					System.out.println("Qual nota do aluno(a) " + participante[i] + " para o " + (y + 1) + "º bimestre: ");
					nota[j][y] = leia.nextDouble();
					leia.nextLine(); // limpa cache
					
				}
				break;
			}

		}

		// NÃO ESTÁ FUNCIONANDO
		// Condição para calcular a média do aluno 
		for (i = 0; i < 10; i++) {
			for (y = 0; y < 4; j++) {
				media[m] += nota[j][y];
			}
			media[m] /= 4;
		}

		System.out.printf("\n Nota do aluno " +participante[i] + media[m]);

	}

}
