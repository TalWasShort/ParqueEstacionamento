import static org.junit.Assert.*;

import org.junit.Test;

public class TesteElectrico {

	@Test
	public void test() {
		Estacionamento e1= new EstacionamentoElectrico(0);
		
		assertEquals(TipoVeiculo.Electrico , e1.TipoVeiculo);
	}

}
