package pagamento;

import java.math.BigDecimal;

import exceptions.AlertaDeRiscoException;
import exceptions.CapturaNaoAutorizadaException;
import gestoderisco.GestorDeRisco;
import operadora.Operadora;

public class Pagamento {
	private Operadora operadora;
	private GestorDeRisco gestorDeRisco;
	
	public Pagamento(ModuloPagamentoFactory moduloPagamentoFactory) {
		this.operadora = moduloPagamentoFactory.criaOperadora();
		this.gestorDeRisco = moduloPagamentoFactory.criarGestorDeRisco();
	}
	
	public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		this.operadora.capturar(cartao, valor);
		this.gestorDeRisco.avaliarRisco(cartao, valor);
		return this.operadora.confirmar();
	}
}
