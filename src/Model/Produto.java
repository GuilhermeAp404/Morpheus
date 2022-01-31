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
public class Produto {
    private int codigo = 0;
    private String descricao = null;
    private String marca = null;
    private int quantidade = 0;
    private double custo = 0;
    private double valor = 0;

    public Produto() {
    
    }
    
    public Produto(String desc, String marca, int qtd, double custo, double valor){
         setDescricao(desc);
         setMarca(marca);
         setQuantidade(qtd);
         setCusto(custo);
         setValor(valor);
     }
    
    public Produto( int cod, String desc, String marca, int qtd, double custo, double valor){
         setCodigo(cod);
         setDescricao(desc);
         setMarca(marca);
         setQuantidade(qtd);
         setCusto(custo);
         setValor(valor);
    }
     
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
