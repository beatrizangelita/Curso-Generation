/* 
 * Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, 
 * as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido.
*/
package Entrada_Saida_Operadores;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Informe o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\n Informe o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\n Informe as Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("\n Informe os Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\n Seu salário liquido é : $ %.2f", salarioLiquido);

	}

}
