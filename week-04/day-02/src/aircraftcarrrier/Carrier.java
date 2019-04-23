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
		this.ammoStorageSize = ammoDrained;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void add(Aircraft aircraft) {
		unitsInHangar.add(aircraft);
	}

	public int fire() {
		int fireCapacity = 0;
		for (Aircraft fighter : unitsInHangar) {
			fireCapacity += fighter.getBaseDamage();
		}
		return fireCapacity;
	}

	public int wholeFleetFuelCapacity() {
		int fuelCapacity = 0;
		for (Aircraft fighter : unitsInHangar) {
			fuelCapacity += fighter.getMaxAmmo();
		}
		return fuelCapacity;
	}

	public void fill() {
		try {
			if (this.ammoStorageSize == 0);
		} catch (Exception outOfAmmo) {
			System.out.println("Carrier ran out of ammo.");
		}
		if (getAmmoStorageSize() < wholeFleetFuelCapacity()) {
			while (getAmmoStorageSize() > 0) {
				for (Aircraft fighter : unitsInHangar) {
					if (fighter.isPriority()) {
						setAmmoStorageSize(fighter.refill(getAmmoStorageSize()));
					}
				}
			}
		} else {
			for (Aircraft fighter : unitsInHangar) {
				setAmmoStorageSize(fighter.refill(getAmmoStorageSize()));
			}
		}
	}

	public void getStatus() {
		if (this.getHealthPoints() <= 0) {
			System.out.println("It´s dead Jim.");
		} else {
		System.out.println("HP: " + this.getHealthPoints() + ", Aircraft count: " + this.unitsInHangar.size()
						                   + ", Ammo Storage: " + this.getAmmoStorageSize() + ", Total damage: " + this.fire());
		System.out.println("Aircrafts:");
		for (Aircraft fighter : unitsInHangar) {
			fighter.getStatus();
			}
		}
	}

	public void fight(Carrier oppossingCarrier) {
		if (this.getHealthPoints() != 0 && oppossingCarrier.getHealthPoints() != 0) {
			oppossingCarrier.setHealthPoints(oppossingCarrier.getHealthPoints() - fire());
			this.fill();
			this.setHealthPoints(this.getHealthPoints() - oppossingCarrier.fire());
			oppossingCarrier.fill();
			this.getStatus();
			oppossingCarrier.getStatus();
		}
	}
}
