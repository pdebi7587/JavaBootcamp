package weekFive.abstraction;

public class Human extends animal {
  boolean canThink;

public Human(boolean canBreathe, int noOfLegs, boolean predator, boolean canThink) {
	super(canBreathe, noOfLegs, predator);
	this.canThink = canThink;
}

	void canMove() {
		System.out.println("Human can move by walking and running!");
	}
	
	void areCarnivorus() {
		System.out.println("Human eats everything!");
	}
  
  
}
