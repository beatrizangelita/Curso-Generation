// Mostrar o menor número

programa
{

	funcao inicio()
	{
		 
		inteiro numero, menorNumero=0

		para (inteiro cont = 1; cont <= 6; cont ++){
			escreva("Digite o ", cont, " número: ")
			leia(numero)

			se(cont == 1){
				menorNumero = numero
				}
				senao{
					se(numero < menorNumero){
						menorNumero = numero
						}
					}
			
			}

			escreva("\n\n Menor número é: ", menorNumero)

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */