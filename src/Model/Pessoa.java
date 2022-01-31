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
public abstract class Pessoa {
    private String nome = null;
    private String email = null;
    private String cpf = null;
    private String data_nascimento = null;
    private String celular = null;

    public Pessoa() {
        
    }

    public Pessoa(String nome, String email, String cpf, String data_nascimento, String celular) {
        setNome(nome);
        setEmail(email);
        setCpf(cpf);
        setData_nascimento(data_nascimento);
        setCelular(celular);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
