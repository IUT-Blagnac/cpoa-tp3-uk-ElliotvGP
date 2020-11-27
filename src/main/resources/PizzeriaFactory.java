

public class PizzeriaFactory { //singleton
	
	public static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	public static PizzeriaFactory getInstance() {
		return PizzeriaFactory.uniqueInstance;
	}
	
	public Pizzeria create(String name) {
		switch(name) {
		case "Brest":
			return new PizzeriaBrest();
		case "Strasbourg":
			return new PizzeriaStrasbourg();
		default :
			return null;
		}
	}
}
