package programming.core.java;

public class While {

	public static void main(String[] args) {

		int loop = 0;

		while (true) {
			System.out.println("looping: " + loop);

			if (loop == 5) {
				break;
			}
			
			loop++;
			System.out.println("Running! ");
		}
		
		System.out.println("HERE");
		
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
