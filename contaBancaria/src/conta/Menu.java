package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.util.Cores;
import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		/*
		 * Teste da Classe Conta
		 * 
		 * Foi removido esse teste por que a classe Conta implementou a classe abstrata
		 * Conta conta = new Conta(1, 123, 1, "Adriana", 10000.0f); conta.visualizar();
		 * conta.sacar(12000.0f); conta.visualizar(); conta.depositar(5000.0f);
		 * conta.visualizar();
		 * 
		 * // Teste da Classe Conta Corrente ContaCorrente contaCorrente = new
		 * ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		 * contaCorrente.visualizar(); contaCorrente.sacar(12000.0f);
		 * contaCorrente.visualizar(); contaCorrente.depositar(5000.0f);
		 * contaCorrente.visualizar();
		 * 
		 * // Teste da Classe Conta Poupança ContaPoupanca ContaPoupanca = new
		 * ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		 * ContaPoupanca.visualizar(); ContaPoupanca.sacar(1000.0f);
		 * ContaPoupanca.visualizar(); ContaPoupanca.depositar(5000.0f);
		 * ContaPoupanca.visualizar();
		 */

		Scanner leia = new Scanner(System.in);

		// Variáveis de entrada de dados
		int op, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite; 

		// Instância da Classe ContaController
		ContaController contas = new ContaController();

		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);
			
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();
		
		while (true) {

			System.out.println("\n");
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND
					+ "\t\t	###################################################");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t#	   	  BANCO DO WHISKY 	          #");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t###################################################");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t#	(1) Criar Conta			  	  #");
			System.out.println("\t\t#	(2) Listar todas as contas	  	  #");
			System.out.println("\t\t#	(3) Buscar Conta por Numero	  	  #");
			System.out.println("\t\t#	(4) Atualizar Dados da Conta      	  #");
			System.out.println("\t\t#	(5) Apagar Conta		  	  #");
			System.out.println("\t\t#	(6) Sacar		  	  	  #");
			System.out.println("\t\t#	(7) Depositar			  	  #");
			System.out.println("\t\t#	(8) Transferir valores entre Contas	  #");
			System.out.println("\t\t#	(9) Sair			  	  #");
			System.out.println("\t\t#				    		  #");
			System.out.println("\t\t###################################################" + Cores.TEXT_RESET);

			System.out.println("\n Digite a opção desejada: ");

			try {
				op = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				op = 0;
			}
			
			if (op == 9) {
			System.out.println(
					Cores.TEXT_GREEN_BOLD + "\n\t\t BANCO DO WHISKY - Seu dinheiro, no lugar mais seguro! \n\n");
			leia.close();
			System.exit(0);
			}

			//op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
				
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				
				do {
					System.out.println("Digite o Tipo da Conta (1-ContaCorrente ou 2-ContaPoupança): ");
					tipo = leia.nextInt();
				}while(tipo < 1 && tipo > 2);
					
				System.out.println("Digite o Saldo da Conta: R$");
				saldo = leia.nextFloat();
				
				switch(tipo) {
					case 1 -> {
						System.out.println("Digite o Limite de Crédito: R$");
						limite = leia.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversario da Conta: ");
						aniversario = leia.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				}
				keyPress();
				break;

			case 2:
				System.out.println("Listar todas as Contas\n\n");
				contas.listarTodas();

				keyPress();
				break;

			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				break;

			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				keyPress();
				break;

			case 5:
				System.out.println("Apagar a Conta\n\n");

				keyPress();
				break;

			case 6:
				System.out.println("Saque\n\n");

				keyPress();
				break;

			case 7:
				System.out.println("Depósito\n\n");

				keyPress();
				break;

			case 8:
				System.out.println("Transferência entre Contas\n\n");

				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\n\t\t Opção Inválida! \n");

				keyPress();
				break;
			}

		}
	}

	// Exigir que a tecla ENTER seja precionada ao final da opção Menu.
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}