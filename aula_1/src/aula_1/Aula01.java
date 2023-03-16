package aula_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
	
		Scanner leia = new Scanner(System.in);
		
		double num1, num2;
		String nome;
		
		System.out.println("Digite o seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextDouble();
		
		System.out.println("\nSoma: " + df.format((num1 + num2)));
		System.out.println("Subtração: " + df.format((num1 - num2)));
		System.out.println("Multiplicação: " + df.format((num1 * num2)));
		System.out.println("Divisão: " + df.format((num1 / num2)));
		System.out.println("A pontencia: "+ df.format(Math.pow(num1, num2)));
		System.out.println("A Raiz quadrada: "+ df.format(Math.sqrt(num1)));
		
		System.out.println("\nObridado por partipar " + nome);
		 
		
		leia.close();
	}

}
