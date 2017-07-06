package model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class PedidoVendaTest {

	@Test
	public void deveCalcularValorTotalPedidoParaClienteVip() {
		PedidoVenda pedidoVenda = new PedidoVendaBuilder()
				                       .comClienteVip("Arthur Andrade")
				                       .comItem("Relogio", 2, "200")
				                       .comItem("Celular", 1, "200")
				                       .comNumero("02")
				                       .construir();
		
		BigDecimal valorTotal = pedidoVenda.getValorTotal();
		
		assertEquals(new BigDecimal("576").doubleValue(), valorTotal.doubleValue(), 0.001);
	}
	
	@Test
	public void deveCalcularValorTotalPedidoParaClienteNormal() {
		PedidoVenda pedidoVenda = new PedidoVendaBuilder()
				                       .comClienteNormal("Arthur Andrade")
				                       .comItem("Relogio", 2, "200")
				                       .comItem("Celular", 1, "200")
				                       .comNumero("02")
				                       .construir();
		
		BigDecimal valorTotal = pedidoVenda.getValorTotal();
		
		assertEquals(new BigDecimal("600").doubleValue(), valorTotal.doubleValue(), 0.001);
	}
}
