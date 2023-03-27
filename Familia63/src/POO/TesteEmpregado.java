package POO;

public class TesteEmpregado {

	public static void main(String[] args) {

		//Instanciar o empregado com vetor 
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Beatriz", 15000);
		lista[1] = new Empregado("Whisky", 10000);
		lista[2] = new Empregado("Bolinho", 20000);
		
		// ForFetch
		for(Empregado roda:lista) { // roda é uma variavel de loop 
			roda.imprimir();
		}
		
		System.out.print("############################################# \n");
		
		// ForFetch
		for(Empregado roda:lista) {
			roda.aumentarSalario(25);
			roda.imprimir();
		}

	}

}
