package conta.model;

public class ContaCorrente extends Conta {

	// Atritutos
	private float limite;
	
	// Construtor
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);

		this.limite = limite;
	}

	// Métodos GET / SET
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor){
			System.out.println("\n Saldo Insuficiente!");
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}

}
