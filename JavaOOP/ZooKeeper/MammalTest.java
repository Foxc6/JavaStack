public class MammalTest {

	public static void main(String[] args) {
		
		Dragon d1 = new Dragon("Drogon");
		d1.attackTown();
		System.out.println("Name: " + d1.getName() + " ----- Energy Level: " + d1.getEnergyLevel());
		d1.attackTown();
		System.out.println("Name: " + d1.getName() + " ----- Energy Level: " + d1.getEnergyLevel());
		d1.eatHumans();
		System.out.println("Name: " + d1.getName() + " ----- Energy Level: " + d1.getEnergyLevel());
		d1.eatHumans();
		System.out.println("Name: " + d1.getName() + " ----- Energy Level: " + d1.getEnergyLevel());
		d1.eatHumans();
		System.out.println("Name: " + d1.getName() + " ----- Energy Level: " + d1.getEnergyLevel());
		d1.fly();
		System.out.println("Name: " + d1.getName() + " ----- Energy Level: " + d1.getEnergyLevel());
		d1.fly();
		System.out.println("Name: " + d1.getName() + " ----- Energy Level: " + d1.getEnergyLevel());
		
		
		
		Mammal m1 = new Mammal("Steve");
		m1.sayName();
		
		
		
		Gorilla g1 = new Gorilla("Subject 1");
		
		System.out.println("Name: " + g1.getName() + " ----- Energy Level: " + g1.getEnergyLevel());
		g1.throwSomething();
		System.out.println("Name: " + g1.getName() + " ----- Energy Level: " + g1.getEnergyLevel());
		g1.throwSomething();
		System.out.println("Name: " + g1.getName() + " ----- Energy Level: " + g1.getEnergyLevel());
		g1.throwSomething();
		System.out.println("Name: " + g1.getName() + " ----- Energy Level: " + g1.getEnergyLevel());
		g1.eatBanana();
		System.out.println("Name: " + g1.getName() + " ----- Energy Level: " + g1.getEnergyLevel());
		g1.eatBanana();
		System.out.println("Name: " + g1.getName() + " ----- Energy Level: " + g1.getEnergyLevel());
		g1.climbTree();
		System.out.println("Name: " + g1.getName() + " ----- Energy Level: " + g1.getEnergyLevel());
	}
}
