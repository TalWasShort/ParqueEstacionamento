import static org.junit.Assert.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

public class TesteDevolverLugar {

	@Test
	public void test() {
		Parque p1 = new Parque();
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.DevolverVeiculo(0);
		assertEquals(null, p1.Lugares.get(0));
	}
	
	//verifica que o lugar vazio se mantém na memsa posição
	@Test
	public void testeDevolverComVariosLugaresExistentes() {
		
		Parque p1= new Parque();
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Electrico);
		p1.PedirLugar(TipoVeiculo.Hidrogenio);
		p1.DevolverVeiculo(2);
		assertEquals(null, p1.Lugares.get(2));
		
	}

}
