package POO;

public abstract class Telefone { // abstract torna a classe a abstrata

	// Atributos
	private String tipo;
	
	// metodo abstrato --> não precisa de implementos 
	abstract public void disca(String numero); 
	abstract public void toca(int numToques); 

	
	// Construtor
	public Telefone(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	
	// Métodos GET / SET --> não abstratos e possui implementos
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
