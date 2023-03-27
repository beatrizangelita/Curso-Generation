package POO;

import java.text.NumberFormat;

public class Empregado {

	// Atributo
	private String nome;
	private double salario;
	
	// Construtor
	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	// Métodos GET / SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Método de funcionalidades - criado || void não retorna nada
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual / 100;
	}
	
	// Método de funcionalidade - criado || sem void vai retornar
	public String formatarMoeda() {
		
		// formatador de String 
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // metodo - 	pega o sistema operacional para verificar qual o pais para mostrar a moeda
		nf.setMinimumFractionDigits(2); // metodo - colocar quantas casas depois da ,
		String formatoMoeda = nf.format(salario);
		
		return formatoMoeda; // irá retornar o salario formatado
	}
	
	public void imprimir() {
		System.out.println(nome + "\t\t\t Salário:" + this.formatarMoeda());
	}
		
}
