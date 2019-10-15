package sistema.consultório;
import Arquivos.Suporte;
import java.io.*;
import java.util.ArrayList;
import view.TelaLogin;
import java.util.StringTokenizer;


public class Principal {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Secretária secretaria = new Secretária();

        //TelaLogin tela = new TelaLogin();
        //tela.setVisible(true);
        
        Suporte suporte = new Suporte();
        ArrayList<Pacientes> lista_pacientes = suporte.recuperarConsultas();
        
        for(int i=0;i<lista_pacientes.size();i++)
        {            
            System.out.println("\nPaciente "+ i + " " + lista_pacientes.get(i).nome);
        }
        
                
    }           
}
        
    
    

