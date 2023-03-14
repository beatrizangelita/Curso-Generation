package JavaIntroducao;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Beatriz Angelita";
		int idade = 27, x = 7;
		double altura = 1.60, nota1, nota2, nota3, media;
		
		System.out.println("\n O seu nome é: "+ nome + "\n Sua Idade é: " + idade + "\n Sua Altura é: " + altura);
	
		
		Scanner leia = new Scanner(System.in); 
		System.out.println("\n Entre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\n Entre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\n Entre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3 ;
		
		System.out.println("\n Sua média é: " + media);
		
		System.out.printf("\n Sua média é: %.2f",media); //formatação 2 antes da virgula 
	
		nota1 = Math.sqrt(nota2); // raiz quadrada
		nota2 = Math.pow(nota3, 3); // potencia, ao cubo
		
		x = idade % x; // divisao de idade por x, mostra o resto
	}

}
