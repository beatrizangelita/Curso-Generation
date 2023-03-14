
	/*
	 * Camila é convidada a implementar um recurso que mostra o maior dos três valores na tela inicial
	*/

programa
{

	inclua biblioteca Matematica --> mat
	funcao inicio(){

		real valores, menorValor = 0

		para (inteiro cont = 1; cont <= 3; cont ++){
			escreva("Digite o ", cont, " valor: $")
			leia(valores)

			se(cont == 1){
				menorValor = valores
				}
				senao{
					se(valores < menorValor){
						menorValor = valores
						}
					}
			
			}

			escreva("\n\n Menor valor é: ", mat.arredondar(menorValor,2))

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */