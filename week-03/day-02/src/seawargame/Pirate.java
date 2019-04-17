package seawargame;

public class Pirate {
	String name;
	boolean intoxication = false;
	int rumDrankedCount;
	boolean isAlive = true;
	boolean isCaptain = false;

	public Pirate(String newName, boolean captain) {
		this.name = newName;
		this.isCaptain = captain;
	}

	public void drinkSomeRum() {
		this.intoxication = true;
		this.rumDrankedCount += 1;
	}

	public int getRumDrankedCount() {
		return rumDrankedCount;
	}

	public void howsItGoingMate() {
		if (rumDrankedCount <= 4) {
			System.out.println("Pour me anudder!");
		} else {
			System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
		}
	}
	public void die() {
		this.isAlive = false;
		System.out.println("One of the pirates died.");
	}



}
