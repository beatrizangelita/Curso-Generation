/*
 * Desenvolva um algoritmo em Java para uma conta bancária. 
 * O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e 3) 
 * e o valor a ser depositado ou sacado (somente nas opções 2 e 3). 
 * Considere que um saque só pode ser realizado caso haja saldo suficiente. 
 * Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o valor de R$ 1000.00. 
 * Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!
 */

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		float deposito, saque, saldo = 1000, saldoAtual;
		int op = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n\t\t Informe a opção desejada! ");
		
		System.out.println(" 1 - Saldo");
		System.out.println(" 2 - Saque");
		System.out.println(" 3 - Depósito");
		
		System.out.println("\n Digite o código da operação: ");
		op = leia.nextInt();
		
		switch(op) {
			
		case 1:
			System.out.printf("\n Operação - Saldo \n Saldo: $ %.2f", saldo);
			break;
			
		case 2: 
			System.out.println("\n Operação - Saque");
			
			System.out.println("\n Informe o valor para saque: ");
			saque = leia.nextInt();	
			
			if(saque > saldo) {
				System.out.println("Saldo insulficiente!");
				}
			else {
				saldoAtual = saldo - saque;
				System.out.printf("Seu saldo atual é: $ %.2f!", saldoAtual);
			}
			break;
			
		case 3: 
			System.out.println("\n Operação - Depósito");
			
			System.out.println("\n Informe o valor do depósito: ");
			deposito = leia.nextInt();	
			
			saldoAtual = deposito + saldo;
			System.out.printf("\n Seu saldo atual é $ %.2f: ", saldoAtual);
			break;
			
		default : 
			System.out.println("\n Operação inválida! ");
				
		}

	}

}
