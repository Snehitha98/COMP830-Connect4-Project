package connect4;

public class board 
{		
    static int rows = 6;
	static int columns = 7;
    static char[][] grid = new char[rows][columns];
    
	private static board singletonInstance = null;
	public static board createInstance() 
	{	
		try
		{	
			if(singletonInstance==null)
			{
				
				singletonInstance=new board();
				return singletonInstance;
				
			}
			
			return singletonInstance;
		}
		catch(Exception e)
		{
			
		}
		return singletonInstance;
	
	}
	public  void Creategrid()
    {
		for (int row = 0; row < grid.length; row++){
			for (int col = 0; col < grid[0].length; col++){
				grid[row][col] = ' ';
			}
		}
    }
    public  void displaygrid() 
	{
    	System.out.println(" 0 1 2 3 4 5 6");
		System.out.println("---------------");
		for (int row = 0; row < grid.length; row++){
			System.out.print("|");
			for (int col = 0; col < grid[0].length; col++){
				System.out.print(grid[row][col]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("---------------");
		}
		System.out.println(" 0 1 2 3 4 5 6");
	
	}
	
}