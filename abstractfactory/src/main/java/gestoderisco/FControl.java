package gestoderisco;

import java.math.BigDecimal;

import exceptions.AlertaDeRiscoException;

public class FControl implements GestorDeRisco {
	
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if(cartao.startsWith("7777")) {
			throw new AlertaDeRiscoException("Cartão suspeito.");
		}
	}
}
