package operadora;

import java.math.BigDecimal;

import exceptions.CapturaNaoAutorizadaException;

public class RedeCard implements Operadora {
	
	private Long codigoConfirmacao = -1L;

	public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {
		if(cartao.startsWith("2222") && valorMaiorQueLimite(valor)) {
			throw new CapturaNaoAutorizadaException("valor maior que limite para cartão informado.");
		}
		this.codigoConfirmacao = (long)Math.random() * 300;
		
	}
	
	private boolean valorMaiorQueLimite(BigDecimal valor) {
		BigDecimal limite = new BigDecimal("1000");
		return valor.compareTo(limite) > 0;
	}

	public Long confirmar() {
		System.out.println("Fazendo o débito na conta do cliente via RedeCard");
		return this.codigoConfirmacao;
	}

}
