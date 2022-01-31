/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.CargoDAO;

/**
 *
 * @author Tegon Faria
 */
public class Cargo {
    private int id;
    private String nome_cargo;

    public Cargo() {
    }

    public Cargo(String nome_cargo) {
        setNome_cargo(nome_cargo);
    }

    public Cargo(int id, String nome_cargo) {
        setId(id);
        setNome_cargo(nome_cargo);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome_cargo() {
        return nome_cargo;
    }

    public void setNome_cargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }

    @Override
    public String toString() {
        String ret = this.getNome_cargo();
        return ret; //To change body of generated methods, choose Tools | Templates.
    }

    
}
