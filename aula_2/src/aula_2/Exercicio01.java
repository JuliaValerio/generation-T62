package aula_2;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, soma;
		
		System.out.println("Digite o número A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		C = leia.nextInt();
		
		soma = A+B;
				
		if(soma > C)
			System.out.println("\nA Soma de A + B é Maior do que C\n" + A + "+" + B +" = "+ soma +" > " + C );
		else if(soma < C)
			System.out.println("A Soma de A + B é Menor do que C\n" + A + "+" + B +" = "+ soma +" < " + C );
		else if(soma == C)
			System.out.println("A Soma de A + B é Igual a C\n" + A + "+" + B +" = "+ soma +" = " + C );
		leia.close();
	}

}
