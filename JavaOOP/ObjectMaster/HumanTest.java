
public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		Ninja n1 = new Ninja();
		Wizard w1 = new Wizard();
		Samurai s1 = new Samurai();
		Samurai s2 = new Samurai();
		Samurai s3 = new Samurai();
		Samurai s4 = new Samurai();
		Samurai s5 = new Samurai();
		Samurai s6 = new Samurai();
		System.out.println("Human 1 Health: " + h1.getHealth());
		System.out.println("Samurai 1 Health: " + s1.getHealth());
//		System.out.println("Ninja 1 Health: " + n1.getHealth());
//		h2.attack(h1);
//		System.out.println("Human 1 Health after getting attacked: " + h1.getHealth());
//		h2.attack(h1);
//		System.out.println("Human 1 Health after getting attacked: " + h1.getHealth());
//		h2.attack(h1);
//		System.out.println("Human 1 Health after getting attacked: " + h1.getHealth());
//		h2.attack(h1);
//		System.out.println("Human 1 Health after getting attacked: " + h1.getHealth());
		
//		System.out.println("Wizard 1 Health: " + w1.getHealth());
//		System.out.println("Wizard 1 Intelligence: " + w1.getIntelligence());
		
//		w1.heal(h1);
//		System.out.println("Human 1 Health after getting healed: " + h1.getHealth());
		
//		System.out.println("Human 2 Health: " + h2.getHealth());
//		w1.useFireball(h2);
//		System.out.println("Human 2 Health after getting hit by Wizard's Fireball: " + h2.getHealth());
		
//		n1.steal(h1);
//		System.out.println("Human 1 Health: " + h1.getHealth());
//		System.out.println("Ninja 1 Health: " + n1.getHealth());
		
//		n1.runAway();
//		System.out.println("Ninja 1 Health after running away: " + n1.getHealth());
		
//		s1.deathBlow(h1);
//		System.out.println("Human 1 Health after death blow: " + h1.getHealth());
//		System.out.println("Samurai 1 Health after dealing death blow: " + s1.getHealth());
//		s1.meditate();
//		System.out.println("Samurai 1 Health after meditation: " + s1.getHealth());
		
		System.out.println("Current number of Samurai: " + s1.howMany());
		
		
	}

}
