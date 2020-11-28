package connect4;

import java.util.Scanner;

public class RunGame {

    public static void main(String args[]) {

    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("WELCOME TO CONNECT 4!!!!!!");

    	
    	System.out.println("Do you want to know rules of the game");
    	System.out.println("If so, Type 'yes' else 'no' ");

    	String userinput = in.nextLine(); 
    	   	
    	if(userinput.equals("yes")) {
    		
    		
    		Fileread f = new Fileread();
    		f.start();
    	}
 	
        Connect4 c = Connect4.createInstance();
        c.run();

    }
}