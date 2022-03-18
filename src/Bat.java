
public class Bat extends Mammal {
	public Bat(int energyLevel) {
		super(300);
	}
	
	public void fly() {
		System.out.println("Whoosh");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("crunch");
		energyLevel += 25;
	}
	
	public void attackTowns() {
		System.out.println("Burn it down ");
		energyLevel -= 100;
	}

}
