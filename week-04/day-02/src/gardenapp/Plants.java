package gardenapp;

public class Plants {

	String type;
	double waterAmount;
	double waterAbsorption;

	public Plants() {
	}

	public String getType() {
		return type;
	}

	public double getWaterAmount() {
		return waterAmount;
	}

	public double getWaterAbsorption() {
		return waterAbsorption;
	}

	public void setWaterAmount(double waterAmount) {
		this.waterAmount += waterAmount;
	}

	public void getStatus() {
	}

	public boolean needsWater() {
		if (getWaterAmount() < 5 & this instanceof Flower) {
			return true;
		} else if (getWaterAmount() < 10 & this instanceof Tree) {
			return true;
		}
		return false;
	}
}
