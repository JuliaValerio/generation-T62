package conta.controller;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

		while (true) {

			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN_BRIGHT
					+ "******************************************************");
			System.out.println("*                                                    *");
			System.out.println("*                BANCO DO BRAZIL COM Z               *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			System.out.println("*                                                    *");
			System.out.println("*            1 - Criar Conta                         *");
			System.out.println("*            2 - Lista Todas as Contas               *");
			System.out.println("*            3 - Buscar Conta por número             *");
			System.out.println("*            4 - Atualizar Dados da Conta            *");
			System.out.println("*            5 - Apagar Conta                        *");
			System.out.println("*            6 - Sacar                               *");
			System.out.println("*            7 - Depositar                           *");
			System.out.println("*            8 - Transferir valores entre Contas     *");
			System.out.println("*            9 - Sair                                *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			System.out.println("  Entre com a opção desejada:                         ");
			System.out.println("                                                      ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_GREEN_BRIGHT
						+ "******************************************************");
				System.out.println("*                                                    *");
				System.out.println("*  Banco do Brazil com Z - O seu futuro começa aqui! *");
				System.out.println("*                                                    *");
				System.out.println("******************************************************");
				
				leia.close();
				sobre();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o Limite de Crédito (R$): ");
						limite = leia.nextFloat();

						// criar o objeto conta corrente
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversario da Conta: ");
						aniversario = leia.nextInt();

						// criar o objeto conta poupanca
					}
					}
				} while (tipo < 1 && tipo > 2);
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				tipo = 1;
				// condicional buscar na collection

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				// retornar tipo

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
					
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca

				}
				default -> {
					System.out.println("Tipo de conta inválido!");
					}
				}
				// fim do condicional buscar na collection
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
				System.out.println("Digite o Numero da Conta de Origem: ");
				numero = leia.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				numeroDestino = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
				} while (valor <= 0);
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}

		}

	}
	public static void sobre() {
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BRIGHT + "Julia Valerio - juliav286@gmail.com");
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BRIGHT + "https://github.com/JuliaValerio");
	}
}
