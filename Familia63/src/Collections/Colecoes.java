package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Estrutura do List
		
		// List<objeto> nome instancia objeto
		List<Integer> primeiraLista = new ArrayList<Integer>();
		
		// Adicionando um elemento para dentro da minha lista
		primeiraLista.add(2);
		primeiraLista.add(1);
		primeiraLista.add(3);
		primeiraLista.add(1);
		primeiraLista.add(2);
		primeiraLista.add(5);
		primeiraLista.add(2);
		primeiraLista.add(3);
		
		// foretch tipo de dados, a variavel, e a lista que quer rodar
		for (Integer listaElemento:primeiraLista) {
			System.out.println(listaElemento);
		}
		
		System.out.println("\n Removendo um elemento da minha primeira lista: ");
		System.out.println();
		
		// removendo primeiro index(posicao) da minha lista
		primeiraLista.remove(0);
		
		for (Integer listaElemento:primeiraLista) {
			System.out.println(listaElemento);
		}
		
		// Pegar primeiro elemento index(posicao) da minha lista
		int primeiroElemento = primeiraLista.get(0);
		System.out.println("\n O primeiro elemento é: " +primeiroElemento);
		System.out.println();
		
		// size verificada o tamanho da lista || i é um indice - posição 0 pra frente
		for (int i=0; i < primeiraLista.size(); i++) {
			System.out.println("\n Elemento: " +primeiraLista.get(i));
		}
		
		// interface sort ordenar os valores dentro da lista
		Collections.sort(primeiraLista); 
		System.out.println("\n Depois de ordenado: " +primeiraLista);
		
		// Estrutura do Set 
		
		Set<Integer> meuSet = new HashSet<Integer>();
	
		meuSet.add(4);
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(5);
		meuSet.add(6);
		
		// interface Iterator(é uma classe) colega em ordem descente e tira os dados repetidos
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
		}
		
	}

}
