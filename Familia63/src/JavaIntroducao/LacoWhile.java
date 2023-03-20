package JavaIntroducao;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {

		// Estrutura do Laço While - é utilizado quando não temos números pré-determinado. Eenquanto for verdadeiro executa.
		
		// somaPar = 0 / contImpar = 0 :: é somente para fazer a primeira vez, por que o 0 é neutro. Está inicializando a variavel.
		int numero, somaPar=0, contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com um número: ");
		numero = leia.nextInt();
		
		//enquanto numero for diferente de 0, será mostrado a mensagem, caso digite 0 ele saira do loop. Só tem 1 condição.
		while(numero != 0) { 
			
			if(numero % 2 == 0) {
				somaPar += numero; // irá somar os numero par
			}
			else {
				contImpar ++; // irá contar os numeros impar
			}
			System.out.println("\n Entre com um novo número: ");
			numero = leia.nextInt();
		}

		System.out.println("\n Soma dos números pares foi: " + somaPar);
		System.out.println("\n Quantidade de números impar: " + contImpar);
	}

}
