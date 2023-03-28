package POO;

	// implementar a multipla herança || Extender BaseFiguras e implementar Figuras

public class Quadrado extends BaseFigura implements Figuras{

	Quadrado(double lado, String nome){
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
	}
	
	@Override
	public double getDiagonal() {
		return Math.sqrt(2) * lado1; // calculo do quadrado
	}
	
}
