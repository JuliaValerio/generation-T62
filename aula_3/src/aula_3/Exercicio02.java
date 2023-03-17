package aula_3;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero, impar = 0, par= 0;
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.println("Digite o "+ contador +"º número: ");
			numero = leia.nextInt();
			
			if(numero%2==0) 
				par++;
			else
				impar++;
		}
		System.out.println("Total de números pares: "+ par);
		System.out.println("Total de números ímpares: "+ impar);
		
	}

}
