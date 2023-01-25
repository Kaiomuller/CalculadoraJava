package exercicios;

import java.util.Scanner;

public class exerciciosModulo3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("------- CALCULADORA -------");			
			
		System.out.print("\nDigite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print(" \nDigite aqui o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print(" \nInforme a operacao:  ");
		String op = entrada.next();
		
		//Logica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado =  "/".equals(op) ? num1 / num2 : resultado;
		
		System.out.printf(" \n %.2f %s %.2f = %.2f ", num1 , op,  num2, resultado);
		
		 		
		entrada.close();
	}
	
}
