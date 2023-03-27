package POO;

public class OperarioHeranca extends PessoaHeranca{
	
	// Atributos
	private double valorProducao;
	private double comissao;
	
	// Construtor
	public OperarioHeranca(String nome, String endereco, String cPF, int telefone, int idade, double valorProducao,
			double comissao) {
		
		super(nome, endereco, cPF, telefone, idade); // atributos da classe PessoaHeranca
		
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	// Métodos GET / SET
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	public void imprimirOperario() {
		System.out.println("\n Nome do Empregado: " + getNome() + "\n CPF: " + getCPF() + "\n Idade: " + getIdade() + "\n Telefone: " + getTelefone() 
		+ "\n Endereço: " + getEndereco() + "\n Valor total dos artigos produzidos por " + getNome() + " : " + valorProducao 
		+ "\n Porcentagem (sem o %) da comissão desse artigo: " + comissao);
	}
	
	// calculo do valor da produção
	public void calcularValorArtigo() {
		double valorTotal = valorProducao + (valorProducao * (comissao / 100));
		System.out.println("\n Valor total a ser recebido pelo Operario: " + getNome() + "\n é igual a: " + valorTotal);
	}
	

}
