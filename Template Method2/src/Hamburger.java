/**
 * Presentation 1 Hamburger
 * 
 * Champlain College CSI-340, Fall 2018
 * 
 * Author: Matthew Schwartzkopf And Paul Lindenberg Emails:
 * matthew.schwartzkopf@mymail.champlain.edu,
 * paul.lindenberg@mymail.champlain.edu Class : CSI-340 Assignment: Presentation 1
 * Hamburger Date Assigned: October 7, 2018 Due Date: October 16, 2018
 * 
 * Description:
 * 
 * This code represents an example of Template Method using a hamburger class
 **/

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
		System.out.println("Order is being server to customer.");
	}

	boolean customerWantsCondiments() {
		return false;
	}
}
