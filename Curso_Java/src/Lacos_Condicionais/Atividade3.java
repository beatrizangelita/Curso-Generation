/*
 * Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
 * Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). 
 * De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue. 
 */
package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean doador;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Qual o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("\n Qual idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("\n É a primeira vez que doa? ");
		doador = leia.nextBoolean();
		
		/*if (idade >= 18 && idade <=60) {
			System.out.println(nome+" está apto(a) para doar sangue");
		}else if(idade > 60 && idade <=69 && doador == true) {
			System.out.println(nome+" está apto(a) para doar sangue");
		}else if(idade > 60 && idade <=69 && doador == false){
			System.out.println(nome+" não está apto(a) para doar sangue");
		}else {
			System.out.println(nome+" não está apto(a) para doar sangue");
		}/*/
		
		if(idade >= 18 && idade <=60) {
			System.out.println(nome + " está apto para doar sangue!");
		}
		else if (idade > 60 && idade <=69 && doador == true) {
			System.out.println(nome + " está apto para doar sangue!");
		}
		else if(idade > 60 && idade <=69 && doador == false) {
			System.out.println(nome + " não está apto para doar sangue!");
		}
		else {
			System.out.println(nome + " não esta apto para doar sangue!");
		}
	}

}
