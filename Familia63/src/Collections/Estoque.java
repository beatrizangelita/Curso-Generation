/*
 * Criando um estoque 
 */

package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int op;

		// ou ArrayList<String> estoque = new ArrayList<String>();
		List<String> estoque = new ArrayList<String>();
		
		do {
			
			System.out.println("\n ------------------------ ");
			System.out.println("\n\t\t Menu do Estoque");
			System.out.println("\n(1) Deseja adicionar produto ao estoque?");
			System.out.println("(2) Deseja remover produto do estoque?");
			System.out.println("(3) Deseja atualizar produto do estoque?");
			System.out.println("(4) Deseja mostrar os produtos no estoque?");
			System.out.println("(0) Deseja encerrar o programa de estoque? ");
			System.out.println("\n Digite a sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
				case 1:
					leia.nextLine();
					System.out.println("\n Digite o produto para adicionar ao estoque: ");
					String produto = leia.nextLine();
					estoque.add(produto); // adicionando produto ao estoque
					break;
					
				case 2:
					leia.nextLine();
					System.out.println("\n Digite o produto que deseja remover do estoque: ");
					String removeProduto = leia.nextLine();
						if(estoque.contains(removeProduto)) { // verificar se existe o produto no estoque
							estoque.remove(removeProduto);
						}else {
							System.out.println("\n Esse produto não existe!");
						}
						
						System.out.println("\n Produtos do Estoque: ");
						System.out.println(estoque);
						
					break;
					
				case 3:
					leia.nextLine();
					System.out.println("\n Digite o produto que deseja atualizar: ");
					String atualizaProduto = leia.nextLine();
					System.out.println("\n Digite o nome que entrará no lugar do produto" + atualizaProduto);
					String novoProduto = leia.nextLine();
						if(estoque.contains(atualizaProduto)) {
							estoque.remove(atualizaProduto);
							estoque.add(novoProduto);
						}
						else {
							System.out.println("\n Produtos do Estoque: ");
							System.out.println(estoque);
						}
					break;
				case 4:
					leia.nextLine();
					System.out.println();
					System.out.println("\n Produtos do estoque:");
					System.out.println(estoque);
					break;
					
				case 0:
					leia.nextLine();
					System.out.println("\n Muito obrigado por utilizar nosso sistema!");
					break;
					
					default:
						System.out.println("\n Opção inválida! Digite novamente uma das opções:");
			}
			
		}while(op != 0);
	}

}
