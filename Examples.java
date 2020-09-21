package programming.core.java;

public class Examples {
	public static void main(String args[]) {
		int num = 3;
		float myFloat = 324.3f;
		double myDouble = 3.145243;
		System.out.println(num);
		System.out.println("Hello World");
		System.out.println(myFloat);

		String text = "Hello";
		String blank = " ";
		String name = "Karen";
		String greeting = text + blank + name; // Concat of Strings
		System.out.println(greeting);

		String message = "Hello " + myDouble;
		System.out.println(message);
		
		boolean loop = 4 < 5;
		System.out.println(loop);
		
		// outputs 10 times if value = 0 at the start
		int value = 0;
		while(value < 10) 
		{
			value = value + 1;
			System.out.println("Hello " + value);
			//value = value + 1;
		}
		
		
	}

}
