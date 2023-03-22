package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// Lista
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		
		while(cores.size() != 5) {
			System.out.println("Digite o nome de uma cor para adicionar: ");
			cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println("\n************** RESULTADO ****************\n");
		System.out.println("Listar todas as Cores:\n");
		if (cores.isEmpty()) {
			System.out.println("Não existem cores cadastradas!");
		}else {
			for(var eCor : cores)
				System.out.println(eCor);
		}
		
		System.out.println("\nOrdenar as cores:\n");
		cores.sort(null);
		
		for(int contador = 0; contador < cores.size(); contador ++) {
			var xCor = cores.get(contador);
			System.out.println(xCor);
		}
	}
}