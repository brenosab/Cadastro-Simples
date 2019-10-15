package sistema.consultório;

import Arquivos.Suporte;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Médico extends Consultas{
    
    
    public Médico() throws IOException { }
        
    
    public void CarregarConsulta() throws IOException
    {            
        for(Pacientes p: getList_cons())
        {            
           Suporte.recuperarConsultas();
        }
    }
    
    
    public void listar()
    {
        for(int i=0;i<getList_cons().size();i++)
        {
            System.out.println("Nome: " + getList_cons().get(i).getNome());
            System.out.println("Data da Consulta: " + getList_cons().get(i).getData());
            System.out.println("Plano: " + getList_cons().get(i).getPlano());    
        }
    }
    
    public String listarEmp()
    {
        String s = "";
        for(int i=0;i<this.getList_cons().size();i++)
        {
            s = "Nome: " + this.getList_cons().get(i).getNome() + "Data da Consulta: " + this.getList_cons().get(i).getData() +  this.getList_cons().get(i).getPlano() + "Plano: ";
        }
        return s;
    }
     
    public Pacientes buscar(String nome)
    {
        for(Pacientes p: this.getList_cons())
        {
            if(p.getNome().equalsIgnoreCase(nome)) return p;
	}
        return null;
    }
     
    public Pacientes buscarData(String data)
    {
		for(Pacientes p: this.getList_cons()){
			if(p.getData().equalsIgnoreCase(data)){
				return p;
			}
		}
		return null;
    }

    public void remove(String nome)
    {
		for(Pacientes p: this.getList_cons()){
			if(p.getNome().equalsIgnoreCase(nome))
			{
				this.getList_cons().remove(p);
			}
		}
    }
    
    public void gravar()
    {
		try {			
			File arq = new File("lista_pacintes.txt");
			arq.createNewFile();
			FileWriter writer = new FileWriter(arq);
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			for(Pacientes p: this.getList_cons()){
				bwriter.write(p.getNome() + "   " + p.getData()+ "   " + p.getPlano() +"\r\n");
				bwriter.flush();
			}
			bwriter.close();
			writer.close();
		} catch (IOException e){ }
    }
     
}
