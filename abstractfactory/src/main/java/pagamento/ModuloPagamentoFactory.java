package pagamento;

import gestoderisco.GestorDeRisco;
import operadora.Operadora;

public interface ModuloPagamentoFactory {

	public Operadora criaOperadora();
	public GestorDeRisco criarGestorDeRisco();
	
}
