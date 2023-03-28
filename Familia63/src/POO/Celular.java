package POO;

public class Celular extends Telefone {
	
	// Construtor
	public Celular() {
		super("Telefone Celular"); // irá passar a String para o tipo do telefone
	}
	
	// metodos polimorfos :: @Override para indicar que são metodos polimorfos
	@Override 
	public void toca(int codToque) {
		switch(codToque) {
		case 1: 
			System.out.println("Pin Pin Pin");
			break;
		case 2: 
			System.out.println("Pin Pin Pin");
			break;
			
		default:
			System.out.println("Ta tanana tananana");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\n O número: " + numero + " é um celular.");
	}
	
}
