/**
 *
 * @author PedroReiDelas
 */
import java.util.List;
import java.util.ArrayList;

public class Comanda {
    private int numComanda, codCliente;
    private double valorTotalVenda;
    private static List<Item> itens = new ArrayList<>();
    

    public Comanda(int numComanda, double valorTotalVenda, int codCliente){
        this.numComanda = numComanda;
        this.valorTotalVenda = valorTotalVenda;
        this.codCliente = codCliente;
    }
    
    public void setNumComanda(int numComanda){
        this.numComanda = numComanda;
    }
    
    public int getNumComanda(){
        return numComanda;
    }

    public void setValorTotalVenda(double valorTotalVenda){
        this.valorTotalVenda = valorTotalVenda;
    }
    
    public double getValorTotalVenda(){
        return valorTotalVenda;
    }
    
    public void setCodCliente(int codCliente){
        this.codCliente = codCliente;
    }

    public int getCodCliente(){
        return codCliente;
    }
    
    public void adcionarItens(Item i){
    	itens.add(i);
    }

    public static int getLenItens() {
        return itens.size();
    }

    public void setItens(List<Item> itens) {
	this.itens = itens;
    }

}
