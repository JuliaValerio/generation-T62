package aula_4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);

        int numero;

        int vetorInt[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        Arrays.sort(vetorInt);

        System.out.println("Digite o número que você deseja encontrar: ");
        numero = leia.nextInt();

        for (int contador = 0; contador < vetorInt.length; contador ++) {
            if (vetorInt[contador] == numero)
                System.out.println("O número " + numero + " está localizado na posição [" + contador + "]");
            if(numero > 10) {
                System.out.println("Número " + numero + " não encontrado! ");
            	break;
            }
        }
    }
}


