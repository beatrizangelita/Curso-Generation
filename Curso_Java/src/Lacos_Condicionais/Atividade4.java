/*
 * Escreva um algoritmo em Java, que leia 3 palavras (String), 
 * que definem as características de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita
 */

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		String palavra1, palavra2, palavra3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a primeira palavra: ");
		palavra1 = leia.nextLine();
		
		System.out.println("Digite a segunda palavra: ");
		palavra2 = leia.nextLine();
		
		System.out.println("Digite a terceira palavra: ");
		palavra3 = leia.nextLine();
		
		// equals 
		
		if(palavra1.equals("vertebrado")) {
			if(palavra2.equals("aves")) {
				if(palavra3.equals("carnivoro")) {
					System.out.println("\n Águia");
				}
				else {
					System.out.println("\n Pombo");
				}
			}
			else {
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("\n Humano");
				}
				else {
					System.out.println("\n Vaca");
				}
				
			}
		}
		else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\n Pulga");
				}
				else {
					System.out.println("Lagarta");
				}
			}
			else {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\n Sanguessuga");
				}
				else {
					System.out.println("\n Minhoca");
				}
			}
		}
		
	}

}
