
public class Rocket extends Vehicle {
	
	private int numberofthrusters;
	
	public Rocket(int numberofthrusters, String type, int numberofwheels, String colour,int age){
		super(type,numberofwheels, colour, age);
		this.numberofthrusters = numberofthrusters;
	}
	
	public int getNumberofthrusters() {
		return this.numberofthrusters;	
	}
	
	public void setNumberofthrusters(int num) {
		this.numberofthrusters = num;
	}

}
