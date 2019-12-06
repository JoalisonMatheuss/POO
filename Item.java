/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PedroReiDelas
 */
public class Item {
    private Produto produto;
    private double valorUnitario;
    private int qtd;

    public Item(Produto produto, double valorUnitario, int qtd){
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.qtd = qtd;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public Produto getProduto(){
        return produto;
    }

    public void setValorUnitario(double valorUnitario){
        this.valorUnitario  = valorUnitario;
    }

    public double getvalorUnitario(){
        return valorUnitario;
    }

    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public int getQtd(){
        return qtd;
    }
}
