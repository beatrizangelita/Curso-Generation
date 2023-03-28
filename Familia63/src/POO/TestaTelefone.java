package POO;

public class TestaTelefone {

	public static void main(String[] args) {
		
		/* Objeto do tipo telefone - classe abstrata não pode ser instancia
		Telefone tel = new Telefone(); 
		*/
		
		// Objeto Celular/Fixo/Publico - Não é uma classe abstrata e pode ser instanciado
		Celular cel = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();
		
		// Não é objeto instanciado, é uma varivavel vazia 
		Telefone telefone = null;
		
		int n = (int) (Math.random() * 3.0); // sistema randomico - pega números aleatorios 0 1 ou 2
		System.out.println("\n O número sorteado foi: " + n);
		
		switch (n) {
		
		case 1:
			telefone = cel;
			break;
		case 2:
			telefone = fixo;
			break;
		case 3:
			telefone = publico;
			break;
			
			default:
				System.out.println("\n Erro inesperado!");
		}
		
		if(telefone != null) {
			telefone.disca("911223344");
			telefone.toca(2);
		}
		
	}

}
