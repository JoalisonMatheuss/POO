class ContaEnergia{
  //  Atributos
    private String nome;
    private double consumo;

    // Construtor
    public ContaEnergia(String nome, double consumo){
      this.nome = nome;
      this.consumo = consumo;
    }
    public void setExibir(){
      System.out.println("----- Dados do Consumidor -----");
      System.out.println("Nome do Cliente: "+nome);
      System.out.println("Consumo: "+consumo);
    }
    
    public String getNome(){
      return nome;
    }
    public void setNome(String nome){
      this.nome = nome;
    }
    public double getConsumo(){
      return consumo;
    }
    public void setConsumo(double consumo){
      this.consumo = consumo;
    }
}

public class Main{
  public static void main(String[] args){
    ContaEnergia conta = new ContaEnergia("Joalison", 10.00);
    conta.setExibir();
  }
}