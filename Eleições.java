import java.util.Scanner;

class Candidato{
  //Atributos
  public String nome;
  public String partido;
  public int numeroVotos;
  public int votos;

  //Construtor
  public Candidato(String nome, String partido, int numeroVotos){
    this.nome = nome;
    this.partido = partido;
    this.numeroVotos = numeroVotos;
    this.votos = 0;
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
  public void  NumeroVotos(){
    
  }
}

public class Main{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int votos = teclado.nextInt();

    Candidato candidato = new Candidato("José", "Felicidade", votos);
    Candidato candidato2 = new Candidato("João", "Esperança", votos);

    

  }
}

class Urna{
  //Atributos
  private Candidato candidato;


  //Cosntrutor
  public Urna(Candidato candidato){
    this.candidato = candidato;
  }

  //Métodos

  public void votar(){}

  public void exibirTotalDeVotos(){}

  public void exibirTotalDeVotosBrancosNulos(){}

  public void exibirTotalDeVotosDosCandidatos(){}

  public void  exibirDadosDoCandidatoVencedor(){}

}
