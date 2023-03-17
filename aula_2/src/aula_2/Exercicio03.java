package aula_2;

import java.util.Scanner;

public class Exercicio03 {


	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome, pergunta;
		int idade;
		boolean doacao = false;

		System.out.println("Digite o seu Nome: ");
		nome = leia.nextLine();

		System.out.println("Digite a sua Idade: ");
		idade = leia.nextInt();

		System.out.println("Primeira doação? (S/N)");
		leia.skip("\\R?");
		pergunta = leia.nextLine().toUpperCase();

		if (pergunta == "S")
			doacao = true;

		if (idade >= 60 && idade <= 69) {
			if (doacao)
				System.out.println(nome + " não está apto(a) a doar!");
			else
				System.out.println(nome + " está apto(a) a doar!");
		} else if (idade < 18 || idade > 69)
			System.out.println(nome + " não está apto(a) a doar!");
		else
			System.out.println(nome + " está apto(a) a doar!");

	}

}
