package programming.core.java;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String text = input.nextLine();
		
	//Switch statement can not be activated with a variable,it must be a constant "start", "green" or 5.
	switch(text) {
	case "Start":
		System.out.println("Machine started");
		break;
	case "Stop":
		System.out.println("Machine stopped");
		break;
		default:
			System.out.println("Command not recognised");
	}
	}

}
