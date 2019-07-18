class Vinho{
  private String nome, tipoDeUva, fabricante, dataDeFabricacao;
  private int valorDeCompra;

  //  Construtor
  public Vinho(String nome, String tipoDeUva, String fabricante, String dataDeFabricacao, int valorDeCompra){
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
  public int getValorDeCompra(){
    return valorDeCompra;
  }
  public void setValorDeCompra(int valorDeCompra){
    this.valorDeCompra = valorDeCompra;
  }
}



class VinhoBranco extends Vinho{
  private String tipo;

  //Construtor
  public VinhoBranco(String nome, Stirng tipoDeUva, String fabricante, String dataDeFabricacao, int valorDeCompra, String tipo){
    super(nome, tipoDeUva, fabricante, dataDeFabricacao, valorDeCompra);
    this.tipo = tipo;
  }

  //Métodos
  public String getTipo(){
    return tipo;
  }
  public void setTipo(String tipo){
    this.tipo = tipo;
  }
}


class VinhoTinto extends Vinho{
  private int safra;

  //Construtor
  public VinhoTinto(String nome, String tipoDeUva, String fabricante, String dataDeFabricacao, String valorDeCompra, int safra){
    super(nome, tipoDeUva, fabricante, dataDeFabricacao, valorDeCompra);
    this.safra = safra;
  }

  //Métodos
  public int getSafra(){
    return safra;
  }
  public void setSafra(int safra){
    this.safra = safra;
  }
}

