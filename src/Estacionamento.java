
public abstract class Estacionamento {

	public int EstacionamentoId;
	public TipoVeiculo TipoVeiculo;
	
	//Construtor

	public Estacionamento(int estacionamentoId) {
		
		EstacionamentoId= estacionamentoId;
		
	}

	@Override
	public String toString() {
		return "Nº Lugar= " + EstacionamentoId + ", Tipo de Veiculo= " + TipoVeiculo ;
	}
	
}
