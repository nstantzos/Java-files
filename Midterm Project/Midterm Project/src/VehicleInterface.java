import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public interface VehicleInterface 
{
	public static double trackLength = 2000;
	public static double breakDownMax = 1000;
	//FileWriter fileWriter = new FileWriter("Vehicle_Race_Append_Test.txt", true); //Set true for append mode

	
	public static void PrintResultsToFile(Vehicle myVehicle)
	{
		try
	    {
	        File file = new File("Vehicle_File_From_Interface.txt");
	        if (!file.exists()) 
	        {
	             file.createNewFile();
	        }
	        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	        BufferedWriter bw = new BufferedWriter(fw);

	        //BufferedReader br = new BufferedReader(new FileReader(inputfile)); // each thread reads a different input file
	        //String line="";

	        //while((line=br.readLine())!=null)
	        //{
	            //String id = line.trim();               // fetch id

	            //StringBuffer sb = processId(userId);   // process id

	            synchronized(myVehicle)
	            {
	            //bw.write(sb.toString() + "\n");        // write to file
	            bw.write(VehicleInterface.PrintResultsToConsole(myVehicle.position, myVehicle.vehicleName) + "\n");        // write to file
	    		// Race win conditions
	    		if(myVehicle.position >= trackLength)
	    		{
	    			Vehicle.winner = true;
	    			System.out.println("The race is over, " + myVehicle.vehicleName + " has won!");
	    			bw.write("The race is over, " + myVehicle.vehicleName + " has won!" + "\n"); 
	    			String winnerMessage = "The race is over, " + myVehicle.vehicleName + " has won!";
	    			//raceWinner.add(winnerMessage);
	    			//Write to the already opened output file here
	    			
//	    			if (raceWinner.size() > 1) 
//	    			{
//	    				raceWinner.add("The race was a tie!");
//	    			}
	    		}
	            }
	        //}
	        bw.close();
	    }
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
		
	}
	
	// Print results to file and console
	public static String PrintResultsToConsole(int position, String vehicleName)
	{
		//System.out.println("I am in the interface method");
		//System.out.println(vehicleName + " has a position of: " + position + " meters");
		return vehicleName + " has a position of: " + position + " meters";
		//Append text to the already opened output file here
//		try 
//		{
//			usingBufferedWriter(vehicleName + " has a position of: " + position + " meters");
//			//testString += vehicleName + " has a position of: " + position + " meters";
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
		
		
	}
}
