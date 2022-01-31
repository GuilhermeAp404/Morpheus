/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.ClienteDAO;
import javax.swing.JOptionPane;
/**
 *
 * @author Tegon Faria
 */
public class Cliente extends Pessoa{
    private String data_registro = null;
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String email, String cpf, String data_nascimento, String celular, String data_registro) {
        super(nome, email, cpf, data_nascimento, celular);
        setData_registro(data_registro);
    }
    
    public String getData_registro() {
        return data_registro;
    }

    public void setData_registro(String data_registro) {
        this.data_registro = data_registro;
    }

    @Override
    public String toString() {
        return this.getNome();//To change body of generated methods, choose Tools | Templates.
    }

    
}
