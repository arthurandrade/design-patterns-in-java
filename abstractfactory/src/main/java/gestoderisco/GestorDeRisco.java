package gestoderisco;

import java.math.BigDecimal;

import exceptions.AlertaDeRiscoException;

public interface GestorDeRisco {
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException;
}
