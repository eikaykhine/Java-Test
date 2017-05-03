package enumTest;

import java.awt.GraphicsEnvironment;

public class EnumTest {

	public static void main(String[] args) {
		Books dragonlance = Books.DRAGONLANCE;

		// toString() method could be used to get their string representation.
		System.out.println(dragonlance.toString());

		// they can use '==' operator to check their equality
		if (dragonlance == Books.DRAGONLANCE) {
			System.out.println(true);
		}
		
	}

	// Enums are compiled-time type safe
	public String greet(Languages lang) {
		if (lang == Languages.ENGLISH) {
			return "English";
		} else if (lang == Languages.GERMAN) {
			return "Hallo";
		} else if (lang == Languages.FRENCH) {
			return "Salut";
		} else {
			return "Selam";
		}
	}
}
