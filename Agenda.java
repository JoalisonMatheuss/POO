import java.util.Scanner;

class Pessoa{
  private String nome, telefone;
  private int idade;

  //construtor
  public Pessoa(String nome, int idade, String telefone){
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
  }

  //metodos
  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public int getIdade(){
    return idade;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public String getTelfone(){
    return telefone;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }
}


class Agenda{
  private Pessoa[] pessoa;
  private int qtd;

  public Agenda(int qtd){
    this.qtd = 0;
    this.pessoa = new Pessoa[qtd];
  }

  public boolean add(Pessoa p){
    if(qtd == this.pessoa.length) return false;
    this.pessoa[this.qtd++] = p;
    return true;
  }

  public String getNomeMaisNova(){
    if (this.qtd == 0){
       return null;
    }
    Pessoa menor = this.pessoa[0];
    for(Pessoa p: this.pessoa){
      if(p.getIdade() < menor.getIdade())
        menor = p;
    }

    return menor.getNome(); 
  }
}

public class Main{ 
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Agenda agenda = new Agenda(4);
    String nome, telefone;
    int idade;


    for (int i = 0; i<4; i++){
      System.out.println("Informe o nome: ");
      nome = in.nextLine();

      System.out.println("\nInforme o telefone: ");
      telefone = in.nextLine();

      System.out.println("\nInforme a idade: ");
      idade = in.nextInt(); in.nextLine();
      
      agenda.add(new Pessoa(nome, telefone, idade));
    }

    System.out.println("\nNome da Pessoa mais nova");
    System.out.println(agenda.getNomeMaisNova());
  }
}