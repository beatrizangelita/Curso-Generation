package POO;

public class EmpregadoHerancaTeste {

	public static void main(String[] args) {

		EmpregadoHeranca beatriz = new EmpregadoHeranca("Beatriz Angelita", "Rua do Whisku, 90", "43444400000", 959730000, 27, 99, 15000, 10);
		OperarioHeranca teste = new OperarioHeranca("Beatriz Angelita", "Rua do Whisku, 90", "43444400000", 959730000, 27, 10000, 15);
		
		beatriz.imprimir();
		beatriz.calcularSalario();
		
		teste.imprimirOperario();
		teste.calcularValorArtigo();

	}

}
