package POO;

public class AtividadeClientePessoaFisica extends AtividadeCliente {
	
	// Atributos
	private String cpf;

	// Construtor
	public AtividadeClientePessoaFisica(String nome, String genero, int telefone, int idade, String email, String cpf) {
		super(nome, genero, telefone, idade, email);
		
		this.cpf = cpf;
	}
	
	// Métodos SET / GET

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// Validar CPF
	public void validarCPF() {
		if(getCpf().length() != 11) { // vai contar quantos caracteres tem no cpf
			System.out.println("\n CPF Inválido");
		}
		else {
			System.out.println("\n CPF Válido!");
		}
	}
	
	public void visualizarFisica() {
		System.out.println(" Nome: " + getNome() + "\n Genero: " + getGenero() + "\n Telefone: " + getTelefone() 
			+ "\n Idade: " + getIdade() + "\n Email: " + getEmail() + "\n CPF: " + cpf + "\n");
	}

}
