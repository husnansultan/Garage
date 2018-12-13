
public class Car extends Vehicle {
	
	private int currentGear;  

	public Car(int currentGear, String vehicleType, int numWheels, int numDoors, int speed, String make, String name) {
		super(vehicleType, numWheels, numDoors, speed, make, name);
		this.setCurrentGear(currentGear);
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Current Gear: " + this.getCurrentGear() + "  Body Type: " + this.getVehicleType() + "  Make/Model: " + this.getMake() + "  Number of Wheels: " + this.getNumWheels() + "  Number of Doors: " + this.getNumDoors() + "  Speed(MPH): " + this.getSpeed();
	}
}
