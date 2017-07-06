package operadora;

import java.math.BigDecimal;

import exceptions.CapturaNaoAutorizadaException;

public class Cielo implements Operadora {
	
	private Long codigoConfirmacao = -1L;

	public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {
		if(cartao.startsWith("5555")) {
			throw new CapturaNaoAutorizadaException("N�mero de cart�o inv�lido!");
		}
		
		this.codigoConfirmacao = (long) Math.random() * 1000;		
	}

	public Long confirmar() {
		System.out.println("Fazendo o d�bito na conta do cliente via Cielo");
		return this.codigoConfirmacao;
	}

}
