

import java.util.ArrayList;

public abstract class Pizza {
	
	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList garnitures;
	
	protected void prepare() {
		System.out.println("Preparation of Pizza "+this.name);
		System.out.println("Add the sauce...\nAdd the garnitures :");
		for(int i=0; i<this.garnitures.size();i++) {
			System.out.println("   "+this.garnitures.get(i));
		}
	}

	protected void bake() {
	System.out.println("Bake 25 minutes at 180°");
		
	}

	protected void cut() {
		// TODO Auto-generated method stub
		
	}

	protected void wrap() {
		System.out.println("Put the Pizza in the official box");
		
	}
	
	public String getName() {
		return this.name;
	}
}
