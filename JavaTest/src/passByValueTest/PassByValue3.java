package passByValueTest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PassByValue3 {

	public static void javaMethod(int val, Dog objPtr) {
		val = 7; // Modifies the copy
		objPtr.setName("objPtr"); // Modifies the original Dog pointed to by the
									// copy of the pointer passed.
		objPtr = new Dog("newObjPtr"); // Modifies the copy of the pointer,
										// leaving the original object alone.
	}

	public static void main(String[] args) {
		int a = 0;
		Dog d0 = new Dog("d0");
		javaMethod(a, d0);
		System.out.println("a is : " + a);
		System.out.println("d0 is : " + d0);
		// a is still set to 0
		// d0 now has name "objPtr"
		String ab = null;
		System.out.println(ab);
		int j = 0;
		for (; j < 8; j++) {
			System.out.println("Printing inner for loop" + j);
		}

	}
}
