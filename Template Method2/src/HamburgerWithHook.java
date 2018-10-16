
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

import java.util.Scanner;

public class HamburgerWithHook extends Hamburger {

	public void cookMeat() {
		System.out.println("Meat is cooking on the grill");
	}

	void addCondiments() {
		System.out.println("Adding Lettuce and Tomato");
	}

	public boolean customerWantsCondiments() {
		String userInput = getUserInput();

		if (userInput.toLowerCase() == "yes")
			return true;
		else
			return false;
	}

	private String getUserInput() {
		String userInput = null;
		Scanner reader = new Scanner(System.in);

		System.out.println("Would you like Lettuce and Tomato? (y/n)");
		userInput = reader.nextLine();
		reader.close();

		if (userInput.toLowerCase().startsWith("y"))
			return "yes";
		else
			return "no";
	}
}
