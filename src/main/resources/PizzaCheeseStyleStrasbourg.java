import java.util.ArrayList;

public class PizzaCheeseStyleStrasbourg extends Pizza{
	
	public PizzaCheeseStyleStrasbourg() {
		this.name="Strasbourg style with cheese";
		this.garnitures = new ArrayList<String>();
		this.garnitures.add("Mozarella");
	}
	
	@Override
	protected void cut() {
		System.out.println("Cut in square portion");
	}


}
