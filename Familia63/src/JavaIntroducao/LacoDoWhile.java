package JavaIntroducao;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		
		// Estrutura Do While - Executa pelo menos uma vez enquanto for verdadeiro.
		
		int tabuada, x=1, resultado;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("\n\t\t Digite a tabuada que deseja visualizar: ");
		tabuada = leia.nextInt();
		
		do { // Faça 
			
			resultado = tabuada * x;
			System.out.println(tabuada + " X " + x + " = " + resultado);
			x++;
		}
		while(x <= 10); // Enquanto a condição for verdadeira
		
	}

}
