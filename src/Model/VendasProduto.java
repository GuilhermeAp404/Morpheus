package Model;
/**
*
* @author Guilherme
*/
public class VendasProduto {

    private int idVendaProduto;
    private int produto;
    private int vendas;
    private double venProdValor;
    private int venProdQtd;

    public VendasProduto(){}

    public VendasProduto(int produto, int vendas, double venProdValor, int venProdQtd) {
        setProduto(produto);
        setVendas(vendas);
        setVenProdValor(venProdValor);
        setVenProdQtd(venProdQtd);
    }

    public VendasProduto(int idVendaProduto, int produto, int vendas, double venProdValor, int venProdQtd) {
        setIdVendaProduto(idVendaProduto);
        setProduto(produto);
        setVendas(vendas);
        setVenProdValor(venProdValor);
        setVenProdQtd(venProdQtd);
    }


    
    public void setIdVendaProduto(int pIdVendaProduto){
        this.idVendaProduto = pIdVendaProduto;
    }

    public int getIdVendaProduto(){
        return this.idVendaProduto;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public void setVendas(int pVendas){
        this.vendas = pVendas;
    }

    public int getVendas(){
        return this.vendas;
    }


    public void setVenProdValor(double pVenProdValor){
        this.venProdValor = pVenProdValor;
    }

    public double getVenProdValor(){
        return this.venProdValor;
    }


    public void setVenProdQtd(int pVenProdQtd){
        this.venProdQtd = pVenProdQtd;
    }

    public int getVenProdQtd(){
        return this.venProdQtd;
    }

    @Override
    public String toString(){
        return "ModelVendasProduto {" + "::idVendaProduto = " + this.idVendaProduto + "::produto = " + this.produto + "::vendas = " + this.vendas + "::venProdValor = " + this.venProdValor + "::venProdQtd = " + this.venProdQtd +  "}";
    }
}