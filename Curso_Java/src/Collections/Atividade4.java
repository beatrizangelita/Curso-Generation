/*
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: 
 * Número 00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: 
 * O número NN não foi encontrado!
 */

package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> listaNum = new HashSet<Integer>();
		
		listaNum.add(2);
		listaNum.add(5);
		listaNum.add(1);
		listaNum.add(3);
		listaNum.add(4);
		listaNum.add(9);
		listaNum.add(7);
		listaNum.add(8);
		listaNum.add(10);
		listaNum.add(6);
		
		System.out.println("Digite o número que deseja encontrar: ");
		int verificaNum = leia.nextInt();
		leia.nextLine();
		
		for(int i = 0; i < listaNum.size(); i++) {
			//System.out.println(listaElemento);
			
				if(listaNum.contains(verificaNum)) {
					System.out.println("\n O número " + verificaNum + " , foi encontrado. ");
					leia.nextLine();
				}
				
				else {
					System.out.println("\n O número " + verificaNum + " não foi encontrado.");
					leia.nextLine();
				}
			
		}

	}

}
