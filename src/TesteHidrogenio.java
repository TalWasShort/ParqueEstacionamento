import static org.junit.Assert.*;

import org.junit.Test;

public class TesteHidrogenio {

	@Test
	public void test() {
		Estacionamento e1= new EstacionamentoHidrogenio(0);
		
		assertEquals(TipoVeiculo.Hidrogenio , e1.TipoVeiculo);
	}

}
