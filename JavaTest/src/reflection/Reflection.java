package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	public void firstMoveChoice() {
		System.out.println("First Move");
	}

	public void secondMOveChoice() {
		System.out.println("Second Move");
	}

	public void thirdMoveChoice() {
		System.out.println("Third Move");
	}

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Reflection test = new Reflection();
		Method[] method = test.getClass().getMethods();
		// firstMoveChoice
		method[0].invoke(test, null);
		// secondMoveChoice
		method[1].invoke(test, null);
		// thirdMoveChoice
		method[2].invoke(test, null);
	}

}
