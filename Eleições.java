class Candidato{
  //Atributos
  private String nome;
  private String partido;
  private int numeroVotos;

  //Construtor
  public Candidato(String nome, String partido, int numeroVotos){
    this.nome = nome;
    this.partido = partido;
    this.numeroVotos = numeroVotos;
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
  public void NumeroVotos(){
    
  }
}

public class Main{
  public static void main(String[] args){
    Candidato candidato = new Candidato(System.in);
    System.out.println("Digite 1, 2, 3 ou 0: ");
    int voto = Candidato.next();

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
