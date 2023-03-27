package conta.model;

public class ContaPoupanca extends Conta{

	// Atributo
	private int aniversario;

	// Construtor
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		
		this.aniversario = aniversario;
	}

	// Métodos GET / SET
	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}
    
}
