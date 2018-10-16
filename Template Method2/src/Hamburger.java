
public abstract class Hamburger {

	Hamburger() {
	};

	final void prepareRecipe() {
		grabIngredients();
		cookMeat();

		if (customerWantsCondiments())
			addCondiments();

		serve();
	}

	abstract void cookMeat();

	abstract void addCondiments();

	void grabIngredients() {
		System.out.println("Grabbing ingredients.");
	}

	void serve() {
		System.out.println("Order is being server to customer");
	}

	boolean customerWantsCondiments() {
		return false;
	}

}
