class Paciente{
  //Atributos
  private double peso;
  private double altura;

  //COnstrutor
  public Paciente(double peso, double altura){
    this.peso = peso;
    this.altura = altura; 
  }

  //Metodos
  public double getPeso(){
    return peso;
  }
  public void setPeso(double peso){
    this.peso = peso;
  }
  public double getAltura(){
    return altura;
  }
  public void setAltura(double altura){
    this.altura = altura;
  }

  public double calcularIMC(){
    return peso/altura*altura;
  }

  public void Diagnostico(){
    double imc = calcularIMC();
    if (imc < 16){
      System.out.println("Baixo Peso Muito Grave");
    } else if(imc >= 16 && imc < 16.99){
      System.out.println("Peso Grave");
    } else if(imc >= 17 && imc <= 18.49){
      System.out.println("Baixo Peso");
    } else if(imc >= 18.50 && imc <= 24.99){
      System.out.println("Peso Normal");
    } else if(imc >= 25 && imc <= 29.99){
      System.out.println("Sobrepeso");
    } else if(imc >= 30 && imc <= 34.99){
      System.out.println("Obesidade grau I");
    } else if(imc >= 35 && imc <= 39.99){
      System.out.println("Obesidade grau II");
    } else{
      System.out.println("Obesidade grau II");
    }
  }
}

public class Main{
  public static void main(String[] args){
    Paciente paciente = new Paciente(40.00, 1.70);
    paciente.Diagnostico();
  }
}
