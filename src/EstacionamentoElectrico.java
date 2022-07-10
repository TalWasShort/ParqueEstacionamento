import java.util.Random;
import java.util.Scanner;

public class EstacionamentoElectrico extends Estacionamento {

	

	//Atributos
	public double PotenciaAbastecimento;
	
	//Métodos
	
	public double getPotenciaAbastecimento() {
		return PotenciaAbastecimento;
	}

	
	public void IniciarAbastecimento() {
		// A mangueira é destrancada e começa a abastecer o veículo
		
	}
	
	public void FecharAbastecimento() {
		//O abastecimento pára e a mangueira é trancada
	}

	//Construtor
	public EstacionamentoElectrico(int estacionamentoId) {
		super (estacionamentoId);
		this.TipoVeiculo= TipoVeiculo.Electrico;
		
		Random randGenerator = new Random();
		PotenciaAbastecimento = randGenerator.nextDouble()*1000;
			
		
	}
	public EstacionamentoElectrico( int estacionamentoId, double potenciaAbastecimento) {
		super(estacionamentoId);
		this.TipoVeiculo= TipoVeiculo.Electrico;
		this.PotenciaAbastecimento= potenciaAbastecimento;
		
	}

	

}
