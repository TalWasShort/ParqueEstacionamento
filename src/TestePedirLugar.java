import static org.junit.Assert.*;

import org.junit.Test;

public class TestePedirLugar {

	@Test
	public void testeHidrogenio() {
		Parque p1= new Parque();
		p1.PedirLugar(TipoVeiculo.Hidrogenio);
		assertEquals( TipoVeiculo.Hidrogenio,p1.Lugares.get(0).TipoVeiculo);
		
	}
	
	@Test
	public void testeElectrico() {
		Parque p1= new Parque();
		p1.PedirLugar(TipoVeiculo.Electrico);
		assertEquals( TipoVeiculo.Electrico, p1.Lugares.get(0).TipoVeiculo);
		
	}
	@Test
	public void testeSimples() {
		Parque p1= new Parque();
		p1.PedirLugar(TipoVeiculo.Normal);
		assertEquals( TipoVeiculo.Normal,p1.Lugares.get(0).TipoVeiculo);
				
	}
	
	//Com este teste verificamos que o veículo a hidrogénio é posto no primeiro lugar disponível
	@Test
	
	public void testePosicao() {
		
		Parque p1= new Parque();
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Hidrogenio);
		
			
		
		assertEquals(TipoVeiculo.Hidrogenio,p1.Lugares.get(5).TipoVeiculo);
	}
	
@Test
	
	public void testePosicaoDepoisDeDevolucao() {
		
		Parque p1= new Parque();
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.PedirLugar(TipoVeiculo.Normal);
		p1.DevolverVeiculo(2);
		p1.PedirLugar(TipoVeiculo.Hidrogenio);	
	
		
		assertEquals(TipoVeiculo.Hidrogenio,p1.Lugares.get(2).TipoVeiculo);
	}
}
