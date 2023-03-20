package JavaIntroducao;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		// Estrutura do FOR - é utilizando com número já pré-determinado
		
		// somaMedia = 0 :: é somente para fazer a primeira vez, por que o 0 é neutro. Está inicializando a variavel.
		
		float n1, n2, n3, media, somaMedia = 0, mediaGeral;
		int x;
		String nome;
		
		Scanner leia = new Scanner (System.in); // Escanear o valor que o usuário digital e guardar em uma variavel

		// FOR (PrimeiroParametro(inicio) , SegundoParametro(fim), Condicao(como vai rodar no laço))
		
		for(x = 1; x <= 3; x++) { // x++ é a mesma coisa que x = x + 1
			
			System.out.println("Entre com o nome do alune: ");
			nome = leia.nextLine();
			
			System.out.println("Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			
			System.out.println("Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			
			System.out.println("Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			leia.nextLine(); // limpa o cache da memora (acontece só com variaveis de string)
			
			// calculo da média
			media = (n1+n2+n3)/3;
			
			// somaMedia = somaMedia + media
			somaMedia += media;
			System.out.println("\n A média do alune " + nome + " foi de: " + media);
			
		}
		
		//Calculo da média geral
		mediaGeral = somaMedia / 3;
		System.out.printf("\n Média Geral dos alunes é: %.2f", mediaGeral);
	}

}
