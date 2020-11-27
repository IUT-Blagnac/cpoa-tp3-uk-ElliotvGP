
public class PizzeriaStrasbourg extends Pizzeria{

	PizzaFactoryStrasbourg fabrique;

	public PizzeriaStrasbourg() {
		this.fabrique = PizzaFactoryStrasbourg.uniqueInstance;
	}

	@Override
	Pizza orderPizza(String type) {

		Pizza pizza = fabrique.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.wrap();

		return pizza;
	}

}
