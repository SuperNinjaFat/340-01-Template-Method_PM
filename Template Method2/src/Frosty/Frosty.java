package Frosty;

public abstract class Frosty {

	Frosty() {
	};

	final void prepareRecipe() {
		addFlavor();
		addIce();
		mix();
		pourIntoCup();
		serve();
	}
	
	void pourIntoCup() {
		System.out.println("Poring drink into cup.");
		
	}

	void serve() {
		System.out.println("Serving drink.");
		
	}

	void mix() {
		System.out.println("Mixing drink.");
		
	}

	void addIce() {
		System.out.println("Adding ice.");
		
	}

	abstract void addFlavor();

}
