
public class Samurai extends Human {
	private int health = 200;
	public static int numSamurai = 0;
	public Samurai() {
		Samurai.numSamurai++;
	}


	// CLASS METHODS
	public void deathBlow(Human human) {
		human.setHealth(human.getHealth() - human.getHealth());
		this.setHealth(this.getHealth() / 2);
	}
	
	public void meditate() {
		this.setHealth(this.getHealth() + (this.getHealth() / 2));
	} 
	
	public int howMany() {
		return Samurai.numSamurai;
	}
	
	
	// GETTERS AND SETTERS
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public static int getNumSamurai() {
		return numSamurai;
	}
	public static void setNumSamurai(int numSamurai) {
		Samurai.numSamurai = numSamurai;
	}
}
