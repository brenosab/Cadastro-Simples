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
public class Pacientes {
    private String nome;
     protected String dia;
     protected String mes;
     private String plano;
     protected String CPF;
     protected String telefone;
    
    
     public Pacientes(String nome, String dia,String mes, String plano) {
        super();
        this.nome = nome;
        this.dia =dia;
        this.plano = plano;
        this.mes = mes;
        
    }

      public Pacientes(String nome, String CPF, String telefone) {
        super();
        this.nome = nome;
        this.CPF =CPF;
        this.telefone = telefone;
        
        
    }


    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
     public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
         public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
    
      public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
      public String gettelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
