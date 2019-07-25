package Vetor;

import java.util.Date;

public abstract class Vinho{
	  private String nome, tipoDeUva, fabricante;
	  private Date dataDeFabricacao;
	  private double valorDeCompra;

	  // Construtor
	  public Vinho(String nome, String tipoDeUva, String fabricante, Date dataDeFabricacao, double valorDeCompra){
	    this.nome = nome;
	    this.tipoDeUva = tipoDeUva;
	    this.fabricante = fabricante;
	    this.dataDeFabricacao = dataDeFabricacao;
	    this.valorDeCompra = valorDeCompra;
	  }

	  //Métodos
	  public String getNome(){
	    return nome;
	  }
	  public void setNome(String nome){
	    this.nome = nome;
	  }
	  public String getTipoDeUva(){
	    return tipoDeUva;
	  }
	  public void setTipoDeUva(String tipoDeUva){
	    this.tipoDeUva = tipoDeUva;
	  }
	  public String getFabricante(){
	    return fabricante;
	  }
	  public void setFabricante(String fabricante){
	    this.fabricante = fabricante;
	  }
	  public Date getDataDeFabricacao(){
	    return dataDeFabricacao;
	  }
	  public void setDataDeFabriacacao(Date dataDeFabricacao){
	    this.dataDeFabricacao = dataDeFabricacao;
	  }
	  public double getValorDeCompra(){
	    return valorDeCompra;
	  }
	  public void setValorDeCompra(double valorDeCompra){
	    this.valorDeCompra = valorDeCompra;
	  }
	  public abstract double CalcularValor();
	  
	  public abstract void informacoes();
	}
}



package Vetor;

import java.util.Date;

public class VinhoBranco extends Vinho{
	  private String tipo;

	  public VinhoBranco(String nome, String tipoDeUva, String fabricante, Date dataDeFabricacao, double valorDeCompra, String tipo){
	    super(nome, tipoDeUva, fabricante, dataDeFabricacao, valorDeCompra);
	    this.tipo = tipo;
	  }

	  public String getTipo(){
	    return tipo;
	  }
	  public void setTipo(String tipo){
	    this.tipo = tipo;
	  }
	  
	  public double CalcularValor() {
		  if(this.tipo.equalsIgnoreCase("frisante")) {
			  return (getValorDeCompra() +(0.15 * getValorDeCompra()));
		  }
		  else {
			  return getValorDeCompra();
		  }
	  }
	  
	  public void informacoes() {
		  System.out.println("\n------- INFORMAÇÕES DO VINHO PROCURADO ---------");
		  System.out.println("Nome: " +getNome());
		  System.out.println("tipoDeUva: " +getTipoDeUva());
		  System.out.println("fabricante: " +getFabricante());
		  System.out.println("dataDeFabricacao: " +getDataDeFabricacao());
		  System.out.println("valorDeCompra R$" +getValorDeCompra());
		  System.out.println("Tipo: " +getTipo());
		  System.out.println("------------------------------------------------");
	  }
	}
}



package Vetor;

import java.util.Date;

public class VinhoTinto extends Vinho{
	  private int safra;

	  public VinhoTinto(String nome, String tipoDeUva, String fabricante, Date dataDeFabricacao, double valorDeCompra, int safra){
	    super(nome, tipoDeUva, fabricante, dataDeFabricacao, valorDeCompra);
	    this.safra = safra;
	  }

	  public int getSafra(){
	    return safra;
	  }
	  public void setSafra(int safra){
	    this.safra = safra;
	  }
	  
	  public double CalcularValor() {
		  if(this.safra <= 2009) {
			  return (getValorDeCompra() + (0.22*getValorDeCompra()));
		  }
		  else {
			  return getValorDeCompra();
		  }
	  }
	  
	  public void informacoes() {
		  System.out.println("\n------- INFORMAÇÕES DO VINHO ---------");
		  System.out.println("Nome: " +getNome());
		  System.out.println("tipoDeUva: " +getTipoDeUva());
		  System.out.println("fabricante: " +getFabricante());
		  System.out.println("dataDeFabricacao: " +getDataDeFabricacao());
		  System.out.println("valorDeCompra R$" +getValorDeCompra());
		  System.out.println("Safra: " +getSafra());
		  System.out.println("---------------------------------------");
	  }
	  
	}
}



package Vetor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Adega {
	private Vinho zeColmeia[][];

	public Adega() {
		this.zeColmeia = new Vinho[20][10];
	}

	public void AdicionarGarrafa(int linha, int coluna, Vinho Garrafa) {
		if (zeColmeia[linha][coluna] == null) {
			zeColmeia[linha][coluna] = Garrafa;

		}
	}

	public void ContaDosVinhos() {
		int totalBranco = 0;
		int totalTinto = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (zeColmeia[i][j] instanceof VinhoBranco) {
					totalBranco = totalBranco + 1;
				}
				if (zeColmeia[i][j] instanceof VinhoTinto) {
					totalTinto = totalTinto + 1;
				}
			}
		}
		System.out.println("Total de vinhos Brancos: " + totalBranco);
		System.out.println("Total de vinhos Tintos: " + totalTinto);
	}

	public void TotalGarrafas() {
		int totalGarrafas = 0;
		for (int i = 0; i < zeColmeia.length; i++) {
			for (int j = 0; j < zeColmeia[i].length; j++) {
				if (zeColmeia[i][j] != null) {
					totalGarrafas += 1;
				}
			}
		}
		System.out.println("Total de Garrafas: " + totalGarrafas);
	}

	public void ValorTotalCompra() {
		double valorTotal = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (zeColmeia[i][j] != null) {
					valorTotal += zeColmeia[i][j].getValorDeCompra();
				}
			}
		}
		System.out.printf("Total das compras: %.2f", (valorTotal));
		System.out.println();
	}

	public void ValorVendas() {
		double valorTotalVendas = 0;
		for (int i = 0; i < zeColmeia.length; i++) {
			for (int j = 0; j < zeColmeia[i].length; j++) {
				if (zeColmeia[i][j] != null) {
					valorTotalVendas += zeColmeia[i][j].CalcularValor();
				}

			}
		}
		System.out.printf("Valor total de vendas: %.2f", (valorTotalVendas));
		System.out.println();
	}

	public void VinhoMaisAntigo() {
		if (zeColmeia[0][0] != null) {
			Date dataAntiga = zeColmeia[0][0].getDataDeFabricacao();
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 10; j++) {
					if (zeColmeia[i][j] != null) {
						if (zeColmeia[i][j].getDataDeFabricacao().before(zeColmeia[0][0].getDataDeFabricacao())) {
							dataAntiga = zeColmeia[i][j].getDataDeFabricacao();
						}
					}
				}
			}
			DateFormat strDf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Vinho mais antigo: " + strDf.format(dataAntiga));
		} else {
			System.out.println("Adega Vazia");
		}
	}

	public void ObterVinhos(int linha, int coluna) {
		if (zeColmeia[linha][coluna] == null) {
			System.out.println("Não tem vinho aqui");
		} else {
			zeColmeia[linha][coluna].informacoes();
		}
	}

}



package Vetor;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	private static VinhoBranco cadastrarVinhoBranco() throws ParseException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("nome: ");
		String nome = in.nextLine();
		
		System.out.print("tipoDeUva: ");
		String tipoDeUva = in.nextLine();
		
		System.out.print("fabricante: ");
		String fabricante = in.nextLine();
		
		System.out.print("data: ");
		String data = in.nextLine();
		DateFormat strDf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = strDf.parse(data);
		
		System.out.print("ValorDeCompra: ");
		Double valorDeCompra = in.nextDouble();
		
		in.nextLine();
		
		System.out.print("tipo: ");
		String tipo = in.nextLine();
		
		System.out.println();
		
		VinhoBranco vb = new VinhoBranco(nome, tipoDeUva, fabricante, date, valorDeCompra, tipo);
		return vb;
	}
	
	private static VinhoTinto cadastrarVinhoTinto() throws ParseException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("nome: ");
		String nome = in.nextLine();
		
		System.out.print("tipoDeUva: ");
		String tipoDeUva = in.nextLine();
		
		System.out.print("fabricante: ");
		String fabricante = in.nextLine();
		
		System.out.print("data: ");
		String data = in.nextLine();
		DateFormat strDf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = strDf.parse(data);
		
		System.out.print("ValorDeCompra: ");
		Double valorDeCompra = in.nextDouble();
		
		in.nextLine();
		
		System.out.print("safra: ");
		int tipo = in.nextInt();
		
		System.out.println();
		
		VinhoTinto vt = new VinhoTinto(nome, tipoDeUva, fabricante, date, valorDeCompra, tipo);
		return vt;
	}
	
	public static void main(String[] args) throws ParseException {
		
		Adega a = new Adega();
		
		VinhoBranco vb = cadastrarVinhoBranco();
		VinhoTinto vt = cadastrarVinhoTinto();
		
		a.AdicionarGarrafa(0, 0, vb);
		a.AdicionarGarrafa(0, 1, vt);
		
		a.ContaDosVinhos();
		
		a.TotalGarrafas();
		
		a.ValorTotalCompra();
		
		a.ValorVendas();
		
		a.VinhoMaisAntigo();
		
		a.ObterVinhos(0, 0);
		
		
		
	}

}
