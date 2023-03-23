/*
 * Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a ordem de chegada dos Clientes de um Banco. 
 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
 * 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
 * 2: Listar todos os Clientes na fila
 * 3: Chamar (retirar) uma pessoa da fila 
 * 0: O programa deve ser finalizado. 
 * Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila
 */

package Estrutura_de_Dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String cliente;
		int op;

		Queue<String> menu = new LinkedList<String>();

		do {

			System.out.println();
			System.out.println("\t\t###################################################");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t#		Fila do Banco			  #");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t###################################################");
			System.out.println("\t\t###################################################");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t#	(1) Adicionar Cliente na Fila		  #");
			System.out.println("\t\t#	(2) Listar todos os Clientes	  	  #");
			System.out.println("\t\t#	(3) Retirar Cliente da fila	  	  #");
			System.out.println("\t\t#	(0) Sair      	 			  #");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t###################################################");

			System.out.println("\n Digite a opção desejada: ");

			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.print("Favor informar o nome do novo cliente: \n");
				leia.next();
				cliente = leia.nextLine();
				menu.add(cliente);
				break;

			case 2:
				boolean fila = menu.isEmpty();
				if (fila == true) {
					System.out.print("Fila está vazia! \n");
				} else {
					System.out.println("Lista de todos os clientes: \n" + menu);
				}
				break;

			case 3:
				System.out.print("Cliente retirado da fila: \n" + menu.poll());
				System.out.println(menu);
				break;

			case 0:
				System.out.print("\n\t\t Programa Finalizado!");
				leia.close();
				System.exit(0);
				break;

			default:
				System.out.print("\n\t\t Opção Inválida! \n");
				break;

			}

		} while (op != 0);

	}

}
