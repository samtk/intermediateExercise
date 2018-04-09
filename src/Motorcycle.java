
public class Motorcycle extends Vehicle {
	
	private boolean reallyLoud;
	private boolean sidecar;
	
	public Motorcycle(boolean reallyloud, boolean sidecar,String type, int numberofwheels, String colour,int age) {
		super(type, numberofwheels, colour, age);
		this.reallyLoud = reallyloud;
		this.sidecar = sidecar;
	}
	
	public boolean getReallyLoud() {
		return reallyLoud;
	}
	
	public boolean getSideCar() {
		return sidecar;
	}
	
	public void setReallyLoud(boolean reallyloud) {
		this.reallyLoud = reallyloud;
	}
	
	public void setSideCar(boolean sidecar) {
		this.sidecar = sidecar;
	}
	
	

}
