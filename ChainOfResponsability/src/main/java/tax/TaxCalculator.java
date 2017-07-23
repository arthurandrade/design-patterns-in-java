package tax;

import budget.Budget;

public class TaxCalculator {
	public double makeCalculation(Budget budget, Tax tax) {
        return tax.calculate(budget);
      }
}
