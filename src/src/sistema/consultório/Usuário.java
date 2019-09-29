/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.consultório;

/**
 *
 * @author MarceloAlmeidaBarros
 */
public abstract  class Usuário {
    private String nome;
    private String senha;
   
    
    public Usuário (String nome, String senha) {
		setNome(nome);
		setSenha(senha);
               
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
       
	
	
    
}