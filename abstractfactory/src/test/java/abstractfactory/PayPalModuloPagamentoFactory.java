package abstractfactory;

import gestoderisco.ClearSale;
import gestoderisco.GestorDeRisco;
import operadora.Operadora;
import operadora.RedeCard;
import pagamento.ModuloPagamentoFactory;

public class PayPalModuloPagamentoFactory implements ModuloPagamentoFactory {

	public Operadora criaOperadora() {
		return new RedeCard();
	}

	public GestorDeRisco criarGestorDeRisco() {
		
		return new ClearSale();
	}

}
