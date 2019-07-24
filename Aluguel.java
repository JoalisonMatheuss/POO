import java.util.Scanner;

class Aluguel{
  private String nome, email;
  private int quarto;

  public Aluguel(String nome, String email, int quarto){
    this.nome = nome;
    this.email = email;
    this.quarto = quarto;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
    public String getEmail(){
    return email;
  }
  public void setEmail(String email){
    this.email = email;
  }
    public int getQuarto(){
    return quarto;
  }
  public void setQuarto(int quarto){
    this.quarto = quarto;
  }
}

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Alugar quartos, digite quantos vc quer: ");
    int n = in.nextInt();
    System.out.println("\nQuantidade de quartos alugados: " +n);

    Aluguel[] vetor = new Aluguel[n];

    for (int i = 0; i < n; i++){
      in.nextLine();
      System.out.println("Aluguel: "+ i);
      System.out.print("\nNome: ");
      String nome = in.nextLine();
      System.out.print("Email: ");
      String email = in.nextLine();
      System.out.print("Quarto alugado: ");
      int quarto = in.nextInt();

      vetor[i] = new Aluguel(nome, email, quarto);
    }
    in.close();
  }
}