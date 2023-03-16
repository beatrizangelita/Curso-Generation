/*
 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
 * mostre na tela quantos números são pares e quantos número são ímpares.
 */

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		   int x, num, contPar = 0, contImpar = 0;
	        
		   Scanner leia = new Scanner (System.in);
		   
		   // Será mostrado 10x para informar o número
	        for(x = 1; x <= 10; x++){
	        	
	        	System.out.println("Digite o " + x + "º número: ");
	            num = leia.nextInt();
	            
	         // Irá contar os números pares digitados
	            if(num % 2 == 0){
	                contPar++;
	            }

	            // Irá contar os números impares digitados
	            if(num % 2 == 1){
	                contImpar++;
	            }
	            
	        }
	        
	        System.out.println("\n Total de números pares:  " + contPar);
	        System.out.println("\n Total de números impares:  " + contImpar);
	        
	    }
	}
