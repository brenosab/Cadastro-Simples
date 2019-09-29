package sistema.consultório;

import Arquivos.Suporte;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Breno de Souza
 */
public class Médico extends Consultas{
    
    public void CarregarConsulta() throws IOException
    {            
        for(Pacientes p: this.List_cons)
        {            
           Suporte.recuperarConsultas();
        }
    }

    public Médico() throws IOException {
    }
    
    
    public void listar()
    {
        for(int i=0;i<this.List_cons.size();i++)
        {
            System.out.println("Nome: " + this.List_cons.get(i).getNome());
            System.out.println("Data da Consulta: " + this.List_cons.get(i).getData());
            System.out.println("Plano: " + this.List_cons.get(i).getPlano());    
        }
    }
    
     public String listarEmp()
     {
        String s = "";
        for(int i=0;i<this.List_cons.size();i++)
        {
            s = "Nome: " + this.List_cons.get(i).getNome() + "Data da Consulta: " + this.List_cons.get(i).getData() +  this.List_cons.get(i).getPlano() + "Plano: ";
        }
        return s;
     }
     
     public Pacientes buscar(String nome)
     {
        for(Pacientes p: this.List_cons)
        {
            if(p.getNome().equalsIgnoreCase(nome)) return p;
	}
        return null;
    }
     
        public Pacientes buscarData(String data){
		for(Pacientes p: this.List_cons){
			if(p.getData().equalsIgnoreCase(data)){
				return p;
			}
		}
		return null;
	}
	public void remove(String nome){
		for(Pacientes p: this.List_cons){
			if(p.getNome().equalsIgnoreCase(nome))
			{
				this.List_cons.remove(p);
			}
		}
	}
	public void gravar(){
		try {			
			File arq = new File("lista_pacintes.txt");
			arq.createNewFile();
			FileWriter writer = new FileWriter(arq);
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			for(Pacientes p: this.List_cons){
				bwriter.write(p.getNome() + "   " + p.getData()+ "   " + p.getPlano() +"\r\n");
				bwriter.flush();
			}
			bwriter.close();
			writer.close();
		} catch (IOException Erro) {

		}
	}
}
