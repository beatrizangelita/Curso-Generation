/*
 * Crie uma função capaz de processar um número e verificar se é divisível por 4 ou 9. 
 * O resultado verdadeiro (verdadeiro) deve ser emitido para o console se o número for divisível por 4 ou 9, e falso (falso) se o número não for divisível.
 */

programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("Insira um número: ")
		leia(numero)

		se (numero % 4 == 0 ou numero % 9 == 0){
			escreva ("Divisivel por 4 ou 9!!!")
		}

		senao{
		escreva("Não é divisivel por 4 ou 9!!!")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */