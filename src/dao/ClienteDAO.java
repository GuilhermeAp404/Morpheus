/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Cliente;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Tegon Faria
 */
public class ClienteDAO implements dao.Persistencia<Cliente>{
    
    private static ClienteDAO dao = null;
    
    public ClienteDAO(){
        
    }
    
    public static ClienteDAO getInstance(){
        if(dao==null){
            dao = new ClienteDAO();
        }
        return dao;
    }
    
    @Override
    public boolean create(Cliente c) {
        Connection con = ConnectionFactory.getConnection();
        ResultSet rs = null;
        PreparedStatement pst = null;
        String sql = "INSERT INTO Clientes (Nome,CPF,Data_nascimento,Celular,Data_registro,Email) VALUES(?,?,?,?,?,?)";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, c.getNome());
            pst.setString(2, c.getCpf());
            pst.setString(3, c.getData_nascimento());
            pst.setString(4, c.getCelular());
            pst.setString(5, c.getData_registro());
            pst.setString(6, c.getEmail());
            pst.executeUpdate();
            return true;
        }catch(SQLException ex){
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, pst);
        }            
    }

    @Override
    public List<Cliente> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<Cliente>();
        String sql = "SELECT * FROM Clientes ORDER BY Nome";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String nome = rs.getString("Nome");
                String cpf = rs.getString("CPF");
                String Data_nascimento = rs.getString("Data_nascimento");
                String cel = rs.getString("Celular");
                String Data_registro = rs.getString("Data_registro");
                String Email = rs.getString("Email");
                lista.add(new Cliente(nome, Email, cpf, Data_nascimento, cel, Data_registro));
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }

    @Override
    public Cliente find(String doc) {
        Connection con = ConnectionFactory.getConnection();
        Cliente cliente = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Clientes WHERE CPF = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, doc);
            rs = pst.executeQuery();
            while(rs.next()){
                String nome = rs.getString("Nome");
                String cpf = rs.getString("CPF");
                String Data_nascimento = rs.getString("Data_nascimento");
                String cel = rs.getString("Celular");
                String Data_registro = rs.getString("Data_registro");
                String Email = rs.getString("Email");
                cliente = new Cliente(nome, Email, cpf, Data_nascimento, cel, Data_registro);
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return cliente;
    }

    @Override
    public void delete(String cpf) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "DELETE from Clientes where CPF = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro no Delete");
        } finally {
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }

    @Override
    public void update(Cliente c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "UPDATE Clientes set Nome= ?, Data_nascimento= ?, Celular= ?, Data_registro= ?, Email= ? WHERE CPF = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, c.getNome());
            pst.setString(2, c.getData_nascimento());
            pst.setString(3, c.getCelular());
            pst.setString(4, c.getData_registro());
            pst.setString(5, c.getEmail());
            pst.setString(6, c.getCpf());
            pst.executeUpdate();
        }catch(SQLException ex){
            throw new RuntimeException("Erro no Update");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }
    
}
