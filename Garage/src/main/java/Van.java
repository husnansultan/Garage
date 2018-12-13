
public class Van extends Vehicle {
	
	private int totalW;  

	public Van(int totalW, String vehicleType, int numWheels, int numDoors, int speed, String make, String name) {
		super(vehicleType, numWheels, numDoors, speed, make, name);
		this.setTotalW(totalW);
	}
	
	public int getTotalW() {
		return totalW;
	}

	public void setTotalW(int totalW) {
		this.totalW = totalW;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Total Weight: " + this.getTotalW() + "  Body Type: " + this.getVehicleType() + "  Make/Model: " + this.getMake() + "  Number of Wheels: " + this.getNumWheels() + "  Number of Doors: " + this.getNumDoors() + "  Speed(MPH): " + this.getSpeed();
	}
}
