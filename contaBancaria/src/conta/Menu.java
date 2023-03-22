package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int op;
		
		while(true) {
			
			System.out.println("\n");
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND +"\t\t	###################################################");
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
			System.out.println(Cores.TEXT_GREEN_BOLD + "\n\t\t BANCO DO WHISKY - Seu dinheiro, no lugar mais seguro! \n\n");
			leia.close();
			System.exit(0);
			break;
			
		default:
			System.out.println(Cores.TEXT_RED_BOLD +"\n\t\t Opção Inválida! \n");
			break;
	}
		
		}
	}

}
