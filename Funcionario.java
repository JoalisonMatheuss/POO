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
      system.out.println("codigo: " +codigo);
      system.out.println("nome: " +nome);
      system.out.println("cpf: " +cpf);
      system.out.println("endereco: " +endereco);
      system.out.println("telefone: " +telefone);
      system.out.println("idade: " +idade);
      system.out.println("salario: " +salario);
      system.out.println("num_dependentes: " +num_dependentes);
    }

    public void setAlterarSalario(double valor){
      this.salario = salario;
    }

    public double getcalcularSalarioLiquido(int percent){
      return (salario - salario*0.11)+(salario * percent * num_dependentes);
    }
}
public class Main{
  public static void main(String[] args){
    Funcionario fun = new Funcionario()
  }
}
