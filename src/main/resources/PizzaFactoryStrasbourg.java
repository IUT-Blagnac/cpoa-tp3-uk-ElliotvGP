
public class PizzaFactoryStrasbourg extends PizzaFactory{

	
	public static PizzaFactoryStrasbourg uniqueInstance = new PizzaFactoryStrasbourg();

	@Override
	Pizza createPizza(String type) {
		switch(type) {
		case "cheese":
			return new PizzaCheeseStyleStrasbourg();
		case "poivron,":
			return new PizzaPoivronStyleStrasbourg();
		default :
			return new PizzaCheeseStyleStrasbourg();
		}
	}
}


