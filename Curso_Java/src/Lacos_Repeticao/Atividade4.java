/*
 * Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e 
 * precisam de um sistema para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:
●	Idade (Número inteiro)
●	Sexo (Número Inteiro): 
o	1 – Masculino
o	2 – Feminino
o	3 – Outros
●	
	Categoria (Número Inteiro):
o	1 – Backend
o	2 – Frontend
o	3 – Mobile
o	4 – FullStack
Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados de um novo colaboradore ou não (S/N). 
Caso seja pressionada a tecla N, mostre na tela:

●	O número de pessoas desenvolvedoras Backend
●	O número de mulheres desenvolvedoras Frontend
●	O número de homens desenvolvedores Mobile maiores de 40 anos
●	O número de mulheres desenvolvedoras FullStack menores de 30 anos

 */

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String escolha = "s";
		int idade, sexo, categoria, backEnd = 0, frontEnd = 0, mobile = 0, fullStack = 0;

		while (escolha.equalsIgnoreCase("S")) {
			System.out.println("Informe sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\n\t\t Sexo: ");
			System.out.println("1 - Masculino");
			System.out.println("2 - Feminino");
			System.out.println("3 - Outros");
			
			System.out.println("\n Digite a opção desejada: ");
			sexo = leia.nextInt();
			
			switch(sexo) {
			case 1: 
				System.out.println("\n 1 - Masculino");
				break;
			case 2: 
				System.out.println("2- Feminino");
				break;
			case 3: 
				System.out.println("3 - Outros");
				break;
				
				default:
					System.out.println("\n Opção invalida!");
			}
			
			System.out.println("\n\t\t Categoria: ");
			System.out.println("1 - BackEnd");
			System.out.println("2 - FrontEnd");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			
			System.out.println("\n Digite a opção desejada: ");
			categoria = leia.nextInt();
			
			switch(categoria) {
			case 1: 
				System.out.println("\n 1 - BackEnd");
				break;
			case 2: 
				System.out.println("2- FrontEnd");
				break;
			case 3: 
				System.out.println("3 - Mobile");
				break;
			case 4: 
				System.out.println("4 - FullStack");
				break;
				
				default:
					System.out.println("\n Opção invalida!");
			}			
			
			System.out.println("\nDeseja continuar a leitura dos dados de um novo colaboradore? (S/N)");
			escolha = leia.next();

			if (backEnd > 0) {
				backEnd++;
			} 
			
			else if (sexo == 2 && categoria == 2) {
				frontEnd++;
			} 
			
			else if (sexo == 1 && categoria == 3 && idade > 40) {
				mobile++;
			} 
			
			else if (idade < 30 && sexo == 2 && categoria == 4) {
				fullStack++;
			}

		}
		
		System.out.printf("\n O número de pessoas desenvolvedoras Backend é: " + backEnd);
		System.out.printf("\n O número de mulheres desenvolvedoras Frontend é : " + frontEnd);
		System.out.printf("\n O número de homens desenvolvedores Mobile maiores de 40 anos é: " + mobile);
		System.out.printf("\n O número de mulheres desenvolvedoras FullStack menores de 30 anos é : " + fullStack);

	}

}
