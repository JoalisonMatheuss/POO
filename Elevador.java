class Elevador{
  private int andarAtual;
  private int tolAndares;
  private int capacidade;
  private int qtdPessoas;

  public Elevador(int tolAndares, int capacidade){
    this.tolAndares = tolAndares;
    this.capacidade = capacidade;
    this.andarAtual = 0;
    this.qtdPessoas = 0;
  }

  public void Entrar(){
    if(qtdPessoas < capacidade){
      qtdPessoas +=1;
    }
  }

  public void Sair(){
    if(qtdPessoas > 0){
      qtdPessoas -=1;
    }
  }

  public void Sobe(int andarDesejado){
    if(andarAtual < tolAndares && andarDesejado <= tolAndares){
      andarAtual = andarDesejado;
    }
  }

  public void Desce(int andarDesejado){
    if(andarAtual > 0 && andarDesejado < andarAtual){
      andarAtual = andarDesejado;
    }
  }

  public int getAndarAtual(){
    return andarAtual;
  }

  public void setAndarAtual(int andarAtual){
    this.andarAtual = andarAtual;
  }

  public int getTolAndares(){
    return tolAndares;
  }

  public void setTolAndares(int tolAndares){
    this.tolAndares = tolAndares;
  }

  public int getCapacidade(){
    return capacidade;
  }

  public void setCapacidade(){
    this.capacidade = capacidade;
  }

  public int getQtdPessoas(){
    return qtdPessoas;
  }

  public void setQtdPessoas(int qtdPessoas){
    this.qtdPessoas = qtdPessoas;
  }

}

public class Main{
  public static void main( String[] args){
    Elevador e = new Elevador(10, 6);
    System.out.println("Andar atual do elevador: " +e.getAndarAtual());

    e.Entrar();
    e.Entrar();
    e.Entrar();
    e.Entrar();
    e.Entrar();
    e.Entrar();
    
    System.out.println("Pessoas no elevador: " +e.getQtdPessoas());

    e.Sobe(3);
    System.out.println("Andar atual:" +e.getAndarAtual() +" Capacidade:" + e.getCapacidade() +" Qtd Pessoas:" +e.getQtdPessoas() +" total andares:"+e.getTolAndares());
    e.Desce(2);

    e.Sair();

    System.out.println("Andar atual:" +e.getAndarAtual() +" Capacidade:" + e.getCapacidade() +" Qtd Pessoas:" +e.getQtdPessoas() +" total andares:"+e.getTolAndares());

  }
}
