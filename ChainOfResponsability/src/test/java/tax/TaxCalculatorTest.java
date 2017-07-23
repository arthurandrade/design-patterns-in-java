package tax;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import budget.Budget;
import budget.Item;

public class TaxCalculatorTest {

	@Test
	public void ShouldCalculateIssTax() {
		TaxCalculator taxCalculator = new TaxCalculator();
		Budget budget = new Budget(500.0);
		Tax iss = new ISS();
		
		double value = taxCalculator.makeCalculation(budget, iss);
		
		assertEquals(30.0, value, 0.001);		
	}

	@Test
	public void ShouldCalculateIcmsTax() {
		TaxCalculator taxCalculator = new TaxCalculator();
		Budget budget = new Budget(500.0);
		Tax iss = new ICMS();
		
		double value = taxCalculator.makeCalculation(budget, iss);
		
		assertEquals(50.0, value, 0.001);	
	}
	
	@Test
	public void ShouldCalculateIkcvTax() {
		TaxCalculator taxCalculator = new TaxCalculator();
		Budget budget = new Budget(600.0);
		budget.addItems(new Item("iphone 7", 600.0));
		Tax iss = new IKCV();
		
		double value = taxCalculator.makeCalculation(budget, iss);
		
		assertEquals(60.0, value, 0.001);	
	}
}
