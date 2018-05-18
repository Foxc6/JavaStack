
public class Ninja extends Human {
	private int stealth = 10;
	
	// NINJA CLASS METHODS
	public void steal(Human human) {
		this.setHealth(this.getHealth() + this.getStealth());
		human.setHealth(human.getHealth() - this.getStealth());
	}
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
	}

	
	// GETTERS AND SETTERS
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	
}
