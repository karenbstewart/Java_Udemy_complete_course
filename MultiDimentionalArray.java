package programming.core.java;

public class MultiDimentionalArray {
	/* Examples of Arrays and Multi-Dimentional arrays
	 * 2D and 3D and how they work
	 * 
	 * Written by Karen B Stewart 20/10/20
	 */

	public static void main(String[] args) {
		
		int[] values = {3, 5, 2354};
		
		System.out.println(values[2]);
		
		int[][] grid = {
				{00, 01, 02},
				{2, 4},
				{0, 7, 26, 67}
		};
		
		System.out.println(grid[1][1]); // output 4
		System.out.print(grid[2][2]);
		
		String[][] texts = new String[2][3];
		
		System.out.println(texts[0][1] ); // This will return a 'null' as nothing entered in here yet
		texts[0][1] = "hello there";

		System.out.println(texts[0][1] + "HERE" ); // This will return a "Hello there" string
		
		for (int i=0; i<grid.length; i++) 
		{
			for(int col=0; col < grid[i].length; col++) 
			{
				System.out.print(grid[i][col] + "\t" );
			}
			System.out.println();
		}
		
		
        // create a 3d array
        int[][][] test = {
            {
              {000, 001, 002}, 
              {100, 101, 102}
            }, 
            { 
              {666, 11, 12}, 
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
					System.out.print(test[row][col][depth] + "\t" );
				}
				System.out.println(" THIS ");
			}
			System.out.println(" HERE ");
		}
		
		
		
		
		/*       System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) 
            {
                for(int item: array1D) 
                {
                    System.out.print(item + "H \t " );
                }
                System.out.println("R");
            }
        }
 */ 
		
		
	}

}
