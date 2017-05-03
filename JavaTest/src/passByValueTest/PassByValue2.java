package passByValueTest;

public class PassByValue2 {

	public static void main(String[] args) {
		PersonClass temp = new PersonClass("Ma Ma", 22);
		System.err.println("Before Main Temp Val : " + temp);
		print(temp);
		System.err.println("After Main Temp Val : " + temp);
		printObj(temp);
		System.err.println("After Main Temp Val : " + temp);
	}

	private static void print(PersonClass temp) {
		temp.setName("Mg Mg");
		System.err.println("Set Attr Temp Val : " + temp);
	}

	private static void printObj(PersonClass tempObj) {
		PersonClass pc = new PersonClass("Angela", 45);
		tempObj = pc;
		System.err.println("Set Obj Temp Val : " + tempObj);
	}

}
