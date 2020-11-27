import java.util.ArrayList;

public class PizzaCheeseStyleBrest extends Pizza{
	
	public PizzaCheeseStyleBrest() {
		this.name="Pizza with Brest style sauce and cheese";
		this.garnitures = new ArrayList<String>();
		this.garnitures.add("Parmigiano reggiano");
	}
	
	@Override
	protected void cut() {
		System.out.println("Cut the pizza in tringles");
	}

}
