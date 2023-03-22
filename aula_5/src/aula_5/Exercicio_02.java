package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Integer v[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int num;
		
		for (int i : v) {
			numeros.add(i);
		}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		System.out.println("log" + numeros);

		for (int contador = 0; contador < numeros.size(); contador++) {
			if (numeros.size() == num)
				System.out.println("O número " + num + " está localizado na posição [" + contador + "]");
			if (num > 10) {
				System.out.println("Número " + num + " não encontrado! ");
				break;
			}
		}
	}
}
