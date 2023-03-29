package atividade_1;

public class PessoaJuridica extends Cliente {
	
	private int cnpj;

	public PessoaJuridica(String nome, String cpf, String telefone, String email, String endereco, int cnpj) {
		super(nome, cpf, telefone, email, endereco);
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}
	
}