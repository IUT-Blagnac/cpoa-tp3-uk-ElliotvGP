
public class PizzaFactoryBrest extends PizzaFactory{
	
	public static PizzaFactoryBrest uniqueInstance = new PizzaFactoryBrest();

	@Override
	Pizza createPizza(String type) {
		switch(type) {
		case "cheese":
			return new PizzaCheeseStyleBrest();
		case "poivron,":
			return new PizzaPoivronStyleBrest();
		default :
			return new PizzaCheeseStyleBrest();
		}
	}

}
