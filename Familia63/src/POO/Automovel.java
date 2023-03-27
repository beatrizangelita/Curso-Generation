package POO;

public class Automovel {
	
	// não dar para rpdar codigo por que não tem o main

	// Declaração dos atributos da classe
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	// Método construtor - tem que tem exatamente o mesmo nome da classe
	// botão direito --> Source --> Gererate Constructor using fields
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
		
		super(); // não é obrigatório - indicativo que é uma super classe
		
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	// Método Get pegar / Set atribui || --> botão direito, source, generate getters and setters

	
	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public void imprimirInfo() {
		System.out.println(nomeProprietario + " possui um automovel: " + modelo + " com placa: " + placa + " e ano: " + ano + "\n");
	}

}
