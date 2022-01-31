/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Cargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/*DROP TABLE Cargos;
CREATE TABLE Cargos (id integer primary key autoincrement, Descricao varchar(20));*/

/**
 *
 * @author Tegon Faria
 */
public class CargoDAO {
    public static CargoDAO dao = null;
    
    public CargoDAO(){
        
    }
    
    public static CargoDAO getInstance(){
        if(dao == null){
            dao = new CargoDAO();
        }
        return dao;
    }

    public boolean create(Cargo car) {
        int id = 0;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Cargos (Descricao) VALUES (?)";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, car.getNome_cargo());
            pst.executeUpdate();
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, pst);
        }
    }

    public List<Cargo> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Cargo> lista = new ArrayList<Cargo>();
        String sql = "SELECT * FROM Cargos ORDER BY id";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String cargo = rs.getString("Descricao");
                lista.add(new Cargo(id, cargo));
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }

    public List<Cargo> findByNome(String cargo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Cargo> lista = new ArrayList<Cargo>();
        String sql = "SELECT * FROM Cargos WHERE Descricao = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, cargo);
            rs = pst.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String c = rs.getString("Descricao");
                lista.add(new Cargo(id, c));
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }


    public void delete(int Id) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        String sql = "DELETE FROM Cargos WHERE id = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, Id);
            pst.executeUpdate();
        }catch(SQLException ex){
            throw new RuntimeException("Erro no delete");
        }finally{
            ConnectionFactory.closeConnection(con, pst);
        }
    }

    public void update(Cargo c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "UPDATE Cargos set Descricao = ? WHERE id = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, c.getNome_cargo());
            pst.setInt(2, c.getId());
            pst.executeUpdate();
        }catch(SQLException ex){
            throw new RuntimeException("Erro no Update");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }
    
 
    
}
