// Criando uma tabuada com a condição Laço de Repetição (FOR)

programa
{
	
	funcao inicio()
	{
		inteiro x, tabuada, resultado

		escreva("Entre com o valor da tabuada: ")
		leia(tabuada)
		limpa()

		para (x = 1; x <= 10; x++){ // para tem 3 condições: (inicio, fim, condição)
			resultado = x * tabuada

			escreva("\n", x, " X ", tabuada, " = ", resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 203; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */