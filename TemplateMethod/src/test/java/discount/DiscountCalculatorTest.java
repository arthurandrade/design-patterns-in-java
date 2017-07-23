package discount;

import static org.junit.Assert.*;

import org.junit.Test;

import budget.Budget;
import budget.Item;

public class DiscountCalculatorTest {
	
	@Test
	public void ShouldCalculateDiscount() {
		Budget budget = new Budget(600.0);
		budget.addItems(new Item("iphone 4", 250.0));
		budget.addItems(new Item("LG G5", 250.0));
		DiscountCalculator discountCalculator = new DiscountCalculator(new DiscountFor5Items(), new DiscountForMoreThan500Dollars());
		
		double value = discountCalculator.calculateDiscount(budget);
		assertEquals(42, value, 0.001);
	}

}
