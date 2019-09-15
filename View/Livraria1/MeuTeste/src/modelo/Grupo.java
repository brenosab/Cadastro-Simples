
package modelo;
import java.util.ArrayList;

public class Grupo {
    private ArrayList<Usuario>grupo;
    
    public Grupo(){
        this.grupo = new ArrayList<Usuario>();
    }
    
    
    public ArrayList<Usuario> getGrupo() {
            return this.grupo;
        }
    
    
     public void addAdmin(String nome, String senha, int tipo){
            
            try {
                
                Admin admin = new Admin(nome, senha, tipo);
                grupo.add(admin);
            }catch(Exception e) {
                System.err.println(e.getMessage());
            }
            
        }
     
      public void addCliente(String nome, String senha, int tipo){
            
            try {
                
                Cliente cliente = new Cliente(nome, senha, tipo);
                grupo.add(cliente);
            }catch(Exception e) {
                System.err.println(e.getMessage());
            }
            
        }
    
    public String verUsuarios(){
		String lista = "";
		
		for(Usuario i:grupo){
			
			if(i instanceof Admin){
				
				lista= ((Admin)i).getNome() + "\n"+ ((Admin)i).getSenha() + "\n" + i.getTipo();
			}
			if (i instanceof Cliente) {
				
				lista= ((Cliente)i).getNome() + "\n"+ ((Cliente)i).getSenha() + "\n" + i.getTipo();
			}
		}
		return lista;
		
		
	}
      
}
