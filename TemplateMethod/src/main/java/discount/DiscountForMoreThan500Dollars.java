package discount;

import budget.Budget;

public class DiscountForMoreThan500Dollars implements Discount {
	public double deduct(Budget budget) {
		if(budget.getValue() > 500) {
			return budget.getValue() * 0.07;
		}else {
			return 0;
		}
	}
}
