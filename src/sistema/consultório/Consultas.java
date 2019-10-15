package sistema.consultório;

import java.util.ArrayList;
import Arquivos.*;
import java.io.IOException;

public class Consultas {
     private ArrayList<Pacientes>List_cons;

    public Consultas() throws IOException {
        List_cons = Suporte.recuperarConsultas();
    }
    
    public ArrayList<Pacientes> getList_cons() {
		return this.List_cons;
	}
}
