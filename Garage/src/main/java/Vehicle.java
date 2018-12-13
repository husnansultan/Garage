
public abstract class Vehicle {
	
	private String vehicleType;
	private String make;
	private int numWheels;
	private int numDoors;
	private int speed;
	private String name;
	
	public Vehicle(String vehicleType, int numWheels, int numDoors, int speed, String make, String name) {
		
		this.setVehicleType(vehicleType);
		this.setMake(make);
		this.setNumWheels(numWheels);
		this.setNumDoors(numDoors);
		this.setSpeed(speed);
	}
	
	public Vehicle() {
		
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Body Type: " + this.getVehicleType() + "  Make/Model: " + this.getMake() + "  Number of Wheels: " + this.getNumWheels() + "  Number of Doors: " + this.getNumDoors() + "  Speed(MPH): " + this.getSpeed();
	}
}
