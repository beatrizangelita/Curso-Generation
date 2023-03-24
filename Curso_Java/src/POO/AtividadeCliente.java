package POO;

public class AtividadeCliente {

	// Atributo
	private String nomeCliente;
	private String genero;
	private int telefone;
	private int idade;
	private String email;
	
	// Construtor
	public AtividadeCliente(String nomeCliente, String genero, int telefone, int idade, String email) {
		super();
		this.nomeCliente = nomeCliente;
		this.genero = genero;
		this.telefone = telefone;
		this.idade = idade;
		this.email = email;
	}
	
	// Metodos GET / SET

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void imprimir() {
		System.out.println("Cliente: " + nomeCliente + ", Genero: " + genero + ", Telefone: " + telefone + ", Idade: " + idade + ", Email: " + email);
	}
	
}
