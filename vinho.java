package Vetor;

public abstract class Vinho{
	  private String nome, tipoDeUva, fabricante, dataDeFabricacao;
	  private double valorDeCompra;

	  // Construtor
	  public Vinho(String nome, String tipoDeUva, String fabricante, String dataDeFabricacao, double valorDeCompra){
	    this.nome = nome;
	    this.tipoDeUva = tipoDeUva;
	    this.fabricante = fabricante;
	    this.dataDeFabricacao = dataDeFabricacao;
	    this.valorDeCompra = valorDeCompra;
	  }

	  //Métodos
	  public String getNome(){
	    return nome;
	  }
	  public void setNome(String nome){
	    this.nome = nome;
	  }
	  public String getTipoDeUva(){
	    return tipoDeUva;
	  }
	  public void setTipoDeUva(String tipoDeUva){
	    this.tipoDeUva = tipoDeUva;
	  }
	  public String getFabricante(){
	    return fabricante;
	  }
	  public void setFabricante(String fabricante){
	    this.fabricante = fabricante;
	  }
	  public String getDataDeFabricacao(){
	    return dataDeFabricacao;
	  }
	  public void setDataDeFabriacacao(String dataDeFabricacao){
	    this.dataDeFabricacao = dataDeFabricacao;
	  }
	  public double getValorDeCompra(){
	    return valorDeCompra;
	  }
	  public void setValorDeCompra(double valorDeCompra){
	    this.valorDeCompra = valorDeCompra;
	  }
	  public abstract double CalcularValor();
	}



package Vetor;

public class VinhoBranco extends Vinho{
	  private String tipo;

	  public VinhoBranco(String nome, String tipoDeUva, String fabricante, String dataDeFabricacao, double valorDeCompra, String tipo){
	    super(nome, tipoDeUva, fabricante, dataDeFabricacao, valorDeCompra);
	    this.tipo = tipo;
	  }

	  public String getTipo(){
	    return tipo;
	  }
	  public void setTipo(String tipo){
	    this.tipo = tipo;
	  }
	  
	  public double CalcularValor() {
		  if(this.tipo == "frisante") {
			  return (getValorDeCompra() +0.15 * getValorDeCompra());
		  }
		  else {
			  return getValorDeCompra();
		  }
	  }
	}



package Vetor;

public class VinhoTinto extends Vinho{
	  private int safra;

	  public VinhoTinto(String nome, String tipoDeUva, String fabricante, String dataDeFabricacao, double valorDeCompra, int safra){
	    super(nome, tipoDeUva, fabricante, dataDeFabricacao, valorDeCompra);
	    this.safra = safra;
	  }

	  public int getSafra(){
	    return safra;
	  }
	  public void setSafra(int safra){
	    this.safra = safra;
	  }
	  
	  public double CalcularValor() {
		  if(this.safra >= 10) {
			  return getValorDeCompra() + 0.22*getValorDeCompra();
		  }
		  else {
			  return getValorDeCompra();
		  }
	  }
	}




package Vetor;

public class Adega {
	private Vinho zeColmeia[][];
	
	
	public Adega(Vinho zéColmeia[][]) {
		this.zeColmeia = new Vinho[20][10];
	}
	int cont = 0;
	public void AdicionarGarrafa(Vinho garrafa, int linha, int coluna) {
		if(zeColmeia[linha][coluna] == null) {
			zeColmeia[linha][coluna] = garrafa;
			cont+=1;
		}
	}
	
	int totalBranco = 0;
	int totalTinto = 0;
	public void ContaDosVinhos() {
		for(int i = 0; i <= 20; i++) {
			for(int j = 0; j <= 10; j++) {
				if (zeColmeia[i][j] instanceof VinhoBranco) {
					totalBranco = totalBranco +1;
				}if(zeColmeia[i][j] instanceof VinhoTinto) {
					totalTinto = totalTinto + 1;
				}
			}
		}
	}
  
  double valorTotal = 0;
	public void ValorTotalCompra() {
		for(int i = 0; i <= 20; i++) {
			for(int j = 0; i <= 10; j++) {
				if(!(zeColmeia[i][j] == null)) {
					valorTotal += zeColmeia[i][j].getValorDeCompra();
				}
			}
		}
	}
}
