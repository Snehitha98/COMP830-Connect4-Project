package connect4;

import java.util.Scanner;

public class levelofgame {

	levelofgame(){}
	
	public static void level() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Select difficulty level of game");
		System.out.println("1. EASY");
		System.out.println("2. MEDIUM");
		System.out.println("3. HARD");
		int a = in.nextInt();
		
		if (a==1) {
			System.out.println("you have selected easy game");
			
		}
		if (a==2) {
			System.out.println("you have selected medium level game");
			
		}
		if (a==3) {
			System.out.println("you have selected hard game");	
		}
		
		if(a!=1 && a!=2 && a!=3) {
			System.out.println("user input is invalid");
		}
	}
	
	
}
