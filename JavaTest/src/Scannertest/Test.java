package Scannertest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cis84[] student = new Cis84[50];

		int option;

		for (int c = 0; c < 50; c++)
			student[c] = new Cis84();

		do {
			System.out.print("");
			System.out.println("1) Add Information");
			System.out.println("2) Show report");
			System.out.println("3) Exit");
			System.out.print("\nEnter option: ");

			option = input.nextInt();

			switch (option) {
			case 1:
				String n;

				double g;
				int index, i;

				System.out.println("Which position of the student?");
				index = input.nextInt();

				System.out.println("What is the student's name:");
				n = input.nextLine();
				//n = input.nextLine();

				System.out.println("What is student's Id");
				i = input.nextInt();

				System.out.println("What is student's score");
				g = input.nextDouble();

				student[index].setName(n);
				student[index].setGrade(g);
				student[index].setId(i);
				break;

			case 2:
				for (int c = 0; c < 50; c++)
					System.out.println(student[c]);
				break;
			case 3:
				System.out.println("You are done");
				break;
			default:
				System.out.println("Try again");
				break;
			}

		} while (option != 3);
	}
}