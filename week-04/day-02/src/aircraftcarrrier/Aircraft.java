package aircraftcarrrier;

public class Aircraft {

	private int ammo = 0;
	private String type;
	private int maxAmmo;
	private int baseDamage;
	private boolean hasPriority;

	public Aircraft(String type, int maxAmmo, int baseDamage, boolean hasPriority) {
		this.type = type;
		this.maxAmmo = maxAmmo;
		this.baseDamage = baseDamage;
		this.hasPriority = hasPriority;
	}

	public void setAmmo(int ammoLost) {
		this.ammo = ammoLost;
	}

	public int getAmmo() {
		return ammo;
	}

	public int getMaxAmmo() {
		return maxAmmo;
	}

	public int getBaseDamage() {
		return baseDamage;
	}
	public String getType() {
		return type;
	}

	public int fight() {
		setAmmo(0);
		int damageDealt = getAmmo() * getBaseDamage();
		return damageDealt;
	}

	public int refill(int amountOfAmmo) {
		if (amountOfAmmo > getMaxAmmo()) {
			setAmmo(getMaxAmmo());
		} else {
			setAmmo(amountOfAmmo);
		}
		return amountOfAmmo - getAmmo();
	}

	public void getStatus() {
		System.out.println("Type " + getType() + ", Ammo: " + getAmmo() + ", Base Damage: "
						                   + getBaseDamage() + ", All Damage: " + getBaseDamage() * getMaxAmmo());
	}

	public boolean isPriority() {
		return hasPriority;
	}

}
