package weekFive.interfaceAtivity.vehicle;

public class Vehicle {

	public boolean autoMotive;
	
	public int noOfDoors;
	
	public boolean isAutoMotive() {
		return autoMotive;
	}

	public void setAutoMotive(boolean autoMotive) {
		this.autoMotive = autoMotive;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	protected void movePassengers() {
		System.out.println("All the vehicles can move passengers!");
	}
}
