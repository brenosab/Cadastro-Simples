/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.consultório;

import java.util.ArrayList;
import Arquivos.*;
import java.io.IOException;
/**
 *
 * @author MarceloAlmeidaBarros
 */
public class Consultas {
     ArrayList<Pacientes>List_cons;

    public Consultas() throws IOException {
        List_cons = Suporte.recuperarConsultas();
    }
    
    public ArrayList<Pacientes> getList_cons() {
		return this.List_cons;
	}
}
