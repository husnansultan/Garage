import java.util.ArrayList;

public class Garage {
	
	private static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	private static double bill = 0;
	
	public static void addVehicles(Vehicle vehicle){
	
		vehicleList.add(vehicle);
	}
	
	public static void listVehicles() {
		vehicleList.stream().forEach(System.out::println);
	}
	
	public static void billVehicles() {
		
		for (Vehicle vehicle : vehicleList) {
			bill = 0;
			if (vehicle instanceof Car) {
				bill = bill + 120;
				if (vehicle.getVehicleType().equals("Saloon")) {
					bill = bill + 30;
				}
				if (vehicle.getVehicleType()=="Hatchback") {
					bill = bill + 5;
				}
			}else if (vehicle instanceof Van) {
				bill = bill +240;
				if (vehicle.getVehicleType()=="Long Wheel Base") {
					bill = bill + 130;
				}
				if (vehicle.getVehicleType()=="Short Wheel Base") {
					bill = bill + 55;
				}
			}else if (vehicle instanceof Motorcycle) {
				bill = bill + 50;
				if (vehicle.getNumWheels()==2) {
					bill = bill + 3;
				}
			}
			System.out.println(vehicle.getMake() + " " + bill);
		}
	}
	
	public static void emptyGarage() {
		vehicleList.removeAll(vehicleList);
	}
	
	public static void removeVehiclebyID(int ID) {
		vehicleList.remove(ID);
	}
		
	public static void removeVehiclebyVehicleType(String type) {
		vehicleList.removeIf(v -> type.equals(v.getClass().getSimpleName()));
//		System.out.println(vehicleList);
	}
	
}
