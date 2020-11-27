import java.util.ArrayList;

public class PizzaPoivronStyleStrasbourg extends Pizza {
	
	public PizzaPoivronStyleStrasbourg() {
		this.name="Strasbourg style with poivron";
		this.garnitures = new ArrayList<String>();
		this.garnitures.add("Mozarella");
	}
	
	@Override
	protected void cut() {
		System.out.println("Cut in square portion");
	}


}
