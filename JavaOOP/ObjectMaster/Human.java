
public class Human {
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	// CLASS METHODS
	public void attack(Human human) {
		human.setHealth(human.getHealth() - this.getStrength());
	}
	
	public void useFireball(Human human) {
		human.setHealth(human.getHealth() - (3 * this.getIntelligence()));
	}
	
	
	
	// SETTERS AND GETTERS
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strenght) {
		this.strength = strenght;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
}
