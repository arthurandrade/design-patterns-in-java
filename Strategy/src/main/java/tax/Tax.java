package tax;

import budget.Budget;

public interface Tax {
	double calculate(Budget budget);
}
