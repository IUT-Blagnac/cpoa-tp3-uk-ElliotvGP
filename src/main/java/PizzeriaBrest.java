
public class PizzeriaBrest extends Pizzeria{

	PizzaFactoryBrest fabrique; 
	
	public PizzeriaBrest() {
		this.fabrique = PizzaFactoryBrest.uniqueInstance;
	}

	@Override
	Pizza orderPizza(String type) {

		Pizza pizza = this.fabrique.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.wrap();

		return pizza;

	}

}
