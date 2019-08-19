package weekFive.interfaceAtivity.mainRunner;

import weekFive.interfaceAtivity.boat.BoatI;
import weekFive.interfaceAtivity.car.CarI;
import weekFive.interfaceAtivity.vehicle.Vehicle;

public class Bocar extends Vehicle implements BoatI, CarI{

	@Override
	public void canRow() {
		System.out.println("Boat can row!");
	}
	
	@Override
	public void canFloat() {
		System.out.println("Boat can float!");
	}
	

	@Override
	public void canDrive() {
		System.out.println("A car can be driven!");
		
	}

	@Override
	public void canHonk() {
		System.out.println("A car can honk!");
		
	}
	
	@Override
	public void isFun() {
		System.out.println("This must be having fun in the boat, risky btw!");
	}

	@Override
	public void isFun(String msg) {
		System.out.println(msg);
		
	}
	
	public void movePassengers() {
		System.out.println("Bocar can move 8 passengers!");
	}
	
	void assignVar() {
		Bocar bcar = new Bocar();
		bcar.autoMotive = true;
		bcar.noOfDoors = 6;
	}
	
	
	
	
	
}
