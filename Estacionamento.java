package atividade_3_bim;

public interface veiculo {
	
	public void Acelerar();
	
	public void Frear();
}


package atividade_3_bim;

public abstract class Veiculo implements veiculo {
	
	private int Velocidade;
	private String Descricao;
	private int Ano;
	private double Valor;
	private String Placa;
	
	
	public Veiculo(int Velocidade, String Descricao, int Ano, double Valor, String Placa) {
		this.Velocidade = Velocidade;
		this.Descricao = Descricao;
		this.Ano = Ano;
		this.Valor = Valor;
		this.Placa = Placa;
	}



	public int getVelocidade() {
		return Velocidade;
	}



	public void setVelocidade(int Velocidade) {
		this.Velocidade = Velocidade;
	}



	public String getDescricao() {
		return Descricao;
	}



	public void setDescricao(String descricao) {
		this.Descricao = descricao;
	}



	public int getAno() {
		return Ano;
	}



	public void setAno(int ano) {
		this.Ano = ano;
	}



	public double getValor() {
		return Valor;
	}



	public void setValor(double valor) {
		this.Valor = valor;
	}



	public String getPlaca() {
		return Placa;
	}



	public void setPlaca(String placa) {
		this.Placa = placa;
	}



	public abstract void Acelerar();
	
	public abstract void Frear();
	
	public abstract void InformacoesVeiculos();
	
	
}


package atividade_3_bim;

public class Moto  extends Veiculo{
	private int Potencia;

	
	public Moto(int Velocidade, String Descricao, int Ano,double Valor, String Placa, int Potencia) {
		super(Velocidade,Descricao,Ano,Valor,Placa);
		this.Potencia = Potencia;
	}


	public int getPotencia() {
		return Potencia;
	}


	public void setPotencia(int potencia) {
		this.Potencia = potencia;
	}


	public void Acelerar() {
		setVelocidade(getVelocidade() + 10);
		System.out.println("\nAcelerou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		}

	public void Frear() {
		if(getVelocidade() > 10) {
			setVelocidade(getVelocidade()-10);
		}
		System.out.println("\nFreiou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		
	}
	
	public void InformacoesVeiculos() {
		System.out.println("\n======================================================");
		System.out.println("Velocidade: " + getVelocidade());
		System.out.println("Descricao: " + getDescricao());
		System.out.println("Ano: " + getAno());
		System.out.println("======================================================\n");
	}
	
}


package atividade_3_bim;

public class Carro extends Veiculo {

	private int Potencia;
	private int QuantPortas;
	
	public Carro(int Velocidade, String Descricao, int Ano,double Valor, String Placa, int Potencia, int QuantPortas) {
		super(Velocidade,Descricao, Ano, Valor, Placa);
		
		this.Potencia = Potencia;
		this.QuantPortas = QuantPortas;
	}

	

	public int getPotencia() {
		return Potencia;
	}



	public void setPotencia(int potencia) {
		this.Potencia = potencia;
	}



	public int getQuantPortas() {
		return QuantPortas;
	}



	public void setQuantPortas(int quantPortas) {
		this.QuantPortas = quantPortas;
	}



	public void Acelerar() {
		setVelocidade(getVelocidade() + 10);
		System.out.println("\nAcelerou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		}

	public void Frear() {
		if(getVelocidade() >  10) {
			setVelocidade(getVelocidade() - 10);
		}
		System.out.println("\nFreiou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		
	}
	
	public void InformacoesVeiculos() {
		System.out.println("\n======================================================");
		System.out.println("Velocidade: " +getVelocidade());
		System.out.println("Descricao: " +getDescricao());
		System.out.println("Ano: " +getAno());
		System.out.println("======================================================\n");
	}
	

}


package atividade_3_bim;

public class Caminhao extends Veiculo {

	private int Comprimento;
	private int CargaSuportada;
	
	public Caminhao(int Velocidade, String Descricao, int Ano,double Valor, String Placa, int Comprimento, int CargaSuportada) {
		super(Velocidade,Descricao, Ano, Valor, Placa);
		
		this.Comprimento = Comprimento;
		this.CargaSuportada = CargaSuportada;
	}

	

	public int getComprimento() {
		return Comprimento;
	}



	public void setComprimento(int comprimento) {
		this.Comprimento = comprimento;
	}



	public int getCargaSuportada() {
		return CargaSuportada;
	}



	public void setCargaSuportada(int cargaSuportada) {
		this.CargaSuportada = cargaSuportada;
	}



	public void Acelerar() {
		setVelocidade(getVelocidade() + 8);
		System.out.println("\nAcelerou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		}

	public void Frear() {
		if(getVelocidade() > 8) {
			setVelocidade(getVelocidade() - 8);
		}
		System.out.println("\nFreiou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		
	}
	
	public void InformacoesVeiculos() {
		System.out.println("\n======================================================");
		System.out.println("Velocidade: " +getVelocidade());
		System.out.println("Descricao: " +getDescricao());
		System.out.println("Ano: " +getAno());
		System.out.println("======================================================\n");
	}
	

}


package atividade_3_bim;

public class Onibus extends Veiculo {

	private int Comprimento;
	private int CapPassageiros;
	
	public Onibus(int Velocidade, String Descricao, int Ano,double Valor, String Placa, int Comprimento, int CapPassageiros) {
		super(Velocidade,Descricao, Ano, Valor, Placa);
		
		this.Comprimento = Comprimento;
		this.CapPassageiros =CapPassageiros;
	}


	public int getComprimento() {
		return Comprimento;
	}



	public void setComprimento(int comprimento) {
		this.Comprimento = comprimento;
	}



	public int getCapPassageiros() {
		return CapPassageiros;
	}



	public void setCapPassageiros(int capPassageiros) {
		this.CapPassageiros = capPassageiros;
	}



	public void Acelerar() {
		setVelocidade(getVelocidade() + 8);
		System.out.println("\nAcelerou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		}

	public void Frear() {
		if(getVelocidade() >  8) {
			setVelocidade(getVelocidade() - 8);
		}
		System.out.println("\nFreiou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		
	}
	
	public void InformacoesVeiculos() {
		System.out.println("\n======================================================");
		System.out.println("Velocidade: " + getVelocidade());
		System.out.println("Descricao: " + getDescricao());
		System.out.println("Ano: " + getAno());
		System.out.println("======================================================\n");
	}
	

}


package atividade_3_bim;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private List<Veiculo> Estacionamentos = new ArrayList<>();
	private int QuantMotos = 0, QuantCarros = 0, QuantCaminhao = 0, QuantOnibus = 0;
	
	
	public void AdicionarVeiculo(Veiculo veiculo) {
		Estacionamentos.add(veiculo);
	}
	
	
	
	public void ContagemPorTipo() {
		QuantMotos = QuantCarros = QuantCaminhao = QuantOnibus = 0;
		for(int i = 0; i < Estacionamentos.size(); i++) {
			if (Estacionamentos.get(i) instanceof Moto) {
					QuantMotos += 1;
			}
			if (Estacionamentos.get(i) instanceof Carro) {
					QuantCarros += 1;
			}
			if (Estacionamentos.get(i) instanceof Caminhao) {
					QuantCaminhao += 1;
			}
			if (Estacionamentos.get(i) instanceof Onibus) {
					QuantOnibus += 1; 
			}
		}
		System.out.println("Quantidade de Motos: " +QuantMotos);
		System.out.println("Quantidade de Carros: " +QuantCarros);
		System.out.println("Quantidade de Caminhao: " +QuantCaminhao);
		System.out.println("Quantidade de Onibus: " +QuantOnibus);
	}
	
	
	
	public void VeiculoMenorValor() {
		if (Estacionamentos.size() > 0) {
			double MenorValor = Estacionamentos.get(0).getValor();
				for(int i = 1; i < Estacionamentos.size(); i++) {		
					if(Estacionamentos.get(i).getValor() < MenorValor ) {
						MenorValor = Estacionamentos.get(i).getValor();
					}
					
				}
				System.out.printf("\nVeiculo de Menor Valor:  %.2f", (MenorValor));
				System.out.println();
		}
	}
	
	
	
	/*public void MaiorQuantidade() {
		int maior[] = new int[4];
		maior[0].add(QuantMotos);
	} */
	
	
	
	double ValorTotalFrota = 0;
	public void ValorTotalFrota() {
		for(int i = 0; i < Estacionamentos.size(); i++) {
			if(Estacionamentos.get(i) != null) {
				ValorTotalFrota += Estacionamentos.get(i).getValor();
			}
		}
		System.out.printf("\nValor Total da Frota: %.2f", (ValorTotalFrota));
		System.out.println();
	}
	
	
	
	public void AcelerarTodos() {
		for (int i = 0; i < Estacionamentos.size(); i++) {
			if (Estacionamentos.get(i) != null) {
				if (Estacionamentos.get(i) instanceof Moto) {
					Estacionamentos.get(i).Acelerar();
				}
				if (Estacionamentos.get(i) instanceof Carro) {
					Estacionamentos.get(i).Acelerar();
				}
				if (Estacionamentos.get(i) instanceof Caminhao) {
					Estacionamentos.get(i).Acelerar();
				}
				if (Estacionamentos.get(i) instanceof Onibus) {
					Estacionamentos.get(i).Acelerar();
				}
			}
		}
	}
	
	
	
	public void VeiculosCadastrados() {
		for (int i = 0; i < Estacionamentos.size(); i++) {
			if (Estacionamentos.get(i) == null) {
				System.out.println("Sem nenhum Veiculo Cadastrado");
			}
			else {
				Estacionamentos.get(i).InformacoesVeiculos();
			}
		}
	}
	
	
	
	public void FrearTodos() {
		for (int i = 0; i < Estacionamentos.size(); i++) {
			if (Estacionamentos.get(i) != null) {
				if (Estacionamentos.get(i) instanceof Moto) {
					Estacionamentos.get(i).Frear();
				}
				if (Estacionamentos.get(i) instanceof Carro) {
					Estacionamentos.get(i).Frear();
				}
				if (Estacionamentos.get(i) instanceof Caminhao) {
					Estacionamentos.get(i).Frear();
				}
				if (Estacionamentos.get(i) instanceof Onibus) {
					Estacionamentos.get(i).Frear();
				}
			}
		}
	}

}


package atividade_3_bim;


public class Principal {

	public static void main(String[] args) {
		
		Estacionamento esta = new Estacionamento();
		
		Veiculo moto = new Moto(10, "Moto pronta pro grau!", 2012, 1000.00, "123-abc", 20);
		Veiculo carro = new Carro(100, "Carro adulterada", 2014, 1001.00, "124-abc", 50,4);
		Veiculo caminhao = new Caminhao(100, "Caminhão adulterada", 2015, 1002.00, "125-abc", 50,4);
		Veiculo onibus = new Onibus(100, "Onibus adulterada", 2014, 1003.00, "126-abc", 50,4);
		Veiculo moto2 = new Moto(30, "Moto novinha", 2018, 15000.00, "111-abc", 30); 
		Veiculo moto3 = new Moto(50, "Pop do Grau, com churrasqueira", 2016, 5000.00,"222-cdb", 40);
		
		esta.AdicionarVeiculo(moto);
		esta.AdicionarVeiculo(moto2);
		esta.AdicionarVeiculo(moto3);
		esta.AdicionarVeiculo(carro);
		esta.AdicionarVeiculo(caminhao);
		esta.AdicionarVeiculo(onibus);
		
		esta.ContagemPorTipo();
		
		esta.VeiculoMenorValor();

		esta.ValorTotalFrota();
		
		esta.AcelerarTodos();
		
		esta.VeiculosCadastrados();
		
		esta.FrearTodos();
	}

}

