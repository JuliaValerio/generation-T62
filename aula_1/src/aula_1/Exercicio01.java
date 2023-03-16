package aula_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		float salario, abono, novoSalario;
		
		
		System.out.println("Digite o seu salario: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O valor do seu novo salario é " + df.format(novoSalario));
				
	}

}
