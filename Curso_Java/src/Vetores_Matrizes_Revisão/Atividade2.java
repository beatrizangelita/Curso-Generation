/*
 * Um dado convencional (6 lados) é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 */

package Vetores_Matrizes_Revisão;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] dados = new int[10];
		
		int somaLancamento = 0, qtdMaior = 0, maiorValor = 0, qdMaior = 0, x;
		float mediaLancamento;

		for(x = 0; x < 10; x++) {
			System.out.println("\n Digite o valor do lancamento: ");
			dados[x] = leia.nextInt();
			
			// validar se foi digitado 0 a 6
			while(dados[x] < 1 || dados[x] > 6) { // While irá validar até o usuário digitar de 0 a 6, se não, ficará repetindo.
				System.out.println("\n Valor invalido! Digite novamente: ");
				dados[x] = leia.nextInt();
			}
			
			// será somando todos os valores digitados
			somaLancamento += dados[x];
			
			// condição para mostrar quantas vezes foi digitado o número 6
			if(dados[x] == 6) {
				qtdMaior++;
			}
			
			if(maiorValor < dados[x]) {
				maiorValor = dados[x];
			}
		}
		
		// condição para mostrar o maior número digitado
		for(x = 0; x < 10; x++) {
			if (dados[x] == maiorValor) {
				qdMaior++;
			}
		}
		
		mediaLancamento = somaLancamento / 10;
		System.out.println("\n Quantidade de vezes que saiu o valor 6: " +qtdMaior );
		System.out.println("\n Média dos lancamentos: " +mediaLancamento);
		System.out.println("\n Maior lancamento foi: " +qdMaior + " apareceu: " +qtdMaior+ " vezes");
	}

}
