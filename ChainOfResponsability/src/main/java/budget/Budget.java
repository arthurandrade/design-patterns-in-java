package budget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {
	private double value;
	private List<Item> items;

    public Budget(double value) {
        this.value = value;
        items = new ArrayList<Item>();
    }

    public double getValue() {
        return value;
    }
    public void addItems(Item item) {
    	items.add(item);
    }
    
    public List<Item> getItems(){
    	return Collections.unmodifiableList(items);
    }
}
