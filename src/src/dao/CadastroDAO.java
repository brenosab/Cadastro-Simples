/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema.consultório.Pacientes;

/**
 *
 * @author Breno de Souza
 */
public class CadastroDAO {
    
    
    public void create(Pacientes p) throws ParseException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO consultas (nome, data_consulta, plano)VALUES(?,?,?)");
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getData());
            stmt.setString(3,p.getPlano());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con);
        }
    }
    
    public ArrayList<Pacientes> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Pacientes> list_pacientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM consultas");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                String nome = rs.getString("nome");
                String data = rs.getString("data_consulta");
                String plano = rs.getString("plano");
                Pacientes paciente= new Pacientes(nome,data,plano);
                list_pacientes.add(paciente);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con);
        }
        
        return list_pacientes;        
    }
}
