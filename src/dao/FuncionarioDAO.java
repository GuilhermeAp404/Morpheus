/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Cargo;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tegon Faria
 */
public class FuncionarioDAO implements dao.Persistencia<Funcionario>{
    
    public static FuncionarioDAO dao = null;
    
    public FuncionarioDAO(){
        
    }
    
    public static FuncionarioDAO getInstance(){
        if(dao==null){
            dao = new FuncionarioDAO();
        }
        return dao;
    }
    
    @Override
    public boolean create(Funcionario f) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Funcionarios (Nome_func, EmailFunc, CPFFunc, Data_nascimentoFunc, Cargo, CelularFunc, Ativo, Salario, Data_registroFunc) VALUES(?,?,?,?,?,?,?,?,?)";
        try{
           pst = con.prepareStatement(sql);
           pst.setString(1, f.getNome());
           pst.setString(2, f.getEmail());
           pst.setString(3, f.getCpf());
           pst.setString(4, f.getData_nascimento());
           pst.setString(5, f.getCargo().getNome_cargo());
           pst.setString(6, f.getCelular());
           pst.setBoolean(7, f.isAtivo());
           pst.setDouble(8, f.getSalario());
           pst.setString(9, f.getRegistro());
           pst.executeUpdate();
           return true; 
        }catch(SQLException ex){
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, pst);
        }
        
    }

    @Override
    public List<Funcionario> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT * FROM Funcionarios f INNER JOIN Cargos c ON f.Cargo = c.Descricao ORDER BY Nome_func";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String nome = rs.getString("Nome_func");
                String cpf = rs.getString("CPFFunc");
                String Data_nascimento = rs.getString("Data_nascimentoFunc");
                String cel = rs.getString("CelularFunc");
                String Email = rs.getString("EmailFunc");
                Boolean ativo = rs.getBoolean("Ativo");
                double salario = rs.getDouble("Salario");
                //Preenche Cargo
                int id_cargo = rs.getInt("id");
                String descricao = rs.getString("Cargo");
                String data_registro = rs.getString("Data_registroFunc");
                Cargo cargo = new Cargo(id_cargo, descricao);
                lista.add(new Funcionario(cargo, ativo, salario, nome, Email, cpf, Data_nascimento, cel, data_registro));
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
        
    }

    @Override
    public Funcionario find(String doc) {
        Connection con = ConnectionFactory.getConnection();
        Funcionario funcionario = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Funcionarios f INNER JOIN Cargos c ON f.Cargo = c.Descricao  WHERE CPFFunc = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, doc);
            rs = pst.executeQuery();
            while(rs.next()){
                String nome = rs.getString("Nome_func");
                String cpf = rs.getString("CPFFunc");
                String Data_nascimento = rs.getString("Data_nascimentoFunc");
                String cel = rs.getString("CelularFunc");
                String Email = rs.getString("EmailFunc");
                Boolean ativo = rs.getBoolean("Ativo");
                double salario = rs.getDouble("Salario");
                String data_registro = rs.getString("Data_registroFunc");
                //Preenche Cargo
                int id_cargo = rs.getInt("id");
                String descricao = rs.getString("Cargo");
                Cargo cargo = new Cargo(id_cargo, descricao);
                funcionario = new Funcionario(cargo, ativo, salario, nome, Email, cpf, Data_nascimento, cel, data_registro);
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return funcionario;
    }

    @Override
    public void delete(String cpf) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "DELETE from Funcionarios where CPFFunc = ?";
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
    public void update(Funcionario f) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "UPDATE Funcionarios set Nome_func= ?, Data_nascimentoFunc= ?, CelularFunc= ?, Data_registroFunc= ?, EmailFunc= ?, "
                    + "Cargo = ?, Salario = ?, Ativo = ? WHERE CPFFunc = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, f.getNome());
            pst.setString(2, f.getData_nascimento());
            pst.setString(3, f.getCelular());
            pst.setString(4, f.getRegistro());
            pst.setString(5, f.getEmail());
            pst.setString(6, f.getCargo().getNome_cargo());
            pst.setDouble(7, f.getSalario());
            pst.setBoolean(8, f.isAtivo());
            pst.setString(9, f.getCpf());
            pst.executeUpdate();
        }catch(SQLException ex){
            throw new RuntimeException("Erro no Update");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }
    
}
