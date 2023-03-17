package aula_3;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Mostre a tabuada do número: ");
	numero = leia.nextInt();
	
	System.out.println("Tabuada Completa");
	
	for(int contador = 1; contador <= 10; contador ++) 
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
	
	System.out.println("Tabuada dos números pares");
	
	for(int contador = 1; contador <= 10; contador ++) {
		if(contador%2 == 0)
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
	}
	}
	}
