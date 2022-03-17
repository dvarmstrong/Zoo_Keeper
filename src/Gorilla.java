
public class Gorilla extends Mammal {
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("I threw something, haha !");
		energyLevel -= 5;
		
	}
	
	
	public void eatBananas() {
		System.out.println("Umm I love Bananas");
		energyLevel += 10;
	}
	
	
	public void climb() {
		System.out.println("Is this the Empire State Building? ");
		energyLevel -= 10;
	}
	
	
	
	


	
	
	

}
