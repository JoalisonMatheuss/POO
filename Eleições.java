class Candidato{
  //Atributos
  private String nome;
  private String partido;
  private int votos;

  //Construtor
  public Candidato(String nome, String partido, int votos){
    this.nome = nome;
    this.partido = partido;
    this.votos = votos;
  }

  //M�todos
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
  public int getVotos(){
    return votos;
  }
  public void setVotos(int votos){
    this.votos = votos;
  }

  public void NumeroVotos(){
    if (votos == 1){
      System.out.println(votos);
    } else if (votos == 2)

  }
}

public class Main{
  public static vois main(String[] args){
    Candidato candidato = new Candidato("Jos�", "Felicidade", 1);
    Candidato candidato2 = new Candidato("Jo�o", "Esperan�a", 2);
    candidato.NumeroVotos();
    candidato2.NumeroVotos();
  }
}