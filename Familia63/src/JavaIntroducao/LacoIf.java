package JavaIntroducao;

import java.util.Scanner;

public class LacoIf {

	public static void main(String[] args) {
		
		// Estrutura do laço IF
		
		float n1, n2, n3, media; // número com ponto flutuante(reais)
		
		Scanner leia = new Scanner(System.in); // Escanear o valor que o usuário digital e guardar em uma variavel
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("\n Digite a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		// Calculo da média
		media = (n1 + n2 + n3) / 3;
		System.out.printf("\n Sua média é: %.2f", media);
		
		// 
		if (media <= 10 && media >= 7) {
			System.out.println("\n Você está aprovado!");
		} 
		else if(media < 7 && media >= 5) {
			System.out.println("\n Você está de recuperação! ");
		}
		else {
			System.out.println("\n Você está reprovado(a)!");
		}
		
		
		// Estrutura do SWITCH - Escolha
		
		System.out.println("\n\t\t Menu de Elogios!");
		
		System.out.println("\n 1 - Feliz");
		System.out.println("\n 2 - Acolhedora");
		System.out.println("\n 3 - Parabéns");
		System.out.println("\n 4 - Nota 10");
		System.out.println("\n 5 - É Show");
			
		
		System.out.println("\n Digite a sua opção: ");
		int op = leia.nextInt();		
		
		switch(op) {
			
		case 1:
			System.out.println("\n Família Feliz");
			break;
		case 2:
			System.out.println("\n Família Acolhedora");
			break;
		case 3:
			System.out.println("\n Família está de Parabéns");
			break;
		case 4:
			System.out.println("\n Família Nota 10");
			break;
		case 5:
			System.out.println("\n Família é Show");
			break;
			
			default:
				System.out.println("\n Opção inválida!");
		}
		
		
	}
}
