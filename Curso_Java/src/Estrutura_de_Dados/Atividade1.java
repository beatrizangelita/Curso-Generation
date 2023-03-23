/*
 * Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. 
 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
 * 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro. 
 * 2: Listar todos os livros da Pilha 
 * 3: Retirar um livro da pilha  
 * 0: O programa deve ser finalizado. 
 * Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.

 */

package Estrutura_de_Dados;

import java.util.Scanner;
import java.util.Stack;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String livro;
		boolean pilha;
		int op;

		Stack<String> menu = new Stack<String>();

		do {

			System.out.println();
			System.out.println("\t\t###################################################");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t#		Organizador de Livros		  #");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t###################################################");
			System.out.println("\t\t###################################################");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t#	(1) Adicionar Livro na Pilha		  #");
			System.out.println("\t\t#	(2) Listar todos os Livros	  	  #");
			System.out.println("\t\t#	(3) Retirar Livro da Pilha	  	  #");
			System.out.println("\t\t#	(0) Sair      	 			  #");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t###################################################");

			System.out.println("\n Digite a opção desejada: ");

			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.print("Favor informar o nome do Livro: \n");
				leia.next();
				livro = leia.nextLine();
				menu.push(livro);
				break;

			case 2:
				pilha = menu.isEmpty();
				if (pilha == true) {
					System.out.print("Pilha de livros está vazia! \n");
				} else {
					System.out.println("Lista de todos os livros: \n" + menu);
				}
				break;

			case 3:
				pilha = menu.isEmpty();
				if (pilha == true) {
					System.out.print("Não tem como remover livro, pois a pilha de livros está vazia! \n");
				} else {
					System.out.print("Livro removido da pilha: \n" + menu.pop());
					System.out.println(menu);
				}
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
