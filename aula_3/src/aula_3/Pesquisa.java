package aula_3;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, esporte;
		char continua = 'S';
		
		while(continua == 'S') {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o sexo (1-M/2-F/3-outros) ");
			sexo = leia.nextInt();
			
			System.out.println("Digite o seu Esporte favorito (1-Futebol/2-Volei/3-Basquete/4-Games) ");
			esporte = leia.nextInt();
			
			System.out.println("Dejase continuar (S/N)? ");
			continua = leia.next().toUpperCase().charAt(0);
		}
		
		leia.close();
		}

}
