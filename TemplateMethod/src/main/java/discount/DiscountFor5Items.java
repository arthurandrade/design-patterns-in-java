package discount;

import budget.Budget;

public class DiscountFor5Items implements Discount{
	public double deduct(Budget budget) {
		if(budget.getItems().size() > 4) {
			return budget.getValue() * 0.1;
		}else {
			return 0;
		}
	}
}
