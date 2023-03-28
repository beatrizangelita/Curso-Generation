package POO;

public class Fixo extends Telefone{

	public Fixo() {
		super("Telefone Fixo");
	}
	
	// Métodos Abstratos
	
	@Override
	public void toca(int numToques) { // parametros pode ser igual ou diferente da superclasse
		
		for(int i = 0; i < numToques; i ++) {
			System.out.println("Triiiiiiim Triiiiiiim Triiiiiiim");
		}
		
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\n Discando para o número: " + numero);
	}
	
}
