package Collections;

import java.util.Iterator;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		// Estrutura da Dados
		// Pilha - ultimo elemento que entra, é o primeiro elemento que sai
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato verde");
		pilha.push("Prato vermelho");
		pilha.push("Prato preto");
		pilha.push("Prato preto");
		pilha.push("Prato preto");
		
		// irá mostrar os elementros dentro da pilha
		System.out.println("Elementos dentro da pilha: " +pilha);

		// retirar um elemento da pilha
		System.out.println("Retirar um elemento: " +pilha.pop());
		System.out.println("Elementos dentro da pilha: " +pilha);
		
		// irá mostrar o último elemento dentro da pilha
		System.out.println("Elementos no topo: " +pilha.peek());
		
		// adicionar um elemento no topo dentro da pilha
		System.out.println("Adicionar um elementos: " +pilha.push("Prato roxo"));
		System.out.println("Elementos dentro da pilha: " +pilha);
		
		// verificar o tamanho dentro da pilha
		System.out.println("Tamanho da pilha: " +pilha.size());
		
		// verificar um elemento dentro da pilha - vai retornar um valor boolean 
		System.out.println("Verificar se existe elemento: " +pilha.contains("Prato"));

		// Exibir todos os elementos dentro da pilha e organizar em ordem 
		System.out.println("Elementos dentro da pilha: ");
		Iterator<String> iterator = pilha.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
