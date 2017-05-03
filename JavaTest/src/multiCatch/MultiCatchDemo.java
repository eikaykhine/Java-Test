package multiCatch;

import java.util.Scanner;

public class MultiCatchDemo {

	public static class Ex1 extends Exception {
		public Ex1(String errorCode) {
			super(errorCode);// To show error code in throw exception
		}
	}

	public static class Ex2 extends Exception {
		public Ex2(String errorCode) {
			super(errorCode);// To show error code in throw exception
		}
	}

	public static class Ex3 extends Exception {
		public Ex3() {
			super("Ex3 exception");// To show error code in throw exception
		}
	}

	public static class Ex4 extends Exception {
	}

	public static void main(String[] args) throws Ex1, Ex2, Ex3, Ex4 {

		// Number Format Exception
		String number = "24s";
		int no = 0;
		// no = Integer.parseInt(number);
		try {
			no = Integer.parseInt(number);
		} catch (NumberFormatException ex) {
			System.out.println("Number format message : " + ex.getMessage());
		}

		//
		String s = "12 13 14 15 18 16 17 20 2";
		Scanner c = new Scanner(s);
		int sum = 0;
		while (c.nextInt() % 2 == 0) {
			sum += c.nextInt();
		}
		System.out.println(sum);

		//
		int a[] = new int[2];
		System.out.println("out of try");
		try {
			System.out.println("Access invalid element" + a[1]);
			/* the above statement will throw ArrayIndexOutOfBoundException */
		} finally {
			System.out.println("finally is always executed.");
		}

		//
		try {
			char array[] = { 'a', 'b', 'g', 'j' };
			/*
			 * I'm displaying the value which does not exist so this should
			 * throw an exception
			 */
			System.out.println(array[2]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception!!");
		}

		//
		int res = 0;
		try {
			res = sum(0, 12);
		} catch (Exception ex) {
			System.out.println("Error :" + ex.getMessage());
		}
		System.out.println("Result " + res);
		System.out.println("Continue Next statements");

		//
		try {
			doSomething();
		} catch (Ex1 | Ex2 ex) {
			ex.printStackTrace();
			System.out.println("Ex1 & Ex2");
		} catch (Ex3 | Ex4 ex) {
			ex.printStackTrace();
			System.out.println("Ex3 & Ex4");
		}
	}

	private static int sum(int num1, int num2) {
		if (num1 == 0)
			throw new ArithmeticException("First parameter is not valid");
		else
			System.out.println("Both parameters are correct!!");
		return num1 + num2;
	}

	public static void doSomething() throws Ex1, Ex2, Ex3, Ex4 {
		int x1 = 10;
		int sum = 0;
		try {
			sum = x1 / 0;
		} catch (Exception e) {
			throw new Ex1("Arithmetic Exception for Ex1");
			// throw new Ex3();
		}
		System.out.println("Sum " + sum);
	}

}
