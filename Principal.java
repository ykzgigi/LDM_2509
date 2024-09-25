package Herança;

public class Principal {
	
	public static void main(String[] args) {
		
		//criando uma pessoa
		
		Pessoa pessoa = new Pessoa("Ana Julya dos Santos", "(11) 9953-8357");
		System.out.println("Pessoa:");
		System.out.println("Nome:" + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		//Criando uma pessoa física
		PessoaFisica pessoaFisica = new PessoaFisica("Ana Julya dos Santos", "(11)9953-8357", "123.456.789.10","300.564.837.X");
		System.out.println("\nPessoa fisica: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		
		//criando uma pessoa juridica
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11) 2987-9274", "98-654-321/9001-23");
		System.out.println("\nPessoa Juridica: ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
		}

}
