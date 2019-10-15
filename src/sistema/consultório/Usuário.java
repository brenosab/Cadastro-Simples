package sistema.consultório;


public abstract  class Usuário {
    private String nome;
    private String senha;
   
    
    public Usuário (String nome, String senha) 
    {
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