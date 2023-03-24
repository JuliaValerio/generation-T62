package aula_5;

import java.util.Scanner;
import java.util.Stack;
import java.lang.String;

public class Exercicio_05 {

	public static void main(String[] args) {
		// Pilha
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		byte opcao = 0;
		String livro;

		do {

			System.out.println("***************************");
			System.out.println("1- Adicionar Livro na Pilha");
			System.out.println("2- Listar todos os Livros");
			System.out.println("3- retirar um livro na pilha ");
			System.out.println("0- Sair");
			System.out.println("***************************");
			System.out.println("Digite uma opcao: ");
			opcao = leia.nextByte();
			switch (opcao) {

			case 1:
				System.out.println("Digite o nome: ");
				livro = leia.next();
				livros.push(livro);

//				System.out.println("\nPilha: ");
//				for (var eLivro : livros) {
//					System.out.println(eLivro);
//				}
//
//				System.out.println("\nLivro adicionado!");
				break;
				
			case 2:
				if (livros.isEmpty()) {
					System.out.println("Não existem livros cadastrados, o Pilha está vazia!");
				} else {
					System.out.println("Pilha: ");
					for (var eLivro : livros) {
						System.out.println(eLivro);
					}
				}
				break;
				
			case 3:
				if (livros.isEmpty()) {
					System.out.println("Não existem livros cadastrados, o Pilha está vazia!");
				} else {
					System.out.println("Pilha: ");
					livros.pop();
					for (var eLivro : livros) {
						System.out.println(eLivro);
					}
					System.out.println("Um Livro foi retirado da pilha!");
				}
				
			default:
				if (opcao > 3 || opcao < 0)
					System.out.println("Opção Inválida");
				if (opcao == 0)
					System.out.println("Programa Finalizado! :)");
				break;
			}

		} while (opcao != 0);
		leia.close();
	}

}
