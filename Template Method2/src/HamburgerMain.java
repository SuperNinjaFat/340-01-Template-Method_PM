/**
 * Presentation 1 Hamburger
 * 
 * Champlain College CSI-340, Fall 2018
 * 
 * Author: Matthew Schwartzkopf And Paul Lindenberg Emails:
 * matthew.schwartzkopf@mymail.champlain.edu,
 * paul.lindenberg@mymail.champlain.edu Class : CSI-340 Assignment: Presentation
 * 1 Hamburger Date Assigned: October 7, 2018 Due Date: October 16, 2018
 * 
 * Description:
 * 
 * This code represents an example of Template Method using a hamburger class
 **/

public class HamburgerMain {

	public static void main(String[] args) {
		HamburgerWithHook hamburger = new HamburgerWithHook();

		System.out.println("Preparing Hamburger");
		hamburger.prepareRecipe();
	}
}
