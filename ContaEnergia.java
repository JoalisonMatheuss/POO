class ContaEnergia{
  //  Atributos
    private String nome;
    private int consumo;

    // Construtor
    public ContaEnergia(String nome, int consumo){
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
    public int getConsumo(){
      return consumo;
    }
    public void setConsumo(int consumo){
      this.consumo = consumo;
    }
    public void setCalcuclarConsumo(){
      if (consumo == 50){
        System.out.println("R$ "+10.00);
      } else if(consumo > 50){
        System.out.println(consumo*0.20);
      }
    }
}

public class Main{
  public static void main(String[] args){
    ContaEnergia conta = new ContaEnergia("Joalison", 50);
    conta.setExibir();
  }
}
