/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Tegon Faria
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:sqlite:C:\\Users\\Tegon Faria\\Documents\\GitHub\\Morpheus\\db\\MorpheusDB.db";
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL);
        }catch(SQLException ex){
            throw new RuntimeException("Erro na Conexão");
        }
    }
    
    public static void closeConnection(Connection con){
        try{
            if(con != null) con.close();
        }catch(SQLException e){
            throw new RuntimeException("Erro no Fechamento da conexão");
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pst){
        try{
            if(pst != null) pst.close();
            closeConnection(con);
        }catch(SQLException e){
            throw new RuntimeException("Erro no Fechamento do Statement");
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pst, ResultSet rs){
        try{
            if(rs != null) pst.close();
            closeConnection(con, pst);
        }catch(SQLException e){
            throw new RuntimeException("Erro no Fechamento do Result set");
        }
    }
}
