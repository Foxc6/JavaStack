
public class Dragon extends Mammal{
	public Dragon(String name) {
		super(name);
		this.setEnergyLevel(300);
	}
	
	// GETTERS AND SETTERS ALREADY SET IN Mammal.java
	
	// Gorilla sub-class METHODS
	
	public void fly() {
		this.setEnergyLevel(this.getEnergyLevel() - 50);
		System.out.println("The Dragon takes flight and loses 50 energy!");
	}
	
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel() + 25);
		System.out.println("The Dragon devours dozens of souls and gains 25 energy!");
	}
	
	public void attackTown() {
		this.setEnergyLevel(this.getEnergyLevel() - 100);
		System.out.println("The Dragon attacks a village and loses 100 energy!");
	}
}
