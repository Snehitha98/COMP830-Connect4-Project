package connect4;
import java.io.*;


public class Fileread {
	
		
	public static void start() {

		 try{
			 
			  FileInputStream fstream = new FileInputStream("rulesofgame.txt");
			  
			  //object of DataInputStream
			  
			  DataInputStream in1 = new DataInputStream(fstream);
			  
			  BufferedReader br = new BufferedReader(new InputStreamReader(in1));
			  String strLine;
			  
			  //Read text file Line By Line
			  
			  while ((strLine = br.readLine()) != null)   {
				  
			  System.out.println (strLine);
			  
			  }
			    
			  //Close the input stream
			  in1.close();
			  
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
			  }
		
	}


	

