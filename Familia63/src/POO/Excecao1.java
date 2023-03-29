package POO;

public class Excecao1 {

	public static void main(String[] args) {

		// Execptions

		String frase = null;
		String novaFrase = null;

		// ele vai tentar fazer todas as execuções, caso ele ache um problema,

		try {

			// verificou que é um possível erro.
			novaFrase = frase.toUpperCase(); // ele vai pegar a string e torna ela em maiusculo

		} catch (NullPointerException e) {// captura uma possível exceção

			// tratamento da minha exceção
			System.out.println(
					"\n A frase inicial está Nula, para solucionar tal problema, foi lhe atribuido um valor default");
			frase = "Frase Vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("\n Frase antiga: " +frase );
		System.out.println("\n Nova Frase: " +novaFrase );
		
	}

}
