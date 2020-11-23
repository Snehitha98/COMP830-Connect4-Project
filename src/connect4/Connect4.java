package connect4;

import java.util.Scanner;

public class Connect4 {

    private Board board;
    private Player[] players;
    private Scanner userInput;
    private Rule rule;
    private boolean runGame = true;
    private final int rows = 6;
    private final int columns = 6;
    private int moves =0;
   
   	private static Connect4 singletonInstance = null;
   	public static Connect4 createInstance() 
   	{	
   		try
   		{	
   			if(singletonInstance==null)
   			{	
   				singletonInstance=new Connect4();
   				return singletonInstance;
   				
   			}
   			
   			return singletonInstance;
   		}
   		catch(Exception e)
   		{
   			
   		}
   		return singletonInstance;
   	}

    public Connect4() {
        players = new Player[2];
        board = new Board(this.rows, this.columns);
        rule = new Rule(board);
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }

        userInput = new Scanner(System.in);
    }

    public void run() {

    	initialize_players();
        board.initialize_Board();
        board.printBoard();


        while (runGame) {

            System.out.println("Now " + players[0].getName() + " should play");
            processChecks();
            userChance("R");
            this.moves = this.moves + 1;


            System.out.println("Now " + players[1].getName() + " should play");
            processChecks();
            userChance("B");
            this.moves = this.moves + 1;

        }

    }

    public void processChecks(){
        System.out.println("Please enter a column number between 1 to "+columns);
        board.printBoard();
        rule.checkDraw(this.moves);
    }


    private void userChance(String player) {

        boolean process = true;

        while (process) {

            if (!userInput.hasNextInt()) {
                //if the user has entered the non-integer, then warn the user
                System.out.println(player + " please enter a column number between 1 to "+columns);
                userInput.next();
            }
            //if the user has not entered wrong input, then curry on updating the board
            else {

                int input_number = userInput.nextInt(); //take user input as integer

                if (input_number > 0 && input_number <= columns) {


                    if (rule.invalidinput(input_number)) {
                        System.out.println(player + " the column " + input_number
                                + " already full, choose another column number");
                    } else {
                        board.updateBoard(input_number, player);
                        rule.isConnected(input_number,player);
                        process = false; // close

                    }
                } else {
                    System.out.println(player + " please enter a column number between 1 to "+columns);
                }


            }

        }

    }

    private void initialize_players() {

        boolean run = true;

        while (run) {
        	Scanner in = new Scanner(System.in);

        	System.out.println("Choose number of players: ");
			System.out.println("Type in 1 or 2 ");		
			int a = in.nextInt(); 
			if(a==1) {
				System.exit(0);
			}
			if(a==2) {
            System.out.println("Player 1 please enter your name?");
            players[0].setType("R");
            players[0].setName(userInput.next());

            System.out.println("Player 2 please enter your name?");
            players[1].setType("B");
            players[1].setName(userInput.next());

            if (players[0].getName().length() > 0 && players[1].getName().length() > 0) {
                run = false;
            }
        }
        }
    }

	


}