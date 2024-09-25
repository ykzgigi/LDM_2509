package Herança;

public class PessoaJuridica extends Pessoa{
	 
	//subclasse
	private String cnpj;
	
	public PessoaJuridica (String nome,String telefone, String cnpj) {
		super(nome,telefone);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
