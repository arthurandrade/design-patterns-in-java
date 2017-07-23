package discount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import budget.Budget;

public class DiscountCalculator {
	List<Discount> discounts = new ArrayList<Discount>();
	public DiscountCalculator(Discount ...discounts) {
		this.discounts.addAll(Arrays.asList(discounts));
	}
	
	public double calculateDiscount(Budget budget) {
		double value = 0;
		for(Discount discount: discounts) {
			value = discount.deduct(budget);
			if(value != 0) {
				return value;
			}			
		}
		return value;
	}
}
