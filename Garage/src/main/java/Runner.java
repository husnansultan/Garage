
public class Runner {

	public static void main(String[] args) {
		
		Garage.addVehicles(new Car(4, "HatchBack", 4, 5, 120, "VolksWagon GTD", "Hasams Car"));
		Garage.addVehicles(new Van(4000, "Long Wheel Base", 4, 5, 120, "Mercedes Sprinter", "Hus's Van"));
		Garage.addVehicles(new Car(1, "Saloon", 3, 3, 165, "Fiat Punto", "Rajs Car"));
		Garage.addVehicles(new Motorcycle(2, "Low Rider", 2, 0, 120, "Harley", "Your maws Bike"));
		Vehicle boby = new Car (2, "hatch",4, 5, 170, "audi", "seetols motor");
		Garage.addVehicles(boby);
		
		Garage.listVehicles();
		Garage.billVehicles();
		
//		Id of vehicle ranges from 0 onwards. 0 being the first.
//		Garage.removeVehiclebyID(1);
		Garage.removeVehiclebyVehicleType("Van");
//		Garage.emptyGarage();
		Garage.listVehicles();
	}

}
