    /*DROP TABLE Produtos;

    CREATE TABLE Produtos (
        Codigo_prod INTEGER      PRIMARY KEY AUTOINCREMENT
                                 DEFAULT (0) 
                                 NOT NULL,
        Descricao   VARCHAR (30),
        Preco       DOUBLE       NOT NULL,
        Quantidade  INTEGER      NOT NULL,
        Marca       VARCHAR (15),
        Custo       DOUBLE       NOT NULL
    );*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Tegon Faria
 */
public class ProdutoDAO {
    
    public static ProdutoDAO dao;

    public ProdutoDAO() {
    }
    
    public static ProdutoDAO getInstance(){
        if(dao == null){
            dao = new ProdutoDAO();
        }
        return dao;
    }

    
    
    public boolean create(Produto p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Produtos (Descricao,Preco,Quantidade,Marca,Custo) VALUES(?,?,?,?,?)";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,p.getDescricao() );
            pst.setDouble(2, p.getValor());
            pst.setInt(3, p.getQuantidade());
            pst.setString(4, p.getMarca() );
            pst.setDouble(5, p.getCusto());
            pst.executeUpdate();
            return true;
        }catch(SQLException ex){
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, pst);
        }
    }


    public List<Produto> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Produto> lista = new ArrayList<Produto>();
        String sql = "SELECT * FROM Produtos ORDER BY Codigo_prod";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("Codigo_prod");
                String desc = rs.getString("Descricao");
                String marca = rs.getString("Marca");
                double custo = rs.getDouble("Custo");
                double valor = rs.getDouble("Preco");
                int qtd = rs.getInt("Quantidade");
                lista.add(new Produto(codigo, desc, marca, qtd, custo, valor));
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }


    public List<Produto> findByName(String nome) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Produto> lista = new ArrayList<Produto>();
        String sql = "SELECT * FROM Produtos WHERE Descricao LIKE '%?%'";
        sql = sql.replace("?", nome);
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("Codigo_prod");
                String desc = rs.getString("Descricao");
                String marca = rs.getString("Marca");
                double custo = rs.getDouble("Custo");
                double valor = rs.getDouble("Preco");
                int qtd = rs.getInt("Quantidade");
                lista.add(new Produto(codigo, desc, marca, qtd, custo, valor));
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }
    
     public Produto findById(int id){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Produto produto = null;
        String sql = "SELECT * FROM Produtos WHERE Codigo_prod = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("Codigo_prod");
                String desc = rs.getString("Descricao");
                String marca = rs.getString("Marca");
                double custo = rs.getDouble("Custo");
                double valor = rs.getDouble("Preco");
                int qtd = rs.getInt("Quantidade");
                produto = new Produto(codigo, desc, marca, qtd, custo, valor);
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return produto;
     }


    public void delete(int cod) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "DELETE from Produtos WHERE Codigo_prod = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, cod);
            pst.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro no Delete");
        } finally {
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }


    public void update(Produto p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "UPDATE Produtos set Descricao= ?, Preco= ?, Quantidade= ?, Marca= ?, "
                    + "Custo = ? WHERE Codigo_prod = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, p.getDescricao() );
            pst.setDouble(2, p.getValor());
            pst.setInt(3, p.getQuantidade());
            pst.setString(4, p.getMarca());
            pst.setDouble(5, p.getCusto());
            pst.setInt(6, p.getCodigo());
            pst.executeUpdate();
        }catch(SQLException ex){
            throw new RuntimeException("Erro no Update");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }
 
}
