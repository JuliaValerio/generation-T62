package atividade_1;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Julia V.", "999.999.999-99", "(11) 99999-9999", "email1@gmail.com", "Rua Tal, 123");
		Cliente cliente2 = new Cliente("Vinicius S.", "123.456.789-10", "(11) 99999-9999", "email2@gmail.com", "Rua Tal, 123");		
		
		cliente1.visualizar();
		System.out.println("\n");
		cliente2.visualizar();
	}

}
