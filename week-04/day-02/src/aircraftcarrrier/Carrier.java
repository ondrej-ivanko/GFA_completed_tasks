package aircraftcarrrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

	private List<Aircraft> unitsInHangar = new ArrayList<>();
	private int ammoStorageSize;
	private int healthPoints;

	public Carrier(int ammoStorage, int healthPoints) {
		this.ammoStorageSize = ammoStorage;
		this.healthPoints = healthPoints;
	}

	public int getAmmoStorageSize() {
		return ammoStorageSize;
	}

	public void setAmmoStorageSize(int ammoDrained) {
		this.ammoStorageSize -= ammoDrained;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints -= healthPoints;
	}

	public void add(Aircraft aircraft) {
		unitsInHangar.add(aircraft);
	}

	public int wholeFleetFuelCapacity() {
		int fuelCapacity = 0;
		for (Aircraft fighter : unitsInHangar) {
			fuelCapacity += fighter.getMaxAmmo();
		}
		return fuelCapacity;
	}

	public boolean hasAmmo() {
		if (this.getAmmoStorageSize() != 0) {
			return true;
		}
		return false;
	}

	public boolean lessAmmoThanCapacity() {
		if (this.getAmmoStorageSize() < this.wholeFleetFuelCapacity()) {
			return true;
		}
		return false;
	}

	public void fillByPriority() {
		for (Aircraft fighter : this.unitsInHangar) {
			if (fighter.isPriority()) {
				fighter.refill(this.getAmmoStorageSize());
				setAmmoStorageSize(fighter.getAmmo());
			}
		}
	}

	public void fillAllPlanes() {
		for (Aircraft fighter : unitsInHangar) {
			fighter.refill(this.getAmmoStorageSize());
			setAmmoStorageSize(fighter.getAmmo());
		}
	}



	public void fill() {
		try {
			hasAmmo();
		} catch (Exception outOfAmmo) {
			System.out.println("Carrier ran out of ammo.");
		}
		 if (lessAmmoThanCapacity()) {
			while (getAmmoStorageSize() > 0) {
				fillByPriority();
					}
			 System.out.println("No more ammo in storage.");
		 } else {
				fillAllPlanes();
		 }
	}


	public void getStatus() {
		if (this.getHealthPoints() <= 0) {
			System.out.println("It´s dead Jim.");
		} else {
		System.out.println("HP: " + this.getHealthPoints() + ", Aircraft count: " + this.unitsInHangar.size()
						                   + ", Ammo Storage: " + this.getAmmoStorageSize() + ", Total damage: "
						                   + this.aircraftsAttack());
		System.out.println("Aircrafts:");
		for (Aircraft fighter : unitsInHangar) {
			fighter.getStatus();
			}
		}
	}

	public int aircraftsAttack() {
		int fleetDamage = 0;
		for (Aircraft fighter : this.unitsInHangar) {
			fleetDamage += fighter.fight();
		}
		return fleetDamage;
	}

	public void fight(Carrier oppossingCarrier) {
		if (this.getHealthPoints() != 0 && oppossingCarrier.getHealthPoints() != 0) {
			oppossingCarrier.setHealthPoints(this.aircraftsAttack());
			this.getStatus();
		}
	}
}
