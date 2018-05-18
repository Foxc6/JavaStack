
public class Gorilla extends Mammal{
	public Gorilla(String name) {
		super(name);
		int energyLevel = this.getEnergyLevel();
	}
	
	// GETTERS AND SETTERS ALREADY SET IN Mammal.java
	
	// Gorilla sub-class METHODS
	
	public void throwSomething() {
		this.setEnergyLevel(this.getEnergyLevel() - 5);
		System.out.println("Throwing things leads to energy level decrease of 5.");
	}
	
	public void eatBanana() {
		this.setEnergyLevel(this.getEnergyLevel() + 10);
		System.out.println("Loves me some nanners! Energy increases by 10.");
	}
	
	
	public void climbTree() {
		this.setEnergyLevel(this.getEnergyLevel() - 10);
		System.out.println("Climbing trees decreases energy by 10.");
	}
	
}
