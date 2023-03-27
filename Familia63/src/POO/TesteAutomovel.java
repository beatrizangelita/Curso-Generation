 package POO;

public class TesteAutomovel {

	public static void main(String[] args) {

		// consegue rodar o codigo por que tem o main
		
		// Instanciando um objeto da classe Automovel
		
		Automovel auto1 = new Automovel("Beatriz","Fiat","FUF-9930",2023);
		
		// irá mostrar a mensagem da outra classe declarada
		auto1.imprimirInfo();

		// SET para trocar o valor 
		System.out.println("Transferencia de Proprietário!");
		auto1.setNomeProprietario("Whisky");
		auto1.imprimirInfo();
		
		System.out.println("Mudança de Placa");
		auto1.setPlaca("FUF-2023");
		auto1.imprimirInfo();
	}

}
