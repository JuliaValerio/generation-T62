package aula_2;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número:");

		numero = leia.nextInt();

		if(numero%2==0) {
			if(numero<0)
				System.out.println("O Número " + numero + " é par negativo!");
			else
				System.out.println("O Número " + numero + " é par positivo!");
		}
		
		if(numero%2==1 || numero%2== -1) {
			if(numero<0)
				System.out.println("O Número " + numero + " é ímpar negativo!");
			else
				System.out.println("O Número " + numero + " é ímpar positivo!");
		}
		


		leia.close();

	}

}
