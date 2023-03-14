/*
 *  Leia quatro valores float (n1, n2, n3, n4). 
 *  A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4
 */

package Entrada_Saida_Operadores;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("\n Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n Digite o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("\n Digite o querto número: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2 ) - (n3 * n4);
		
		System.out.printf("\n Diferença é: %.2f", diferenca);
	}

}
