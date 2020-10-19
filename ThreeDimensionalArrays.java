package programming.core.java;

public class ThreeDimensionalArrays {
	
	public static void main(String[] args) 
	{
        // create a 3d array
        int[][][] test = {
            {
              {111, 222, 333}, 
              {444, 555, 666}
            }, 
            { 
              {777, 888, 999}, 
              {110, 111, 112}, 
              {210, 211, 212}
            } 
        };
 
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
		for (int row=0; row < test.length; row++) 
		{
			for(int col=0; col < test[row].length; col++) 
			{				
				for(int depth=0; depth < test[row][col].length; depth++) 
				{
					System.out.print(test[row][col][depth] + "R\t" );
				}
				System.out.println(" THIS ");
			}
			System.out.println(" HERE ");
		}
	}
	
}
