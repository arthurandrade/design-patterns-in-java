package tax;

import budget.Budget;
import budget.Item;
import template.ConditionalTaxTemplate;

public class IKCV extends ConditionalTaxTemplate {

    private boolean haveItemHigherThan400DollaresIn(Budget budget) {
          for (Item item : budget.getItems()) {
              if(item.getValue() > 400) return true;
          }
          return false;
    }
    
	@Override
	protected boolean mustUseMaximationTax(Budget budget) {
		return budget.getValue() > 500 && haveItemHigherThan400DollaresIn(budget);
	}
	
	@Override
	protected double maximationTax(Budget budget) {
		return budget.getValue() * 0.10;
	}
	
	@Override
	protected double minimumTax(Budget budget) {
		return budget.getValue() * 0.06;
	}
}
