package weekFive.abstraction;

public abstract class animal {
	
	boolean canBreathe;
	int noOfLegs;
	boolean predator;
	
	
	
	
	public animal(boolean canBreathe, int noOfLegs, boolean predator) {
		super();
		this.canBreathe = canBreathe;
		this.noOfLegs = noOfLegs;
		this.predator = predator;
	}

	void canMove() {
		System.out.println("All animal can move");
	}
	
	void limitedLongivity() {
		System.out.println("All animals die");
	}
	
	
	abstract void limited();
	
	
}
