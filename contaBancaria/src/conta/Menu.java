package conta;

import java.util.Scanner;
import conta.util.Cores;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		// Teste da Classe Conta
		
		/* Foi removido esse teste por que a classe Conta implementou a classe abstrata
		Conta conta = new Conta(1, 123, 1, "Adriana", 10000.0f);
		conta.visualizar();
		conta.sacar(12000.0f);
		conta.visualizar();
		conta.depositar(5000.0f);
		conta.visualizar();*/

		// Teste da Classe Conta Corrente
		ContaCorrente contaCorrente = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		contaCorrente.visualizar();
		contaCorrente.sacar(12000.0f);
		contaCorrente.visualizar();
		contaCorrente.depositar(5000.0f);
		contaCorrente.visualizar();

		// Teste da Classe Conta Poupança
		ContaPoupanca ContaPoupanca = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		ContaPoupanca.visualizar();
		ContaPoupanca.sacar(1000.0f);
		ContaPoupanca.visualizar();
		ContaPoupanca.depositar(5000.0f);
		ContaPoupanca.visualizar();

		Scanner leia = new Scanner(System.in);

		int op;

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

			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("Criar Conta\n\n");

				break;

			case 2:
				System.out.println("Listar todas as Contas\n\n");

				break;

			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				break;

			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				break;

			case 5:
				System.out.println("Apagar a Conta\n\n");

				break;

			case 6:
				System.out.println("Saque\n\n");

				break;

			case 7:
				System.out.println("Depósito\n\n");

				break;

			case 8:
				System.out.println("Transferência entre Contas\n\n");

				break;

			case 9:
				System.out.println(
						Cores.TEXT_GREEN_BOLD + "\n\t\t BANCO DO WHISKY - Seu dinheiro, no lugar mais seguro! \n\n");
				leia.close();
				System.exit(0);
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\n\t\t Opção Inválida! \n");
				break;
			}

		}
	}

}
