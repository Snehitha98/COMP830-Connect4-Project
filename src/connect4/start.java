package connect4;

import java.util.Scanner;

public class start {
	
	start(){
	
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Select number of players: ");
	 System.out.println("1. ONE PLAYER ");
	 System.out.println("2. TWO PLAYERS ");
	 
	 int a = in.nextInt(); 
	 if (a==1) {
		 System.out.println("no. of players are 1");
		 playerdetails.playername1();
	 }
	 
	 if (a==2) {
		 System.out.println("no. of players are 2");
		 playerdetails.playername2();
	 }
	 
	 if (a!=1 && a!=2) {

		 System.out.println("invalid user input");
 
	}

}
}