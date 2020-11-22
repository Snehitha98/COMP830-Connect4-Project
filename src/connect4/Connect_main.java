package connect4;

public class Connect_main {
	
	public static void main(String[] args) {
		
		System.out.println("WELCOME TO CONNECT 4 GAME");
		start s = new start();
		
		board b=board.createInstance();
		
    	b.Creategrid();
    	b.displaygrid();
		
    	
	}

}
