package Herança;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	
	
	//Construtor
		//superclasse
		public Veiculo(String marca, String modelo, int ano, String cor) {
		this.marca = marca;
		this.marca = modelo;
		this.ano = ano;
		this.cor = cor;
		}
		
		public String getMarca() {
			return marca;
		}
		
		public void setMarca(String marca) {
		this.marca = marca;
		
		}
		
		public String getModelo() {
			return modelo;
		}
		
		public void setModelo(String modelo) {
		this.modelo = modelo;
		
		}
		
		public int getAno() {
			return ano;
		}
		
		public void setAno(int ano) {
		this.ano = ano;
		}
		
		public String getCor() {
			return cor;
		}
		
		public void setCor(String cor) {
		this.cor = cor;
		}
		
		

}
