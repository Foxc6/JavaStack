
public class Mammal {
	private String name;
	private int energyLevel;
	
	// Class Constructor
	public Mammal(String name) {
		this.name = name;
		this.energyLevel = 100;
	}
	
	// Class Methods
	
	public void sayName() {
		System.out.println("My name is " + this.name);
	}
	
	
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
