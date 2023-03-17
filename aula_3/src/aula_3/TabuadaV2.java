package aula_3;

import java.util.Scanner;

public class TabuadaV2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, contador = 1;

		System.out.println("Mostre a tabuada do nÃºmero: ");
		numero = leia.nextInt();
		
		while(contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
			contador ++;
		}
	}

}
