import java.util.ArrayList;

public class ParqueToArmazemAdaptor implements IParqueStorageAdaptor  {
	// M�todos
	
		public void EnviarLugares(ArrayList<Estacionamento> parque, ArrayList<Estacionamento> armazem){
		
			
			for (Estacionamento estacionamento : parque) {
				if (estacionamento!=null) {
					armazem.add(estacionamento);
					parque.set(estacionamento.EstacionamentoId,null);
				}						
			}
								
		}
	
}
