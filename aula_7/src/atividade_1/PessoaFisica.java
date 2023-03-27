package atividade_1;

public class PessoaFisica extends Cliente {
	private int rg;

	public PessoaFisica(String nome, String cpf, String telefone, String email, String endereco, int rg) {
		super(nome, cpf, telefone, email, endereco);
		this.rg = rg;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("RG: " + this.rg);
	}
}
