// 2)	Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float e exiba na tela a média final do participante.

package Entrada_Saida_Operadores;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\n Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\n Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\n Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\n Sua média é: %.2f", media);

	}

}
