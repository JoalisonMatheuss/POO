class Conta{
  private String nome;
  private double saldo;
  private double limite;

  public Conta(String nome, double saldo, double limite){
    this.nome = nome;
    this.saldo = saldo;
    this.limite = limite;
  }

  public void Sacar(double quantidade){
    if(quantidade > 0 && quantidade <= saldo){
      saldo = saldo - quantidade;
      System.out.println("\nSaldo atual: " +getSaldo() +"\n");
    } else{
      System.out.println("Operaçãão invalida \n");
    }
  }

  public void Depositar(double quantidade){
    if (quantidade > 0 && quantidade <= limite){
      saldo += quantidade;
      System.out.println("Saldo atual: " +getSaldo() +"\n");
    } else{
      System.out.println("Não pode depositar! \n");
    }
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public double getSaldo(){
    return saldo;
  }

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public double getLimite(){
    return limite;
  }

  public void setLimite(double limite){
    this.limite = limite;
  }
}


public class Main{
  public static void main(String[] args){
    Conta c = new Conta("KULELE", 1000.00, 10000.00);
    c.Sacar(150);

    c.Depositar(25555.00);
  }
}
