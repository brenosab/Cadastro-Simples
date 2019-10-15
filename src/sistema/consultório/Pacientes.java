package sistema.consultório;


public class Pacientes {
     private String nome;
     private String data;
     private String ano;
     private String plano;
     private int CPF;
     private String telefone;
    
    
    public Pacientes(String nome, String data, String plano) 
    {
        super();
        this.nome = nome;
        this.data =data;
        this.plano = plano;
        
    }

    public Pacientes(String nome, int CPF, String telefone) 
    {
        super();
        this.nome = nome;
        this.CPF =CPF;
        this.telefone = telefone;
    }


    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
    
      public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
      public String gettelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
