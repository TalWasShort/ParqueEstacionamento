import java.util.Random;
import java.util.Scanner;

public class EstacionamentoElectrico extends Estacionamento {

	

	//Atributos
	public double PotenciaAbastecimento;
	
	//M�todos
	
	public double getPotenciaAbastecimento() {
		return PotenciaAbastecimento;
	}

	
	public void IniciarAbastecimento() {
		// A mangueira � destrancada e come�a a abastecer o ve�culo
		
	}
	
	public void FecharAbastecimento() {
		//O abastecimento p�ra e a mangueira � trancada
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
