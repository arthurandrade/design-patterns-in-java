package template;

import budget.Budget;
import tax.Tax;

public abstract class ConditionalTaxTemplate implements Tax {
    public double  calculate(Budget budget) {
        if(mustUseMaximationTax(budget)) {
          return maximationTax(budget);
        }
        else {
          return minimumTax(budget);
        }
      }        

      protected abstract boolean mustUseMaximationTax(Budget budget);
      protected abstract double maximationTax(Budget budget);
      protected abstract double minimumTax(Budget budget);
 }

