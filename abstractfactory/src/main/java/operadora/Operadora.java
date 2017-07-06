package operadora;

import java.math.BigDecimal;

import exceptions.CapturaNaoAutorizadaException;

public interface Operadora {
	
	public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException;
	public Long confirmar();

}
