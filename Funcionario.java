class Funcionario{
    //Atributos
    
    private int codigo;
    private String nome;
    private int cpf;
    private String endereco;
    private int telefone;
    private int idade;
    private double salario;
    private int num_dependentes;

    //Construtor
    
    public Funcionario(int codigo, String nome, int cpf, String endereco, int telefone, int idade, double salario, int num_dependentes){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
        this.num_dependentes = num_dependentes;
    }

    //Metodos

    public void setExibir(){
      System.out.println("\n"+"   DADOS DO FUNCIONARIO" + "\n");
      System.out.println("--------------------------------");
      System.out.println("|"+" codigo --> " + codigo);
      System.out.println("|"+" nome --> " + nome);
      System.out.println("|"+" cpf --> " + cpf);
      System.out.println("|"+" endereco --> " + endereco);
      System.out.println("|"+" telefone --> " + telefone);
      System.out.println("|"+" idade --> " + idade);
      System.out.println("|"+" salario --> " + salario);
      System.out.println("|"+" num_dependentes --> " + num_dependentes);
      System.out.println("--------------------------------");
    }

    public void setAlterarSalario(double salario){
      this.salario = salario;
    }

    public int getCodigo(){
      return codigo;
    }

    public void setCodigo(int codigo){
      this.codigo = codigo;
    }

    public String getNome(){
      return nome;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public int getCpf(){
      return cpf;
    }

    public void setCpf(int cpf){
      this.cpf = cpf;
    }

    public String getEndereco(){
      return endereco;
    }
    
    public void setEndereco(String endereco){
      this.endereco = endereco;
    }

    public int getTelefone(){
      return telefone;
    }

    public void setTelefone(int telefone){
      this.telefone = telefone;
    }

    public int getIdade(){
      return idade;
    }
    
    public void setIdade(int idade){
      this.idade = idade;
    }

    public double getcalcularSalarioLiquido(int percent){
      return (salario - salario*0.11)+(salario * percent * num_dependentes);
    }

    public void setcalcularSalarioLiquido(double salario){
      this.salario = salario;
    }

    public int getNum_dependentes(){
      return num_dependentes;
    }

    public void setNum_dependentes(int num_dependentes){
      this.num_dependentes = num_dependentes;
    }

}


public class Main{
  public static void main(String[] args){
    Funcionario funcionario = new Funcionario(1, "Jooj", 1234567891, "RUA I DON'T NOW", 999799532, 25, 998.00, 0);
    funcionario.setExibir();
  }
}
