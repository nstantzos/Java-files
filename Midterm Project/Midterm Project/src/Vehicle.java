import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public abstract class Vehicle extends Thread implements VehicleInterface, Runnable
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

	public String vehicleName;
	private String vehicleType;
	private int currentSpeed;
	private int maxSpeed;
	public int position;
	public int pitStopFrequency;
	private boolean hasTurbo;
	Random random = new Random();
	public static boolean winner = false;
	
	
	
	public int getCurrentSpeed() 
	{
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) 
	{
		this.currentSpeed = currentSpeed;
	}

	public int getPosition() 
	{
		return position;
	}

	public void setPosition(int position) 
	{
		this.position = position;
	}	
	
	public String getVehicleName() 
	{
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) 
	{
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() 
	{
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) 
	{
		this.vehicleType = vehicleType;
	}

	public int getMaxSpeed() 
	{
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) 
	{
		this.maxSpeed = maxSpeed;
	}

	public int getPitStopFrequency() 
	{
		return pitStopFrequency;
	}

	public void setPitStopFrequency(int pitStopFrequency) 
	{
		this.pitStopFrequency = pitStopFrequency;
	}

	public boolean isHasTurbo() 
	{
		return hasTurbo;
	}

	public void setHasTurbo(boolean hasTurbo) 
	{
		this.hasTurbo = hasTurbo;
	}
	
	public Vehicle(String vehicleName, String vehicleType, int currentSpeed, int maxSpeed, int position, int pitStopFrequency, boolean hasTurbo) 
	{
		// Initialize variables/properties of class
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
		this.position = position;
		this.pitStopFrequency = pitStopFrequency;
		this.hasTurbo = hasTurbo;
		
	}
	
	// The run method MUST be overridden whenever a class implements the Runnable interface
	@Override
	public void run() 
	{

		
		// Execute until a vehicle's position is greater than or equal to race distance and winner is true
		while (this.position < trackLength && !winner)
		{
			try
			{
				switch (pitStopFrequency) 
		        {
		            case 0:  
		            	long shortRest = random.nextInt((int)breakDownMax);
						Vehicle.sleep(shortRest/2);
						//System.out.println("Stock car has broken down.");
		                break;
		            case 1:
		            	long mediumRest = random.nextInt((int)breakDownMax);
						Vehicle.sleep((long) (mediumRest/1.5));
						this.currentSpeed = this.currentSpeed + 20;
						//System.out.println("Dragster has broken down");
		                break;
		            case 2:
		            	long longRest = random.nextInt((int)breakDownMax);
						Vehicle.sleep(longRest);
						//System.out.println("Off road vehicle has broken down");
		                break;
		            default:
		                break;
		        }
				
				// update vehicle's position
				this.position += this.getCurrentSpeed();
				
				//Try to print to file from interface
				VehicleInterface.PrintResultsToFile(this);
				
				
//				try
//			    {
//					//Try to print to file from interface
//    				VehicleInterface.PrintResultsToFile(this);
//					
//			        File file = new File("Vehicle_Racecrazyideas.txt");
//			        if (!file.exists()) 
//			        {
//			             file.createNewFile();
//			        }
//			        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
//			        BufferedWriter bw = new BufferedWriter(fw);
//
//			        //BufferedReader br = new BufferedReader(new FileReader(inputfile)); // each thread reads a different input file
//			        //String line="";
//
//			        //while((line=br.readLine())!=null)
//			        //{
//			            //String id = line.trim();               // fetch id
//
//			            //StringBuffer sb = processId(userId);   // process id
//
//			            synchronized(this)
//			            {
//			            //bw.write(sb.toString() + "\n");        // write to file
//			            bw.write(VehicleInterface.PrintResultsToConsole(this.position, this.vehicleName) + "\n");        // write to file
//			    		// Race win conditions
//			    			if(this.position >= trackLength)
//			    			{
//			    				Vehicle.winner = true;
//			    				System.out.println("The race is over, " + this.vehicleName + " has won!");
//			    				bw.write("The race is over, " + this.vehicleName + " has won!" + "\n"); 
//			    				String winnerMessage = "The race is over, " + this.vehicleName + " has won!";
//			    				//raceWinner.add(winnerMessage);
//			    				//Write to the already opened output file here
//			    			
////			    				if (raceWinner.size() > 1) 
////			    				{
////			    				raceWinner.add("The race was a tie!");
////			    				}
//			    			}
//			            }
//			        //}
//			        bw.close();
//			    }
//			    catch (IOException e)
//			    {
//			        e.printStackTrace();
//			    }
				
				
				
				
				
				
				
				
				
				
				
//				synchronized(this) 
//				{
//					//VehicleInterface.PrintResultsToConsole(this.position, this.vehicleName);
//					//commentary.add(copyResult);
//					
//				}
				
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
			

		
	}
	
	
//	public Vehicle(String vehicleName, String vehicleType, int maxSpeed, int pitStopFrequency, boolean hasTurbo) 
	{
//        this.vehicleName = vehicleName;
//        this.vehicleType = vehicleType.toUpperCase();
        
        // Checks the loan amount
//            if (maxSpeed > maxSpeed) 
//            {
//                //throw (new InputMismatchException("Loan amount value is over $100,000.00"));
//            	System.out.println("Error: Loan amount is over $50,000");
//            	System.exit(0);
//            } else 
//            {
//                this.maxSpeed = maxSpeed;
//            }
        
        // Defaults term to 1 year 
//        switch (term) 
//        {
//            case shortTerm:  
//                this.term = term;
//                break;
//            case mediumTerm:
//                this.term = term;
//                break;
//            case longTerm:
//                this.term = term;
//                break;
//            default:
//                this.term = 1;
//                break;
//        }
    }
}
