import static org.junit.Assert.*;

import org.junit.Test;

public class TesteSimples {

	@Test
	public void test() {
		Estacionamento e1= new EstacionamentoSimples(0);
		
		assertEquals(TipoVeiculo.Normal , e1.TipoVeiculo);
	}

}
