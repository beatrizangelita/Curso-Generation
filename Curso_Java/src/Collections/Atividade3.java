/*
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set. 
 * Em seguida, faça o que se pede:
 * Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
 */

package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> primeiroSet = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("\n Digite o " + i + "º número: ");
			int numeros = leia.nextInt();
			primeiroSet.add(numeros);
		}
		
		Iterator<Integer> iSet = primeiroSet.iterator();
		
		while(iSet.hasNext()) {
			System.out.println("\n Todos os Elementos: " +iSet.next());
		}

	}

}
