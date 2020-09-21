package programming.core.java;

public class If {
	public static void main(String[] args) {
		//used for results of a calculation
		boolean cond = 4 == 3;
		System.out.println(cond);
		
		int myInt = 21;
		
		if (4 == 4) 
		{
			System.out.println("Yes it's true");
		}
		
		if (myInt < 10) 
		{
			System.out.println("less than 10");
		}
		else if(myInt > 20)
		{
			System.out.println("greater than 20");
		}
		else 
		{
			System.out.println("between 10 and 20");
		}
	}
}
