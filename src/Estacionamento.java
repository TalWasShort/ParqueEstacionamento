
public abstract class Estacionamento {

	public int EstacionamentoId;
	public TipoVeiculo TipoVeiculo;
	
	//Construtor

	public Estacionamento(int estacionamentoId) {
		
		EstacionamentoId= estacionamentoId;
		
	}

	@Override
	public String toString() {
		// Idealmente colocariamos um Unit Test tambem para este metodo.
		
		return "N� Lugar= " + EstacionamentoId + ", Tipo de Veiculo= " + TipoVeiculo ;
	}
	
}
