import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TesteFechoDiario {

	@Test
	public void test() {
		Parque p1= new Parque();
		ParqueToArmazemAdaptor adapter= new ParqueToArmazemAdaptor();
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Hidrogenio);
		ArrayList<Estacionamento> parqueAntigo= new ArrayList<Estacionamento>();
		
		for (Estacionamento estacionamento : p1.Lugares) {
			switch (estacionamento.TipoVeiculo) {
			
		//	case Electrico: parqueAntigo.add( new EstacionamentoElectrico(estacionamento.EstacionamentoId,((EstacionamentoElectrico) estacionamento).PotenciaAbastecimento));		
				
		//		break;
				
			case Hidrogenio: parqueAntigo.add(new EstacionamentoHidrogenio(estacionamento.EstacionamentoId));
				
				break;
				
			default:  parqueAntigo.add( new EstacionamentoSimples(estacionamento.EstacionamentoId));
				break;
			}
			
		}
		p1.FechoDiario();
		//verifica que os armazém recebeu os lugares do parque
		for (Estacionamento estacionamento : p1.armazem.Lugares) {
			assertEquals(parqueAntigo.get(estacionamento.EstacionamentoId).EstacionamentoId, estacionamento.EstacionamentoId);
		}
		//verifica que o estacionamento do Parque ficou vazio
		for (Estacionamento estacionamento : p1.Lugares) {
			assertEquals( null, estacionamento);
			
		}	
		
		
	}

}
