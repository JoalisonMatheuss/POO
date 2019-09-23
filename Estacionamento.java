package atividade_3_bim;

public interface veiculo {
	
	public void Acelerar();
	
	public void Frear();
}

package atividade_3_bim;

public abstract class Veiculo {
	
	private int Velocidade;
	private String Descricao;
	private int Ano;
	private double Valor;
	private String Placa;
	
	
	public Veiculo(int Velocidade, String Descricao, int Ano, double Valor, String Placa) {
		this.Velocidade = 0;
		this.Descricao = Descricao;
		this.Ano = Ano;
		this.Valor = Valor;
		this.Placa = Placa;
	}



	public int getVelocidade() {
		return Velocidade;
	}



	public void setVelocidade(int velocidade) {
		this.Velocidade = velocidade;
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
	
	public abstract void Tipo();
	
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
		System.out.println("Acelerou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		}

	public void Frear() {
		if(getVelocidade() >= 10) {
			setVelocidade(getVelocidade() - 10);
			System.out.println("Freiou!");
			System.out.println("Velocidade Atual: " + getVelocidade());
		}
		
	}
	
	public void InformacoesVeiculos() {
		System.out.println("======================================================");
		System.out.println("Velocidade: " +getVelocidade());
		System.out.println("Descricao: " +getDescricao());
		System.out.println("Ano: " +getAno());
		System.out.println("======================================================");
	}
	
	public void Tipo() {
		System.out.println("Moto");
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
		System.out.println("Acelerou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		}

	public void Frear() {
		if(getVelocidade() >= 10) {
			setVelocidade(getVelocidade() - 10);
			System.out.println("Freiou!");
			System.out.println("Velocidade Atual: " + getVelocidade());
		}
		
	}
	
	public void InformacoesVeiculos() {
		System.out.println("======================================================");
		System.out.println("Velocidade: " +getVelocidade());
		System.out.println("Descricao: " +getDescricao());
		System.out.println("Ano: " +getAno());
		System.out.println("======================================================");
	}
	
	public void Tipo() {
		System.out.println("Carro");
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
		System.out.println("Acelerou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		}

	public void Frear() {
		if(getVelocidade() >= 8) {
			setVelocidade(getVelocidade() - 8);
			System.out.println("Freiou!");
			System.out.println("Velocidade Atual: " + getVelocidade());
		}
		
	}
	
	public void InformacoesVeiculos() {
		System.out.println("======================================================");
		System.out.println("Velocidade: " +getVelocidade());
		System.out.println("Descricao: " +getDescricao());
		System.out.println("Ano: " +getAno());
		System.out.println("======================================================");
	}
	
	public void Tipo() {
		System.out.println("Caminhao");
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
		System.out.println("Acelerou!");
		System.out.println("Velocidade Atual: " + getVelocidade());
		}

	public void Frear() {
		if(getVelocidade() >= 8) {
			setVelocidade(getVelocidade() - 8);
			System.out.println("Freiou!");
			System.out.println("Velocidade Atual: " + getVelocidade());
		}
		
	}
	
	public void InformacoesVeiculos() {
		System.out.println("======================================================");
		System.out.println("Velocidade: " +getVelocidade());
		System.out.println("Descricao: " +getDescricao());
		System.out.println("Ano: " +getAno());
		System.out.println("======================================================");
	}
	
	public void Tipo() {
		System.out.println("Onibus");
	}
}


package atividade_3_bim;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private List<Veiculo> Estacionamentos = new ArrayList<>();
	
	
	public Estacionamento() {
	}
	
	public void AdicionarVeiculo(Veiculo veiculo) {
		if(Estacionamentos.get(0) != null) {
			Estacionamentos.add(veiculo);
		}
	}
	
	public void ContagemPorTipo() {
		int QuantMotos = 0, QuantCarros = 0, QuantCaminhao = 0, QuantOnibus = 0;
		for(int i = 0; i <= Estacionamentos.size(); i++) {
			if (Estacionamentos.get(i) != null) {
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
		}
		System.out.println("Quantidade de Motos: " +QuantMotos);
		System.out.println("Quantidade de Carros: " +QuantCarros);
		System.out.println("Quantidade de Caminhao: " +QuantCaminhao);
		System.out.println("Quantidade de Onibus: " +QuantOnibus);
	}
	
	
	public void VeiculoMenorValor() {
		if (Estacionamentos.get(0) != null) {
			double MenorValor = 0;
			
			for(int i = 0; i <= Estacionamentos.size(); i++) {
				if (Estacionamentos.get(i) != null) {
					if (Estacionamentos.get(i).getValor() < Estacionamentos.get(0).getValor()) {
						MenorValor = Estacionamentos.get(i).getValor();
					}
				}
			}
			System.out.printf("Veiculo de Menor Valor:  %.2f", (MenorValor));
			System.out.println();
		}
	}
	
	
	//public void VeiculoMaiorQuantidade() {
		//double MaiorQuantidade = 0;
		//for (int i = 0; i < Estacionamentos.size(); i++) {
			//if (Estacionamentos.get(i) )
		//}
	//}
	
	
	public void ValorTotalFrota() {
		double ValorTotalFrota = 0;
		for(int i = 0; i < Estacionamentos.size(); i++) {
			if(Estacionamentos.get(i) != null) {
				ValorTotalFrota += Estacionamentos.get(i).getValor();
			}
		}
		System.out.printf("Valor Total da Frota: %.2f", (ValorTotalFrota));
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
		
		
	}

}
