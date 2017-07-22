package tax;

import budget.Budget;

public class ICMS implements Tax {
	public double calculate(Budget budget) {
        return budget.getValue() * 0.1;
    }
}
