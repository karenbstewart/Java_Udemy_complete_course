package programming.core.java;

import java.util.Scanner;

public class GettingUserInput {
	public static void main(String[] args) {

		// create a scanner object
		Scanner input = new Scanner(System.in);

		// Output the prompt
		System.out.println("Enter a line of text: ");

		// Wait for the user to enter a line of text
		String line = input.nextLine();

		// Tell them what they entered
		System.out.println("You entered: " + line);

		
		// prompt user to input an integer
		System.out.println("Enter an Integer: ");

		// Wait for the user to enter a line of text
		int value = input.nextInt();

		// Tell them what they entered
		System.out.println("You entered: " + value);
		
		
		// prompt user to input an floating point value
		System.out.println("Enter a floating point value: ");

		// Wait for the user to enter a line of text
		double doubleValue = input.nextDouble();

		// Tell them what they entered
		System.out.println("You entered: " + doubleValue);

	}

}
