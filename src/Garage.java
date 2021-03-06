import java.util.ArrayList;


public class Garage {
	
	ArrayList<Vehicle> garage;
	
	public Garage() {
		garage = new ArrayList<Vehicle>();
	}
	
	
	/**
	 * *
	 * Adds a new vehicle to the garage
	 * @param vehicle
	 */
	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
		
	}
	
	/**
	 * *
	 * returns a vehicle 
	 * @param id
	 */
	public Vehicle getVehicle(int id) {
		return garage.get(id);
	}
	
	/**
	 * *
	 * removes all vehicles that have the type specified eg car, motorcycle, rocket
	 * @param type
	 */
	public void removeVehiclesByType(String type) {
		for(int i = 0; i < garage.size(); i++) {
			
			if(garage.get(i).getType().equals(type))
			{
				garage.remove(i);
			}
		}
		
	}
	
	/**
	 * *
	 * removes vehicle based on id (index of arraylist)
	 * @param id
	 */
	public void removeVehicle(int id) {
		garage.remove(id);
	}
	
	/**
	 * *
	 * Removes all vehicles from the garage
	 */
	public void emptyGarage() {
		garage.clear();
	}
	
	/**
	 * *
	 * Takes a vehicle as input and calculates the bill for motorcycles
	 * @param vehicle
	 */
	public int calculateMotorcycleBill(Motorcycle motorcycle) {
		return motorcycle.getNumberOfWheels() * 100 * motorcycle.getAge() ;
	}
	
	/**
	 * *
	 * Takes a vehicle as input and calculates the bill for cars
	 * @param vehicle
	 */
	public int calculateCarBill(Car car) {	
		int value = 50;
		if (car.getAutomatic()) value = 100;
		return car.getNumberOfWheels() * value * car.getAge();
	}
	
	/**
	 * *
	 * Takes a vehicle as input and calculates the bill for rockets
	 * @param vehicle
	 */
	public int calculateRocketBill(Rocket rocket) {
		return rocket.getNumberofthrusters() * 10000;
	}
	
	
	/**
	 * *
	 * Takes a vehicle id as input and calculates the bill
	 * @param id
	 */
	public int calculateVehicleBill(int id) {
		int total = 0;
		if(garage.get(id).getType().equals("car")) {
			total += calculateCarBill((Car)garage.get(id));
		}
		if(garage.get(id).getType().equals("motorcycle")) {
			total += calculateMotorcycleBill((Motorcycle)garage.get(id));
		}
		if(garage.get(id).getType().equals("rocket")) {
			total += calculateRocketBill((Rocket)garage.get(id));
		}
		return total;	
	}
	
	/**
	 * *
	 * Calculates the bill of every vehicle in the garage
	 * @param vehicle
	 */
	public int calculateTotalBill() {
		int total = 0;
		for(int i = 0; i < garage.size(); i++) {
			total += calculateVehicleBill(i);
		}
		return total;
		
	}
	
	
	
	
}
