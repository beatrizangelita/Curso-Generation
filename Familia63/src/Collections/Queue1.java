package Collections;

import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue1 {

	public static void main(String[] args) {

		// Estrutura do Dados
		// Queue - Fila primeiro que entra, é o primeiro que sai

		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i = 0; i <= 10; i ++) {
			fila.add(i);
		}
		
		// verificando os elementos dentro da fila
		System.out.println("Elemento dentro da fila: " +fila);
		
		// removendo elemento da fila
		System.out.println("Remover elemento dentro da fila: " +fila.remove());
		
		// verificando os elementos dentro da fila após remover
		System.out.println("Elemento dentro da fila após a remoção: " +fila);
		
		// adicinando elemento dentro da fila
		System.out.println("Elemento dentro da fila: " +fila.add(11));
		
		// verificando os elementos dentro da fila após adicionar
		System.out.println("Elemento dentro da fila: " +fila);
		
		System.out.println("Pegar o primeiro elemento dentro da fila: " +fila.peek());
		
		// verificar qual o tamanho da minha fila - quantos elementos
		System.out.println("Pegar o tamanho da fila: " +fila.size());
		
		// verificar se um elemento está dentro da fila - vai retornar um valor boolean 
		System.out.println("Verificar um elemento dentro da fila: " +fila.contains(37));
		
		// ele exibir todos os elementos da fila, e remove o primeiro elemento
		System.out.println("Exibir e vou também retirar o primeiro elemento dentro da fila: " +fila.poll());
		
		System.out.println("Elemento dentro da fila: " +fila);
		
		// ordena os elementos dentro da fila - Iterator é uma API
		Iterator<Integer> iterator = fila.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// irá limpar a fila
		System.out.println("Limpar os elemento dentro da fila. ");
		fila.clear();
		
		// verificar se a fila tem elementos dentro dela - vai retornar um valor boolean 
		System.out.println("Elemento dentro da fila: " +fila.isEmpty());
		System.out.println("Elemento dentro da fila: " +fila);
	}

}
