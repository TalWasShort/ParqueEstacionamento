
public class EstacionamentoHidrogenio extends Estacionamento {	
	
	//M�todos	

	public void IniciarAbastecimento() {
		// A mangueira � destrancada e come�a a abastecer o ve�culo.
		}
		
	public void FecharAbastecimento() {
		//O abastecimento p�ra e a mangueira � trancada
		}	
	
	//Construtor
	public EstacionamentoHidrogenio(int estacionamentoId) {
		super (estacionamentoId);
		
		this.TipoVeiculo= TipoVeiculo.Hidrogenio;
	}
}
