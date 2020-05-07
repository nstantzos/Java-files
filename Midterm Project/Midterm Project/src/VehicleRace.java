import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class VehicleRace implements StockCarInterface, OffRoadInterface, DragsterInterface
{
	public static void main(String[] args) throws IOException 
	{
		
		//String vehicleName, String vehicleType, int currentSpeed, int maxSpeed, int position, int pitStopFrequency, boolean hasTurbo
		// Initialize StockCar, OffRoadVehicle, and Dragster threads
		StockCar myStockCar = new StockCar("Stock Car", "StockCar", stockCarMaxSpeed, stockCarMaxSpeed, 0, stockCarPitStopFrequency, stockCarHasTurbo);
		OffRoadVehicle myOffRoadVehicle = new OffRoadVehicle("Off Road Vehicle", "OffRoadVehicle", offRoadVehicleStartingSpeed, offRoadVehicleMaxSpeed, 0, offRoadVehiclePitStopFrequency, offRoadVehicleHasTurbo);
		Dragster myDragster = new Dragster("Dragster", "Dragster", dragsterStartingSpeed, dragsterMaxSpeed, 0, dragsterPitStopFrequency, dragsterHasTurbo);

		// set vehicles to user threads
		myStockCar.setDaemon(false);
		myOffRoadVehicle.setDaemon(false);
		myDragster.setDaemon(false);


		
		// Start threads
		myStockCar.start();
		myOffRoadVehicle.start();
		myDragster.start();
	}

}
