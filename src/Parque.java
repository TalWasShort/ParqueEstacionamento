import java.util.ArrayList;

public class Parque  {
	
	//Atributos
	public ArrayList<Estacionamento> Lugares = new ArrayList<Estacionamento>();
	public IParqueStorageAdaptor Adapter;
	public Armazem armazem= new Armazem();
	
	//construtor
	
	public Parque() {
		this.Adapter=new ParqueToArmazemAdaptor();
		this.armazem= new Armazem();
			}
	
	//Metodos
	
	public Estacionamento PedirLugar(TipoVeiculo TipoVeiculo) {
		Estacionamento resultado= null;
		int LugarVazio =Lugares.size();	
		boolean reutilizouLugar=false;
		
		for ( int i=0; i<Lugares.size(); i++ ) {
			
			if (Lugares.get(i)==null) {	
				LugarVazio=i;
				reutilizouLugar=true;
					break;					
			}
		}		
		
		switch (TipoVeiculo) {
		
		case Electrico: resultado= new EstacionamentoElectrico(LugarVazio);		
			
			break;
			
		case Hidrogenio: resultado= new EstacionamentoHidrogenio(LugarVazio);
			
			break;
			
		default:  resultado= new EstacionamentoSimples(LugarVazio);
			break;
		}
		
		if (!reutilizouLugar) {
			Lugares.add(resultado);			
		} else Lugares.set(LugarVazio, resultado);
		
		return resultado ;
	}	
	

	public void DevolverVeiculo(int estacionamentoId) {
		Lugares.set(estacionamentoId, null);
	}
	
	public void FechoDiario(){
		
		this.Adapter.EnviarLugares(Lugares, this.armazem.Lugares);
	}
}


