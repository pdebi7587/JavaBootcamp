package weekFive.interfaceAtivity.mainRunner;

import java.util.ArrayList;
import java.util.List;

import weekFive.interfaceAtivity.boat.BoatI;
import weekFive.interfaceAtivity.car.CarI;

public class MainRunner extends Vehicle{

	public static void main(String [] args) {
		
		Bocar bcar = new Bocar();
		bcar.canFloat();
		bcar.canRow();
		bcar.canDrive();
		bcar.canHonk();
		//bcar.hp = 750;
		//CarI.hp = 750;
		bcar.isFun("Car is more fun");
		bcar.isFun();
		bcar.movePassengers();
		System.out.println(CarI.hp);
		bcar.setAutoMotive(true);
		bcar.setNoOfDoors(6);
		
		//BoatI bi = new Bocar();
		
		//List li = new ArrayList<>();
		
		System.out.println("Doors: " +bcar.getNoOfDoors);
		System.out.println(CarI.hp);
		
		
		
		
		
		
	}
}
