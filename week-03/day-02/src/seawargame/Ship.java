package seawargame;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	int aliveMembers = 0;
	int dead = 0;
	int shipReadiness;

	List<Pirate> pirateCrew = fillShip();

	public List<Pirate> fillShip() {
		List<Pirate> container = new ArrayList<>();
		container.add(new Pirate("Bloody Leg", true));
		for (int i = 0; i < (int) (3 + Math.random() * 7); i++) {
			container.add(new Pirate("Pirate ", false));
			this.aliveMembers++;
		}
		return container;
	}
	public int cptDrankCount() {
		return pirateCrew.get(0).getRumDrankedCount();
	}

	public void shipState() {
		int dead = 0;
		for (Pirate pirate : pirateCrew) {
			if (pirate.isAlive == false) {
				dead++;
			}
		}
		System.out.println("Amount of crew members alive: " + aliveMembers);
		System.out.println("Amount of dead crew: " + dead);
		System.out.println("Captain drank " + cptDrankCount() + " bottles of Rum.");
	}
	public int shipReadiness(Ship ship) {
		ship.shipReadiness = (aliveMembers - cptDrankCount());
		return this.shipReadiness;
	}

	public int getAliveMembers() {
		return aliveMembers;
	}

	public void setDead(int dead) {
		this.dead = dead;
	}

	public void setAliveMembers(int aliveMembers) {
		this.aliveMembers = aliveMembers;
	}

	public boolean battle(Ship ship) {
		if (this.shipReadiness > shipReadiness(ship)) {
			int deadCrew = 0;
			for (int i = 0; i < (int)(1 + Math.random() * ship.getAliveMembers()); i++) {
				ship.pirateCrew.get(i).die();
				deadCrew++;
			}
			int aliveCrew = ship.aliveMembers - deadCrew;
			ship.setAliveMembers(aliveCrew);
			ship.setDead(deadCrew);
			for (int i = 0; i < this.pirateCrew.size() - 1; i++) {
				if (this.pirateCrew.get(i).isAlive == true) {
					this.pirateCrew.get(i).drinkSomeRum();
				}
			}
		} else {
			int deadCrew = 0;
			for (int i = 0; i < (int)(1 + Math.random() * this.getAliveMembers()); i++) {
				this.pirateCrew.get(i).die();
				deadCrew++;
			}
			int aliveCrew = this.aliveMembers - deadCrew;
			this.setAliveMembers(aliveCrew);
			this.setDead(deadCrew);
			for (int i = 0; i < ship.pirateCrew.size() - 1; i++) {
				if (ship.pirateCrew.get(i).isAlive == true) {
					ship.pirateCrew.get(i).drinkSomeRum();
				}
			}
			}
		return false;
	}
}
