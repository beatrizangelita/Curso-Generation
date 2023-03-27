package POO;

public class EmpregadoHeranca extends PessoaHeranca { // extends --> classe EmpregadoHeranca irá hendar tudo que tem dentro da classe PessoaHeranca

	// Atributos
	private int codigoSetor;
	private float salarioBase;
	private float imposto;

	// Construtor
	public EmpregadoHeranca(String nome, String endereco, String cPF, int telefone, int idade, int codigoSetor,
			float salarioBase, float imposto) {

		super(nome, endereco, cPF, telefone, idade); // atributos da classe PessoaHeranca

		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public void imprimir() {
		System.out.println("\n Nome do Empregado: " + getNome() + "\n CPF: " + getCPF() + "\n Idade: " + getIdade() + "\n Telefone: " + getTelefone() 
		+ "\n Endereço: " + getEndereco() + "\n Código do Setor: " + codigoSetor + "\n Sálario Base: " + salarioBase 
		+ "\n Valor em porcentagem (sem o %) do imposto a ser retido do sálario: " + imposto);
	}

	// calcular salario
	public void calcularSalario() {
		double salarioTotal = salarioBase - (salarioBase * (imposto / 100));
		System.out.println("\n O sálario total a ser recebido pelo empregado " + getNome() + " é igual a: " + salarioTotal);
	}
	
}
