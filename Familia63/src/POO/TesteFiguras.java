package POO;

public class TesteFiguras {

	public static void main(String[] args) {
		
		// Objeto Quadrado
		Quadrado fig1 = new Quadrado(10, "Quadrado");
		// Objeto Retangulo
		Retangulo fig2 = new Retangulo(3,4,"Retangulo");
		
		System.out.println(fig1.getNome() + " : " + fig1.getDiagonal());
		System.out.println(fig2.getNome() + " : " + fig2.getDiagonal());

	}

}
