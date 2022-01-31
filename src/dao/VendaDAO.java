/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Cargo;
import Model.Cliente;
import Model.Funcionario;
import Model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Tegon Faria
 */
public class VendaDAO {
    private static VendaDAO dao;

    public VendaDAO() {
    
    }
    
    public static VendaDAO getInstance(){
        if(dao == null){
            dao = new VendaDAO();
        }
        return dao;
    }
    
    public int create(Venda v){
        int id = 0;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "INSERT INTO Vendas (Funcionario, CPF_Cliente, dataVenda, Desconto, Total) VALUES(?,?,?,?,?)";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, v.getVendedor().getNome());
            pst.setString(2, v.getCliente().getCpf());
            pst.setString(3, v.getData_venda());
            pst.setInt(4, v.getDesconto());
            pst.setDouble(5, v.getValor_total());
            pst.executeUpdate();
            rs = pst.getGeneratedKeys();
            if(rs.next()){
                id = rs.getInt(1);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no Insert");
            id = 0;
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return id;
    }
    
    public List<Venda> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Venda> lista = new ArrayList<Venda>();
        String sql = "select * from Vendas v inner join Funcionarios f INNER JOIN"
                + " Cargos cg INNER JOIN Clientes c ON f.Nome_func = v.Funcionario and c.CPF = v.CPF_cliente "
                + "and f.Cargo = cg.Descricao order by Codigo_ped";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("Codigo_ped");
                //preenche funcionario
                String nomeFunc = rs.getString("Nome_func");
                String cpfFunc = rs.getString("CPFFunc");
                String Data_nascimentoFunc = rs.getString("Data_nascimentoFunc");
                String celFunc = rs.getString("CelularFunc");
                String EmailFunc = rs.getString("EmailFunc");
                Boolean ativo = rs.getBoolean("Ativo");
                double salario = rs.getDouble("Salario");
                String data_registroFunc = rs.getString("Data_registroFunc");
                //Preenche Cargo
                int id_cargo = rs.getInt("id");
                String descricao = rs.getString("Cargo");
                Cargo cargo = new Cargo(id_cargo, descricao);
                Funcionario func = new Funcionario(cargo, ativo, salario, nomeFunc, EmailFunc, cpfFunc, Data_nascimentoFunc, celFunc, data_registroFunc);
                //preenche cliente
                String nome = rs.getString("Nome");
                String cpf = rs.getString("CPF");
                String Data_nascimento = rs.getString("Data_nascimento");
                String cel = rs.getString("Celular");
                String Data_registro = rs.getString("Data_registro");
                String Email = rs.getString("Email");
                Cliente cliente = new Cliente(nome, Email, cpf, Data_nascimento, cel, Data_registro);
                //termina vendas
                double valorTotal = rs.getDouble("Total");
                int desconto = rs.getInt("Desconto");
                String dataVenda = rs.getString("DataVenda");
                lista.add(new Venda(codigo, valorTotal, desconto, cliente, dataVenda, func));
               
            }
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }
    
    public void delete(int id){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "DELETE from Vendas where Codigo_ped = ?";
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
    
    public Venda find(int id){
        Venda venda = null;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Venda> lista = new ArrayList<Venda>();
        String sql = "select * from Vendas v inner join Funcionarios f INNER JOIN"
                + " Cargos cg INNER JOIN Clientes c ON f.Nome_func = v.Funcionario and c.CPF = v.CPF_cliente "
                + "and f.Cargo = cg.Descricao WHERE Codigo_ped = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            //preenche funcionario
            String nomeFunc = rs.getString("Nome_func");
            String cpfFunc = rs.getString("CPFFunc");
            String Data_nascimentoFunc = rs.getString("Data_nascimentoFunc");
            String celFunc = rs.getString("CelularFunc");
            String EmailFunc = rs.getString("EmailFunc");
            Boolean ativo = rs.getBoolean("Ativo");
            double salario = rs.getDouble("Salario");
            String data_registroFunc = rs.getString("Data_registroFunc");
            //Preenche Cargo
            int id_cargo = rs.getInt("id");
            String descricao = rs.getString("Cargo");
            Cargo cargo = new Cargo(id_cargo, descricao);
            Funcionario func = new Funcionario(cargo, ativo, salario, nomeFunc, EmailFunc, cpfFunc, Data_nascimentoFunc, celFunc, data_registroFunc);
            //preenche cliente
            String nome = rs.getString("Nome");
            String cpf = rs.getString("CPF");
            String Data_nascimento = rs.getString("Data_nascimento");
            String cel = rs.getString("Celular");
            String Data_registro = rs.getString("Data_registro");
            String Email = rs.getString("Email");
            Cliente cliente = new Cliente(nome, Email, cpf, Data_nascimento, cel, Data_registro);
            //termina vendas
            double valorTotal = rs.getDouble("Total");
            int desconto = rs.getInt("Desconto");
            String dataVenda = rs.getString("DataVenda");
            venda = new Venda(id, valorTotal, desconto, cliente, dataVenda, func);
        }catch(SQLException ex){
           throw new RuntimeException("Erro no Select.");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return venda;
    }

    public void update(Venda v) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "UPDATE Vendas set Funcionario = ?, CPF_cliente = ?, dataVenda = ?,"
                   + " Desconto = ?, total = ? WHERE Codigo_ped = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, v.getVendedor().getNome());
            pst.setString(2, v.getCliente().getCpf());
            pst.setString(3, v.getData_venda());
            pst.setInt(4, v.getDesconto());
            pst.setDouble(5, v.getValor_total());
            pst.setInt(6, v.getCodigo());
            pst.executeUpdate();
        }catch(SQLException ex){
            throw new RuntimeException("Erro no Update");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }
}
