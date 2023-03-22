package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList {

	public static void main(String[] args) {
		// Lista
		Scanner leia = new Scanner(System.in);

		ArrayList<Double> notas = new ArrayList<Double>();
		int opcao = 0;
		double nota = 0.0;

		do {
			System.out.println("***************************");
			System.out.println("1- Cadastrar Nota ");
			System.out.println("2- Listar todas as Notas ");
			System.out.println("3- Buscar uma Nota ");
			System.out.println("4- Remover uma Nota ");
			System.out.println("5- Atualizar uma Nota ");
			System.out.println("6- Ordenar");
			System.out.println("7- Sair");
			System.out.println("***************************");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Cadastrar Nota ");
				System.out.println("Digite uma Nota: ");
				nota = leia.nextDouble();
				notas.add(nota);

				break;

			case 2:
				System.out.println("Listar notas");
				
				if (notas.isEmpty()) {
					System.out.println("Não existem notas cadastradas!");
				}else {
					for(var eNota : notas)
						System.out.println(eNota);
				}
				break;

			case 3:
				System.out.println("Buscar uma Nota ");
				System.out.println("Digite uma Nota: ");
				nota = leia.nextDouble();

				if (notas.contains(nota))
					System.out.println("A nota está na localizada na posição: " + notas.indexOf(nota));
				else
					System.out.println("A nota não foi encontrada!");
				break;

			case 4:
				System.out.println("Remover uma Nota ");
				System.out.println("Digite uma Nota: ");
				nota = leia.nextDouble();
				
				notas.remove(nota);
				break;

			case 5:
				System.out.println("Atualizar uma Nota ");
				System.out.println("Digite a Nota atual: ");
				nota = leia.nextDouble();
				System.out.println("Digite a nova Nota: ");
				var novaNota = leia.nextDouble();
				
				notas.set(notas.indexOf(nota), novaNota);
				break;

			case 6:
				notas.sort(null);
				
				for(int contador = 0; contador < notas.size(); contador ++) {
					var xNota = notas.get(contador);
					System.out.println(xNota);
				}
				
				for(var eNota : notas) {
					if(eNota%2 == 0)
						System.out.println(eNota);
				}
				break;

			default:
				if (opcao > 6 || opcao < 0)
					System.out.println("Opção Inválida");
			}

		} while (opcao != 0);

		leia.close();

	}

}