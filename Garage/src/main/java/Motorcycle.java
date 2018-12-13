
public class Motorcycle extends Vehicle {
	
	private int numMirrors; 

	public Motorcycle(int numMirrors, String vehicleType, int numWheels, int numDoors, int speed, String make, String name) {
		super(vehicleType, numWheels, numDoors, speed, make, name);
		this.setNumMirrors(numMirrors);
	}
	
	public int getNumMirrors() {
		return numMirrors;
	}

	public void setNumMirrors(int numMirrors) {
		this.numMirrors = numMirrors;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Number of Mirrors: " + this.getNumMirrors() + "  Body Type: " + this.getVehicleType() + "  Make/Model: " + this.getMake() + "  Number of Wheels: " + this.getNumWheels() + "  Number of Doors: " + this.getNumDoors() + "  Speed(MPH): " + this.getSpeed();
	}
}
