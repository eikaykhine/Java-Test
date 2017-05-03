package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	public static void main(String args[]) {
		
		String str = "Be Happy";
		str += " Today is Monday";
		System.out.println(str);
		
		int numberOfPlayers = 0;
		String sport = "hockey";

		switch (sport) {
		case "tennis":
		case "pingpong":
		case "badminton":
			numberOfPlayers = 1;
			break;
		case "volleyball":
		case "hockey":
			numberOfPlayers = 6;
			break;
		case "baseball":
		case "softball":
			numberOfPlayers = 9;
			break;
		}
		System.out.println(numberOfPlayers + " player(s) are needed.");
		
		/*int x = 15;
		int y = 2;
		while (y != 0) {
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		System.out.println("x is : " + x);*/

		/*
		 * boolean gameOver = true; int score = 5000; int levelCompleted = 5;
		 * int bonus = 100;
		 * 
		 * if (score == 5000) System.out.println("Your score is 5000");
		 * 
		 * if (score > levelCompleted) { System.out.println(
		 * "Score is greater that levelCompleted"); System.out.println(
		 * "5000 is greater that 5"); System.out.println(
		 * "Some new text on true condition"); }
		 * 
		 * if (score < 5000) { System.out.println("Score is equal to 5000"); }
		 * else { System.out.println("Condition is false"); }
		 * 
		 * // if ( (score < 5000) && (score > 1000) ){ if ((score == 5000) &&
		 * (score > 1000)) { System.out.println("Both conditions are true"); }
		 * else if (score < 1000) { System.out.println(
		 * "Else if condition is true"); } else { System.out.println(
		 * "None of the condtitions are true!"); } if (gameOver == true) { int
		 * finalScore = score + (levelCompleted * bonus); System.out.println(
		 * "Your final score was " + finalScore); }
		 * 
		 * if (gameOver == true) { score = 10000; levelCompleted = 8; bonus =
		 * 200; int finalScore = score + (levelCompleted * bonus);
		 * System.out.println("Your final score was " + finalScore); }
		 * 
		 * System.out.println(score);
		 * 
		 * System.out.println(levelCompleted);
		 */

		/*
		 * char inp[] = "TestString".toCharArray(); int n = inp.length;
		 * reverse(inp, 0, n - 1); System.out.println(String.valueOf(inp));
		 */
		
		String temp = "Vinay";
        print(temp);
        System.err.println(temp);

	}

	private static void print(String temp) {
        temp = null;
    }
	
	public static void reverse(char[] arr, int start, int end) {
		if (start >= end)
			return;
		char tmp;
		tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
		// reverse(arr, start + 1, end - 1);
		// reverse(arr, ++start, --end);
		reverse(arr, start++, end--);// error

	}

	/*
	 * private final String test = "test123";
	 * 
	 * public Test() { System.out.println("Test = "+test); }
	 * 
	 * public static void main(String[] args) { Test t = new Test(); }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner s = new Scanner(System.in); System.out.print("Ente Employee ID: "
	 * ); int employeeId = s.nextInt(); System.out.print("Ente SEX: "); char SEX
	 * = s.next().charAt(0); System.out.print("Ente Employee Name: ");
	 * s.nextLine(); String employeeName = s.nextLine(); System.out.println(
	 * "Employee ID is " + employeeId); System.out.println("Employee Name is " +
	 * employeeName); System.out.println("Employee gender is " + SEX);
	 * 
	 * }
	 */

	/* public static void main(String[] args) { */

	/*
	 * double a = 2.2; double b = 1.2; double c = a - b; System.out.println(c);
	 * 
	 * BigDecimal first, second, result, result1; first = new BigDecimal("2.2");
	 * second = new BigDecimal("1.2"); result = first.subtract(second); result1
	 * = first.add(second); System.out.println("result is " + result);
	 * System.out.println("result1 is " + result1); // will print : result is
	 * 0.3333333333333333
	 * 
	 * String str1 = new String("ABC"); String str2 = new String("ABC");
	 * 
	 * if(str1 == str2){ System.out.println("Equal"); }else{ System.out.println(
	 * "Not Equal"); } System.out.println("Equal "+(str1 == str2));
	 * 
	 * String str3 = "ABC"; String str4 = "ABC";
	 * 
	 * if(str3 == str4){ System.out.println("Equal"); }else{ System.out.println(
	 * "Not Equal"); } System.out.println("Equal "+(str3 == str4));
	 */

	/* s */

}
