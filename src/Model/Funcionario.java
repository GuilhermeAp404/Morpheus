/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tegon Faria
 */
public class Funcionario extends Pessoa{
    private Cargo cargo;
    private boolean isAtivo;
    private double salario;
    private String registro;

    public Funcionario() {
        
    }

    public Funcionario(Cargo cargo, boolean isAtivo, double salario, String nome, String email, String cpf, String data_nascimento, String celular, String registro) {
        super(nome, email, cpf, data_nascimento, celular);
        setCargo(cargo);
        setIsAtivo(isAtivo);
        setSalario(salario);
        setRegistro(registro);
    }
    
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    public boolean isAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(boolean isAtivo) {
        this.isAtivo = isAtivo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
    
    
    
}
