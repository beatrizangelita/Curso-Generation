/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. 
 * Em seguida, faça o que se pede:
 * Mostre na tela todas as cores que foram adicionadas. 
 * Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\n Digite a " + i + "ª cor: ");
		String adicionar = leia.nextLine();
		cores.add(adicionar);
		}
		
		System.out.println("\n Todas as cores que foram adicionadas: " +cores);
		Collections.sort(cores);
		System.out.println("\n Todas as cores que foram adicionadas em ordem crescente: " +cores);

	}

}
