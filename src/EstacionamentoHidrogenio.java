
public class EstacionamentoHidrogenio extends Estacionamento {	
	
	//Métodos	

	public void IniciarAbastecimento() {
		// A mangueira é destrancada e começa a abastecer o veículo.
		}
		
	public void FecharAbastecimento() {
		//O abastecimento pára e a mangueira é trancada
		}	
	
	//Construtor
	public EstacionamentoHidrogenio(int estacionamentoId) {
		super (estacionamentoId);
		
		this.TipoVeiculo= TipoVeiculo.Hidrogenio;
	}
}
