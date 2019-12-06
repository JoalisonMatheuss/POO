/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PedroReiDelas
 */
public class Produto {
    private int codProduto;
    private double custo;
    private String descricao;
    private double preco;
    private String nome;
    private double lucro;

    public Produto(int codProduto, double custo, String descricao, String nome){
        this.codProduto = codProduto;
        this.custo = custo;
        this.descricao = descricao;
        this.lucro = 0.2;
        this.preco = custo * lucro;
        this.nome = nome;
        
    }

    public int getCodProduto(){
        return codProduto;
    }

    public void setCodProduto(int codProduto){
        this.codProduto = codProduto;
    }

    public double getCusto(){
        return custo;
    }

    public void setCusto(double custo){
        this.custo = custo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getLucro() {
 		return lucro;
 	}

 	public void setLucro(double lucro) {
 		this.lucro = lucro;
 	}

}