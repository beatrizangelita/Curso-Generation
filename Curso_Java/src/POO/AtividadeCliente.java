package POO;

public class AtividadeCliente {

	// Atributo
	private String nome;
	private String genero;
	private int telefone;
	private int idade;
	private String email;
	
	// Construtor
	public AtividadeCliente(String nome, String genero, int telefone, int idade, String email) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.telefone = telefone;
		this.idade = idade;
		this.email = email;
	}
	
	// Metodos GET / SET

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	public void visualizarCliente() {
		System.out.println(" Nome: " + nome + "\n Genero: " + genero + "\n Telefone: " + telefone + "\n Idade: " + idade + "\n Email: " + email + "\n");
	}
	
}
