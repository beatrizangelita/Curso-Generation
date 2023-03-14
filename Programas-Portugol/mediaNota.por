// mostrar a média da nota

programa
{
	inclua biblioteca Matematica --> mat	
	funcao inicio()
	{
		real nota1, nota2, nota3, media
		
		escreva("Digite a primeira nota: ")
		leia(nota1)
		
		escreva("Digite a segunda nota: ")
		leia(nota2)

		escreva("Digite a segunda nota: ")
		leia(nota3)

		media = (nota1 + nota2 + nota3) / 3
		limpa()
		
			se (media >= 7.0){
				escreva("Você está aprovado!", "\n Sua nota é: ", mat.arredondar(media,2))
				}
			senao se (media >= 3.0 e media <= 7.0){
				escreva("Você está de recuperação!", "\n Sua nota é: ",  mat.arredondar(media,2))
				}
			senao{
				escreva("Você está reprovado! ", "\n Sua nota é: ", mat.arredondar(media,2))
				}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 637; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */