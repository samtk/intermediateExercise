
public class Vehicle {
	
	private int numberofwheels;
	private String colour;
	private int age;
	private String type;
	
	public Vehicle(String type, int numberofwheels, String colour, int age) {
		this.numberofwheels = numberofwheels;
		this.colour = colour;
		this.age = age;
		this.type = type;
	}
	
	public int getNumberOfWheels() {
		return numberofwheels;
	}
	
	public String getColor() {
		return colour;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getType() {
		return type;
	}
	
	public void setNumberOfWheels(int x) {
		numberofwheels = x;
	}
	
	public void setColour(String c) {
		colour = c;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setType() {
		this.type = type;
	}
	

}
