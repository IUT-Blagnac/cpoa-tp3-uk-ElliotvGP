import java.util.ArrayList;

public class PizzaPoivronStyleBrest extends Pizza {

	public PizzaPoivronStyleBrest() {
		this.name="Pizza with Brest style sauce and poivron";
		this.garnitures = new ArrayList<String>();
		this.garnitures.add("Parmigiano reggiano");
	}

	@Override
	protected void cut() {
		System.out.println("Cut the pizza in tringles");
	}
}

