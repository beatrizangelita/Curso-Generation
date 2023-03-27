package POO;

public class AtividadeClassePessoaJuridica extends AtividadeCliente {

	// Atributos
	private String cnpj;

	// Construtor
	public AtividadeClassePessoaJuridica(String nome, String genero, int telefone, int idade, String email, String cnpj) {
		super(nome, genero, telefone, idade, email);
		
		this.cnpj = cnpj;
	}

	// Métodos GET / SET
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	// Validar CNPJ
		public void validarCNPJ() {
			if(getCnpj().length() != 14) { // vai contar quantos caracteres tem no cnpj
				System.out.println("\n CNPJ Inválido");
			}
			else {
				System.out.println("\n CNPJ Válido!");
			}
		}
	
	public void visualizarJurifico() {
		System.out.println(" Nome: " + getNome() + "\n Genero: " + getGenero() + "\n Telefone: " + getTelefone() 
		+ "\n Idade: " + getIdade() + "\n Email: " + getEmail() + "\n CNPJ: " + cnpj + "\n");
	}
}
