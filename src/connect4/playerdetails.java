package connect4;

import java.util.Scanner;

public class playerdetails{
	
	playerdetails l = new playerdetails();
	
	public playerdetails() {}
	
	public static void playername1() {
				
		Scanner in = new Scanner(System.in);
		
		System.out.println("player 1 name: Computer");
		System.out.println("Enter player 2 name: ");
		String s = in.nextLine(); 
        System.out.println("Please Choose one color between Red and yellow-Type in R or B: ");
        String s2 = in.nextLine();
        if(s2 == "R") {
        	System.out.println("player 1 color is Blue");
        }
        if(s2 == "B") {
        	System.out.println("player 1 color is RED");
        }
		levelofgame.level();
	}
	
	public static void playername2() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter player 1 name: ");
		String s1 = in.nextLine(); 
		System.out.println("Please Choose one color between Red and yellow-Type in R or B: ");
        String s2 = in.nextLine(); 
        
        
        System.out.println("Enter player 2 name: ");
		String s3 = in.nextLine(); 		
		levelofgame.level();
		
	}
	

}
