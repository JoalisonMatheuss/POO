import java.util.Scanner;

class Candidato{
  //Atributos
  public String nome;
  public String partido;
  public int numeroVotos;
  public int votos;

  //Construtor
  public Candidato(String nome, String partido){
    this.nome = nome;
    this.partido = partido;
    this.numeroVotos = 0;
  }

  //Métodos
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getPartido(){
    return partido;
  } 
  public void setPartido(String partido){
    this.partido = partido;
  }
  public int getNumeroVotos(){
    return numeroVotos;
  }
  public void Votos(){
    numeroVotos +=1;
  }
}


class Urna{
  //Atributos
  private Candidato cand1;
  private Candidato cand2;
  private int TtlVotos;
  private int BNulos;


  //Cosntrutor
  public Urna(Candidato cand1, Candidato cand2){
    this.cand1 = cand1;
    this.cand2 = cand2;
    this.TtlVotos = 0;
    this.BNulos = 0;
  }

  //Métodos
  public void votar(){
    Scanner e = new Scanner(System.in);
    int voto;

    do{
      System.out.println("-----------------------------------------");
      System.out.println("\nDigite 1 para Candidato1");
      System.out.println("Digite 2 para Candidato2");
      System.out.println("Digite 3 para Branco Nulo");
      System.out.println("Digite 0 para Encerrar \n");
      System.out.println("-----------------------------------------");
      voto = e.nextInt();


      if (voto == 1){
        cand1.Votos();
        TtlVotos += 1;
      }
      else if (voto == 2){
        cand2.Votos();
        TtlVotos += 1;
      }
      else if (voto == 3){
        BNulos +=1;
        TtlVotos +=1;
      }
    } while(voto!=0);
  }

  public void exibirTotalDeVotos(){
    System.out.println("Total de votos: " + TtlVotos);
  }

  public void exibirTotalDeVotosBrancosNulos(){
    System.out.println("Total de votos Brancos Nulos: " + BNulos);
  }

  public void exibirTotalDeVotosDosCandidatos(){
    System.out.println("Total de votos Candidato 1: +" + cand1);

    System.out.println(" Total de Votos Candidato 2: " + cand2);
  }

  public void  exibirDadosDoCandidatoVencedor(){
    if (cand1.getNumeroVotos() > cand2.getNumeroVotos()){
      System.out.println("Novo Prefeito da Cidade");
      System.out.println("Nome:" + cand1.nome +"\nPartido: " +cand1.partido +"\nTotalVotos: " +cand1.getNumeroVotos()); 
    }
    else if (cand1.getNumeroVotos() == cand2.getNumeroVotos()){
      System.out.println("Segundo Turno");
    }
    else{
      System.out.println("Novo Prefeito da Cidade");
      System.out.println("Nome:" + cand2.nome +"\nPartido: " +cand2.partido +"\nTotalVotos: " +cand2.getNumeroVotos());   
    }
  }

}
public class Main{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

    System.out.println("Nome do 1º Candidato:");
    String nome = teclado.nextLine();

    System.out.println("\nPartido do 1º Candidato:");
    String partido = teclado.nextLine();

    Candidato cand1 = new Candidato(nome, partido);
    System.out.println("-----------------------------------------");

    System.out.println("Nome do 2º Candidato:");
    nome = teclado.nextLine();

    System.out.println("\nPartido do 2º Candidato:");
    partido = teclado.nextLine();

    Candidato cand2 = new Candidato(nome, partido);

    Urna urna = new Urna(cand1, cand2);

    urna.votar();
    urna.exibirTotalDeVotos();
    urna.exibirTotalDeVotosBrancosNulos();
    urna.exibirTotalDeVotosDosCandidatos();
    urna.exibirDadosDoCandidatoVencedor();

  }
}
