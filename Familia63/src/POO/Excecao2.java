package POO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {

// criar um método - ele vai demostrar o lancamento de uma excessão quando, por exemplo ocorre divisão por 0
	public static int quociente(int numerador, int denominador) throws ArithmeticException { // ele é uma excecção, ele
																								// vai pegar o metodo e
																								// vai verificar se pode
																								// acontecer um erro de
																								// aritmetica
		return numerador / denominador;
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		boolean continueLoop = true; // determina se mais entrada são necessárias

		do {

			try {
				System.out.println("\n Entre com o numerador: ");
				int numerador = leia.nextInt();

				System.out.println("\n Entre com o denominador: ");
				int denominador = leia.nextInt();

				int resultado = quociente(numerador, denominador);
				System.out.printf("\n Resultado: %d / %d = %d\n", numerador, denominador, resultado);
				
				continueLoop = false;
				
			} catch (InputMismatchException e) { // vai tratar uma entrada de dados errados
				System.err.printf("\n\n Exception: %s \n", e); // vai mostrar qual a exception que está dando erro
				leia.nextLine();
				System.out.println("\n Você deve entrar com o valor do tipo inteiro! Por favor. Tente Novamente.");
			
			} catch (ArithmeticException arithmeticException) {
				System.err.printf("\n\n Exception: %s	\n", arithmeticException);
				System.out.println("\n Zero é um denominador inválido! Por favor. Tente Novamente.");
			}

		} while (continueLoop); // enquanto for verdadeiro, vai continuar
	}

}
