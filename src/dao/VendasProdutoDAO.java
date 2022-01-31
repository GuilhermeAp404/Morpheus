/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.VendasProduto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Tegon Faria
 */
public class VendasProdutoDAO {
    private static VendasProdutoDAO dao;

    public VendasProdutoDAO() {
    }
    
    public static VendasProdutoDAO getInstance(){
        if(dao == null){
            dao = new VendasProdutoDAO();
        }
        return dao;
    }
    
    public void craete(VendasProduto vp){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO VendaProdutos (cod_vd, cod_prod_vd, qtd_prod_vd, valor_final_prod) VALUES(?,?,?,?)";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, vp.getVendas());
            pst.setInt(2, vp.getProduto());
            pst.setInt(3, vp.getVenProdQtd());
            pst.setDouble(4, vp.getVenProdValor());
            pst.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, pst);
        }
    }
    
    public List<VendasProduto> find(int id_vd){
        Connection con = ConnectionFactory.getConnection();
        List<VendasProduto> lista = new ArrayList<VendasProduto>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM VendaProdutos WHERE cod_vd = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, id_vd);
            rs = pst.executeQuery();
            while(rs.next()){
                int codItv = rs.getInt("cod_itv");
                int codVd = rs.getInt("cod_vd");
                int codProd = rs.getInt("cod_prod_vd");
                int qtd = rs.getInt("qtd_prod_vd");
                double valorTotal = rs.getDouble("Valor_final_prod");
                lista.add(new VendasProduto(codItv, codProd, codVd, valorTotal, qtd));
            }
        }catch( SQLException ex){
            throw new RuntimeException("Erro no Selecte");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }
    
    public List<VendasProduto> read(){
        Connection con = ConnectionFactory.getConnection();
        List<VendasProduto> lista = new ArrayList<VendasProduto>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM VendaProdutos ORDER BY cod_itv";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                int codItv = rs.getInt("cod_itv");
                int codVd = rs.getInt("cod_vd");
                int codProd = rs.getInt("cod_prod_vd");
                int qtd = rs.getInt("cod_itv");
                double valorTotal = rs.getDouble("Valor_final_prod");
                lista.add(new VendasProduto(codProd, codItv, qtd, valorTotal, codProd));
            }
        }catch( SQLException ex){
            throw new RuntimeException("Erro no Selecte");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }

    public void delete(int id) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "DELETE from VendaProdutos where cod_vd = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro no Delete");
        } finally {
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }

    public void update(VendasProduto vp) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "UPDATE VendaProdutos set qtd_prod_vd= ?, valor_final_prod= ?  WHERE cod_prod_vd = ?  AND cod_vd = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, vp.getVenProdQtd());
            pst.setDouble(2, vp.getVenProdValor());
            pst.setInt(3, vp.getProduto());
            pst.setInt(4, vp.getVendas());
            pst.executeUpdate();
        }catch(SQLException ex){
            throw new RuntimeException("Erro no Update");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }
}
