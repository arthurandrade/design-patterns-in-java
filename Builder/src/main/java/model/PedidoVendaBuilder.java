package model;

import java.math.BigDecimal;

public class PedidoVendaBuilder {
	
	
	private PedidoVenda instancia;
	
	public PedidoVendaBuilder() {
		this.instancia = new PedidoVenda();
	}
	
	public PedidoVendaBuilder comClienteVip(String nome) {
		definirCliente(nome, true);
		return this;
	}
	
	public PedidoVendaBuilder comClienteNormal(String nome) {
		definirCliente(nome, false);
		return this;
	}
	
	private void definirCliente(String nome, boolean vip) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setVip(vip);
		this.instancia.setCliente(cliente);
	}
	
	public PedidoVendaBuilder comItem(String nome, Integer quantidade, String valor) {
		ItemPedido item = new ItemPedido();
		item.setNome(nome);
		item.setValorUnitario(new BigDecimal(valor));
		item.setQuantidade(quantidade);
				
		this.instancia.getItensPedido().add(item);
		return this;
	}
	
	public PedidoVendaBuilderValido comNumero(String numero) {
		
				
		this.instancia.setNumero(numero);
		return new PedidoVendaBuilderValido(this.instancia);
	}

}
