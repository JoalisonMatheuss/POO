import java.util.Scanner;

class Produto{
  private String nome;
  private double preco;

  public Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public double getPreco(){
    return preco;
  }
  public void setPreco(double preco){
    this.preco = preco;
  }
}

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    Produto[] vetor = new Produto[n];

    for(int i = 0; i < n; i++){
      in.nextLine();

      String nome = in.nextLine();

      double preco = in.nextDouble();

      vetor[i] = new Produto(nome, preco);
    }

    double soma = 0.0;
    for(int i = 0; i < vetor.length; i++){
      soma += vetor[i].getPreco();
    }

    double media = soma /vetor.length;

    System.out.printf("Media = %.2f%n", media);
    in.close();
  }
}