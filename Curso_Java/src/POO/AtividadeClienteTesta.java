package POO;

import java.util.Scanner;

public class AtividadeClienteTesta {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		AtividadeCliente cliente = new AtividadeCliente("Beatriz", "Feminino", 1198882222, 27, "teste@gmail.com");
		AtividadeClientePessoaFisica clienteFisica = new AtividadeClientePessoaFisica("Whisky", "Masculino", 1198888222,10, "teste@gmail.com", "00011122233");
		AtividadeClassePessoaJuridica clienteJuridico = new AtividadeClassePessoaJuridica("Ziza", "Feminino",1198888111, 50, "teste@gmail.com", "44455566677788");

		System.out.println(" Cliente: ");
		cliente.visualizarCliente();
		
		System.out.println(" Cliente Pessoa Fisica: ");
		clienteFisica.visualizarFisica();
		
		System.out.println(" Cliente Pessoa Juridica: ");
		clienteJuridico.visualizarJurifico();
		
	}
}
