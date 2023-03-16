package aula_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###,##0.0");
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite as suas notas para saber a média :)\n");
		
		System.out.println("Nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4; 
		
		System.out.println("Sua media é " + df.format(media));
		
	}

}
