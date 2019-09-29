
package modelo;


public class Revista extends Item{
	

	
	private String nome;

	public Revista(String nome, int cod,  double preco, String editora, int tipo){
		super(cod, preco, editora, tipo);
		setNome(nome);
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void aplicaLucro(){
		
		setPreco(getPreco()+ getPreco() * 0.1);
	}

}

