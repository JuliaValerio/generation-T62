package aula_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		
		System.out.println("Digite o seu salario bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o seu Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o seu Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o seu descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("O valor do seu salario liquido é " + df.format(salarioLiquido));
				
	}

}
