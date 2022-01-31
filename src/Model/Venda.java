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
public class Venda {
    private int codigo;
    private double valor_total;
    private int desconto;
    private Cliente Cliente;
    private String data_venda;
    private Funcionario vendedor;

    public Venda() {
        
    }

    public Venda(double valor_total, int desconto, Cliente cliente,String data_venda, Funcionario vendedor) {
        setValor_total(valor_total);
        setDesconto(desconto);
        setCliente(cliente);
        setData_venda(data_venda);
        setVendedor(vendedor);
    }

    public Venda(int codigo, double valor_total, int desconto, Cliente cliente, String data_venda, Funcionario vendedor) {
        setCodigo(codigo);
        setValor_total(valor_total);
        setDesconto(desconto);
        setCliente(cliente);
        setData_venda(data_venda);
        setVendedor(vendedor);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }



}
