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

		if (userInput.toLowerCase().startsWith("y"))
			return "yes";
		else
			return "no";
	}
}
