package Arquivos;

import java.io.*;
import java.util.ArrayList;
import sistema.consultório.*;

public class Suporte {
    
    public static void salvaConsultas(Secretária secretaria) throws IOException{
        //NOVO ARQUIVO
		File arquivo = new File("Consultas.txt");
		arquivo.createNewFile();
		
		
		//ESCRITA NO ARQUIVO
		FileWriter escritor = new FileWriter(arquivo,true);
		BufferedWriter ebuff = new BufferedWriter(escritor);
        
        
        ArrayList<String> lista = secretaria.listarPacientes();
        for(int i=0;i<lista.size();i++){
            ebuff.write(lista.get(i));
            ebuff.flush();
            ebuff.newLine();
        }
        


        System.out.println("Nova Consulta Adicionada!!!");

        //SEMPRE FECHAR OS ESCRITORES/LEITORES DE ARQUIVO

        ebuff.close();
        escritor.close();
    }
    
    
    public static ArrayList<Pacientes> recuperarConsultas() throws IOException{
        ArrayList<Pacientes>lista_aux = new ArrayList();
        FileReader reader = null;
        try {
            reader = new FileReader(new File("Consultas.txt"));
        } catch (FileNotFoundException e1) {
            File arq = new File("Consultas.txt");
            arq.createNewFile();
            reader = new FileReader(arq);
        }
        
        
        BufferedReader breader = new BufferedReader(reader);
        String linha;
    
        while ((linha = breader.readLine()) != null){
            
            
            String nome = linha;
            String plano = breader.readLine();
            // String data = Double.parseDouble(breader.readLine());
            String data = breader.readLine();
            lista_aux.add(new Pacientes(nome,plano,data));
        
        }
        
        breader.close();
        reader.close();
        return lista_aux;
    
    }
      
    
    
    public static void salvaCadastroPacientes(Secretária secretaria) throws IOException{
        //NOVO ARQUIVO
	File arquivo = new File("CadastroPacientes.txt");
	arquivo.createNewFile();
		
		
	//ESCRITA NO ARQUIVO
	FileWriter escritor = new FileWriter(arquivo,true);
	BufferedWriter ebuff = new BufferedWriter(escritor);
        
        
        String lista = secretaria.listarCadastros();
        ebuff.write(lista);
        ebuff.flush();
        ebuff.newLine();

        System.out.println("Novo Paciente adicionado!!!");
        //SEMPRE FECHAR OS ESCRITORES/LEITORES DE ARQUIVO
        ebuff.close();
        escritor.close();
    }
    
    
    public static Secretária recuperarCadastroPacientes() throws IOException{
        
        FileReader reader = null;
        try {
            reader = new FileReader(new File("CadastroPacientes.txt"));
        } catch (FileNotFoundException e1) {
            File arq = new File("CadastroPacientes.txt");
            arq.createNewFile();
            reader = new FileReader(arq);
        }
        
        
        BufferedReader breader = new BufferedReader(reader);
        String linha = "";
        Secretária s = new Secretária();
    
        
        for( Pacientes p: s.getList_pac())
        {
            while ((linha = breader.readLine()) != null)
            {
               String nome = linha;
               double CPF = Double.parseDouble(breader.readLine());
               double telefone = Double.parseDouble(breader.readLine());

               s.listar();
            }
        }
        
        breader.close();
        reader.close();
        return s;
    }
    
    
}

