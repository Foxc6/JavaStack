
public class Wizard extends Human {
	private int health = 50;
	private int intelligence = 8;
	
	// WIZARD CLASS METHODS
	public void heal(Human human) {
		human.setHealth(human.getHealth() + this.getIntelligence());
	}
	
	// WIZARD GETTERS AND SETTERS
	public int getHealth() {
		return this.health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getIntelligence() {
		return this.intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
}
