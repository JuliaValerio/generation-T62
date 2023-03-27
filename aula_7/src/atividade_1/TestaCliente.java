package atividade_1;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Julia V.", "999.999.999-99", "(11) 99999-9999", "email1@gmail.com", "Rua Tal, 123");
		Cliente cliente2 = new Cliente("Vinicius S.", "123.456.789-10", "(11) 99999-9999", "email2@gmail.com", "Rua Tal, 123");		
		
		cliente1.visualizar();
		System.out.println("\n");
		cliente2.visualizar();
		System.out.println("\n");
		
		PessoaFisica pf1 = new PessoaFisica("Andressa F.", "999.999.999-99", "(11) 99999-9999", "email1@gmail.com", "Rua Tal, 123", 372938461);
		PessoaFisica pf2 = new PessoaFisica("Paulo A.", "999.999.999-99", "(11) 99999-9999", "email1@gmail.com", "Rua Tal, 123", 998765432);
		pf1.visualizar();
		System.out.println("\n");
		pf2.visualizar();
		System.out.println("\n");
		
		PessoaJuridica pj1 = new PessoaJuridica("Rosalia M.", "999.999.999-99", "(11) 99999-9999", "email1@gmail.com", "Rua Tal, 123", 1234567789);
		PessoaJuridica pj2 = new PessoaJuridica("Drake C.", "999.999.999-99", "(11) 99999-9999", "email1@gmail.com", "Rua Tal, 123", 1092928383);
		pj1.visualizar();
		System.out.println("\n");
		pj2.visualizar();
		System.out.println("\n");
	}

}
