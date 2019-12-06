
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estoque estoque = new Estoque();
		
		Produto p = new Produto(1, 1.0, "comida", 10.0, "pizza");
                
                Cliente c = new Cliente("1", "Pp");
                
                Estoque e = new Estoque();
                
                e.adcionarProduto(p);
                e.Pedir(c);
                
	}

}
