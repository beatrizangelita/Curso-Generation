package POO;

public class PessoaHeranca {
	
	// CRAIR SUBCLASSE
	
	// Atributos
	private String nome;
	private String endereco;
	private String CPF;
	private int telefone;
	private int idade;
	
	// Construtor
	public PessoaHeranca(String nome, String endereco, String cPF, int telefone, int idade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		CPF = cPF;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	// Métodos GET / SET

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
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
	
	// Validar CPF
	
	public void validarCPF() {
		if(getCPF().length() != 11) { // vai contar quantos caracteres tem no cpf
			System.out.println("\n CPF Inválido");
		}
		else {
			System.out.println("\n CPF Válido!");
		}
	}
	
}
