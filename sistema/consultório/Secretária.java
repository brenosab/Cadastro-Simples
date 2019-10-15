/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.consultório;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;

/**
 *
 * @author MarceloAlmeidaBarros
 */
public class Secretária {
    ArrayList<Pacientes>List_pac;

    public Secretária() {
        List_pac = new ArrayList<Pacientes>();
    }
    
    public ArrayList<Pacientes> getList_pac() {
		return this.List_pac;
	}
    
    public void add(String nome, String dia,String mes, String plano){
        Pacientes paciente = new Pacientes(nome,dia,mes,plano);
        this.List_pac.add(paciente);
        System.out.println("Consulta Adicionada");
    }
    
    public void Cadastrar(String nome, String telefone, String CPF){
        Pacientes paciente = new Pacientes(nome,telefone,CPF);
        this.List_pac.add(paciente);
        System.out.println("Paciente Cdastrado");
    }
    
    public void listar(){
        for(int i=0;i<this.List_pac.size();i++){
            System.out.println("Nome: " + this.List_pac.get(i).getNome());
            System.out.println("Data da Consulta: " + this.List_pac.get(i).getDia() + "/" + this.List_pac.get(i).getMes());
            System.out.println("Plano: " + this.List_pac.get(i).getPlano());
            
        }
        
    }
    
     public String listarPacientes(){
         
         String s = "";
        for(int i=0;i<this.List_pac.size();i++){
            s = "Nome: " + this.List_pac.get(i).getNome() + "Data da Consulta: " + this.List_pac.get(i).getDia() + "/" + this.List_pac.get(i).getMes()+  "Plano: " + this.List_pac.get(i).getPlano();
           
        }
    return s;
}
      public String listarCadastros(){
         
         String s = "";
        for(int i=0;i<this.List_pac.size();i++){
            s = "Nome: " + this.List_pac.get(i).getNome()+ "   " + "Telefone: " + this.List_pac.get(i).gettelefone() + "   " + "CPF: "  + this.List_pac.get(i).getCPF() ;
           
        }
    return s;
}
     
	public Pacientes buscar(String nome){
		for(Pacientes p: this.List_pac){
			if(p.getNome().equalsIgnoreCase(nome)){
				return p;
			}
		}
		return null;
	}
	public void remove(String nome){
		for(Pacientes p: this.List_pac){
			if(p.getNome().equalsIgnoreCase(nome))
			{
				this.List_pac.remove(p);
			}
		}
	}
	public void gravar(){
		try {			
			File arq = new File("lista_pacintes.txt");
			arq.createNewFile();
			FileWriter writer = new FileWriter(arq);
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			for(Pacientes p: this.List_pac){
				bwriter.write(p.getNome() + "    " + p.getDia() + "/" + p.getMes()+ "   " + p.getPlano() + "\r\n");
				bwriter.flush();
			}
			bwriter.close();
			writer.close();
                        
		} catch (IOException Erro) {

		}
	}

    public void add(String text, String text0, String text1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
