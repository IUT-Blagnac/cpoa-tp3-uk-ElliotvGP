package classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void deuxPizzeriaDifferentesBrest() {
		Pizzeria shopFromBrest = PizzeriaFactory.getInstance().create("Brest");
		Pizzeria shopFromBrest2 = PizzeriaFactory.getInstance().create("Brest");
		 assertNotEquals("Two Ordered Pizzas Are Different",shopFromBrest,shopFromBrest2);
	}
	
	@Test
	public void bonnePizzaCommandee() {
		Pizzeria shopFromStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
		Pizza pizza = shopFromStrasbourg.orderPizza("cheese");
		assertEquals(pizza.getName(),"Strasbourg style with cheese");
	}
	
	@Test
	public void singletonPizzeriaFactory() {
		PizzeriaFactory factory1 = PizzeriaFactory.getInstance();
		PizzeriaFactory factory2 = PizzeriaFactory.getInstance();
		assertEquals(factory1, factory2);
	}
	
	@Test
	public void singletonPizzaFactory() {
		PizzaFactoryBrest pizzaF1 = PizzaFactoryBrest.uniqueInstance;
		PizzaFactoryBrest pizzaF2 = PizzaFactoryBrest.uniqueInstance;
		assertEquals(pizzaF1, pizzaF2);
	}
	
	@Test
	public void bonneGarniturePizzaStrasbourg() {
		Pizzeria shopFromStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
		Pizza pizza = shopFromStrasbourg.orderPizza("cheese");
		assertEquals(pizza.garnitures.get(0), "Mozarella");
	}
	
	
}
