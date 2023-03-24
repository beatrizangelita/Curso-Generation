package POO;

import java.util.Scanner;

public class AtividadeClienteTesta {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		AtividadeCliente[] clientes = new AtividadeCliente[3];
		
		clientes[0] = new AtividadeCliente("Beatriz", "Feminino", 1198882222, 27, "teste@gmail.com");
		clientes[1] = new AtividadeCliente("Whisky", "Masculino", 1198888222, 10, "teste@gmail.com");
		clientes[2] = new AtividadeCliente("Ziza", "Feminino", 1198888111, 50, "teste@gmail.com");
		
		for(AtividadeCliente loop:clientes) {
			loop.imprimir();
		}
	}

}
