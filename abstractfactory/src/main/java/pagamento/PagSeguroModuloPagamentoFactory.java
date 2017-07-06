package pagamento;

import gestoderisco.FControl;
import gestoderisco.GestorDeRisco;
import operadora.Cielo;
import operadora.Operadora;

public class PagSeguroModuloPagamentoFactory implements ModuloPagamentoFactory {

	public Operadora criaOperadora() {
		return new Cielo();
	}

	public GestorDeRisco criarGestorDeRisco() {
		return new FControl();
	}

}
