class ContaEnergia{
  //  Atributos
    private String nome;
    private int consumo;

    // Construtor
    public ContaEnergia(String nome, int consumo){
      this.nome = nome;
      this.consumo = consumo;
    }
    public void Exibir(){
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
    public void CalcuclarConsumo(){
      if (consumo <= 50){
        System.out.println(10.00);
      } else if(consumo <= 100){
        System.out.println(10+(consumo-50)*0.20);
        } else if(consumo <=200){
          System.out.println((10+(50* 0.20) + (consumo - 100) * 0.25));
      } else{
        System.out.println(10+(50* 0.20) + (consumo - 100) * 0.25 + (consumo -200)*0.35);
       }
    }
}

public class Main{
  public static void main(String[] args){
    ContaEnergia conta = new ContaEnergia("Joalison", 200);
    conta.Exibir();
    conta.CalcuclarConsumo();
  }
}
